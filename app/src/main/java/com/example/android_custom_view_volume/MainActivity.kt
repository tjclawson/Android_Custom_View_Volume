package com.example.android_custom_view_volume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var volumeText = "Volume ${VolumeKnob.volume}"
        var rotateText = "Rotation ${VolumeKnob.rotate}"
        tv_rotation.text = rotateText
        tv_volume.text = volumeText*/

        val volumeKnob = volume_knob

        /*volumeKnob.setOnClickListener {

            tv_volume.text = volumeKnob.volume.toString()

           // tv_volume.text = volumeKnob.getVolume()

        }*/
        //val rotate = VolumeKnob::rotate

        //var volumeText = "Volume $volume"

        //tv_volume.text = volumeText


    }

    fun onClick(view: View){
        val volumeKnob = volume_knob
        tv_volume.text = volumeKnob.volume.toString()
    }
}
