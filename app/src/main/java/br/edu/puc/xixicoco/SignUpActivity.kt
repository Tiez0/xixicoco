package br.edu.puc.xixicoco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.puc.xixicoco.ui.theme.XixicocoTheme
import androidx.compose.runtime.*


class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            XixicocoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SimpleOutlinedTextFieldSample() {
    var NOME by remember { mutableStateOf("0") }

    OutlinedTextField(
        value = NOME,
        onValueChange = {NOME = it },
        label = { Text("NOME") }
    )
}

// comentario de teste
@Composable
fun Temail() {
    var EMAIL by remember { mutableStateOf("0") }

    OutlinedTextField(
        value = EMAIL,
        onValueChange = { EMAIL = it },
        label = { Text("CPF") }
    )
}





@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    XixicocoTheme {
        SimpleOutlinedTextFieldSample()
    }
}
@Preview(showBackground = true)
@Composable
fun TextFieldPreview2() {
    XixicocoTheme {
        Temail()
    }
}
