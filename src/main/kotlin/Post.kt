import java.awt.SystemColor.text

data class Post(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    var text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friend_only: Boolean,
    val commentInfo: CommentInfo,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val post_type: String,
    val post_source:Post_source,
    val attachments: Array<Any>?,
    val geo: Geo,
    val signer_id: Int,
    val copy_history: Array<Reposts>?,
    val can_pln: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val postponed_id: Int

        )

