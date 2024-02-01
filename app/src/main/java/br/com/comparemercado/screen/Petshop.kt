package br.com.comparemercado.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Petshop(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF018786))
            .padding(32.dp)
    ) {
        Text(
            text = "PETSHOP",
            fontSize = 35.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
        Button(
            onClick = {
                navController.navigate("inicia")
                      },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Voltar", fontSize = 20.sp, color = Color.White)
        }

    }

}


