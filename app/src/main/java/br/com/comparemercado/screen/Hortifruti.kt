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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import br.com.comparemercado.R


@Composable
fun Hortifruti(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        )

        {
            Text(
                text = "HORTFRUTI",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .offset(x = (-120).dp)
                    .offset(y = (20).dp),
                color = Color(0xFF1BC4B4)
            )
            Image(
                painter = painterResource(id = R.drawable.ameixa),
                contentDescription = "ameixa",
                modifier = Modifier
                    .size(120.dp)
                    .padding(16.dp)
            )
            Text(
                text = "Ameixa kilo R\$6,50",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )

            Image(
                painter = painterResource(id = R.drawable.banana),
                contentDescription = "banana",
                modifier = Modifier
                    .size(130.dp)
                    .padding(16.dp)
                    .height(70.dp)
            )
            Text(
                text = "Banana kilo R\$5,50",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Image(
                painter = painterResource(id = R.drawable.lichia),
                contentDescription = "lichia",
                modifier = Modifier
                    .size(120.dp)
                    .padding(16.dp)
                    .height(30.dp)
            )
            Text(
                text = "Lichia kilo R\$16,50",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Image(
                painter = painterResource(id = R.drawable.morango),
                contentDescription = "morango",
                modifier = Modifier
                    .size(140.dp)
                    .padding(16.dp)
                    .height(50.dp)
            )
            Text(
                text = "Morango bandeja R\$3,50",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Button(
                onClick = { navController.navigate("inicia") },
                modifier = Modifier
                    .offset(x = (140).dp)
                    .offset(y = (-10).dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF1BC4B4))
            ) {
                Text(text = "Voltar", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}