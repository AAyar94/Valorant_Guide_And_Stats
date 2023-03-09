package com.aayar94.valorantguidestats.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ValorantMap(
    val uuid: String,
    val displayName: String,
    val coordinates: String,
    val displayIcon: String?,
    val listViewIcon: String?,
    val splash: String,
    val mapUrl: String,
    val xMultiplier: Double,
    val yMultiplier: Double,
    val xScalarToAdd: Double,
    val yScalarToAdd: Double
) : Parcelable