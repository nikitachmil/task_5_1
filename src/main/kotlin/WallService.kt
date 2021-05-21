

object WallService {
    var posts = emptyArray<MyPost>()

    var item = 0


    fun add(post: MyPost): MyPost {
        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        return posts.last()
    }

    fun printAllPosts(posts: Array<MyPost>) {
        for (post in posts) {
            print(post)
        }
    }


    fun update(post: Array<MyPost>, item: Int): Any  {
        for ((index, post) in posts.withIndex()) {
            if (item == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }




    //var resultUpdate = false
        // for ((index, posts) in post.withIndex()) {
        //if (item == posts.id) {
        // var result = posts.copy(text = "text")
        //resultUpdate = true}

        //else
        //resultUpdate = false


        //}
        // return resultUpdate


        // }
    }

















