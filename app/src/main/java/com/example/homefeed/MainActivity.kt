import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birdFeedList = generateBirdFeedList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BirdFeedAdapter(birdFeedList)
    }

    private fun generateBirdFeedList(): List<BirdFeedItem> {
        // Replace this with your actual data retrieval logic
        // For simplicity, creating a dummy list here
        return List(10) { index ->
            BirdFeedItem("Bird $index", "Lorem ipsum dolor sit amet.")
        }
    }
}
