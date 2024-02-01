package br.com.comparemercado.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.comparemercado.R

@Composable
fun Inicia (navController: NavController) {
    Column(
        modifier = Modifier
            .padding(25.dp)
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Text(
            text = "Conveniência",
            color = Color(0xFF1BC4B4),
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(35.dp),
            value = "Av Brasil, 1234",
            onValueChange = {},
            label = {
                Text(text = "Endereço:")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFFBBC2C1),
                unfocusedBorderColor = Color(0xFFFFBBC2C1),
                focusedContainerColor = Color(0x79DDE2E1),
            ),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_place_24),
                    contentDescription = "Localização",
                    tint = Color(0xFF18AF9A),
                )
            }
        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    navController.navigate("mercado")
                          },
                modifier = Modifier.size(120.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFECECEC))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mercados),
                        contentDescription = "Imagem Mercado"
                    )
                    Text(text = "Mercados",
                        color = Color.DarkGray
                    )
                }
            }
            Spacer(modifier = Modifier.width(50.dp))
            Button(
                onClick = {
                    navController.navigate("hortifruti")
                          },
                modifier = Modifier.size(120.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFECECEC))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hortifruti),
                        contentDescription = "Ícone Hortifruti"
                    )
                    Text(text = "Hortifruti",
                        color = Color.DarkGray
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    navController.navigate("bebidas")
                },
                modifier = Modifier.size(120.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFECECEC))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bebidas),
                        contentDescription = "Imagem Bebidas"
                    )
                    Text(text = "Bebidas",
                        color = Color.DarkGray
                    )

                }
            }
            Spacer(modifier = Modifier.width(50.dp))
            Button(
                onClick = {
                    navController.navigate("petshop")
                },
                modifier = Modifier.size(120.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFECECEC))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.petshop),
                        contentDescription = "Ícone Petshop"
                    )
                    Text(text = "Petshop",
                        color = Color.DarkGray)
                }
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, end = 0.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.rodape),
                contentDescription = "rodapé",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            )

        }
    }
}

