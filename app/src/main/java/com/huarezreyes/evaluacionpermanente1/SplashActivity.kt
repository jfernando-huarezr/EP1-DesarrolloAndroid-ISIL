package com.huarezreyes.evaluacionpermanente1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionPermanente1Theme {
                LaunchedEffect(key1 = true) {
                    delay(2000);
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish() //una vez cargado cerrar el activity splash, cuando retroceda ya no va a aparecer
                }


                Box (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.primary),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.icon), contentDescription = stringResource(
                        id = R.string.logo),
                        modifier = Modifier
                            .size(80.dp)
                    )
                }
            }
        }
    }
}

