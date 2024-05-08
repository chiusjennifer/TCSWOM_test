package tw.edu.pu.s1114859.tcswom_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val items: List<Contact>, val context: Context) : RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val fdname1 = view.findViewById<TextView>(R.id.name)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fdname1.text=items[position].fdname
        //items[position].fdname

    }
}