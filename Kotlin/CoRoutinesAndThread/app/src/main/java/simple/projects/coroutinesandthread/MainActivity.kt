package simple.projects.coroutinesandthread

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

import simple.projects.coroutinesandthread.ui.theme.CoRoutinesAndThreadTheme
import simple.projects.coroutinesandthread.viewmodels.NameViewModel

class MainActivity : ComponentActivity() {
    val TAG = "Main"
    val nameViewModel = NameViewModel();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Text(text = nameViewModel.name)
        }

        Log.d(TAG, "Hey from the ${Thread.currentThread().name}")
        GlobalScope.launch(Dispatchers.IO) {
            delay(3000)
            Log.d(TAG, "In thread ${Thread.currentThread().name}")
            nameViewModel.updateName();


        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoRoutinesAndThreadTheme {
        Greeting("Android")
    }
}