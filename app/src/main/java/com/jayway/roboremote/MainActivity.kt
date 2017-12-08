package com.jayway.roboremote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftView.setOnTouchListener({ view: View, motionEvent: MotionEvent ->
            Log.d("MainActivity", view.tag.toString())
            val y = motionEvent.y
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> Log.d("MainActivity", "down")
                MotionEvent.ACTION_MOVE -> Log.d("MainActivity", "moving")
                MotionEvent.ACTION_UP -> Log.d("MainActivity", "up")
                MotionEvent.ACTION_CANCEL -> Log.d("MainActivity", "cancel")
                MotionEvent.ACTION_OUTSIDE -> Log.d("MainActivity", "outside")
                else -> Log.d("MainActivity", "not moving")
            }
            Log.d("MainActivity", y.toString())
            return@setOnTouchListener true
        })

        rightView.setOnTouchListener({ view: View, motionEvent: MotionEvent ->
            Log.d("MainActivity", view.tag.toString())
            val y = motionEvent.y
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> Log.d("MainActivity", "down")
                MotionEvent.ACTION_MOVE -> Log.d("MainActivity", "moving")
                MotionEvent.ACTION_UP -> Log.d("MainActivity", "up")
                MotionEvent.ACTION_CANCEL -> Log.d("MainActivity", "cancel")
                MotionEvent.ACTION_OUTSIDE -> Log.d("MainActivity", "outside")
                else -> Log.d("MainActivity", "not moving")
            }
            Log.d("MainActivity", y.toString())
            return@setOnTouchListener true
        })
    }
}
