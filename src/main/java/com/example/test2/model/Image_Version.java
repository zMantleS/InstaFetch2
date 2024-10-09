package com.example.test2.model;

import com.example.test2.processing.MediaProxy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image_Version {

    private List<Candidate> candidates;

        public List<Candidate> getCandidates() {
            return candidates;
        }

        public void setCandidates(List<Candidate> candidates) {
            this.candidates = candidates;
        }

    @Override
    public String toString() {
        return "Image_Version{" +
                "candidates=" + candidates +
                '}';
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate{
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            MediaProxy mediaProxy = new MediaProxy(url,"image");
            String newlink = mediaProxy.getNewlink();
            this.url = newlink;
        }

        @Override
        public String toString() {
            return "Candidate{" +
                    "url='" + url + '\'' +
                    '}';
        }
    }
}



