package fi.oamk.chat


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: ArrayList<Message>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myView = LayoutInflater.from(parent.context)
            .inflate(R.layout.message_row,parent,false)
        return MyViewHolder(myView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.message.text = myDataset[position].message
        holder.author.text =
            "by " + myDataset[position].author +
                    " on " + myDataset[position].time
    }

    override fun getItemCount() = myDataset.size

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val message: TextView = itemView.findViewById(R.id.message)
        val author: TextView = itemView.findViewById(R.id.author)
    }
}
