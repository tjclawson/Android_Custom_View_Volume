package com.example.android_custom_view_volume

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class VolumeKnob(context: Context?, attrs: AttributeSet?): View(context, attrs) {


    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private var startX = 0f
    private var endX = 0f
    private var diffX = 0f
    var rotate = 0f
    var volume = 0f

    private var position = 0f
    private var maxRotate = 315f
    private var minRotate = 0f


    init {


    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                startX = event.x

            }
            MotionEvent.ACTION_MOVE -> {
                endX = event.x
                diffX = endX - startX
                rotate = position + (diffX * 360) / width
                if (rotate >= maxRotate) {
                    rotate = maxRotate
                } else if (rotate < minRotate) {
                    rotate = minRotate
                } else {
                    rotate = rotate
                }
                volume = rotate / 315
                invalidate()
            }
            MotionEvent.ACTION_UP -> {
                position = rotate
                println("volume $volume")
                println("rotation $rotate")





            }

        }

        return true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.GRAY
        paint2.color = Color.DKGRAY

        canvas?.rotate(rotate, width / 2f, height / 2f)

        canvas?.drawCircle(width / 2f, height / 2f, 400f, paint)
        canvas?.drawCircle(width / 2.5f, height / 1.5f, 50f, paint2)

        storeVolume(volume)


    }

    fun storeVolume(volume: Float): String {
        var sVolume = volume

        return sVolume.toString()
    }

    fun getVolume(): String {

       return storeVolume(volume)


    }




}