package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_real_pin_code.*

class RealPinCode : AppCompatActivity() {
    var count = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_real_pin_code)
        var sharedPreferences2 = getSharedPreferences("password", MODE_PRIVATE)
        var pass = sharedPreferences2.getString("passwords","")

        firstPinView.addTextChangedListener {
            if (pass.toString().contains(firstPinView.text.toString())) {
                count = false
                startActivity(Intent(this, MainActivity::class.java))
            }
            }
        if (count){
            firstPinView.currentLineColor.equals(R.color.black)
            Toast.makeText(this, "wrong password", Toast.LENGTH_SHORT).show()
        }
        }
    }
