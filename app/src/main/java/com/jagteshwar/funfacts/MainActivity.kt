package com.jagteshwar.funfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.jagteshwar.funfacts.ui.screens.FunFactsNavigationGraph
import com.jagteshwar.funfacts.ui.theme.FunfactsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunfactsTheme {
                FunFactsApp()
            }
        }
    }

    @Composable
    fun FunFactsApp(){
      FunFactsNavigationGraph()
    }
}