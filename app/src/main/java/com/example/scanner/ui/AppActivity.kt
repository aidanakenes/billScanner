package com.example.scanner.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.scanner.R
import com.example.scanner.ui.documents.ScannerFragment

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ScannerFragment())
            .addToBackStack(null)
            .commit()
    }

}