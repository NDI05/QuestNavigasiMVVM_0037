package com.nusadataindonesia.pertemuan_keenam.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.nusadataindonesia.pertemuan_keenam.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun tampilinData(
    onBackBtnClick:()-> Unit
){
    val item = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "lainnya"),
        Pair(stringResource(R.string.alamat), "yogyakarta")
    )
}
