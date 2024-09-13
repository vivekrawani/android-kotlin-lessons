package simple.projects.taskmanager

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var count : Int by mutableStateOf(0)
        private set
    fun updateCount(){
        this.count++
    }
}