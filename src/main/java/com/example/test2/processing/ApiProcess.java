package com.example.test2.processing;

import com.example.test2.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ApiProcess {

    private String XRapidAPIKey;
    private String XRapidAPIHost;
    private RestTemplate restTemplate;
    private HttpHeaders headers;
    private String responseBody;
    private static Logger logger = LogManager.getLogger(ApiProcess.class);

    public ApiProcess(RestTemplate restTemplate){
        this.XRapidAPIKey = "2439f4b798mshd4ad76ba77f1a57p1a26aajsn4a119f6ba9f5";
        this.XRapidAPIHost = "instagram243.p.rapidapi.com";
        this.headers = constructHeader();
        this.restTemplate = restTemplate;
    }


    public HttpHeaders constructHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-RapidAPI-Key", this.XRapidAPIKey);
        headers.add("X-RapidAPI-Host", this.XRapidAPIHost);
        return headers;
    }

    public Profile2 requestInfo(String username) throws JsonProcessingException {
        String url = "https://instagram243.p.rapidapi.com/userinfo/"+username;
        String jsString = constructHttpRequest(url);
        this.responseBody = jsString;
        System.out.println(jsString);
        Object info = objectMapping(new String[]{"info"});
        Profile2 profile2 = (Profile2) info;
        return profile2;
    }

    public Posts requestPosts(String userid, String count) throws JsonProcessingException {
        String endCursor = "QVFENHN0bmgycndDZFcwdF9PN1pJSFBUa0ZFUW5KbUk5TVFtUVlxbHRVNUhXVE1HTWl3Uy1mMk5TejlBZ3FqMXlVNHpfUlNjRUU5RTRWMVhDT1NLSmw4Tg==";
        String url = "https://instagram243.p.rapidapi.com/userposts2/"+userid+"/"+count+"/"+endCursor;
        String jsString = constructHttpRequest(url);
        this.responseBody = jsString;
        Object info = objectMapping(new String[]{"posts"});
        Posts posts = (Posts) info;
        return posts;
    }

    public Stories requestStories(String userid) throws JsonProcessingException {
        String url = "https://instagram243.p.rapidapi.com/userstories/"+userid;
        String jsString = constructHttpRequest(url);
        this.responseBody = jsString;
        Object info = objectMapping(new String[]{"stories"});
        Stories stories = (Stories) info;
        return stories;

    }

    public Reels requestReels(String userid, String count) throws JsonProcessingException{
        String endCursor = "QVFESFdZV2JmQVlUamhaLV9zeE5FNm9MRHJpeG5DRWhrRGFWSXFmRmZsNklEdXhLZE9CblRCNG9weFlVYlNfT2ZBZGp4a1BtVGdzOFJCWnRJbWJCeHAwLQ==";
        String url = "https://instagram243.p.rapidapi.com/userreels/"+userid+"/"+count+"/"+endCursor;
        String jsString = constructHttpRequest(url);
        this.responseBody = jsString;
        Object info = objectMapping(new String[]{"reels"});
        Reels reels = (Reels) info;
        return reels;

    }

    public Highlights requestHighlights(String userid) throws JsonProcessingException{
        String url = "https://instagram243.p.rapidapi.com/userhighlights/"+userid;
        String jsString = constructHttpRequest(url);
        this.responseBody = jsString;
        System.out.println(jsString.toCharArray());
        Object info = objectMapping(new String[]{"highlights"});
        Highlights highlights = (Highlights) info;
        return highlights;
    }

    public HighlightDetail requestHighlight(String highlightid) throws JsonProcessingException{
        String url = "https://instagram243.p.rapidapi.com/highlightdetail/"+highlightid;
        String regex = "highlight:"+highlightid+"(\\d*)";
        String jsString = constructHttpRequest(url);
        jsString = jsString.replaceFirst(regex, "highlight");
        this.responseBody = jsString;
        Object info = objectMapping(new String[]{"highlight",highlightid});
        HighlightDetail highlight = (HighlightDetail) info;

        return highlight;
    }

    public String constructHttpRequest(String url){
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        String jsString = response.getBody();
        return jsString;
    }



    public Object objectMapping(String[] endpoint) throws JsonProcessingException {

        ObjectMapper objectMapper =  new ObjectMapper();

        JsonNode jsonNode = new ObjectMapper().readTree(this.responseBody);

        switch (endpoint[0]){
            case "info":
                Profile2 profile2 = objectMapper.treeToValue(jsonNode, Profile2.class);
                return profile2;
            case "posts":
                Posts posts = objectMapper.treeToValue(jsonNode, Posts.class);
                return posts;
            case "stories":
                Stories stories = objectMapper.treeToValue(jsonNode, Stories.class);
                return stories;
            case "reels":
                Reels reels = objectMapper.treeToValue(jsonNode, Reels.class);
                return reels;
            case "highlights":
                Highlights highlights = objectMapper.treeToValue(jsonNode, Highlights.class);
                return highlights;
            case "highlight":
                HighlightDetail highlight = objectMapper.treeToValue(jsonNode, HighlightDetail.class);
                return highlight;
            default:
                return null;
        }
    }


}
