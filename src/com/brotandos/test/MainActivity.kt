package com.brotandos.test

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(FrameLayout(this).apply {
            addView(TextView(this@MainActivity).apply { text = "Hello, World!" })
        })
    }
}