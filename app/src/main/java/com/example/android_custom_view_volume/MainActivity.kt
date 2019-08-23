package com.example.android_custom_view_volume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var volumeText = "Volume ${VolumeKnob.volume}"
        var rotateText = "Rotation ${VolumeKnob.rotate}"
        tv_rotation.text = rotateText
        tv_volume.text = volumeText*/

        volumeKnob.setOnClickListener {

            tv_volume.text = volumeKnob.getVolume()

        }
        //val rotate = VolumeKnob::rotate

        //var volumeText = "Volume $volume"

        //tv_volume.text = volumeText




    }
}
