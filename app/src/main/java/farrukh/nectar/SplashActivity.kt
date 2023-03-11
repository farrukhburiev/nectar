package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    lateinit var splash_first: Animation
    lateinit var nectar_animation: Animation
    lateinit var mini_text_animation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splash_first = AnimationUtils.loadAnimation(this, R.anim.splash_first)
        nectar_animation = AnimationUtils.loadAnimation(this, R.anim.nectar_animation)
        mini_text_animation = AnimationUtils.loadAnimation(this, R.anim.mini_text_animation)

        carrot.startAnimation(splash_first)
        nectar.startAnimation(nectar_animation)
        mini_text.startAnimation(mini_text_animation)

        Handler().postDelayed({
            var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
            var sharedPreferences2 = getSharedPreferences("password", MODE_PRIVATE)
            var s = ""
            var sr = ""
            s = sharedPreferences!!.getString("users", "").toString()
            sr = sharedPreferences2!!.getString("passwords", "").toString()
            if (s != "") {
                if (sr != "") {
                    startActivity(Intent(this, RealPinCode::class.java))
                }
                startActivity(Intent(this, PinCodeActivuty::class.java))
            } else {
                startActivity(Intent(this, RegistrationActivity::class.java));
                finish()
            }
        }, 4000)


    }
}