package com.example.leidyzulu.kotlin_advance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager = GridLayoutManager(this, 2)
        //rcViewLanding.layoutManager = LinearLayoutManager(this)

        val itemsShop = (0..20).map {
            ItemLanding("Titulo $it", "Descr $it", 200.00 + it)
        }

        val adapterLanding = AdapterLanding(itemsShop)
        rcViewLanding.adapter = adapterLanding

    }



}
