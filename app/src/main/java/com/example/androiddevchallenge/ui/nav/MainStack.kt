package com.example.androiddevchallenge.ui.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.screen.details.PuppyDetailsScreen
import com.example.androiddevchallenge.ui.screen.list.PuppiesListScreen

@Composable
fun MainStack() {
    val navController = rememberNavController()
    val routeList = stringResource(id = R.string.route_puppies_list)
    val routeDetails = stringResource(id = R.string.route_puppy_details)
    val argDetailsUuid = stringResource(id = R.string.route_puppy_details_args_uuid)

    NavHost(navController, startDestination = routeList) {
        composable(route = routeList) {
            PuppiesListScreen(
                onPuppySelected = { uuid -> navController.navigate("${routeDetails}/${uuid}") }
            )
        }
        composable(
            route = "${routeDetails}/{${argDetailsUuid}}",
            arguments = listOf(navArgument(argDetailsUuid) { type = NavType.StringType })
        ) { backStackEntry ->
            PuppyDetailsScreen(
                uuid = backStackEntry.arguments?.getString(argDetailsUuid),
                back = navController::popBackStack
            )
        }
    }
}
