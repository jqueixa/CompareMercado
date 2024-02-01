package br.com.comparemercado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.comparemercado.screen.Bebidas
import br.com.comparemercado.screen.Hortifruti
import br.com.comparemercado.screen.Inicia
import br.com.comparemercado.screen.Mercado
import br.com.comparemercado.screen.Petshop
import br.com.comparemercado.ui.theme.CompareMercadoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompareMercadoTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "inicia"
                    ) {
                        composable(route = "inicia") {
                            Inicia(navController)
                        }
                        composable(route = "mercado") {
                            Mercado(navController)
                        }
                        composable(route = "hortifruti") {
                            Hortifruti(navController)
                        }
                        composable(route = "bebidas") {
                            Bebidas(navController)
                        }
                        composable(route = "petshop") {
                            Petshop(navController)
                        }

                    }
                }
            }
        }
    }
}