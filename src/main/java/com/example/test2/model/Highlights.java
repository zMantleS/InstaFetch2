package com.example.test2.model;

import com.example.test2.processing.MediaProxy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Highlights {
    private String status;
    private List<Data> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data{
        private Node node;

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Node{
        private String __typename;
        private String id;
        private String title;
        private CoverMedia cover_media;

        public String get__typename() {
            return __typename;
        }

        public void set__typename(String __typename) {
            this.__typename = __typename;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public CoverMedia getCover_media() {
            return cover_media;
        }

        public void setCover_media(CoverMedia cover_media) {
            this.cover_media = cover_media;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CoverMedia{
        private String thumbnail_src;

        public String getThumbnail_src() {
            return thumbnail_src;
        }

        public void setThumbnail_src(String thumbnail_src) {
            MediaProxy mediaProxy = new MediaProxy(thumbnail_src,"image");
            String newlink = mediaProxy.getNewlink();
            this.thumbnail_src = newlink;
        }
    }

}
