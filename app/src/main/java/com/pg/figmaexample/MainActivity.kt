package com.pg.figmaexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.pg.figmaexample.button.Button
import com.pg.figmaexample.button.Icon
import com.pg.figmaexample.button.Size
import com.pg.figmaexample.button.State
import com.pg.figmaexample.ui.theme.FigmaExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier, color = MaterialTheme.colorScheme.error) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Button(
        icon = Icon.None,
        size =Size.S,
        state = State.Primary,
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FigmaExampleTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun Man() {
    Text(
        text = "MAN",
        color = Color(0xff333333).copy(alpha = 0.5f),
        lineHeight = 2.46.em,
        style = TextStyle(
            fontSize = 14.sp,
            letterSpacing = 3.sp)
    )
}

@Preview(showBackground = true)
@Composable
fun Cart() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(width = 313.dp)
            .height(height = 134.dp)
    ) {
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 0.dp)
                .width(width = 100.dp)
                .height(height = 134.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Rectangle 344",
                modifier = Modifier
                    .width(width = 100.dp)
                    .height(height = 133.dp))
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 110.71640014648438.dp,
                    y = 7.dp)
        ) {
            Column() {
                Text(
                    text = "LAMEREI",
                    color = Color.Black,
                    lineHeight = 1.43.em,
                    style = TextStyle(
                        fontSize = 14.sp,
                        letterSpacing = 2.sp))
                Spacer(
                    modifier = Modifier
                        .height(height = 6.dp))
                Text(
                    text = "Recycle Boucle Knit Cardigan Pink",
                    color = Color(0xff555555),
                    lineHeight = 1.5.em,
                    style = TextStyle(
                        fontSize = 12.sp))
            }
            Spacer(
                modifier = Modifier
                    .height(height = 12.dp))
            Box(
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .width(width = 78.dp)
                    .height(height = 24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(size = 24.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(1.dp, Color(0xffc4c4c4)),
                            shape = CircleShape)) {

                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "Plus",
                        modifier = Modifier
                            .size(size = 16.dp))
                }
                Text(
                    text = "1",
                    color = Color.Black,
                    lineHeight = 1.em,
                    style = TextStyle(
                        fontSize = 14.sp))
                Box(
                    modifier = Modifier
                        .size(size = 24.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(1.dp, Color(0xffc4c4c4)),
                            shape = CircleShape)) {


                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "Plus",
                        modifier = Modifier
                            .size(size = 16.dp))
                }
            }
            Spacer(
                modifier = Modifier
                    .height(height = 12.dp))
            Text(
                text = "$120",
                color = Color(0xffdd8560),
                lineHeight = 1.6.em,
                style = TextStyle(
                    fontSize = 15.sp))
        }
    }
}