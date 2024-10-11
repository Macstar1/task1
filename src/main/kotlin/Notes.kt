data class Notes(
    val id: Long = 1L,
    val title: String = "",
    var text: String = "",
    val date: Int = 1,
    var comments: Array<Comments> = emptyArray(),
    val viewUrl: String = "",
    var isDelete: Boolean = false
)