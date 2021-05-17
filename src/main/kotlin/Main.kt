fun main() {


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

    val Post2 = MyPost(
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
    val Post3 = MyPost(
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


    var update = 3
    WallService.add(Post)
    WallService.add(Post2)
    WallService.add(Post3)
    WallService.printAllPosts(WallService.posts)
    var result = WallService.update(WallService.posts,update)

    println(result)

}






