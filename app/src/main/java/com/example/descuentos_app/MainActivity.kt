package com.example.descuentos_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.descuentos_app.ui.theme.Descuentos_AppTheme
import com.example.descuentos_app.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Descuentos_AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    HomeView()
                }
            }
        }
    }
}

