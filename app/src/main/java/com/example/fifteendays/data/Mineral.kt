package com.example.fifteendays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.fifteendays.R

data class Mineral(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val hardness: Int,
    @StringRes val description: Int
)

val minerales = listOf(
    Mineral(R.drawable.mineral1, R.string.mineral1, 2, R.string.mineral_description_1),
    Mineral(R.drawable.mineral2, R.string.mineral2,  2, R.string.mineral_description_2),
    Mineral(R.drawable.mineral3, R.string.mineral3, 2, R.string.mineral_description_3),
    Mineral(R.drawable.mineral4, R.string.mineral4, 7, R.string.mineral_description_4),
    Mineral(R.drawable.mineral5, R.string.mineral5, 5, R.string.mineral_description_5),
    Mineral(R.drawable.mineral6, R.string.mineral6, 4, R.string.mineral_description_6),
    Mineral(R.drawable.mineral7, R.string.mineral7, 7, R.string.mineral_description_7),
    Mineral(R.drawable.mineral8, R.string.mineral8, 5, R.string.mineral_description_8),
    Mineral(R.drawable.mineral9, R.string.mineral9, 5, R.string.mineral_description_9),
    Mineral(R.drawable.mineral10, R.string.mineral10, 5, R.string.mineral_description_10),
    Mineral(R.drawable.mineral11, R.string.mineral11, 5, R.string.mineral_description_11),
    Mineral(R.drawable.mineral12, R.string.mineral12, 5, R.string.mineral_description_12),
    Mineral(R.drawable.mineral13, R.string.mineral13, 4, R.string.mineral_description_13),
    Mineral(R.drawable.mineral14, R.string.mineral14, 7, R.string.mineral_description_14),
    Mineral(R.drawable.mineral15, R.string.mineral15, 7, R.string.mineral_description_15)
)
