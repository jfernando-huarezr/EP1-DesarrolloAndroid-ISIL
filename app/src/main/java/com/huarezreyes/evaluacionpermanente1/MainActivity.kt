package com.huarezreyes.evaluacionpermanente1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionPermanente1Theme {
                Column (
                    modifier =
                    Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(top = 32.dp),

                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = stringResource(id = R.string.slogan)
                    )

                    Text(
                        text = stringResource(id = R.string.marca),
                        style = MaterialTheme.typography.titleLarge
                    )
                }

                Column (
                    modifier =
                    Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,

                ){
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = stringResource(id = R.string.marca),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = stringResource(id = R.string.saludo),
                        modifier = Modifier.padding(vertical = 20.dp)
                    )

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    )  {

                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, IniciarActivity::class.java))
                        }, shape = MaterialTheme.shapes.small) {
                            Text(text = stringResource(id = R.string.inicio))
                        }

                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, SociosActivity::class.java))
                        }, shape = MaterialTheme.shapes.small) {
                            Text(text = stringResource(id = R.string.socios))
                        }

                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, MasInformacionActivity::class.java))
                        }, shape = MaterialTheme.shapes.small) {
                            Text(text = "Mas Informacion")
                        }

                    }


                }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = stringResource(id = R.string.derechos),
                        modifier = Modifier.padding(
                            bottom = dimensionResource(
                                id = R.dimen.espacio
                            )
                        )
                    )
                    //usualmente se usan medidas fijas.
                }
            }


        }
    }
}

