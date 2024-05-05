package com.huarezreyes.evaluacionpermanente1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.huarezreyes.evaluacionpermanente1.R

// Set of Material typography styles to start with
private val Onest = FontFamily(
    Font(R.font.onestblack, FontWeight.Black),
    Font(R.font.onestbold, FontWeight.Bold),
    Font(R.font.onestregular, FontWeight.Normal),
    Font(R.font.onestlight, FontWeight.Light),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Onest,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = Onest,
        fontWeight = FontWeight.Black,
        fontSize = 36.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    labelSmall = TextStyle(
     fontFamily = Onest,
     fontWeight = FontWeight.Medium,
     fontSize = 11.sp,
     lineHeight = 16.sp,
     letterSpacing = 0.5.sp
 )

)