package com.example.viewbindingandactivityresultapi

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import androidx.appcompat.app.AppCompatActivity

class Contract<T>(private val clazz: Class<T>) : ActivityResultContract<Unit, String>() {
//class Contract : ActivityResultContract<Unit, String>() {


//    inline fun <reified T : Any> retrieveSomething(classs: Class<Any>): Class<T> {
//        c=classs
//        return T::class.java
//    }

    companion object {
        const val contract1 = "CONTRACT_1"
        const val contract2 = "CONTRACT_2"
    }

    override fun createIntent(context: Context, input: Unit?): Intent {
        return Intent(context, clazz)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String {
        val message1 = intent?.getStringExtra(contract1)
        val message2 = intent?.getStringExtra(contract2)
        return if (!message1.isNullOrEmpty()) {
            message1
        } else if(!message2.isNullOrEmpty()){
            message2
        }else{
            "No Message"
        }
    }


}