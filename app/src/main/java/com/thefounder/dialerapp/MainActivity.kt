package com.thefounder.dialerapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dexter.withContext(this).withPermission(android.Manifest.permission.CALL_PHONE).withListener(object : PermissionListener {

            override fun onPermissionGranted(permissionGrantedResponse: PermissionGrantedResponse?) {

            }

            override fun onPermissionDenied(permissionDeniedResponse: PermissionDeniedResponse?) {

            }

            override fun onPermissionRationaleShouldBeShown( p0: PermissionRequest?, p1: PermissionToken?) {

            }

        }).check()


        btn1.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"1"
        }

        btn2.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"2"
        }

        btn3.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"3"
        }

        btn4.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"4"
        }

        btn5.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"5"
        }

        btn6.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"6"
        }

        btn7.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"7"
        }

        btn8.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"8"
        }

        btn9.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"9"
        }

        btn0.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"0"
        }

        btnStar.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"*"
        }

        btnHash.setOnClickListener {

            txtPhone.text = txtPhone.text.toString()+"#"
        }

        btnCall.setOnClickListener {

            makePhoneCall()
        }

        ibtn.setOnClickListener{

            val stringBuilder = StringBuilder(txtPhone.text)
            stringBuilder.deleteCharAt(txtPhone.text.length-1)
            val newsString = stringBuilder.toString()
            txtPhone.text = newsString
        }
    }

    private fun makePhoneCall() {

        val number = txtPhone.text.toString()
        val dial = "tel:" + number
        val intent = Intent(Intent.ACTION_CALL , Uri.parse(dial))
        startActivity(intent)
    }

}

