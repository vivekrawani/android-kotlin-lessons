package simple.projects.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import simple.projects.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier = Modifier.weight(1f) ){
                        Card(title = "Text composable", content = "Displays text and follows the recommended Material Design guidelines.", color =Color(0xFFEADDFF))
                        Card(title ="Image composable" , content = "Creates a composable that lays out and draws a given Painter class object.", color = Color(0xFFD0BCFF))
                    }
                    Row(modifier = Modifier.weight(1f)) {
                        Card(title = "Row composable" , content = "A layout composable that places its children in a horizontal sequence.", color = Color(0xFFB69DF8))
                        Card(title = "Column composable", content = "A layout composable that places its children in a vertical sequence.", color = Color(0xFFF6EDFF))
                    }
                }



            }
        }
    }
}

@Composable
fun Card(title: String, content : String, color: Color) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp))
        Text(text = content)
    }
}
