package com.example.androidkeyboardstatechecker

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        KeyboardEventListener(this) {
            Log.v("Keyboard checker", "Keyboard is open = $it")
            if (it) {
                makeToast("Keyboard Open")
            } else {
                makeToast("Keyboard closed")
            }
        }
    }
}
