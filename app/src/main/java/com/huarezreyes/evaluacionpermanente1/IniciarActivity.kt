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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme

class IniciarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionPermanente1Theme {
                Column {
                    Box {
                        Image(
                            painter =
                            painterResource(id = R.drawable.banner6),
                            contentDescription = "banner",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(300.dp),
                            contentScale = ContentScale.Crop
                        )

                        Surface (
                            color = Color.Black.copy(alpha = 0.6f),
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomStart)
                        ) {
                            Text(
                                text = stringResource(id = R.string.title_activity_iniciar),
                                style = MaterialTheme.typography.titleLarge,
                                color = MaterialTheme.colorScheme.tertiary,
                                modifier = Modifier
                                    .padding
                                        (horizontal = dimensionResource(id = R.dimen.espacio1),
                                        vertical = 8.dp)
                            )
                        }
                    }

                    Box (
                        modifier = Modifier.fillMaxSize()
                                    .background(MaterialTheme.colorScheme.background)
                                    .padding(20.dp)

                    ) {
                        Text(text = stringResource(id = R.string.mensaje_inicio1))
                    }
                }



                Row (
                    modifier = Modifier.fillMaxSize().padding(bottom = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Button(onClick = {
                        startActivity(Intent(this@IniciarActivity, TerminosActivity::class.java))
                    }, modifier = Modifier.padding(end = 4.dp),
                        shape = MaterialTheme.shapes.medium) {
                        Text(text = "Terminos")
                    }
                    Button(onClick = {
                        startActivity(Intent(this@IniciarActivity,EscritorioActivity::class.java))
                    }, shape = MaterialTheme.shapes.medium) {
                        Text(text = "Empiece Ya")
                    }
                }
            }

        }
    }
}

