import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Text("Toy Story", fontSize = 64.sp, fontWeight = FontWeight(700))
            Image(
                painter = painterResource("CAPA-TOY-STORY.jpeg"),
                contentDescription = "Capa do filme Toy Story",
                modifier = Modifier.width(200.dp)
            )
            Row {
                Text("Nota: 8.3")
                Text(" - ")
                Text("Ano: 1995")
            }
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
