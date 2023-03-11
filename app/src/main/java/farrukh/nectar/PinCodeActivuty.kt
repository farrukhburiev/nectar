package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import farrukh.nectar.databinding.ActivityRegistrationBinding
import kotlinx.android.synthetic.main.activity_pin_code_activuty.*

class PinCodeActivuty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code_activuty)




//        textView4.startAnimation(back_to)
        back.setOnClickListener {
            var intent = Intent(this,RegistrationActivity::class.java)

            startActivity(intent)
            finish()
        }
        next.setOnClickListener {
            if (new_password.text!!.length == 4 && confirm_password.text!!.length == 4){
                if (new_password.text.toString().equals(confirm_password.text.toString())){
                    val intent = Intent(this,RealPinCode::class.java)
                    intent.putExtra("password",new_password.text.toString())
                    startActivity(intent)
                }
                else Toast.makeText(this, "passwords are not equal", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "enter 4 digits !! or are you dumb ?", Toast.LENGTH_SHORT).show()

        }

    }
}