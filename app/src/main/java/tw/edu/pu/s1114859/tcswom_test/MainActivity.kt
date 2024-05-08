package tw.edu.pu.s1114859.tcswom_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    var db = FirebaseFirestore.getInstance()
    var user: MutableMap<String, Any> = HashMap()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnUpdate:Button=findViewById(R.id.btnUpdate)
        val edtName:EditText=findViewById(R.id.edtName)
        val edtWeight:EditText=findViewById(R.id.edtWeight)

        btnUpdate.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                user["名字"] = "邱家妤"
                user["出生體重"] = 3800
                db.collection("Users")
                  //  .document(edtName.text.toString())
                    .add(user)
                    .addOnSuccessListener {
                        Toast.makeText(baseContext, "新增/異動資料成功",
                            Toast.LENGTH_LONG).show()

                    }
                    .addOnFailureListener { e ->
                        Toast.makeText(baseContext, "新增/異動資料失敗：" + e.toString(),
                            Toast.LENGTH_LONG).show()
                            Log.d("error","error $e")
                    }
            }
        })

    }

}
