package com.example.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.canvas.destination.CanvasBasic
import com.example.canvas.destination.MainRoute
import com.example.canvas.presentation.CanvasBasicScreenRoute
import com.example.canvas.presentation.MainScreenRoute
import com.example.canvas.ui.theme.CanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CanvasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun NavigationScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = MainRoute
    ) {
        composable<MainRoute> {
            MainScreenRoute(
                onClick = { event ->
                    when(event) {
                        NavigationClickEvent.BasicCanvas -> navController.navigate(CanvasBasic)
                    }
                }
            )
        }

        composable<CanvasBasic> {
            CanvasBasicScreenRoute()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CanvasTheme {
        NavigationScreen()
    }
}