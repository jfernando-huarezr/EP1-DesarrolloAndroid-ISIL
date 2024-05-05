package com.huarezreyes.evaluacionpermanente1.ui.theme

import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(topStartPercent = 5, topEndPercent = 65, bottomStartPercent = 65, bottomEndPercent = 10),
    medium = AbsoluteRoundedCornerShape(topLeftPercent = 50, topRightPercent = 50, bottomLeftPercent = 50, bottomRightPercent = 10),
    large = CutCornerShape(topStartPercent = 35, topEndPercent = 35, bottomStartPercent = 75, bottomEndPercent = 75)
)