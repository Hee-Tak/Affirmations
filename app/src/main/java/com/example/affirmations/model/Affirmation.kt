package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
// 리소스 주석 달기위해서

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )