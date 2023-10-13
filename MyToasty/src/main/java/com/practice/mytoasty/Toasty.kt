package com.practice.mytoasty

import android.content.Context
import android.widget.Toast

class Toasty {
    fun simpleToast(context:Context,msg:String){
       Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }

}