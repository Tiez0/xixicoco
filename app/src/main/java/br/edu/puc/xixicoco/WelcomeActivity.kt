package br.edu.puc.xixicoco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.puc.xixicoco.ui.theme.XixicocoTheme

class WelcomeActivity : ComponentActivity() {
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
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Bem-vindo ao programa experimental Firebase",
            modifier = modifier
        )

        botaologin {
            println("Botão de login clicado")

        }
        botaosignup {
            println("Botão de singup clicado")
        }
    }
}
@Composable
fun botaologin(onClick: () -> Unit) {
    FilledTonalButton(onClick = onClick) {
        Text("Login")
    }
}
@Composable
fun botaosignup(onClick: () -> Unit) {
    FilledTonalButton(onClick = onClick) {
        Text("Singup")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    XixicocoTheme {
        Greeting("Android")
    }
}