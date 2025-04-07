package br.edu.puc.xixicoco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
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
fun Tnome() {
    var NOME by remember { mutableStateOf(" ") }

    OutlinedTextField(
        value = NOME,
        onValueChange = {NOME = it },
        label = { Text("NOME") }
    )
}

// comentario de teste
@Composable
fun Temail() {
    var EMAIL by remember { mutableStateOf(" ") }

    OutlinedTextField(
        value = EMAIL,
        onValueChange = { EMAIL = it },
        label = { Text("EMAIL") }
    )
}

@Composable
fun Tsenha() {
    var SENHA by remember {  mutableStateOf(" ") }

    OutlinedTextField(
        value = SENHA,
        onValueChange = { SENHA = it },
        label = { Text("SENHA") }

    )
}

@Composable
fun Trg() {
    var RG by remember {  mutableStateOf(" ") }

    OutlinedTextField(
        value = RG,
        onValueChange = { RG = it },
        label = { Text("RG") }

    )
}

@Composable
fun Tcpf() {
    var CPF by remember {  mutableStateOf(" ") }

    OutlinedTextField(
        value = CPF,
        onValueChange = { CPF = it },
        label = { Text("cpf") }

    )
}

@Composable
fun botaocriarconta(onClick: () -> Unit) {
    FilledTonalButton(onClick = onClick) {
        Text("CRIAR CONTA")
    }
}





@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    XixicocoTheme {
        Tnome()
    }
}
@Preview(showBackground = true)
@Composable
fun TextFieldPreview2() {
    XixicocoTheme {
        Temail()
    }
}
@Preview (showBackground = true)
@Composable
fun TextFieldPreview3(){
    XixicocoTheme {
        Tsenha()
    }
}

@Preview (showBackground = true)
@Composable
fun TextFieldPreview4(){
    XixicocoTheme {
        Trg()
    }
}

@Preview (showBackground = true)
@Composable
fun TextFieldPreview5(){
    XixicocoTheme {
        Tcpf()
    }
}

@Preview (showBackground = true)
@Composable
fun ButtonFieldPreview6(){
    XixicocoTheme {
        botaocriarconta() {  }
    }
}







