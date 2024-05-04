package tw.edu.pu.s1114859.tcswom_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    val db = Firebase.firestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnUpdate: Button = findViewById(R.id.btnUpdate)
        btnUpdate.setOnClickListener({
            val user = hashMapOf(
                "名字" to "tcyang",
                "初生體重" to 3800
            )
            db.collection("TC_opendata")
                .add(user)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(this, "新增/異動資料成功",
                        Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(this, "新增/異動資料失敗：" + e.toString(),
                        Toast.LENGTH_LONG).show()
                }
        })
    }

}
