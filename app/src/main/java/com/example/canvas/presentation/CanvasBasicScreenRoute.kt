package com.example.canvas.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.canvas.ui.theme.CanvasTheme

@Composable
fun CanvasBasicScreenRoute(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Cavas Baisc")
    }
}

@Preview
@Composable
private fun CanvasBasicScreenRoutePreview() {
    CanvasTheme {
        CanvasBasicScreenRoute()
    }
}