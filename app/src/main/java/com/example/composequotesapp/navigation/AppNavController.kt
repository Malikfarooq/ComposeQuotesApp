package com.example.composequotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composequotesapp.presentation.ui.screen.detailscreen.DetailScreen
import com.example.composequotesapp.presentation.ui.screen.homescreen.HomeScreen


@Composable
fun AppNavController() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenName.SPLASH_SCREEN) {

        composable(route = ScreenName.SPLASH_SCREEN) {
         HomeScreen{
             navController.navigate(ScreenName.DEVICE_DETAIL_SCREEN)
         }
        }

        composable(route = ScreenName.DEVICE_DETAIL_SCREEN) {
            DetailScreen{
                navController.popBackStack()
            }
        }
    }

}