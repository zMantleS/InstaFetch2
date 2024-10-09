package com.example.test2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stories {
    @JsonProperty("status")
    private String status;

    @JsonProperty("count")
    private int count;

    @JsonProperty("data")
    private List<Story> story;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Story> getStory() {
        return story;
    }

    public void setStory(List<Story> story) {
        this.story = story;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Story{
        private int media_type;
        @JsonProperty("video_versions")
        private List<Video> video_versions;

        @JsonProperty("image_versions2")
        private com.example.test2.model.Image_Version image_versions2;
        private int taken_at;
        private int expiring_at;
        private boolean has_audio;

        public int getMedia_type() {
            return media_type;
        }

        public void setMedia_type(int media_type) {
            this.media_type = media_type;
        }

        public List<Video> getVideo_versions() {
            return video_versions;
        }

        public void setVideo_versions(List<Video> video_versions) {
            this.video_versions = video_versions;
        }

        public com.example.test2.model.Image_Version getImage_versions2() {
            return image_versions2;
        }

        public void setImage_versions2(com.example.test2.model.Image_Version image_versions2) {
            this.image_versions2 = image_versions2;
        }

        public int getTaken_at() {
            return taken_at;
        }

        public void setTaken_at(int taken_at) {
            this.taken_at = taken_at;
        }

        public int getExpiring_at() {
            return expiring_at;
        }

        public void setExpiring_at(int expiring_at) {
            this.expiring_at = expiring_at;
        }

        public boolean isHas_audio() {
            return has_audio;
        }

        public void setHas_audio(boolean has_audio) {
            this.has_audio = has_audio;
        }
    }

}



