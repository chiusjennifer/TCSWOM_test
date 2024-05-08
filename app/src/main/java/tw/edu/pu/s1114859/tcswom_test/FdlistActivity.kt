package tw.edu.pu.s1114859.tcswom_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FdlistActivity : AppCompatActivity() {
    lateinit var mRecyclerView: RecyclerView
    val contacts= listOf<Contact>(
        Contact("財團法人基督教惠明盲人福利基金會"),
        Contact("財團法人基督教盲人福利基金會"),
        Contact("財團法人基督教惠明盲人福利基金會"),
        Contact("財團法人基督教惠明盲人福利基金會"),
        Contact("財團法人基督教惠明盲人福利基金會"),
        Contact("財團法人基督教惠明盲人福利基金會"),
        Contact("財團法人基督教惠明盲人福利基金會")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fdlist)
        mRecyclerView=findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager= LinearLayoutManager(this)
        mRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        mRecyclerView.adapter=ListAdapter(contacts,this)
    }
}