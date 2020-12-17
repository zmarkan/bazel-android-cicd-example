package com.circleci.bazelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.circleci.weathersimple.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greeter = Greeter("CircleCI")

        findViewById<TextView>(R.id.greeting).text = greeter.greet()
    }
}