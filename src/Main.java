import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
       String json = "{\n" +
                "  \"kind\": \"Listing\",\n" +
                "  \"data\": {\n" +
                "    \"modhash\": \"\",\n" +
                "    \"dist\": 25,\n" +
                "    \"children\": [\n" +
                "      {\n" +
                "        \"kind\": \"t3\",\n" +
                "        \"data\": {\n" +
                "          \"approved_at_utc\": null,\n" +
                "          \"subreddit\": \"funny\",\n" +
                "          \"selftext\": \"\",\n" +
                "          \"author_fullname\": \"t2_rc2qj\",\n" +
                "          \"saved\": false,\n" +
                "          \"mod_reason_title\": null,\n" +
                "          \"gilded\": 3,\n" +
                "          \"clicked\": false,\n" +
                "          \"title\": \"The only baby picture i have... why?\",\n" +
                "          \"link_flair_richtext\": [],\n" +
                "          \"subreddit_name_prefixed\": \"r/funny\",\n" +
                "          \"hidden\": false,\n" +
                "          \"pwls\": 6,\n" +
                "          \"link_flair_css_class\": null,\n" +
                "          \"downs\": 0,\n" +
                "          \"thumbnail_height\": 140,\n" +
                "          \"top_awarded_type\": null,\n" +
                "          \"hide_score\": false,\n" +
                "          \"name\": \"t3_i33bkg\",\n" +
                "          \"quarantine\": false,\n" +
                "          \"link_flair_text_color\": \"dark\",\n" +
                "          \"upvote_ratio\": 0.91,\n" +
                "          \"author_flair_background_color\": null,\n" +
                "          \"subreddit_type\": \"public\",\n" +
                "          \"ups\": 129378,\n" +
                "          \"total_awards_received\": 31,\n" +
                "          \"media_embed\": {},\n" +
                "          \"thumbnail_width\": 140,\n" +
                "          \"author_flair_template_id\": null,\n" +
                "          \"is_original_content\": false,\n" +
                "          \"user_reports\": [],\n" +
                "          \"secure_media\": null,\n" +
                "          \"is_reddit_media_domain\": true,\n" +
                "          \"is_meta\": false,\n" +
                "          \"category\": null,\n" +
                "          \"secure_media_embed\": {},\n" +
                "          \"link_flair_text\": null,\n" +
                "          \"can_mod_post\": false,\n" +
                "          \"score\": 129378,\n" +
                "          \"approved_by\": null,\n" +
                "          \"author_premium\": true,\n" +
                "          \"thumbnail\": \"https://b.thumbs.redditmedia.com/hx81ohJKZmTEzAHC0RYsp85LCfYTpohDsxjNPGEAQHw.jpg\",\n" +
                "          \"edited\": false,\n" +
                "          \"author_flair_css_class\": null,\n" +
                "          \"author_flair_richtext\": [],\n" +
                "          \"gildings\": {\n" +
                "            \"gid_1\": 3,\n" +
                "            \"gid_2\": 3,\n" +
                "            \"gid_3\": 1\n" +
                "          },\n" +
                "          \"post_hint\": \"image\",\n" +
                "          \"content_categories\": null,\n" +
                "          \"is_self\": false,\n" +
                "          \"mod_note\": null,\n" +
                "          \"created\": 1596510531,\n" +
                "          \"link_flair_type\": \"text\",\n" +
                "          \"wls\": 6,\n" +
                "          \"removed_by_category\": null,\n" +
                "          \"banned_by\": null,\n" +
                "          \"author_flair_type\": \"text\",\n" +
                "          \"domain\": \"i.redd.it\",\n" +
                "          \"allow_live_comments\": true,\n" +
                "          \"selftext_html\": null,\n" +
                "          \"likes\": null,\n" +
                "          \"suggested_sort\": null,\n" +
                "          \"banned_at_utc\": null,\n" +
                "          \"url_overridden_by_dest\": \"https://i.redd.it/4vxsmbsb6ue51.jpg\",\n" +
                "          \"view_count\": null,\n" +
                "          \"archived\": false,\n" +
                "          \"no_follow\": false,\n" +
                "          \"is_crosspostable\": false,\n" +
                "          \"pinned\": false,\n" +
                "          \"over_18\": false,\n" +
                "          \"awarders\": [],\n" +
                "          \"media_only\": false,\n" +
                "          \"can_gild\": false,\n" +
                "          \"spoiler\": false,\n" +
                "          \"locked\": false,\n" +
                "          \"author_flair_text\": null,\n" +
                "          \"treatment_tags\": [],\n" +
                "          \"visited\": false,\n" +
                "          \"removed_by\": null,\n" +
                "          \"num_reports\": null,\n" +
                "          \"distinguished\": null,\n" +
                "          \"subreddit_id\": \"t5_2qh33\",\n" +
                "          \"mod_reason_by\": null,\n" +
                "          \"removal_reason\": null,\n" +
                "          \"link_flair_background_color\": \"\",\n" +
                "          \"id\": \"i33bkg\",\n" +
                "          \"is_robot_indexable\": true,\n" +
                "          \"report_reasons\": null,\n" +
                "          \"author\": \"OhCaptainDem\",\n" +
                "          \"discussion_type\": null,\n" +
                "          \"num_comments\": 3254,\n" +
                "          \"send_replies\": true,\n" +
                "          \"whitelist_status\": \"all_ads\",\n" +
                "          \"contest_mode\": false,\n" +
                "          \"mod_reports\": [],\n" +
                "          \"author_patreon_flair\": false,\n" +
                "          \"author_flair_text_color\": null,\n" +
                "          \"permalink\": \"/r/funny/comments/i33bkg/the_only_baby_picture_i_have_why/\",\n" +
                "          \"parent_whitelist_status\": \"all_ads\",\n" +
                "          \"stickied\": false,\n" +
                "          \"url\": \"https://i.redd.it/4vxsmbsb6ue51.jpg\",\n" +
                "          \"subreddit_subscribers\": 32125587,\n" +
                "          \"created_utc\": 1596481731,\n" +
                "          \"num_crossposts\": 15,\n" +
                "          \"media\": null,\n" +
                "          \"is_video\": false\n" +
                "        }\n" +
                "      }";

        ObjectMapper objectMapper = new ObjectMapper();
        RedditTopNews rootNode = objectMapper.readValue(json, RedditTopNews.class);
        String kind = rootNode.kind;
        System.out.println(kind);
        /*RedditTopNews topNews = new RedditTopNews();
        RedditTopNews.Data data = topNews.new Data();
        RedditTopNews.Children children = topNews.new Children();
        RedditTopNews.Children.Data data1 = topNews.new RedditTopNews.Children.Data();*/


    }
}
