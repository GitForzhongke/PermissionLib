package com.zhong.permissionx

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhong.permissionlibrary.PermissionX

/**
 *@Time: 2020/9/15
 *@Description:
 *@Author: zhongke
 */

class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PermissionX.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
            {
                if (allGranted) {
                    //TODO
                } else {
                    //TODO
                }
            }
        }
    }
}