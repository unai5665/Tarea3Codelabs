import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
fun App(modifier: Modifier = Modifier, words: List<String> = listOf("World", "Compose")) {
    Column (modifier = modifier.padding(24.dp) ){
        for (word in words) {
            Basic(word = words)
        }

    }

    }

@Composable
fun Basic(word: List<String>, modifier: Modifier = Modifier) {
    Column (modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
            .background(color = Color.Blue)){
        Text(text = " A Alejandro")
        Text(text = "no le")
        Text(text = "gustan")
        Text(text = "los")
        Text(text = "moros")


    }

}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
