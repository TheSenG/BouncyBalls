package com.example.bouncyballs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class BallAnimationExample : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val container = findViewById<View>(R.id.container) as LinearLayout
        container.addView(MyAnimationView(this))
    }
}