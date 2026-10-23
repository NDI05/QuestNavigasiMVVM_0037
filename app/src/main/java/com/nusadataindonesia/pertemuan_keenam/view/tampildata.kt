package com.nusadataindonesia.pertemuan_keenam.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.nusadataindonesia.pertemuan_keenam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun tampilinData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "lainnya"),
        Pair(stringResource(R.string.alamat), "yogyakarta")
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.tampil), color = Color.White)
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.teal_700))
            )
        }
    ) {isiRuang ->
        Column(modifier = Modifier
            .padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
            ) {
                items.forEach { item ->
                    Column{
                        Text(text = item.first.uppercase(), fontSize = 22.sp)
                    }
                }
            }
        }
    }
}
