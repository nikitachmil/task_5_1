import WallService.add
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test

    fun add() {
        val Post = MyPost(
            1, 2, 3, 200, "text", 1, 2, false,
            Comments(200, true, true, true, false),
            Copyright(1, "face", "friend", "Chandler"),
            Likes(200, true, true, true),
            Reposts(4, false),
            Views(800),
            "ross",
            false,
            false, false, false,
            true, true,
            Donute(true, 2, Placeholder(true), true, "Yes"),
            1
        )
        var result = add(Post)
        //print(result)



        assertEquals(
            MyPost(
                1, 2, 3, 200, "text", 1, 2, false,
                Comments(200, true, true, true, false),
                Copyright(1, "face", "friend", "Chandler"),
                Likes(200, true, true, true),
                Reposts(4, false),
                Views(800),
                "ross",
                false,
                false, false, false,
                true, true,
                Donute(true, 2, Placeholder(true), true, "Yes"),
                1
            ),

            result
        )


    }

    @Test
    fun update() {
        var update = 1
        var posts = emptyArray<MyPost>()


        val Post = MyPost(
            1, 2, 3, 200, "text", 1, 2, false,
            Comments(200, true, true, true, false),
            Copyright(1, "face", "friend", "Chandler"),
            Likes(200, true, true, true),
            Reposts(4, false),
            Views(800),
            "ross",
            false,
            false, false, false,
            true, true,
            Donute(true, 2, Placeholder(true), true, "Yes"),
            1
        )
        add(Post)
        posts += Post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)




        assertEquals(
            true,
            WallService.update(posts, update)
        )
    }

    @Test
    fun updateFalse() {
        val Post = MyPost(
            1, 2, 3, 200, "text", 1, 2, false,
            Comments(200, true, true, true, false),
            Copyright(1, "face", "friend", "Chandler"),
            Likes(200, true, true, true),
            Reposts(4, false),
            Views(800),
            "ross",
            false,
            false, false, false,
            true, true,
            Donute(true, 2, Placeholder(true), true, "Yes"),
            1
        )
        add(Post)
        var posts = emptyArray<MyPost>()
        posts += Post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)

        var update = 8


        assertEquals(
            false,
            WallService.update(posts, update),
        )
    }

}










