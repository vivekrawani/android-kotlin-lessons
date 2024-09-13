package simple.projects.taskmanager

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import coil.compose.AsyncImage
import simple.projects.taskmanager.ui.theme.TaskManagerTheme
import kotlin.math.log

class SecondActivity  : ComponentActivity() {
    private val viewModel by viewModels<ImageViewModel>()
    private val countViewModel by viewModels<CountViewModel>()
    private val TAG = "LifeCycle"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Create")
        setContent {
            TaskManagerTheme {

               // var count : MutableState<Int> = mutableStateOf(0)
//                var count : Int by remember {
//                    mutableStateOf(0)
//                }
                Box(
                    modifier = Modifier.fillMaxSize()


                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()

                    ) {
                        Text(text = "Hola")
                        Text(text = countViewModel.count.toString())
                        Button(onClick = {
                            countViewModel.updateCount()
//                            countViewModel.updateCount()
                        }) {
                            Text(text = "Hit me")
                        }
                    }
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Destroy")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Stop")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Restart")
    }

    override fun onNewIntent(intent: Intent?){
        super.onNewIntent(intent)
        setIntent(intent)

        val uri = if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.TIRAMISU){
            intent?.getParcelableExtra(Intent.EXTRA_STREAM, Uri::class.java)

        } else {
            intent?.getParcelableExtra(Intent.EXTRA_STREAM)
        }
        viewModel.updateUri(uri)
        Log.d("Testis", uri.toString())


    }
}