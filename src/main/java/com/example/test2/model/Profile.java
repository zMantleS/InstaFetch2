package com.example.test2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    @JsonProperty("username")
    private String username;

    private String id;

    private String full_name;

    private boolean is_private;

    private String bio;

    private String fbid;

    private String profile_pic_url_hd_proxy;

    private int followers;

    private int following;

    private boolean is_business;

    private boolean is_verified;

    private String category_name;

    private LastMedia lastMedia;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LastMedia{
        private int count;
        private List<MediaItem> media;
        private PageInfo page_info;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<MediaItem> getMedia() {
            return media;
        }

        public void setMedia(List<MediaItem> media) {
            this.media = media;
        }

        public PageInfo getPage_info() {
            return page_info;
        }

        public void setPage_info(PageInfo page_info) {
            this.page_info = page_info;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PageInfo{
        private boolean has_next_page;
        private String next;

        public boolean isHas_next_page() {
            return has_next_page;
        }

        public void setHas_next_page(boolean has_next_page) {
            this.has_next_page = has_next_page;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MediaItem{
        private String id;
        private String shortcode;
        private String link_to_post;
        private String display_url;
        private String display_url_proxy;
        private boolean is_video;
        private boolean is_pinned;
        private int comment_count;
        private int like;
        private String caption;
        private String thumbnail_src;
        private String thumbnail_src_proxy;
        private boolean is_more_than_one;
        private List<MediaChild> children;
        private int video_views;
        private String video_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getShortcode() {
            return shortcode;
        }

        public void setShortcode(String shortcode) {
            this.shortcode = shortcode;
        }

        public String getLink_to_post() {
            return link_to_post;
        }

        public void setLink_to_post(String link_to_post) {
            this.link_to_post = link_to_post;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            this.display_url = display_url;
        }

        public String getDisplay_url_proxy() {
            return display_url_proxy;
        }

        public void setDisplay_url_proxy(String display_url_proxy) {
            this.display_url_proxy = display_url_proxy;
        }

        public boolean isIs_video() {
            return is_video;
        }

        public void setIs_video(boolean is_video) {
            this.is_video = is_video;
        }

        public boolean isIs_pinned() {
            return is_pinned;
        }

        public void setIs_pinned(boolean is_pinned) {
            this.is_pinned = is_pinned;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getThumbnail_src() {
            return thumbnail_src;
        }

        public void setThumbnail_src(String thumbnail_src) {
            this.thumbnail_src = thumbnail_src;
        }

        public String getThumbnail_src_proxy() {
            return thumbnail_src_proxy;
        }

        public void setThumbnail_src_proxy(String thumbnail_src_proxy) {
            this.thumbnail_src_proxy = thumbnail_src_proxy;
        }

        public boolean isIs_more_than_one() {
            return is_more_than_one;
        }

        public void setIs_more_than_one(boolean is_more_than_one) {
            this.is_more_than_one = is_more_than_one;
        }

        public List<MediaChild> getChildren() {
            return children;
        }

        public void setChildren(List<MediaChild> children) {
            this.children = children;
        }

        public int getVideo_views() {
            return video_views;
        }

        public void setVideo_views(int video_views) {
            this.video_views = video_views;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MediaChild{
        private String id;
        private String shortcode;
        private String link_to_post;
        private String display_url;
        private String display_url_proxy;
        private boolean is_video;
        private String accessibility_caption;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getShortcode() {
            return shortcode;
        }

        public void setShortcode(String shortcode) {
            this.shortcode = shortcode;
        }

        public String getLink_to_post() {
            return link_to_post;
        }

        public void setLink_to_post(String link_to_post) {
            this.link_to_post = link_to_post;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            this.display_url = display_url;
        }

        public String getDisplay_url_proxy() {
            return display_url_proxy;
        }

        public void setDisplay_url_proxy(String display_url_proxy) {
            this.display_url_proxy = display_url_proxy;
        }

        public boolean isIs_video() {
            return is_video;
        }

        public void setIs_video(boolean is_video) {
            this.is_video = is_video;
        }

        public String getAccessibility_caption() {
            return accessibility_caption;
        }

        public void setAccessibility_caption(String accessibility_caption) {
            this.accessibility_caption = accessibility_caption;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    public String getProfile_pic_url_hd_proxy() {
        return profile_pic_url_hd_proxy;
    }

    public void setProfile_pic_url_hd_proxy(String profile_pic_url_hd_proxy) {
        this.profile_pic_url_hd_proxy = profile_pic_url_hd_proxy;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public boolean isIs_business() {
        return is_business;
    }

    public void setIs_business(boolean is_business) {
        this.is_business = is_business;
    }

    public boolean isIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public LastMedia getLastMedia() {
        return lastMedia;
    }

    public void setLastMedia(LastMedia lastMedia) {
        this.lastMedia = lastMedia;
    }


}
