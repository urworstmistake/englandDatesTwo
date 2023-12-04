package ru.mggtk.englanddates

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Button: Button = findViewById(R.id.AboutButton)
        val TextViewButton: TextView = findViewById(R.id.textView17)
        Button.setOnClickListener{
            //intent = Intent(this@MainActivity, AboutActivity::class.java)
            //startActivity(intent)
            showAboutDialog(this)
        }
        TextViewButton.setOnClickListener{
            intentLoad("https://ru.wikipedia.org/")
        }
        }
    private fun showAboutDialog(context: Context) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("О программе")
        val message = "Программа повествует нам о эпохах Английской истории, начиная с одинадцатого века по современность" //текст
        builder.setMessage(message)

        builder.setPositiveButton("OK") { dialog, which ->
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }

    private fun intentLoad(){
        val intent = Intent(this, WebActivity::class.java)
        startActivity(intent)
    }
    }
