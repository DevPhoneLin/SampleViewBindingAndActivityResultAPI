package com.example.viewbindingandactivityresultapi

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import com.example.viewbindingandactivityresultapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private val launcher1 = registerForActivityResult(Contract<SecondActivity>(SecondActivity::class.java)) {
        Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    }

    private val launcher2 = registerForActivityResult(Contract<ThirdActivity>(ThirdActivity::class.java)) {
        Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnReqSecond.setOnClickListener {
            launcher1.launch()
        }

        mBinding.btnReqThird.setOnClickListener {
            launcher2.launch()
        }


    }

//    fun onSecondActivityRequestClick(view : View){
//        launcher1.launch()
//    }
//
//    fun onThirdActivityRequestClick(view : View){
//        launcher2.launch()
//    }


}