package simple.projects.taskmanager

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import simple.projects.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()){
                    Button(onClick = { Intent(applicationContext, SecondActivity::class.java).also {
                        startActivity(it)
                    } }) {

                        Text(text = "Go to second activity")
                    }
                    Button(onClick = { Intent(Intent.ACTION_MAIN).also {
                        it.`package`="com.google.android.youtube"
                        try {
                        startActivity(it)

                        }catch (e : ActivityNotFoundException){

                        }
                    } }) {

                        Text(text = "Go to Youtube app")
                    }
                    Button(onClick = {
                        val sendIntent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/*"
                            putExtra(Intent.EXTRA_TEXT, "Text");
//                            putExtra("image_url", R.drawable.ic_task_completed)
                            setPackage("com.whatsapp")
                        }
////                        Intent(Intent.ACTION_MAIN).also {
////                        it.`package`="com.whatsapp"
                        if(sendIntent.resolveActivity(packageManager)!=null){
                            startActivity(sendIntent)
                        }else{
                           Toast.makeText(this@MainActivity, "Text" , Toast.LENGTH_LONG).show()
                        }



                    }
                    ) {

                        Text(text = "Go to WhatsApp")
                    }
                    Button(onClick = { Intent(Intent.ACTION_MAIN).also {
                        it.`package` = "com.application.zomato"
                        try {
                            startActivity(it)

                        }catch (e : ActivityNotFoundException){
                            e.printStackTrace()
                            Toast.makeText(this@MainActivity, "Text" , Toast.LENGTH_LONG).show()
                        }
                    } }) {

                        Text(text = "Go to Hotstar app")
                    }
                    Button(onClick = { Intent(Intent.ACTION_MAIN).also {
                        it.`package`="com.android.chrome"
                        try {
                            startActivity(it)

                        }catch (e : ActivityNotFoundException){

                        }
                    } }) {

                        Text(text = "Go to Chrome")
                    }

                    Button(onClick = {
                        var intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_EMAIL, arrayOf("kumarrawanivivek@gmail.com"))
                            putExtra(Intent.EXTRA_SUBJECT, "Subject")
                            putExtra(Intent.EXTRA_TEXT, "This is template")
                        }
                        if(intent.resolveActivity(packageManager)!=null){
                            startActivity(intent)
                        }
                    }) {
                        Text(text = "Email Me")
                    }
                    Button(onClick = {
                        val activity = Intent(applicationContext, NetworkActivity::class.java)
                        startActivity(activity)
                    }) {
                            Text(text = "Switch Tab")
                    }

                    Button(onClick = {
                        val activity = Intent(applicationContext, DialogBoxSamples::class.java)
                        try {
                            startActivity(activity)
                        } catch (e : ActivityNotFoundException){
                            e.printStackTrace()
                            Toast.makeText( this@MainActivity, "Bot", Toast.LENGTH_SHORT).show()
                        }
                    }) {
                        Text(text = "Dialog Box")
                    }

                }
            }
        }
    }
}

@Composable
fun TaskManager(){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.ic_task_completed), contentDescription = "None")
        Text(text = "All Task Completed",
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp),
            fontWeight = FontWeight.Bold)
        Text(text = "Nice Work", fontSize = 16.sp)
        
    }
}


