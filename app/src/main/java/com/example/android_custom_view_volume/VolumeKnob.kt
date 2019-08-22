package com.example.android_custom_view_volume

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class VolumeKnob(context: Context?, attrs: AttributeSet?): View(context, attrs) {



    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private var startX = 0f
    private var endX = 0f
    private var diffX = 0f
    private var rotate = 0f

    init {


    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                startX = event.x

            }
            MotionEvent.ACTION_MOVE -> {
                endX = event.x
                diffX = endX - startX
                rotate = (diffX * 360) / width
                invalidate()
            }
           MotionEvent.ACTION_UP -> {

           }

        }

        return true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.GRAY
        paint2.color = Color.DKGRAY

        canvas?.rotate(rotate, width/2f, height/2f)

        canvas?.drawCircle(width/2f, height/2f, 400f, paint)
        canvas?.drawCircle(width/2.5f, height/1.5f, 50f, paint2)

        //canvas?.rotate(180f, width/2f, height/2f)
    }

}