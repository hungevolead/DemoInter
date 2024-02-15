package com.frank.demointer.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ItemTikTok(
    val id: String?,
    val title: String?,
    val description: String?,
    val author: String?,
    val image: String?,
    val video: String?,
) : Serializable

data class GetListItemTiktokResponse(
    @SerializedName("status_code")
    val statusCode: Long?,
    @SerializedName("min_cursor")
    val minCursor: Long?,
    @SerializedName("max_cursor")
    val maxCursor: Long?,
    @SerializedName("has_more")
    val hasMore: Long?,
    @SerializedName("aweme_list")
    val awemeList: List<AwemeList>?,
)

data class AwemeList(
    @SerializedName("aweme_id")
    val awemeId: String?,
    val desc: String?,
    @SerializedName("create_time")
    val createTime: Long?,
    val author: Author?,
//    val music: Music?,
    @SerializedName("cha_list")
//    val chaList: List<ChaList?>?,
    val video: Video?,
)

data class Author(
    val uid: String?,
    @SerializedName("short_id")
    val shortId: String?,
    val nickname: String?,
    val gender: Long?,
    val signature: String?,
    val birthday: String?,
    @SerializedName("follow_status")
    val followStatus: Long?,
    @SerializedName("aweme_count")
    val awemeCount: Long?,
    @SerializedName("following_count")
    val followingCount: Long?,
    @SerializedName("follower_count")
    val followerCount: Long?,
    @SerializedName("favoriting_count")
    val favoritingCount: Long?,
    @SerializedName("total_favorited")
    val totalFavorited: Long?,
    @SerializedName("is_block")
    val isBlock: Boolean?,
    @SerializedName("hide_search")
    val hideSearch: Boolean?,
    @SerializedName("custom_verify")
    val customVerify: String?,
    @SerializedName("unique_id")
    val uniqueId: String?,
    @SerializedName("bind_phone")
    val bindPhone: String?,
    @SerializedName("special_lock")
    val specialLock: Long?,
    @SerializedName("need_recommend")
    val needRecommend: Long?,
    @SerializedName("has_facebook_token")
    val hasFacebookToken: Boolean?,
    @SerializedName("has_twitter_token")
    val hasTwitterToken: Boolean?,
    @SerializedName("fb_expire_time")
    val fbExpireTime: Long?,
    @SerializedName("tw_expire_time")
    val twExpireTime: Long?,
    @SerializedName("has_youtube_token")
    val hasYoutubeToken: Boolean?,
    @SerializedName("youtube_expire_time")
    val youtubeExpireTime: Long?,
    @SerializedName("room_id")
    val roomId: Long?,
    @SerializedName("live_verify")
    val liveVerify: Long?,
    @SerializedName("authority_status")
    val authorityStatus: Long?,
    @SerializedName("verify_info")
    val verifyInfo: String?,
    @SerializedName("shield_follow_notice")
    val shieldFollowNotice: Long?,
    @SerializedName("shield_digg_notice")
    val shieldDiggNotice: Long?,
    @SerializedName("shield_comment_notice")
    val shieldCommentNotice: Long?,
//    @SerializedName("share_info")
//    val shareInfo: ShareInfo?,
    @SerializedName("with_commerce_entry")
    val withCommerceEntry: Boolean?,
    @SerializedName("verification_type")
    val verificationType: Long?,
    @SerializedName("enterprise_verify_reason")
    val enterpriseVerifyReason: String?,
    @SerializedName("is_ad_fake")
    val isAdFake: Boolean?,
//    @SerializedName("followers_detail")
//    val followersDetail: Any?,
    val region: String?,
    @SerializedName("account_region")
    val accountRegion: String?,
    @SerializedName("commerce_user_level")
    val commerceUserLevel: Long?,
    @SerializedName("live_agreement")
    val liveAgreement: Long?,
//    @SerializedName("platform_sync_info")
//    val platformSyncInfo: Any?,
    @SerializedName("with_shop_entry")
    val withShopEntry: Boolean?,
    @SerializedName("is_discipline_member")
    val isDisciplineMember: Boolean?,
    val secret: Long?,
    @SerializedName("has_orders")
    val hasOrders: Boolean?,
    @SerializedName("prevent_download")
    val preventDownload: Boolean?,
    @SerializedName("show_image_bubble")
    val showImageBubble: Boolean?,
//    val geofencing: List<Any>?,
    @SerializedName("unique_id_modify_time")
    val uniqueIdModifyTime: Long?,
//    @SerializedName("video_icon")
//    val videoIcon: VideoIcon?,
    @SerializedName("ins_id")
    val insId: String?,
    @SerializedName("google_account")
    val googleAccount: String?,
    @SerializedName("youtube_channel_id")
    val youtubeChannelId: String?,
    @SerializedName("youtube_channel_title")
    val youtubeChannelTitle: String?,
    @SerializedName("apple_account")
    val appleAccount: Long?,
    @SerializedName("with_fusion_shop_entry")
    val withFusionShopEntry: Boolean?,
    @SerializedName("is_phone_binded")
    val isPhoneBinded: Boolean?,
    @SerializedName("accept_private_policy")
    val acceptPrivatePolicy: Boolean?,
    @SerializedName("twitter_id")
    val twitterId: String?,
    @SerializedName("twitter_name")
    val twitterName: String?,
    @SerializedName("user_canceled")
    val userCanceled: Boolean?,
    @SerializedName("has_email")
    val hasEmail: Boolean?,
    @SerializedName("live_agreement_time")
    val liveAgreementTime: Long?,
    val status: Long?,
    @SerializedName("create_time")
    val createTime: Long?,
    @SerializedName("avatar_uri")
    val avatarUri: String?,
    @SerializedName("follower_status")
    val followerStatus: Long?,
    @SerializedName("comment_setting")
    val commentSetting: Long?,
    @SerializedName("duet_setting")
    val duetSetting: Long?,
    @SerializedName("reflow_page_gid")
    val reflowPageGid: Long?,
    @SerializedName("reflow_page_uid")
    val reflowPageUid: Long?,
    @SerializedName("user_rate")
    val userRate: Long?,
    @SerializedName("download_setting")
    val downloadSetting: Long?,
    @SerializedName("download_prompt_ts")
    val downloadPromptTs: Long?,
    @SerializedName("react_setting")
    val reactSetting: Long?,
    @SerializedName("live_commerce")
    val liveCommerce: Boolean?,
//    @SerializedName("cover_url")
    val coverUrl: List<CoverUrl>?,
    val language: String?,
    @SerializedName("has_insights")
    val hasInsights: Boolean?,
    @SerializedName("share_qrcode_uri")
    val shareQrcodeUri: String?,
//    @SerializedName("item_list")
//    val itemList: Any?,
    @SerializedName("user_mode")
    val userMode: Long?,
    @SerializedName("user_period")
    val userPeriod: Long?,
    @SerializedName("is_star")
    val isStar: Boolean?,
    @SerializedName("cv_level")
    val cvLevel: String?,
//    @SerializedName("type_label")
//    val typeLabel: List<Any>?,
//    @SerializedName("ad_cover_url")
//    val adCoverUrl: Any?,
    @SerializedName("comment_filter_status")
    val commentFilterStatus: Long?,
//    @SerializedName("avatar_168x168")
//    val avatar168x168: Avatar168x168?,
//    @SerializedName("avatar_300x300")
//    val avatar300x300: Avatar300x300?,
//    @SerializedName("relative_users")
//    val relativeUsers: Any?,
//    @SerializedName("cha_list")
//    val chaList: Any?,
    @SerializedName("sec_uid")
    val secUid: String?,
//    @SerializedName("need_points")
//    val needPoints: Any?,
//    @SerializedName("homepage_bottom_toast")
//    val homepageBottomToast: Any?,
//    @SerializedName("can_set_geofencing")
//    val canSetGeofencing: Any?,
//    @SerializedName("white_cover_url")
//    val whiteCoverUrl: Any?,
//    @SerializedName("user_tags")
//    val userTags: Any?,
    @SerializedName("stitch_setting")
    val stitchSetting: Long?,
//    @SerializedName("bold_fields")
//    val boldFields: Any?,
//    @SerializedName("search_highlight")
//    val searchHighlight: Any?,
//    @SerializedName("mutual_relation_avatars")
//    val mutualRelationAvatars: Any?,
    @SerializedName("social_info")
    val socialInfo: String?,
//    val events: Any?,
//    @SerializedName("matched_friend")
//    val matchedFriend: MatchedFriend?,
//    @SerializedName("advance_feature_item_order")
//    val advanceFeatureItemOrder: Any?,
//    @SerializedName("advanced_feature_info")
//    val advancedFeatureInfo: Any?,
//    @SerializedName("user_profile_guide")
//    val userProfileGuide: Any?,
//    @SerializedName("shield_edit_field_info")
//    val shieldEditFieldInfo: Any?,
//    @SerializedName("friends_status")
    val friendsStatus: Long?,
//    @SerializedName("can_message_follow_status_list")
//    val canMessageFollowStatusList: Any?,
//    @SerializedName("account_labels")
//    val accountLabels: Any?,
)

data class AvatarLarger(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarThumb(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarMedium(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class ShareInfo(
    @SerializedName("share_url")
    val shareUrl: String?,
    @SerializedName("share_weibo_desc")
    val shareWeiboDesc: String?,
    @SerializedName("share_desc")
    val shareDesc: String?,
    @SerializedName("share_title")
    val shareTitle: String?,
    @SerializedName("share_qrcode_url")
    val shareQrcodeUrl: ShareQrcodeUrl?,
    @SerializedName("share_title_myself")
    val shareTitleMyself: String?,
    @SerializedName("share_title_other")
    val shareTitleOther: String?,
    @SerializedName("share_desc_info")
    val shareDescInfo: String?,
    @SerializedName("now_invitation_card_image_urls")
    val nowInvitationCardImageUrls: Any?,
)

data class ShareQrcodeUrl(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<Any>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class VideoIcon(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<Any>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverUrl(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
//    @SerializedName("url_prefix")
//    val urlPrefix: Any?,
)

data class Avatar168x168(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class Avatar300x300(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class MatchedFriend(
    @SerializedName("video_items")
    val videoItems: Any?,
)

data class Music(
    val id: Long?,
    @SerializedName("id_str")
    val idStr: String?,
    val title: String?,
    val author: String?,
    val album: String?,
    @SerializedName("cover_hd")
    val coverHd: CoverHd?,
    @SerializedName("cover_large")
    val coverLarge: CoverLarge?,
    @SerializedName("cover_medium")
    val coverMedium: CoverMedium?,
    @SerializedName("cover_thumb")
    val coverThumb: CoverThumb?,
    @SerializedName("play_url")
    val playUrl: PlayUrl?,
    @SerializedName("schema_url")
    val schemaUrl: String?,
    @SerializedName("source_platform")
    val sourcePlatform: Long?,
    @SerializedName("start_time")
    val startTime: Long?,
    @SerializedName("end_time")
    val endTime: Long?,
    val duration: Long?,
    val extra: String?,
    @SerializedName("user_count")
    val userCount: Long?,
    val position: Any?,
    @SerializedName("collect_stat")
    val collectStat: Long?,
    val status: Long?,
    @SerializedName("offline_desc")
    val offlineDesc: String?,
    @SerializedName("owner_id")
    val ownerId: String?,
    @SerializedName("owner_nickname")
    val ownerNickname: String?,
    @SerializedName("is_original")
    val isOriginal: Boolean?,
    val mid: String?,
    @SerializedName("binded_challenge_id")
    val bindedChallengeId: Long?,
    val redirect: Boolean?,
    @SerializedName("is_restricted")
    val isRestricted: Boolean?,
    @SerializedName("author_deleted")
    val authorDeleted: Boolean?,
    @SerializedName("is_del_video")
    val isDelVideo: Boolean?,
    @SerializedName("is_video_self_see")
    val isVideoSelfSee: Boolean?,
    @SerializedName("owner_handle")
    val ownerHandle: String?,
    @SerializedName("author_position")
    val authorPosition: Any?,
    @SerializedName("prevent_download")
    val preventDownload: Boolean?,
    @SerializedName("strong_beat_url")
    val strongBeatUrl: StrongBeatUrl?,
    @SerializedName("prevent_item_download_status")
    val preventItemDownloadStatus: Long?,
    @SerializedName("external_song_info")
    val externalSongInfo: List<Any>?,
    @SerializedName("sec_uid")
    val secUid: String?,
    @SerializedName("avatar_thumb")
    val avatarThumb: AvatarThumb2?,
    @SerializedName("avatar_medium")
    val avatarMedium: AvatarMedium2?,
    @SerializedName("avatar_large")
    val avatarLarge: AvatarLarge?,
    @SerializedName("preview_start_time")
    val previewStartTime: Long?,
    @SerializedName("preview_end_time")
    val previewEndTime: Long?,
    @SerializedName("is_commerce_music")
    val isCommerceMusic: Boolean?,
    @SerializedName("is_original_sound")
    val isOriginalSound: Boolean?,
    val artists: Any?,
    @SerializedName("lyric_short_position")
    val lyricShortPosition: Any?,
    @SerializedName("mute_share")
    val muteShare: Boolean?,
    @SerializedName("tag_list")
    val tagList: Any?,
    @SerializedName("is_author_artist")
    val isAuthorArtist: Boolean?,
    @SerializedName("is_pgc")
    val isPgc: Boolean?,
    @SerializedName("search_highlight")
    val searchHighlight: Any?,
    @SerializedName("multi_bit_rate_play_info")
    val multiBitRatePlayInfo: Any?,
    @SerializedName("tt_to_dsp_song_infos")
    val ttToDspSongInfos: Any?,
    @SerializedName("recommend_status")
    val recommendStatus: Long?,
)

data class CoverHd(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverLarge(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverMedium(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverThumb(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class PlayUrl(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class StrongBeatUrl(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarThumb2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarMedium2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarLarge(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class ChaList(
    val cid: String?,
    @SerializedName("cha_name")
    val chaName: String?,
    val desc: String?,
    val schema: String?,
    val author: Author2?,
    @SerializedName("user_count")
    val userCount: Long?,
    @SerializedName("share_info")
    val shareInfo: ShareInfo2?,
    @SerializedName("connect_music")
    val connectMusic: List<Any>?,
    val type: Long?,
    @SerializedName("sub_type")
    val subType: Long?,
    @SerializedName("is_pgcshow")
    val isPgcshow: Boolean?,
    @SerializedName("collect_stat")
    val collectStat: Long?,
    @SerializedName("is_challenge")
    val isChallenge: Long?,
    @SerializedName("view_count")
    val viewCount: Long?,
    @SerializedName("is_commerce")
    val isCommerce: Boolean?,
    @SerializedName("hashtag_profile")
    val hashtagProfile: String?,
    @SerializedName("cha_attrs")
    val chaAttrs: Any?,
    @SerializedName("banner_list")
    val bannerList: Any?,
    @SerializedName("show_items")
    val showItems: Any?,
    @SerializedName("search_highlight")
    val searchHighlight: Any?,
)

data class Author2(
    @SerializedName("followers_detail")
    val followersDetail: Any?,
    @SerializedName("platform_sync_info")
    val platformSyncInfo: Any?,
    val geofencing: Any?,
    @SerializedName("cover_url")
    val coverUrl: Any?,
    @SerializedName("item_list")
    val itemList: Any?,
    @SerializedName("type_label")
    val typeLabel: Any?,
    @SerializedName("ad_cover_url")
    val adCoverUrl: Any?,
    @SerializedName("relative_users")
    val relativeUsers: Any?,
    @SerializedName("cha_list")
    val chaList: Any?,
    @SerializedName("need_points")
    val needPoints: Any?,
    @SerializedName("homepage_bottom_toast")
    val homepageBottomToast: Any?,
    @SerializedName("can_set_geofencing")
    val canSetGeofencing: Any?,
    @SerializedName("white_cover_url")
    val whiteCoverUrl: Any?,
    @SerializedName("user_tags")
    val userTags: Any?,
    @SerializedName("bold_fields")
    val boldFields: Any?,
    @SerializedName("search_highlight")
    val searchHighlight: Any?,
    @SerializedName("mutual_relation_avatars")
    val mutualRelationAvatars: Any?,
    val events: Any?,
    @SerializedName("advance_feature_item_order")
    val advanceFeatureItemOrder: Any?,
    @SerializedName("advanced_feature_info")
    val advancedFeatureInfo: Any?,
    @SerializedName("user_profile_guide")
    val userProfileGuide: Any?,
    @SerializedName("shield_edit_field_info")
    val shieldEditFieldInfo: Any?,
    @SerializedName("can_message_follow_status_list")
    val canMessageFollowStatusList: Any?,
    @SerializedName("account_labels")
    val accountLabels: Any?,
)

data class ShareInfo2(
    @SerializedName("share_url")
    val shareUrl: String?,
    @SerializedName("share_weibo_desc")
    val shareWeiboDesc: String?,
    @SerializedName("share_desc")
    val shareDesc: String?,
    @SerializedName("share_title")
    val shareTitle: String?,
    @SerializedName("bool_persist")
    val boolPersist: Long?,
    @SerializedName("share_title_myself")
    val shareTitleMyself: String?,
    @SerializedName("share_title_other")
    val shareTitleOther: String?,
    @SerializedName("share_signature_url")
    val shareSignatureUrl: String?,
    @SerializedName("share_signature_desc")
    val shareSignatureDesc: String?,
    @SerializedName("share_quote")
    val shareQuote: String?,
    @SerializedName("share_desc_info")
    val shareDescInfo: String?,
    @SerializedName("now_invitation_card_image_urls")
    val nowInvitationCardImageUrls: Any?,
)

data class Video(
    @SerializedName("play_addr")
//    val playAddr: PlayAddr?,
    val cover: Cover?,
    val height: Long?,
    val width: Long?,
//    @SerializedName("dynamic_cover")
//    val dynamicCover: DynamicCover?,
//    @SerializedName("origin_cover")
//    val originCover: OriginCover?,
    val ratio: String?,
//    @SerializedName("download_addr")
//    val downloadAddr: DownloadAddr?,
    @SerializedName("has_watermark")
    val hasWatermark: Boolean?,
//    @SerializedName("bit_rate")
//    val bitRate: List<BitRate>?,
    val duration: Long?,
//    @SerializedName("download_suffix_logo_addr")
//    val downloadSuffixLogoAddr: DownloadSuffixLogoAddr?,
    @SerializedName("has_download_suffix_logo_addr")
    val hasDownloadSuffixLogoAddr: Boolean?,
//    @SerializedName("play_addr_265")
//    val playAddr265: PlayAddr2652?,
    @SerializedName("is_h265")
    val isH265: Long?,
//    @SerializedName("play_addr_h264")
//    val playAddrH264: PlayAddrH264?,
    @SerializedName("cdn_url_expired")
    val cdnUrlExpired: Long?,
    @SerializedName("need_set_token")
    val needSetToken: Boolean?,
//    @SerializedName("CoverTsp")
//    val coverTsp: Double?,
    @SerializedName("misc_download_addrs")
    val miscDownloadAddrs: String?,
//    val tags: Any?,
//    @SerializedName("big_thumbs")
//    val bigThumbs: Any?,
    @SerializedName("is_bytevc1")
    val isBytevc1: Long?,
    val meta: String?,
    @SerializedName("cover_is_custom")
    val coverIsCustom: Boolean?,
    @SerializedName("source_HDR_type")
    val sourceHdrType: Long?,
//    @SerializedName("bit_rate_audio")
//    val bitRateAudio: List<Any>?,
)

data class PlayAddr(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("file_hash")
    val fileHash: String?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class Cover(
    val uri: String?,
    @SerializedName("url_list")
//    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
//    @SerializedName("url_prefix")
//    val urlPrefix: Any?,
)

data class DynamicCover(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class OriginCover(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class DownloadAddr(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class BitRate(
    @SerializedName("gear_name")
    val gearName: String?,
    @SerializedName("quality_type")
    val qualityType: Long?,
    @SerializedName("bit_rate")
    val bitRate: Long?,
    @SerializedName("play_addr")
    val playAddr: PlayAddr2?,
    @SerializedName("is_h265")
    val isH265: Long?,
    @SerializedName("play_addr_265")
    val playAddr265: PlayAddr265?,
    @SerializedName("is_bytevc1")
    val isBytevc1: Long?,
    @SerializedName("dub_infos")
    val dubInfos: Any?,
    @SerializedName("HDR_type")
    val hdrType: String?,
    @SerializedName("HDR_bit")
    val hdrBit: String?,
)

data class PlayAddr2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("file_hash")
    val fileHash: String?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class PlayAddr265(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("file_hash")
    val fileHash: String?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class DownloadSuffixLogoAddr(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class PlayAddr2652(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("file_hash")
    val fileHash: String?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class PlayAddrH264(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_key")
    val urlKey: String?,
    @SerializedName("data_size")
    val dataSize: Long?,
    @SerializedName("file_hash")
    val fileHash: String?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class Statistics(
    @SerializedName("aweme_id")
    val awemeId: String?,
    @SerializedName("comment_count")
    val commentCount: Long?,
    @SerializedName("digg_count")
    val diggCount: Long?,
    @SerializedName("download_count")
    val downloadCount: Long?,
    @SerializedName("play_count")
    val playCount: Long?,
    @SerializedName("share_count")
    val shareCount: Long?,
    @SerializedName("forward_count")
    val forwardCount: Long?,
    @SerializedName("lose_count")
    val loseCount: Long?,
    @SerializedName("lose_comment_count")
    val loseCommentCount: Long?,
    @SerializedName("whatsapp_share_count")
    val whatsappShareCount: Long?,
    @SerializedName("collect_count")
    val collectCount: Long?,
)

data class Status(
    @SerializedName("aweme_id")
    val awemeId: String?,
    @SerializedName("is_delete")
    val isDelete: Boolean?,
    @SerializedName("allow_share")
    val allowShare: Boolean?,
    @SerializedName("allow_comment")
    val allowComment: Boolean?,
    @SerializedName("is_private")
    val isPrivate: Boolean?,
    @SerializedName("with_goods")
    val withGoods: Boolean?,
    @SerializedName("private_status")
    val privateStatus: Long?,
    @SerializedName("in_reviewing")
    val inReviewing: Boolean?,
    val reviewed: Long?,
    @SerializedName("self_see")
    val selfSee: Boolean?,
    @SerializedName("is_prohibited")
    val isProhibited: Boolean?,
    @SerializedName("download_status")
    val downloadStatus: Long?,
)

data class TextExtra(
    val start: Long?,
    val end: Long?,
    @SerializedName("user_id")
    val userId: String?,
    val type: Long?,
    @SerializedName("hashtag_name")
    val hashtagName: String?,
    @SerializedName("hashtag_id")
    val hashtagId: String?,
    @SerializedName("is_commerce")
    val isCommerce: Boolean?,
    @SerializedName("sec_uid")
    val secUid: String?,
)

data class LabelTop(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class ShareInfo3(
    @SerializedName("share_url")
    val shareUrl: String?,
    @SerializedName("share_weibo_desc")
    val shareWeiboDesc: String?,
    @SerializedName("share_desc")
    val shareDesc: String?,
    @SerializedName("share_title")
    val shareTitle: String?,
    @SerializedName("bool_persist")
    val boolPersist: Long?,
    @SerializedName("share_title_myself")
    val shareTitleMyself: String?,
    @SerializedName("share_title_other")
    val shareTitleOther: String?,
    @SerializedName("share_link_desc")
    val shareLinkDesc: String?,
    @SerializedName("share_signature_url")
    val shareSignatureUrl: String?,
    @SerializedName("share_signature_desc")
    val shareSignatureDesc: String?,
    @SerializedName("share_quote")
    val shareQuote: String?,
    @SerializedName("share_desc_info")
    val shareDescInfo: String?,
    @SerializedName("now_invitation_card_image_urls")
    val nowInvitationCardImageUrls: Any?,
    @SerializedName("share_button_display_mode")
    val shareButtonDisplayMode: Long?,
    @SerializedName("button_display_stratege_source")
    val buttonDisplayStrategeSource: String?,
)

data class RiskInfos(
    val vote: Boolean?,
    val warn: Boolean?,
    @SerializedName("risk_sink")
    val riskSink: Boolean?,
    val type: Long?,
    val content: String?,
)

data class VideoControl(
    @SerializedName("allow_download")
    val allowDownload: Boolean?,
    @SerializedName("share_type")
    val shareType: Long?,
    @SerializedName("show_progress_bar")
    val showProgressBar: Long?,
    @SerializedName("draft_progress_bar")
    val draftProgressBar: Long?,
    @SerializedName("allow_duet")
    val allowDuet: Boolean?,
    @SerializedName("allow_react")
    val allowReact: Boolean?,
    @SerializedName("prevent_download_type")
    val preventDownloadType: Long?,
    @SerializedName("allow_dynamic_wallpaper")
    val allowDynamicWallpaper: Boolean?,
    @SerializedName("timer_status")
    val timerStatus: Long?,
    @SerializedName("allow_music")
    val allowMusic: Boolean?,
    @SerializedName("allow_stitch")
    val allowStitch: Boolean?,
)

data class CommerceInfo(
    @SerializedName("adv_promotable")
    val advPromotable: Boolean?,
    @SerializedName("branded_content_type")
    val brandedContentType: Long?,
)

data class InteractPermission(
    val duet: Long?,
    val stitch: Long?,
    @SerializedName("duet_privacy_setting")
    val duetPrivacySetting: Long?,
    @SerializedName("stitch_privacy_setting")
    val stitchPrivacySetting: Long?,
    val upvote: Long?,
    @SerializedName("allow_adding_to_story")
    val allowAddingToStory: Long?,
    @SerializedName("allow_create_sticker")
    val allowCreateSticker: AllowCreateSticker?,
)

data class AllowCreateSticker(
    val status: Long?,
)

data class OriginalClientText(
    @SerializedName("markup_text")
    val markupText: String?,
    @SerializedName("text_extra")
    val textExtra: List<TextExtra2>?,
)

data class TextExtra2(
    val type: Long?,
    @SerializedName("hashtag_name")
    val hashtagName: String?,
    @SerializedName("is_commerce")
    val isCommerce: Boolean?,
    @SerializedName("sub_type")
    val subType: Long?,
    @SerializedName("tag_id")
    val tagId: String?,
)

data class CommentConfig(
    @SerializedName("emoji_recommend_list")
    val emojiRecommendList: Any?,
)

data class AddedSoundMusicInfo(
    val id: Long?,
    @SerializedName("id_str")
    val idStr: String?,
    val title: String?,
    val author: String?,
    val album: String?,
    @SerializedName("cover_hd")
    val coverHd: CoverHd2?,
    @SerializedName("cover_large")
    val coverLarge: CoverLarge2?,
    @SerializedName("cover_medium")
    val coverMedium: CoverMedium2?,
    @SerializedName("cover_thumb")
    val coverThumb: CoverThumb2?,
    @SerializedName("play_url")
    val playUrl: PlayUrl2?,
    @SerializedName("schema_url")
    val schemaUrl: String?,
    @SerializedName("source_platform")
    val sourcePlatform: Long?,
    @SerializedName("start_time")
    val startTime: Long?,
    @SerializedName("end_time")
    val endTime: Long?,
    val duration: Long?,
    val extra: String?,
    @SerializedName("user_count")
    val userCount: Long?,
    val position: Any?,
    @SerializedName("collect_stat")
    val collectStat: Long?,
    val status: Long?,
    @SerializedName("offline_desc")
    val offlineDesc: String?,
    @SerializedName("owner_id")
    val ownerId: String?,
    @SerializedName("owner_nickname")
    val ownerNickname: String?,
    @SerializedName("is_original")
    val isOriginal: Boolean?,
    val mid: String?,
    @SerializedName("binded_challenge_id")
    val bindedChallengeId: Long?,
    val redirect: Boolean?,
    @SerializedName("is_restricted")
    val isRestricted: Boolean?,
    @SerializedName("author_deleted")
    val authorDeleted: Boolean?,
    @SerializedName("is_del_video")
    val isDelVideo: Boolean?,
    @SerializedName("is_video_self_see")
    val isVideoSelfSee: Boolean?,
    @SerializedName("owner_handle")
    val ownerHandle: String?,
    @SerializedName("author_position")
    val authorPosition: Any?,
    @SerializedName("prevent_download")
    val preventDownload: Boolean?,
    @SerializedName("strong_beat_url")
    val strongBeatUrl: StrongBeatUrl2?,
    @SerializedName("prevent_item_download_status")
    val preventItemDownloadStatus: Long?,
    @SerializedName("external_song_info")
    val externalSongInfo: List<Any>?,
    @SerializedName("sec_uid")
    val secUid: String?,
    @SerializedName("avatar_thumb")
    val avatarThumb: AvatarThumb3?,
    @SerializedName("avatar_medium")
    val avatarMedium: AvatarMedium3?,
    @SerializedName("avatar_large")
    val avatarLarge: AvatarLarge2?,
    @SerializedName("preview_start_time")
    val previewStartTime: Long?,
    @SerializedName("preview_end_time")
    val previewEndTime: Long?,
    @SerializedName("is_commerce_music")
    val isCommerceMusic: Boolean?,
    @SerializedName("is_original_sound")
    val isOriginalSound: Boolean?,
    val artists: Any?,
    @SerializedName("lyric_short_position")
    val lyricShortPosition: Any?,
    @SerializedName("mute_share")
    val muteShare: Boolean?,
    @SerializedName("tag_list")
    val tagList: Any?,
    @SerializedName("is_author_artist")
    val isAuthorArtist: Boolean?,
    @SerializedName("is_pgc")
    val isPgc: Boolean?,
    @SerializedName("search_highlight")
    val searchHighlight: Any?,
    @SerializedName("multi_bit_rate_play_info")
    val multiBitRatePlayInfo: Any?,
    @SerializedName("tt_to_dsp_song_infos")
    val ttToDspSongInfos: Any?,
    @SerializedName("recommend_status")
    val recommendStatus: Long?,
)

data class CoverHd2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverLarge2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverMedium2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class CoverThumb2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class PlayUrl2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class StrongBeatUrl2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarThumb3(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarMedium3(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class AvatarLarge2(
    val uri: String?,
    @SerializedName("url_list")
    val urlList: List<String>?,
    val width: Long?,
    val height: Long?,
    @SerializedName("url_prefix")
    val urlPrefix: Any?,
)

data class LogInfo(
    val order: String?,
)

data class AigcInfo(
    @SerializedName("aigc_label_type")
    val aigcLabelType: Long?,
)