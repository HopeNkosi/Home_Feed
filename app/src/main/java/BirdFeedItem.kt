data class BirdFeedItem(val title: String, val description: String)

{

    private var disp: String = ""
    private var id: Int = 0

    data class BirdFeedItem(
        var title: String,
        var disp: String
    ) {
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0
    }



}

annotation class PrimaryKey(val autoGenerate: Boolean)
