package com.example.viewbindingandactivityresultapi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.launch
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingandactivityresultapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private val launcher1 =
        registerForActivityResult(Contract<SecondActivity>(SecondActivity::class.java)) {
            it?.let {
                Toast.makeText(
                    this,
                    "${it.getString("t1")} \t ${it.getString("t2")}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    private val launcher2 =
        registerForActivityResult(Contract(ThirdActivity::class.java)) {
            it?.let {
                Toast.makeText(
                    this,
                    "${it.getString("t1")} \t ${it.getString("t2")}",
                    Toast.LENGTH_SHORT
                ).show()
            }
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
}