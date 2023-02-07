package com.example.vinylapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.vinyl_detail.*

class VinylDetail : AppCompatActivity() {
    private lateinit var obj: VinylData
    private var vinylImg:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vinyl_detail)

        obj = intent.getParcelableExtra("vinyl")!!
        vinylImg = intent.getIntExtra("vinylImage", -1)
        setData(obj, vinylImg!!)
    }

    private fun setData(obj:VinylData, vinylImg : Int){
        nameEp_detail.text = obj.epName
        nameArtist_detail.text = obj.artistName
        codeEp_detail.text = obj.epCode
        yearEp_detail.text = obj.epYear
        overview_info.text = obj.overview
        vinyl_img_detail.setImageResource(vinylImg)


    }
}