package com.gs.buglydemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.text="第二次修复"
        btn.setOnClickListener {
//            throw RuntimeException("我是bug")
            btn.setText("更改字体")
        }
    }
}
