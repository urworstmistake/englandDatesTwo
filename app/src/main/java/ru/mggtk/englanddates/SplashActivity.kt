package ru.mggtk.englanddates

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnticipateInterpolator
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 2500L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val animation: ImageView = findViewById(R.id.imageView)
        val drawable = animation.drawable

        //Проверка на наличие анимации
        if (drawable is Animatable) {
            drawable.start()
            /*Запуск основной activity, после опредленного времени, время регулируется константой
            SPLASH_DISPLAY_LENGTH, значение в миллисекундах
             */
            Handler().postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_DISPLAY_LENGTH)
        }
        else{
            Handler().postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_DISPLAY_LENGTH)

        }

        val gerb: ImageView = findViewById(R.id.imageView)

        gerb.animate().apply {
            rotationY(3600f)
            duration = 10000
            interpolator = AccelerateDecelerateInterpolator()

        }.start()


    }
}