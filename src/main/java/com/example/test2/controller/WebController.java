package com.example.test2.controller;

import com.example.test2.model.*;
import com.example.test2.processing.ApiProcess;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @RequestMapping(value = "/")
    public String index(Model model){
            model.addAttribute("profile", new Profile());
            return "index";
    }


    @RequestMapping("/privacy")
    public String privacy(Model model){
        return "privacy";
    }

    @GetMapping("/profile/{username}")
    public String prof2(@PathVariable("username") String name, Model model, RestTemplate restTemplate) throws JsonProcessingException {
        ApiProcess apiProcess = new ApiProcess(restTemplate);
        Profile2 profile = apiProcess.requestInfo(name);
        String userid = profile.getData().getId();
        Posts post = apiProcess.requestPosts(userid, "12");
        //System.out.println(post.getData().getItems().get(0).getNode().getDisplay_url());
        model.addAttribute("profile", profile);
        model.addAttribute("userid", userid);
        model.addAttribute("posts", post);
        return "profile2";
    }


    @PostMapping ("/profile/{username}")
    public String profile(@PathVariable("username") String name, Model model, RestTemplate restTemplate) throws JsonProcessingException {
        ApiProcess apiProcess = new ApiProcess(restTemplate);
        Profile2 profile = apiProcess.requestInfo(name);
        String userid = profile.getData().getId();
        Posts post = apiProcess.requestPosts(userid, "12");
        System.out.println(post.getData().getEdge_owner_to_timeline_media().getItems().get(0).getNode().getText());

        //Stories stories = apiProcess.requestStories(profile.getData().getId());
        /*String userID = profile.getData().getId();
        Highlights highlights = apiProcess.requestHighlights(userID);
        String highlightID = highlights.getData().get(0).getNode().getId();
        HighlightDetail highlightDetail = apiProcess.requestHighlight(highlightID);
        Reels reels = apiProcess.requestReels(profile.getData().getId(), "12"); */

        model.addAttribute("profile", profile);
        model.addAttribute("userid", userid);
        model.addAttribute("posts", post);
        /*model.addAttribute("highlights", highlights);
        model.addAttribute("stories", stories);
        model.addAttribute("highlight", highlightDetail);
        model.addAttribute("reels", reels);*/


        return "profile2";

    }

    @RequestMapping(value="/profile/{username}/stories/{userid}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> stories(@PathVariable("username") String name, @PathVariable("userid") String userid, Model model, RestTemplate restTemplate) throws JsonProcessingException{
        ApiProcess apiProcess = new ApiProcess(restTemplate);
        Stories stories = apiProcess.requestStories(userid);

        Map<String, Object> response = new HashMap<>();
        response.put("stories", stories);
        System.out.println(response.get("stories"));

        return ResponseEntity.ok(response);
    }

}
