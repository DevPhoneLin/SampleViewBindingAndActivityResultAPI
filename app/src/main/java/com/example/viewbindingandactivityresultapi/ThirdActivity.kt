package com.example.viewbindingandactivityresultapi

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbindingandactivityresultapi.databinding.ActivitySecondBinding
import com.example.viewbindingandactivityresultapi.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var mThirdBinding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mThirdBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(mThirdBinding.root)
    }

    fun onResultClick2(view : View){

        val result =
            Intent().putExtra(Contract.contract2, mThirdBinding.etText.text.toString())
        setResult(Activity.RESULT_OK, result)
        finish()

    }

}