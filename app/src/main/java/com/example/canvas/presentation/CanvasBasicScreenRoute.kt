package com.example.canvas.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.canvas.ui.theme.CanvasTheme

@Composable
fun CanvasBasicScreenRoute(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        MyCanvas()
    }

    //drawWithContent 예제
    /* Box(
         modifier = modifier
             .fillMaxSize()
             .drawWithContent {
                 drawContent()
                 drawCircle(
                     color = Color.Blue,
                     radius = 100f,
                 )
             }
             .background(color = Color.Red),
     )*/

}

@Composable
fun MyCanvas(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .padding(20.dp)
            .size(300.dp)
    ) {

        //cap 예제
//        drawLine(
//            color = Color.Red,
//            start = Offset(10f, 50f),
//            end = Offset(10f, 500f),
//            cap = StrokeCap.Butt,
//            strokeWidth = 30f
//        )
//

        //join 관련 예제
//        drawRect(
//            color = Color.Blue,
//            topLeft = Offset(100f, 10f),
//            size = Size(200f, 200f),
//            style = Stroke(
//                width = 10.dp.toPx(),
//                join = StrokeJoin.Miter,
//                pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 5f, 10f))
//            )
//        )
//
//        drawRect(
//            color = Color.Red,
//            topLeft = Offset(400f, 10f),
//            size = Size(200f, 200f),
//            style = Stroke(
//                width = 10.dp.toPx(),
//                join = StrokeJoin.Round
//            ),
//            colorFilter = ColorFilter.tint(color = Color.Green, BlendMode.Color)
//        )
//
//        drawRect(
//            color = Color.Green,
//            topLeft = Offset(700f, 10f),
//            size = Size(200f, 200f),
//            style = Stroke(
//                width = 10.dp.toPx(),
//                join = StrokeJoin.Bevel
//            )
//        )

//        다양한 함수 예제
        drawLine(
            color = Color.Blue,
            start = Offset(250f, 50f),
            end = Offset(250f, 500f),
            cap = StrokeCap.Square,
            strokeWidth = 30f
        )

        drawLine(
            color = Color.Green,
            start = Offset(490f, 50f),
            end = Offset(490f, 500f),
            cap = StrokeCap.Round,
            strokeWidth = 30f
        )

        drawRect(
            color = Color.Red,
            topLeft = Offset(100f, 100f),
            size = Size(100f, 100f),
            style = Stroke(
                width = 3.dp.toPx()
            )
        )

        drawCircle(
            brush = Brush.radialGradient(
                listOf(Color.Red, Color.Yellow),
                center = center,
                radius = 100f
            ),
            radius = 100f,
            center = center
        )

        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(100f, 500f),
            size = Size(200f, 200f),
            style = Stroke(
                width = 3.dp.toPx()
            )
        )

        drawOval(
            color = Color.Magenta,
            topLeft = Offset(500f, 100f),
            size = Size(200f, 300f),
        )

        drawLine(
            color = Color.Cyan,
            start = Offset(300f, 700f),
            end = Offset(700f, 700f),
            strokeWidth = 5.dp.toPx()
        )
    }
}

@Preview
@Composable
private fun CanvasBasicScreenRoutePreview() {
    CanvasTheme {
        CanvasBasicScreenRoute()
    }
}