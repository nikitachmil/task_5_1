import WallService.add
import WallService.printAllPosts
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
        var result = WallService.update(WallService.posts, update)

        assertEquals(
            true,
            WallService.update(WallService.posts, update)
        )
    }

    @Test
    fun updateFalse() {
        var update = 8
        var result = WallService.update(WallService.posts, update)

        assertEquals(
            false,
            result,
        )
    }

}










