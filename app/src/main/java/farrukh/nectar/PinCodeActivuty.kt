package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
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

            startActivity(Intent(this,RealPinCode::class.java))
            finish()
        }

    }
}