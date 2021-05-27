package com.example.viewbindingandactivityresultapi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContract

class Contract<T>(private val clazz: Class<T>) : ActivityResultContract<Unit, Bundle>() {

    companion object {
        const val contract1 = "CONTRACT_1"
        const val contract2 = "CONTRACT_2"
    }

    override fun createIntent(context: Context, input: Unit?): Intent {
        return Intent(context, clazz)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Bundle {
        val bundle = Bundle()
        bundle.putString("t1", intent?.getStringExtra(contract1))
        bundle.putString("t2", intent?.getStringExtra(contract2))
        return bundle
    }
}