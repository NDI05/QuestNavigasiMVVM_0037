package com.nusadataindonesia.pertemuan_keenam

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nusadataindonesia.pertemuan_keenam.view.FormIsian
import com.nusadataindonesia.pertemuan_keenam.view.tampilinData

enum class Navigasi{
    FormulirSaya,
    detail
}

@Composable
fun dataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold{isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(isiRuang)
        ){
            composable(route = Navigasi.FormulirSaya.name){
                FormIsian(OnSubmitBtnClick = {
                    navController.navigate(Navigasi.detail.name)
                })
            }
            composable(route = Navigasi.detail.name){
                tampilinData(
                    onBackBtnClick = {cancelAndBackToFormulirSaya(navController)
                    }
                )
            }
        }

    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavController
) {
    navController.popBackStack(
        Navigasi.FormulirSaya.name,
        inclusive = false
    )
}

