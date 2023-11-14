import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homefeed.R

class BirdFeedAdapter(private val birdFeedList: List<BirdFeedItem>) :
    RecyclerView.Adapter<BirdFeedAdapter.BirdFeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BirdFeedViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bird_feed, parent, false)
        return BirdFeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: BirdFeedViewHolder, position: Int) {
        val birdFeedItem = birdFeedList[position]
        holder.titleTextView.text = birdFeedItem.title
        holder.descriptionTextView.text = birdFeedItem.description
    }

    override fun getItemCount(): Int {
        return birdFeedList.size
    }

    class BirdFeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textDescription)
    }
}

