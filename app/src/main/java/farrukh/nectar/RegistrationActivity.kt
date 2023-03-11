package farrukh.nectar

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import farrukh.nectar.databinding.ActivityRegistrationBinding
import farrukh.nectar.model.User
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
     lateinit var binding : ActivityRegistrationBinding
     lateinit var users : MutableList<User>


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        users = mutableListOf<User>()
        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)




        var edit = sharedPreferences.edit()




        logging.setOnClickListener {
            var usern = login_org.text.toString()
            var userp = password_org.text.toString()
            var str = sharedPreferences.getString("users","")
            if (str ==""){
                users = mutableListOf<User>()
            }
            else{
                users = gson.fromJson(str, type)
            }

            users.add(User(usern,userp))
            val s = gson.toJson(users)
            edit.putString("users",s).commit()
        }





        create_account.setOnClickListener {
            startActivity(Intent(this,PinCodeActivuty::class.java))
            finish()
        }


    }
}