package com.example.viewbindingandactivityresultapi

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbindingandactivityresultapi.databinding.ActivityMainBinding
import com.example.viewbindingandactivityresultapi.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var mSecondBinding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(mSecondBinding.root)
    }

    fun onResultClick1(view : View){

        val result =
            Intent().putExtra(Contract.contract1, mSecondBinding.etText.text.toString())
        setResult(Activity.RESULT_OK, result)
        finish()

    }

}