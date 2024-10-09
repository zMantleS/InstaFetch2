package com.example.test2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightDetail {
    private String status;
    private Data data;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data{
        private String status;
        private Reels reels;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Reels getReels() {
            return reels;
        }

        public void setReels(Reels reels) {
            this.reels = reels;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Reels{

        private Highlight highlight;

        public Highlight getHighlight() {
            return highlight;
        }

        public void setHighlight(Highlight highlight) {
            this.highlight = highlight;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Highlight{
        private String id;
        private int latest_reel_media;
        private int media_count;
        private List<String> media_ids;
        private List<Item> items;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getLatest_reel_media() {
            return latest_reel_media;
        }

        public void setLatest_reel_media(int latest_reel_media) {
            this.latest_reel_media = latest_reel_media;
        }

        public int getMedia_count() {
            return media_count;
        }

        public void setMedia_count(int media_count) {
            this.media_count = media_count;
        }

        public List<String> getMedia_ids() {
            return media_ids;
        }

        public void setMedia_ids(List<String> media_ids) {
            this.media_ids = media_ids;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item{
        private boolean is_reel_media;
        private boolean is_terminal_video_segment;
        private int media_type;
        private int taken_at;
        private Image_Version image_versions2;
        private List<Video> video_versions;

        public List<Video> getVideo_versions() {
            return video_versions;
        }

        public void setVideo_versions(List<Video> video_versions) {
            this.video_versions = video_versions;
        }

        public boolean isIs_reel_media() {
            return is_reel_media;
        }

        public void setIs_reel_media(boolean is_reel_media) {
            this.is_reel_media = is_reel_media;
        }

        public boolean isIs_terminal_video_segment() {
            return is_terminal_video_segment;
        }

        public void setIs_terminal_video_segment(boolean is_terminal_video_segment) {
            this.is_terminal_video_segment = is_terminal_video_segment;
        }

        public int getMedia_type() {
            return media_type;
        }

        public void setMedia_type(int media_type) {
            this.media_type = media_type;
        }

        public int getTaken_at() {
            return taken_at;
        }

        public void setTaken_at(int taken_at) {
            this.taken_at = taken_at;
        }

        public Image_Version getImage_versions2() {
            return image_versions2;
        }

        public void setImage_versions2(Image_Version image_versions2) {
            this.image_versions2 = image_versions2;
        }
    }
}
