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


    fun update(post: Array<MyPost>, item: Int) {
        var resultUpdate = true
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

















