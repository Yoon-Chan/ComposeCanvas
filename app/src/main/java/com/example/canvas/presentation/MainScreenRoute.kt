package com.example.canvas.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.canvas.NavigationClickEvent
import com.example.canvas.ui.theme.CanvasTheme

@Composable
fun MainScreenRoute(modifier: Modifier = Modifier, onClick: (NavigationClickEvent) -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //TODO: 여기에 이제 각 시리즈별 버튼을 만들 예정
        Button(
            onClick = { onClick(NavigationClickEvent.BasicCanvas) }
        ) {
            Text("Basic Canvas")
        }
    }
}

@Preview
@Composable
private fun MainScreenRoutePreview() {
    CanvasTheme {
        MainScreenRoute(
            onClick = {}
        )
    }
}