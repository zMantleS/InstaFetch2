package com.example.test2.model;

import com.example.test2.processing.MediaProxy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts {
    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
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
        //@JsonProperty("edges")
        //private List<Item> items;
        @JsonProperty("edge_owner_to_timeline_media")
        private edge_owner_to_timeline_media edge_owner_to_timeline_media;

        public Posts.edge_owner_to_timeline_media getEdge_owner_to_timeline_media() {
            return edge_owner_to_timeline_media;
        }

        public void setEdge_owner_to_timeline_media(Posts.edge_owner_to_timeline_media edge_owner_to_timeline_media) {
            this.edge_owner_to_timeline_media = edge_owner_to_timeline_media;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class edge_owner_to_timeline_media{
        @JsonProperty("edges")
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
        private String display_url;

        private String text;
        private int video_view_count;
        private String video_url;

        @JsonProperty("edge_media_preview_like")
        private EdgeLikedBy edge_media_preview_like;
        private EdgeMediaToComment edge_media_to_comment;

        @JsonProperty("edge_sidecar_to_children")
        private EdgeSidecarToChildren edgeSidecarToChildren;

        @JsonProperty("edge_media_to_caption")
        private EdgeMediaToCaption edgeMediaToCaption;



        public String get__typename() {
            return __typename;
        }

        public void set__typename(String __typename) {
            this.__typename = __typename;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            MediaProxy mediaProxy = new MediaProxy(display_url, "image");
            System.out.println("prox"+mediaProxy.getNewlink());
            this.display_url = mediaProxy.getNewlink();
        }

        public EdgeSidecarToChildren getEdgeSidecarToChildren() {
            return edgeSidecarToChildren;
        }

        public void setEdgeSidecarToChildren(EdgeSidecarToChildren edgeSidecarToChildren) {
            this.edgeSidecarToChildren = edgeSidecarToChildren;
        }

        public EdgeLikedBy getEdge_media_preview_like() {
            return edge_media_preview_like;
        }

        public void setEdge_media_preview_like(EdgeLikedBy edge_media_preview_like) {
            this.edge_media_preview_like = edge_media_preview_like;
        }

        public EdgeMediaToComment getEdge_media_to_comment() {
            return edge_media_to_comment;
        }

        public void setEdge_media_to_comment(EdgeMediaToComment edge_media_to_comment) {
            this.edge_media_to_comment = edge_media_to_comment;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getVideo_view_count() {
            return video_view_count;
        }

        public void setVideo_view_count(int video_view_count) {
            this.video_view_count = video_view_count;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {

            this.video_url = video_url;
        }

        public EdgeMediaToCaption getEdgeMediaToCaption() {
            return edgeMediaToCaption;
        }

        public void setEdgeMediaToCaption(EdgeMediaToCaption edgeMediaToCaption) {
            this.edgeMediaToCaption = edgeMediaToCaption;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeSidecarToChildren{
        private List<Item> edges;

        public List<Item> getEdges() {
            return edges;
        }

        public void setEdges(List<Item> edges) {
            this.edges = edges;
        }
    }



    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeMediaToComment{
        private int count;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeLikedBy{
        private int count;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeMediaToCaption{
        private List<Item> edges;

        public List<Item> getEdges() {
            return edges;
        }

        public void setEdges(List<Item> edges) {
            this.edges = edges;
        }
    }




}




