package com.example.test2.processing;

import org.springframework.http.HttpHeaders;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MediaProxy {
    private String link;
    private String newlink;
    private String mediaType;
    private final static Logger logger = Logger.getLogger(MediaProxy.class.getName());

    public MediaProxy(String link, String mediaType) {
        this.link = link;
        this.mediaType = mediaType;
        this.newlink = setNewLink();
    }

    private String processHost(String host) {
        host = host.replaceAll("-", "--");
        host = host.replaceAll("\\.", "-");
        return host;
    }

    private String extractHost(String link) {
        Pattern pattern = Pattern.compile("(^.*?).com");
        Matcher matcher = pattern.matcher(link);

        if (matcher.find()) {
            return processHost(matcher.group());
        }
        return null;
    }

    private String extractPath(String link) {
        Pattern pattern = Pattern.compile("(?<=\\.com)(.*)");
        Matcher matcher = pattern.matcher(link);

        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private String setNewLink() {
        String host = extractHost(link);
        String path = extractPath(link);

        if (mediaType == "image"){
            if (host != null && path != null) {
                return host + ".translate.goog" + path;
            }
            return link;
        }
        else if(mediaType == "video"){
            if (host != null && path != null){
                HttpHeaders headers = new HttpHeaders();
                headers.add("Auth_Key", "123");
            }
            return link;
        }
        return link;


    }

    public String getNewlink() {
        return newlink;
    }
}