package com.example.androidkeyboardstatechecker

import android.content.Context
import android.widget.Toast

fun Context.makeToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}