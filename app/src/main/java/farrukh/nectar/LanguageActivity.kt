package farrukh.nectar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_language.*
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*
import kotlin.system.exitProcess

class LanguageActivity : AppCompatActivity() {

    lateinit var locale: Locale
    private var currentLanguage = "en"
    private var currentLang: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        currentLanguage = intent.getStringExtra(currentLang).toString()


        val list = ArrayList<String>()
        list.add("Select Language")
        list.add("English")
        list.add("Russian")
        list.add("Japanese")
        list.add("Uzbek")


        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,list)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when(position){
                    0->{}
                    1 -> setLocale("en")
                        2 -> setLocale("ru")
                    3 -> setLocale("ja")
                    4 -> setLocale("uz")

                }
                startActivity(Intent(this@LanguageActivity,RegistrationActivity::class.java))
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }


        }



}







    private fun setLocale(locale_name: String){
        if (locale_name != currentLanguage){
                locale = Locale(locale_name)
            val  res = resources
            val dm = res.displayMetrics
            val conf = res.configuration
            conf.locale = locale
            res.updateConfiguration(conf,dm)

        }
    }
    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
        exitProcess(0)
    }
}