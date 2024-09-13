package simple.projects.coroutinesandthread.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel(){
    var name : String by mutableStateOf("MY NAME!")
        private  set
    fun updateName(){
        name = "Vivek"
    }
}