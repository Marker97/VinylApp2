package com.example.vinylapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.vinyl_detail.*

class VinylDetail : AppCompatActivity() {
    private lateinit var obj: VinylData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vinyl_detail)

        obj = intent.getParcelableExtra("vinyl")!!
        setData(obj)
    }

    private fun setData(obj:VinylData){
        nameEp_detail.text = obj.epName
        nameArtist_detail.text = obj.artistName
        codeEp_detail.text = obj.epCode
        yearEp_detail.text = obj.epYear
        overview_info.text = obj.overview

    }
}