package com.example.leidyzulu.kotlin_advance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_descr.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

       /* intent?.let {
            val textFromMain = it.extras.getString("text")
            txtDetail.text = textFromMain
        }*/

        intent?.extras?.let {
            txtDetailTitle.text = it.getString("title")
            txtDetailDescr.text = it.getString("desc")
            txtDetailPrice.text = "$ ${String.format("%.2f", it.getDouble("price"))}"
        }


    }
}
