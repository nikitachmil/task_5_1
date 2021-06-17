class Video (
    val id: Int,
    val owner_id: Int,
    val title: String,
    val description: String,
    val photo_130: String,
    val photo_320: String,
    val photo_640: String,
    val photo_800:String,
    val photo_1280: String,
    val first_frame_130: String,
    val firs_name_320: String,
    val first_frame_640: String,
    val first_frame_800: String,
    val first_frame_1280: String,
    var date: Int,
    val adding_date: Int,
    val views: Int,
    val comments: Int,
    val payer: String,
    val platform: String,
    val can_edit: Boolean,
    val is_private:Boolean,
    val access_kty: String,
    val processing: Boolean,
    val live: Boolean,
    val upcoming: Boolean,
    val is_favorite: Boolean
        )