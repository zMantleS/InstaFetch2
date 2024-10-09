package com.example.test2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reels {
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
        private List<Item> items;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item{
        private Media media;

        public Media getMedia() {
            return media;
        }

        public void setMedia(Media media) {
            this.media = media;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Media{
        private String video_dash_manifest;
        @JsonProperty("image_versions2")
        private Image_Version image_versions2;
        private List<Video> video_versions;



        public String getVideo_dash_manifest() {
            return video_dash_manifest;
        }

        public void setVideo_dash_manifest(String video_dash_manifest) {
            this.video_dash_manifest = video_dash_manifest;
        }

        public Image_Version getImage_version() {
            return image_versions2;
        }

        public void setImage_version(Image_Version image_version) {
            this.image_versions2 = image_version;
        }

        public List<Video> getVideo_versions() {
            return video_versions;
        }

        public void setVideo_versions(List<Video> video_versions) {
            this.video_versions = video_versions;
        }

        @Override
        public String toString() {
            return "Media{" +
                    "image_versions2=" + image_versions2 +
                    '}';
        }
    }






}

