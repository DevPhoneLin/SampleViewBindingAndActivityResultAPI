package com.example.viewbindingandactivityresultapi

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbindingandactivityresultapi.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var mThirdBinding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mThirdBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(mThirdBinding.root)
    }

    fun onResultClick2(view : View) {
        val intent = Intent()
        intent.putExtra(Contract.contract1, mThirdBinding.etText.text.toString())
        intent.putExtra(Contract.contract2, mThirdBinding.etTextTwo.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}