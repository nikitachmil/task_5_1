import WallService.add
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test

    fun add() {
        val Post = MyPost(
            id = 1,
            owner_id = 2,
            from_id = 3,
            date = 200,
            text = "text",
            reply_owner_id = 1,
            reply_post_id = 2,
            friend_only = false,
            commentInfo = CommentInfo(count = 200, can_post = true, can_close = true, can_open = false),
            copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
            likes = Likes(count = 200, user_likes = true, can_like = true, can_publish = true),
            reposts = Reposts(count = 4, user_reposted = false),
            views = Views(count = 800),
            post_type = "ross",
            can_pin = false,
            can_delete = false,
            can_edit = false,
            is_pinned = false,
            marked_as_ads = true,
            is_favorite = true,
            donut = Donute(
                is_donute = true,
                paid_duration = 2,
                placeholder = Placeholder(donut = true),
                can_publish_free_copy = true,
                edit_mode = "Yes"
            ),
            postponed_id = 1,
            audio = Audio(
                id = 1,
                owner_id = 2,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcs_id = 1,
                album_id = 2,
                genre_id = 3,
                date = 4,
                no_search = true,
                is_hq = false
            ),
            document = Document(
                id = 1,
                owner_id = 2,
                title = "title",
                size = 1,
                ext = "ext",
                url = "URL",
                date = 1,
                type = 2,
                preview = Preview(
                    photo = Photo(
                        id = 1,
                        album_id = 2,
                        owner_id = 3,
                        user_id = 4,
                        text = "yes",
                        date = 1,
                        sizes = Sizes(type = "yes", url = "URL", width = 1, height = 2, myArray = null),
                        width = 2,
                        height = 2
                    ),
                    graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ),
                    audio_massage = Audio_massage(duration = 1, waveform = null, link_ogg = "URL", link_mp3 = "LINK")
                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ), product = Product(), button = Button(), preview_page = "1", preview_url = "2"
            ),
            note = Note(
                id = 1, owner_id = 2, title = 3, text = "tx", date = 1, comments = 2, read_comments = 3,
                view_url = "url"
            ),
            page = Page(
                id = 1,
                group_id = 2,
                creator_id = 3,
                title = "tl",
                currenl_user_can_edit = true,
                currenl_user_can_edit_acces = false,
                who_can_view = false,
                who_can_edit = true,
                edited = 1,
                created = 2,
                editor_id = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",
                view_url = "vies_url"
            ),
            pol = Pol(
                id = 1,
                owner_id = 2,
                created = 3,
                question = 4,
                votes = 5,
                answers = Answers(id = 1, text = "tx", votes = 1, rate = 2, myArray = null),
                anonymous = false,
                multiple = true,
                answer_ids = null,
                end_date = 1,
                closed = true,
                is_board = 1,
                can_edit = false,
                can_vote = false,
                can_report = true,
                can_share = false,
                author_id = 1,
                photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ),
                background = Background(
                    id = 1,
                    type = "t",
                    angle = 1,
                    color = 2,
                    width = 3,
                    height = 4,
                    images = null,
                    points = null
                )
            ),
            post = Post(
                id = 1,
                owner_id = 2,
                from_id = 3,
                created_by = 4,
                date = 5,
                text = "tx",
                reply_owner_id = 1,
                reply_post_id = 2,
                friend_only = true,
                commentInfo = CommentInfo(count = 1, can_post = true, can_close = true, can_open = true),
                copyright = "1",
                likes = Likes(
                    count = 1,
                    user_likes = true, can_like = true, can_publish = false
                ),
                reposts = Reposts(count = 1, user_reposted = true),
                views = Views(count = 1),
                post_type = "1",
                post_source = Post_source(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st", place = Place()
                ),
                signer_id = 1,
                copy_history = null,
                can_pln = true,
                can_delete = false,
                can_edit = true,
                is_pinned = false,
                marked_as_ads = true,
                is_favorite = true,
                postponed_id = 1
            ),
            postSource = Post_source(
                type = "st", platform = "t",
                date = "2", url = "url"
            ),
            sticker = Sticker(
                product_id = 1,
                sticker_id = 2,
                url = "url",
                width = 1,
                height = 2,
                url1 = "url",
                width1 = 1,
                height1 = 2,
                myArray = null,
                myArray1 = null
            ),
            video = Video(
                id = 1,
                owner_id = 2,
                title = "tl",
                description = "2",
                photo_130 = "2",
                photo_320 = "3",
                photo_640 = "4",
                photo_800 = "6",
                photo_1280 = "2",
                first_frame_130 = "5",
                firs_name_320 = "3",
                first_frame_640 = "5",
                first_frame_800 = "8",
                first_frame_1280 = "0",
                date = 1,
                adding_date = 2,
                views = 3,
                comments = 4,
                payer = "1",
                platform = "t",
                can_edit = true,
                is_private = true,
                access_kty = "2",
                processing = false,
                live = false,
                upcoming = false,
                is_favorite = false
            )
        )

        var result = add(Post)
        //print(result)



        assertEquals(
            MyPost(
                id = 1,
                owner_id = 2,
                from_id = 3,
                date = 200,
                text = "text",
                reply_owner_id = 1,
                reply_post_id = 2,
                friend_only = false,
                commentInfo = CommentInfo(count = 200, can_post = true, can_close = true, can_open = false),
                copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
                likes = Likes(count = 200, user_likes = true, can_like = true, can_publish = true),
                reposts = Reposts(count = 4, user_reposted = false),
                views = Views(count = 800),
                post_type = "ross",
                can_pin = false,
                can_delete = false,
                can_edit = false,
                is_pinned = false,
                marked_as_ads = true,
                is_favorite = true,
                donut = Donute(
                    is_donute = true,
                    paid_duration = 2,
                    placeholder = Placeholder(donut = true),
                    can_publish_free_copy = true,
                    edit_mode = "Yes"
                ),
                postponed_id = 1,
                audio = Audio(
                    id = 1,
                    owner_id = 2,
                    artist = "2Pac",
                    title = "2",
                    duration = 1,
                    url = "URL",
                    lyrlcs_id = 1,
                    album_id = 2,
                    genre_id = 3,
                    date = 4,
                    no_search = true,
                    is_hq = false
                ),
                document = Document(
                    id = 1,
                    owner_id = 2,
                    title = "title",
                    size = 1,
                    ext = "ext",
                    url = "URL",
                    date = 1,
                    type = 2,
                    preview = Preview(
                        photo = Photo(
                            id = 1,
                            album_id = 2,
                            owner_id = 3,
                            user_id = 4,
                            text = "yes",
                            date = 1,
                            sizes = Sizes(type = "yes", url = "URL", width = 1, height = 2, myArray = null),
                            width = 2,
                            height = 2
                        ),
                        graffiti = Graffiti(
                            src = "yes", width = 1, height = 2,
                        ),
                        audio_massage = Audio_massage(
                            duration = 1,
                            waveform = null,
                            link_ogg = "URL",
                            link_mp3 = "LINK"
                        )
                    )
                ),
                link = Link(
                    url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(
                        id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                            type = "1", url = "2", width = 1, height = 2, myArray = null
                        ), width = 1, height = 2
                    ), product = Product(), button = Button(), preview_page = "1", preview_url = "2"
                ),
                note = Note(
                    id = 1, owner_id = 2, title = 3, text = "tx", date = 1, comments = 2, read_comments = 3,
                    view_url = "url"
                ),
                page = Page(
                    id = 1,
                    group_id = 2,
                    creator_id = 3,
                    title = "tl",
                    currenl_user_can_edit = true,
                    currenl_user_can_edit_acces = false,
                    who_can_view = false,
                    who_can_edit = true,
                    edited = 1,
                    created = 2,
                    editor_id = 3,
                    views = 5,
                    parent = "rs",
                    parent2 = "ch",
                    source = "source",
                    html = "html",
                    view_url = "vies_url"
                ),
                pol = Pol(
                    id = 1,
                    owner_id = 2,
                    created = 3,
                    question = 4,
                    votes = 5,
                    answers = Answers(id = 1, text = "tx", votes = 1, rate = 2, myArray = null),
                    anonymous = false,
                    multiple = true,
                    answer_ids = null,
                    end_date = 1,
                    closed = true,
                    is_board = 1,
                    can_edit = false,
                    can_vote = false,
                    can_report = true,
                    can_share = false,
                    author_id = 1,
                    photo = Photo(
                        id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                            type = "1", url = "2", width = 1, height = 2, myArray = null
                        ), width = 1, height = 2
                    ),
                    background = Background(
                        id = 1,
                        type = "t",
                        angle = 1,
                        color = 2,
                        width = 3,
                        height = 4,
                        images = null,
                        points = null
                    )
                ),
                post = Post(
                    id = 1,
                    owner_id = 2,
                    from_id = 3,
                    created_by = 4,
                    date = 5,
                    text = "tx",
                    reply_owner_id = 1,
                    reply_post_id = 2,
                    friend_only = true,
                    commentInfo = CommentInfo(count = 1, can_post = true, can_close = true, can_open = true),
                    copyright = "1",
                    likes = Likes(
                        count = 1,
                        user_likes = true, can_like = true, can_publish = false
                    ),
                    reposts = Reposts(count = 1, user_reposted = true),
                    views = Views(count = 1),
                    post_type = "1",
                    post_source = Post_source(type = "s", platform = "s", date = "2", url = "irl"),
                    attachments = null,
                    geo = Geo(
                        type = "st",
                        coordinates = "st", place = Place()
                    ),
                    signer_id = 1,
                    copy_history = null,
                    can_pln = true,
                    can_delete = false,
                    can_edit = true,
                    is_pinned = false,
                    marked_as_ads = true,
                    is_favorite = true,
                    postponed_id = 1
                ),
                postSource = Post_source(
                    type = "st", platform = "t",
                    date = "2", url = "url"
                ),
                sticker = Sticker(
                    product_id = 1,
                    sticker_id = 2,
                    url = "url",
                    width = 1,
                    height = 2,
                    url1 = "url",
                    width1 = 1,
                    height1 = 2,
                    myArray = null,
                    myArray1 = null
                ),
                video = Video(
                    id = 1,
                    owner_id = 2,
                    title = "tl",
                    description = "2",
                    photo_130 = "2",
                    photo_320 = "3",
                    photo_640 = "4",
                    photo_800 = "6",
                    photo_1280 = "2",
                    first_frame_130 = "5",
                    firs_name_320 = "3",
                    first_frame_640 = "5",
                    first_frame_800 = "8",
                    first_frame_1280 = "0",
                    date = 1,
                    adding_date = 2,
                    views = 3,
                    comments = 4,
                    payer = "1",
                    platform = "t",
                    can_edit = true,
                    is_private = true,
                    access_kty = "2",
                    processing = false,
                    live = false,
                    upcoming = false,
                    is_favorite = false
                )
            )
            ,

            result
        )


    }

    @Test
    fun update() {
        var update = 1
        var posts = emptyArray<MyPost>()


        val Post = MyPost(
            id = 1,
            owner_id = 2,
            from_id = 3,
            date = 200,
            text = "text",
            reply_owner_id = 1,
            reply_post_id = 2,
            friend_only = false,
            commentInfo = CommentInfo(count = 200, can_post = true, can_close = true, can_open = false),
            copyright = Copyright(1, "face", "friend", "Chandler"),
            likes = Likes(200, true, true, true),
            reposts = Reposts(4, false),
            views = Views(800),
            post_type = "ross",
            can_pin = false,
            can_delete = false,
            can_edit = false,
            is_pinned = false,
            marked_as_ads = true,
            is_favorite = true,
            donut = Donute(
                is_donute = true,
                paid_duration = 2,
                placeholder = Placeholder(donut = true),
                can_publish_free_copy = true,
                edit_mode = "Yes"
            ),
            postponed_id = 1,
            audio = Audio(
                id = 1,
                owner_id = 2,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcs_id = 1,
                album_id = 2,
                genre_id = 3,
                date = 4,
                no_search = true,
                is_hq = false
            ),
            document = Document(
                id = 1, owner_id = 2, title = "title", size = 1, ext = "ext", url = "URL", date = 1,
                type = 2, preview = Preview(
                    photo = Photo(
                        id = 1,
                        album_id = 2,
                        owner_id = 3,
                        user_id = 4,
                        text = "yes",
                        date = 1,
                        sizes = Sizes(type = "yes", url = "URL", width = 1, height = 2, myArray = null),
                        width = 2,
                        height = 2
                    ), graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ), audio_massage = Audio_massage(duration = 1, waveform = null, link_ogg = "URL", link_mp3 = "LINK")
                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ), product = Product(), button = Button(), preview_page = "1", preview_url = "2"
            ),
            note = Note(
                id = 1,
                owner_id = 2,
                title = 3,
                text = "tx",
                date = 1,
                comments = 2,
                read_comments = 3,
                view_url = "url"
            ),
            page = Page(
                id = 1,
                group_id = 2,
                creator_id = 3,
                title = "tl",
                currenl_user_can_edit = true,
                currenl_user_can_edit_acces = false,
                who_can_view = false,
                who_can_edit = true,
                edited = 1,
                created = 2,
                editor_id = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",
                view_url = "vies_url"
            ),
            pol = Pol(
                id = 1,
                owner_id = 2,
                created = 3,
                question = 4,
                votes = 5,
                answers = Answers(id = 1, text = "tx", votes = 1, rate = 2, myArray = null),
                anonymous = false,
                multiple = true,
                answer_ids = null,
                end_date = 1,
                closed = true,
                is_board = 1,
                can_edit = false,
                can_vote = false,
                can_report = true,
                can_share = false,
                author_id = 1,
                photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ),
                background = Background(
                    id = 1,
                    type = "t",
                    angle = 1,
                    color = 2,
                    width = 3,
                    height = 4,
                    images = null,
                    points = null
                )
            ),
            post = Post(
                id = 1,
                owner_id = 2,
                from_id = 3,
                created_by = 4,
                date = 5,
                text = "tx",
                reply_owner_id = 1,
                reply_post_id = 2,
                friend_only = true,
                commentInfo = CommentInfo(count = 1, can_post = true, can_close = true, can_open = true),
                copyright = "1",
                likes = Likes(
                    count = 1,
                    user_likes = true, can_like = true, can_publish = false
                ),
                reposts = Reposts(count = 1, user_reposted = true),
                views = Views(count = 1),
                post_type = "1",
                post_source = Post_source(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st", place = Place()
                ),
                signer_id = 1,
                copy_history = null,
                can_pln = true,
                can_delete = false,
                can_edit = true,
                is_pinned = false,
                marked_as_ads = true,
                is_favorite = true,
                postponed_id = 1
            ),
            postSource = Post_source(
                type = "st", platform = "t",
                date = "2", url = "url"
            ),
            sticker = Sticker(product_id = 1,
                sticker_id = 2,
                url = "url",
                width = 1,
                height = 2,
                url1 = "url",
                width1 = 1,
                height1 = 2,
                myArray = null,
                myArray1 = null
            ),
            video = Video(
                id = 1,
                owner_id = 2,
                title = "tl",
                description = "2",
                photo_130 = "2",
                photo_320 = "3",
                photo_640 = "4",
                photo_800 = "6",
                photo_1280 = "2",
                first_frame_130 = "5",
                firs_name_320 = "3",
                first_frame_640 = "5",
                first_frame_800 = "8",
                first_frame_1280 = "0",
                date = 1,
                adding_date = 2,
                views = 3,
                comments = 4,
                payer = "1",
                platform = "t",
                can_edit = true,
                is_private = true,
                access_kty = "2",
                processing = false,
                live = false,
                upcoming = false,
                is_favorite = false
            )
        )






        assertEquals(
            true,
            WallService.update(posts, update)
        )
    }

    @Test
    fun updateFalse() {
        val Post = MyPost(
            id = 1,
            owner_id = 2,
            from_id = 3,
            date = 200,
            text = "text",
            reply_owner_id = 1,
            reply_post_id = 2,
            friend_only = false,
            commentInfo = CommentInfo(count = 200, can_post = true, can_close = true, can_open = false),
            copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
            likes = Likes(count = 200, user_likes = true, can_like = true, can_publish = true),
            reposts = Reposts(count = 4, user_reposted = false),
            views = Views(count = 800),
            post_type = "ross",
            can_pin = false,
            can_delete = false,
            can_edit = false,
            is_pinned = false,
            marked_as_ads = true,
            is_favorite = true,
            donut = Donute(
                is_donute = true,
                paid_duration = 2,
                placeholder = Placeholder(donut = true),
                can_publish_free_copy = true,
                edit_mode = "Yes"
            ),
            postponed_id = 1,
            audio = Audio(
                id = 1,
                owner_id = 2,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcs_id = 1,
                album_id = 2,
                genre_id = 3,
                date = 4,
                no_search = true,
                is_hq = false
            ),
            document = Document(
                id = 1,
                owner_id = 2,
                title = "title",
                size = 1,
                ext = "ext",
                url = "URL",
                date = 1,
                type = 2,
                preview = Preview(
                    photo = Photo(
                        id = 1,
                        album_id = 2,
                        owner_id = 3,
                        user_id = 4,
                        text = "yes",
                        date = 1,
                        sizes = Sizes(type = "yes", url = "URL", width = 1, height = 2, myArray = null),
                        width = 2,
                        height = 2
                    ),
                    graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ),
                    audio_massage = Audio_massage(duration = 1, waveform = null, link_ogg = "URL", link_mp3 = "LINK")
                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ), product = Product(), button = Button(), preview_page = "1", preview_url = "2"
            ),
            note = Note(
                id = 1, owner_id = 2, title = 3, text = "tx", date = 1, comments = 2, read_comments = 3,
                view_url = "url"
            ),
            page = Page(
                id = 1,
                group_id = 2,
                creator_id = 3,
                title = "tl",
                currenl_user_can_edit = true,
                currenl_user_can_edit_acces = false,
                who_can_view = false,
                who_can_edit = true,
                edited = 1,
                created = 2,
                editor_id = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",
                view_url = "vies_url"
            ),
            pol = Pol(
                id = 1,
                owner_id = 2,
                created = 3,
                question = 4,
                votes = 5,
                answers = Answers(1, "tx", 1, 2, null),
                anonymous = false,
                multiple = true,
                answer_ids = null,
                end_date = 1,
                closed = true,
                is_board = 1,
                can_edit = false,
                can_vote = false,
                can_report = true,
                can_share = false,
                author_id = 1,
                photo = Photo(
                    id = 1, album_id = 1, owner_id = 2, user_id = 3, text = "tx", date = 1, sizes = Sizes(
                        type = "1", url = "2", width = 1, height = 2, myArray = null
                    ), width = 1, height = 2
                ),
                background = Background(
                    id = 1,
                    type = "t",
                    angle = 1,
                    color = 2,
                    width = 3,
                    height = 4,
                    images = null,
                    points = null
                )
            ),
            post = Post(
                id = 1,
                owner_id = 2,
                from_id = 3,
                created_by = 4,
                date = 5,
                text = "tx",
                reply_owner_id = 1,
                reply_post_id = 2,
                friend_only = true,
                commentInfo = CommentInfo(count = 1, can_post = true, can_close = true, can_open = true),
                copyright = "1",
                likes = Likes(
                    count = 1,
                    user_likes = true, can_like = true, can_publish = false
                ),
                reposts = Reposts(count = 1, user_reposted = true),
                views = Views(count = 1),
                post_type = "1",
                post_source = Post_source(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st", place = Place()
                ),
                signer_id = 1,
                copy_history = null,
                can_pln = true,
                can_delete = false,
                can_edit = true,
                is_pinned = false,
                marked_as_ads = true,
                is_favorite = true,
                postponed_id = 1
            ),
            postSource = Post_source(
                type = "st", platform = "t",
                date = "2", url = "url"
            ),
            sticker = Sticker(
                product_id = 1,
                sticker_id = 2,
                url = "url",
                width = 1,
                height = 2,
                url1 = "url",
                width1 = 1,
                height1 = 2,
                myArray = null,
                myArray1 = null
            ),
            video = Video(
                id = 1,
                owner_id = 2,
                title = "tl",
                description = "2",
                photo_130 = "2",
                photo_320 = "3",
                photo_640 = "4",
                photo_800 = "6",
                photo_1280 = "2",
                first_frame_130 = "5",
                firs_name_320 = "3",
                first_frame_640 = "5",
                first_frame_800 = "8",
                first_frame_1280 = "0",
                date = 1,
                adding_date = 2,
                views = 3,
                comments = 4,
                payer = "1",
                platform = "t",
                can_edit = true,
                is_private = true,
                access_kty = "2",
                processing = false,
                live = false,
                upcoming = false,
                is_favorite = false
            ))


        var posts = emptyArray<MyPost>()
        posts += Post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)

        var update = 8


        assertEquals(
            false,
            WallService.update(posts, update),
        )
    }

}










