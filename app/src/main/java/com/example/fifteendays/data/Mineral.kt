package com.example.fifteendays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.fifteendays.R

data class Mineral(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hardness: Int,
    @StringRes val hobbies: Int
)

val minerales = listOf(
    Mineral(R.drawable.bismuto, R.string.bismuto, R.string., R.string.dog_description_1),
    Mineral(R.drawable.bismuto_variante, R.string.bismuto_variante, R.string., R.string.dog_description_2),
    Mineral(R.drawable.criscola_malaquita, R.string.criscola_malaquita, R.string., R.string.dog_description_3),
    Mineral(R.drawable.cuarzo_titanio, R.string.cuarzo_titanio, R.string., R.string.dog_description_4),
    Mineral(R.drawable.escolecita, R.string.escolecita, R.string., R.string.dog_description_5),
    Mineral(R.drawable.fluorita, R.string.fluorita, R.string., R.string.dog_description_6),
    Mineral(R.drawable.geoda_cuarzo, R.string.geoda_cuarzo, R.string., R.string.dog_description_7),
    Mineral(R.drawable.opalo_fosil, R.string.opalo_fosil, R.string., R.string.dog_description_8),
    Mineral(R.drawable.opalo_fuego, R.string.opalo_fuego, R.string., R.string.dog_description_9),
    Mineral(R.drawable.opalo_galaxia, R.string.opalo_galaxia, R.string., R.string.dog_description_10),
    Mineral(R.drawable.opalo_negro, R.string.opalo_negro, R.string., R.string.dog_description_11),
    Mineral(R.drawable.opalo_ocean, R.string.opalo_oceanico, R.string., R.string.dog_description_12),
    Mineral(R.drawable.rodocrosita, R.string.rodocrosita, R.string., R.string.dog_description_13),
    Mineral(R.drawable.turmalina_birmania, R.string.turmalina_birmarina, R.string., R.string.dog_description_14),
    Mineral(R.drawable.turmalina_sandia, R.string.turmalina_sandia, R.string., R.string.dog_description_15)
)
