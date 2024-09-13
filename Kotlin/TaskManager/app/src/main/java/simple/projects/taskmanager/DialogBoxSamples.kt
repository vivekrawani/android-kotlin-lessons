package simple.projects.taskmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class DialogBoxSamples : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var open by rememberSaveable {
                mutableStateOf(true)
            }
            Surface(
                modifier = Modifier.wrapContentSize(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {



            Text(text = stringResource(id = R.string.hello))
                    Spacer(modifier = Modifier.height(24.dp))



            Button(onClick = {open = true}) {
                Text(text = "Open Box")
            }

            if(open){
                AlertDialog(
                    icon = { Icon(Icons.Filled.DateRange, contentDescription = null)},
                    onDismissRequest = { open = false },
                    title={
                        Text(text = "Title")
                                            },
                    confirmButton = { TextButton(onClick = { open=false }) {
                        Text(text = "Confirm")
                    } },
                    dismissButton = { TextButton(onClick = { open=false }) {
                        Text(text = "Done")
                    } },
                )

                }
            }

            }
        }
    }
}
