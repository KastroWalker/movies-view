import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import utils.loadImageBitmap

@Composable
@Preview
fun App() {
    val coverImageUrl = "https://modobrincar.rihappy.com.br/wp-content/uploads/2022/06/CAPA-TOY-STORY.jpeg"
    val coverImage = loadImageBitmap(coverImageUrl)

    MaterialTheme {
        Column(
            modifier = Modifier.width(200.dp).background(color = Color.Black).padding(all = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                bitmap = coverImage,
                contentDescription = "Capa do filme Toy Story",
                modifier = Modifier.width(200.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Filled.Star, "start", tint = Color.Yellow)
                    Text("8.3", color = Color.White)
                }
                Text("1995", color = Color.White)
            }
            Text("Toy Story", textAlign = TextAlign.Center, color = Color.White)
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Movies View"
    ) {
        App()
    }
}
