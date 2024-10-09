package com.example.test2.model;

import com.example.test2.processing.MediaProxy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile2 {
    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private Data data;


    // Getters and setters for the outer class

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
    public static class Data {
        private String biography;

        private BiographyWithEntities biography_with_entities;
        private Boolean blocked_by_viewer;
        private Boolean restricted_by_viewer;
        private Boolean country_block;
        private String external_url;
        private String external_url_linkshimmed;
        private EdgeFollowedBy edge_followed_by;
        private EdgeFollow edge_follow;
        private String full_name;
        private Object group_metadata;
        private Boolean has_ar_effects;
        private Boolean has_clips;
        private Boolean has_guides;
        private Boolean has_channel;
        private Boolean has_blocked_viewer;
        private Integer highlight_reel_count;
        private Boolean has_requested_viewer;
        private Boolean hide_like_and_view_counts;
        private String id;
        private Boolean is_business_account;
        private Boolean is_professional_account;
        private Boolean is_supervision_enabled;
        private Boolean is_guardian_of_viewer;
        private Boolean is_supervised_by_viewer;
        private Boolean is_supervised_user;
        private Boolean is_embeds_disabled;
        private Boolean is_joined_recently;
        private Object guardian_id;
        private Object business_address_json;
        private String business_contact_method;
        private Object business_email;
        private Object business_phone_number;
        private Object business_category_name;
        private Object overall_category_name;
        private Object category_enum;
        private String category_name;
        private Boolean is_private;
        private Boolean is_verified;
        private EdgeMutualFollowedBy edge_mutual_followed_by;
        private String profile_pic_url;
        private Boolean requested_by_viewer;
        private Boolean should_show_category;
        private Boolean should_show_public_contacts;
        private Object transparency_label;
        private String transparency_product;
        private String username;
        private Object connected_fb_page;
        private List<String> pronouns;
        private int follower_count;
        private int following_count;

        private EdgeSavedMedia edge_saved_media;
        private EdgeMediaCollections edge_media_collections;

        // Getters and setters for the nested classes





        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }


        public BiographyWithEntities getBiography_with_entities() {

            return biography_with_entities;
        }

        public void setBiography_with_entities(BiographyWithEntities biography_with_entities) {
            this.biography_with_entities = biography_with_entities;
        }

        public Boolean getBlocked_by_viewer() {
            return blocked_by_viewer;
        }

        public void setBlocked_by_viewer(Boolean blocked_by_viewer) {
            this.blocked_by_viewer = blocked_by_viewer;
        }

        public Boolean getRestricted_by_viewer() {
            return restricted_by_viewer;
        }

        public void setRestricted_by_viewer(Boolean restricted_by_viewer) {
            this.restricted_by_viewer = restricted_by_viewer;
        }

        public Boolean getCountry_block() {
            return country_block;
        }

        public void setCountry_block(Boolean country_block) {
            this.country_block = country_block;
        }

        public String getExternal_url() {
            return external_url;
        }

        public void setExternal_url(String external_url) {
            this.external_url = external_url;
        }

        public String getExternal_url_linkshimmed() {
            return external_url_linkshimmed;
        }

        public void setExternal_url_linkshimmed(String external_url_linkshimmed) {
            this.external_url_linkshimmed = external_url_linkshimmed;
        }

        public EdgeFollowedBy getEdge_followed_by() {
            return edge_followed_by;
        }

        public void setEdge_followed_by(EdgeFollowedBy edge_followed_by) {
            this.edge_followed_by = edge_followed_by;
        }

        public EdgeFollow getEdge_follow() {
            return edge_follow;
        }

        public void setEdge_follow(EdgeFollow edge_follow) {
            this.edge_follow = edge_follow;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public Object getGroup_metadata() {
            return group_metadata;
        }

        public void setGroup_metadata(Object group_metadata) {
            this.group_metadata = group_metadata;
        }

        public Boolean getHas_ar_effects() {
            return has_ar_effects;
        }

        public void setHas_ar_effects(Boolean has_ar_effects) {
            this.has_ar_effects = has_ar_effects;
        }

        public Boolean getHas_clips() {
            return has_clips;
        }

        public void setHas_clips(Boolean has_clips) {
            this.has_clips = has_clips;
        }

        public Boolean getHas_guides() {
            return has_guides;
        }

        public void setHas_guides(Boolean has_guides) {
            this.has_guides = has_guides;
        }

        public Boolean getHas_channel() {
            return has_channel;
        }

        public void setHas_channel(Boolean has_channel) {
            this.has_channel = has_channel;
        }

        public Boolean getHas_blocked_viewer() {
            return has_blocked_viewer;
        }

        public void setHas_blocked_viewer(Boolean has_blocked_viewer) {
            this.has_blocked_viewer = has_blocked_viewer;
        }

        public Integer getHighlight_reel_count() {
            return highlight_reel_count;
        }

        public void setHighlight_reel_count(Integer highlight_reel_count) {
            this.highlight_reel_count = highlight_reel_count;
        }

        public Boolean getHas_requested_viewer() {
            return has_requested_viewer;
        }

        public void setHas_requested_viewer(Boolean has_requested_viewer) {
            this.has_requested_viewer = has_requested_viewer;
        }

        public Boolean getHide_like_and_view_counts() {
            return hide_like_and_view_counts;
        }

        public void setHide_like_and_view_counts(Boolean hide_like_and_view_counts) {
            this.hide_like_and_view_counts = hide_like_and_view_counts;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getIs_business_account() {
            return is_business_account;
        }

        public void setIs_business_account(Boolean is_business_account) {
            this.is_business_account = is_business_account;
        }

        public Boolean getIs_professional_account() {
            return is_professional_account;
        }

        public void setIs_professional_account(Boolean is_professional_account) {
            this.is_professional_account = is_professional_account;
        }

        public Boolean getIs_supervision_enabled() {
            return is_supervision_enabled;
        }

        public void setIs_supervision_enabled(Boolean is_supervision_enabled) {
            this.is_supervision_enabled = is_supervision_enabled;
        }

        public Boolean getIs_guardian_of_viewer() {
            return is_guardian_of_viewer;
        }

        public void setIs_guardian_of_viewer(Boolean is_guardian_of_viewer) {
            this.is_guardian_of_viewer = is_guardian_of_viewer;
        }

        public Boolean getIs_supervised_by_viewer() {
            return is_supervised_by_viewer;
        }

        public void setIs_supervised_by_viewer(Boolean is_supervised_by_viewer) {
            this.is_supervised_by_viewer = is_supervised_by_viewer;
        }

        public Boolean getIs_supervised_user() {
            return is_supervised_user;
        }

        public void setIs_supervised_user(Boolean is_supervised_user) {
            this.is_supervised_user = is_supervised_user;
        }

        public Boolean getIs_embeds_disabled() {
            return is_embeds_disabled;
        }

        public void setIs_embeds_disabled(Boolean is_embeds_disabled) {
            this.is_embeds_disabled = is_embeds_disabled;
        }

        public Boolean getIs_joined_recently() {
            return is_joined_recently;
        }

        public void setIs_joined_recently(Boolean is_joined_recently) {
            this.is_joined_recently = is_joined_recently;
        }

        public Object getGuardian_id() {
            return guardian_id;
        }

        public void setGuardian_id(Object guardian_id) {
            this.guardian_id = guardian_id;
        }

        public Object getBusiness_address_json() {
            return business_address_json;
        }

        public void setBusiness_address_json(Object business_address_json) {
            this.business_address_json = business_address_json;
        }

        public String getBusiness_contact_method() {
            return business_contact_method;
        }

        public void setBusiness_contact_method(String business_contact_method) {
            this.business_contact_method = business_contact_method;
        }

        public Object getBusiness_email() {
            return business_email;
        }

        public void setBusiness_email(Object business_email) {
            this.business_email = business_email;
        }

        public Object getBusiness_phone_number() {
            return business_phone_number;
        }

        public void setBusiness_phone_number(Object business_phone_number) {
            this.business_phone_number = business_phone_number;
        }

        public Object getBusiness_category_name() {
            return business_category_name;
        }

        public void setBusiness_category_name(Object business_category_name) {
            this.business_category_name = business_category_name;
        }

        public Object getOverall_category_name() {
            return overall_category_name;
        }

        public void setOverall_category_name(Object overall_category_name) {
            this.overall_category_name = overall_category_name;
        }

        public Object getCategory_enum() {
            return category_enum;
        }

        public void setCategory_enum(Object category_enum) {
            this.category_enum = category_enum;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public Boolean getIs_private() {
            return is_private;
        }

        public void setIs_private(Boolean is_private) {
            this.is_private = is_private;
        }

        public Boolean getIs_verified() {
            return is_verified;
        }

        public void setIs_verified(Boolean is_verified) {
            this.is_verified = is_verified;
        }

        public EdgeMutualFollowedBy getEdge_mutual_followed_by() {
            return edge_mutual_followed_by;
        }

        public void setEdge_mutual_followed_by(EdgeMutualFollowedBy edge_mutual_followed_by) {
            this.edge_mutual_followed_by = edge_mutual_followed_by;
        }

        public String getProfile_pic_url() {
            return profile_pic_url;
        }

        public void setProfile_pic_url(String profile_pic_url) {
            MediaProxy mediaProxy = new MediaProxy(profile_pic_url, "image");
            this.profile_pic_url = mediaProxy.getNewlink();
        }


        public Boolean getRequested_by_viewer() {
            return requested_by_viewer;
        }

        public void setRequested_by_viewer(Boolean requested_by_viewer) {
            this.requested_by_viewer = requested_by_viewer;
        }

        public Boolean getShould_show_category() {
            return should_show_category;
        }

        public void setShould_show_category(Boolean should_show_category) {
            this.should_show_category = should_show_category;
        }

        public Boolean getShould_show_public_contacts() {
            return should_show_public_contacts;
        }

        public void setShould_show_public_contacts(Boolean should_show_public_contacts) {
            this.should_show_public_contacts = should_show_public_contacts;
        }

        public Object getTransparency_label() {
            return transparency_label;
        }

        public void setTransparency_label(Object transparency_label) {
            this.transparency_label = transparency_label;
        }

        public String getTransparency_product() {
            return transparency_product;
        }

        public void setTransparency_product(String transparency_product) {
            this.transparency_product = transparency_product;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Object getConnected_fb_page() {
            return connected_fb_page;
        }

        public void setConnected_fb_page(Object connected_fb_page) {
            this.connected_fb_page = connected_fb_page;
        }

        public List<String> getPronouns() {
            return pronouns;
        }

        public void setPronouns(List<String> pronouns) {
            this.pronouns = pronouns;
        }


        public EdgeSavedMedia getEdge_saved_media() {
            return edge_saved_media;
        }

        public void setEdge_saved_media(EdgeSavedMedia edge_saved_media) {
            this.edge_saved_media = edge_saved_media;
        }

        public EdgeMediaCollections getEdge_media_collections() {
            return edge_media_collections;
        }

        public void setEdge_media_collections(EdgeMediaCollections edge_media_collections) {
            this.edge_media_collections = edge_media_collections;
        }

        public int getFollower_count() {
            return follower_count;
        }

        public void setFollower_count(int follower_count) {
            this.follower_count = follower_count;
        }

        public int getFollowing_count() {
            return following_count;
        }

        public void setFollowing_count(int following_count) {
            this.following_count = following_count;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BiographyWithEntities {
        private String raw_text;

        // Getters and setters for the nested class

        public String getRaw_text() {
            return raw_text;
        }

        public void setRaw_text(String raw_text) {
            this.raw_text = raw_text;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Entity{
        private User user;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class User{
        private String username;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeFollowedBy {
        private Integer count;
        private String fbid;
        private Boolean followed_by_viewer;

        // Getters and setters for the nested class

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getFbid() {
            return fbid;
        }

        public void setFbid(String fbid) {
            this.fbid = fbid;
        }

        public Boolean getFollowed_by_viewer() {
            return followed_by_viewer;
        }

        public void setFollowed_by_viewer(Boolean followed_by_viewer) {
            this.followed_by_viewer = followed_by_viewer;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeFollow {
        private Integer count;
        private Boolean follows_viewer;

        // Getters and setters for the nested class

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Boolean getFollows_viewer() {
            return follows_viewer;
        }

        public void setFollows_viewer(Boolean follows_viewer) {
            this.follows_viewer = follows_viewer;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeMutualFollowedBy {
        private Integer count;
        private List<Object> edges;

        // Getters and setters for the nested class

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<Object> getEdges() {
            return edges;
        }

        public void setEdges(List<Object> edges) {
            this.edges = edges;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeSavedMedia {
        private Integer count;
        private PageInfo pageInfo;
        private List<Object> edges;

        // Getters and setters for the nested class

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public PageInfo getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
        }

        public List<Object> getEdges() {
            return edges;
        }

        public void setEdges(List<Object> edges) {
            this.edges = edges;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EdgeMediaCollections {
        private Integer count;
        private PageInfo pageInfo;
        private List<Object> edges;

        // Getters and setters for the nested class

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public PageInfo getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
        }

        public List<Object> getEdges() {
            return edges;
        }

        public void setEdges(List<Object> edges) {
            this.edges = edges;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PageInfo {
        private Boolean has_next_page;
        private String end_cursor;

        // Getters and setters for the nested class

        public Boolean getHas_next_page() {
            return has_next_page;
        }

        public void setHas_next_page(Boolean has_next_page) {
            this.has_next_page = has_next_page;
        }

        public String getEnd_cursor() {
            return end_cursor;
        }

        public void setEnd_cursor(String end_cursor) {
            this.end_cursor = end_cursor;
        }
    }


}
