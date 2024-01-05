package com.compose.sharedcomponent

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.domain.share.Component
import com.compose.feature.amodule.AComponent
import com.compose.feature.amodule.AScreen
import com.compose.feature.bmodule.BScreen

@Composable
fun MainNavGraph(
    startDestination: String = "A Screen",
    aComponent: Component,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(route = "A Screen") {
            AScreen(
                component = AComponent(),
                navigateToB = { navController.navigate("B Screen") },
                navigateUp = { navController.navigateUp() },
            )
        }
        composable(route = "B Screen") {
            BScreen(
                navigateToA = { navController.navigate("A Screen") },
                navigateUp = { navController.navigateUp() },
            )
        }
    }
}
