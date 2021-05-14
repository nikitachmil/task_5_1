import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{
    @Test
    fun add(post: MyPost): MyPost {

        var posts = emptyArray<MyPost>()
        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        return posts.last()

        var result = post.id

        assertEquals( 0 < post.id
            , result
        )
    }
    @Test
    fun updateTrue(post: Array<MyPost>, item: Int) {
        var resultUpdate = true

        var posts = emptyArray<MyPost>()

        for (post in posts) {
            if (item == post.id){
                var result = post.copy(text = "text")
                resultUpdate = true

                break
            } else {
                resultUpdate = false

            }

        }
        println()
        print(resultUpdate)
        println()

        assertEquals( true
            , resultUpdate
        )
    }

    @Test
    fun updateFalse(post: Array<MyPost>, item: Int) {
        var resultUpdate = true

        var posts = emptyArray<MyPost>()

        for (post in posts) {
            if (item == post.id){
                var result = post.copy(text = "text")
                resultUpdate = true

                break
            } else {
                resultUpdate = false

            }

        }
        println()
        print(resultUpdate)
        println()

        assertEquals( false
            , resultUpdate
        )
    }





}

