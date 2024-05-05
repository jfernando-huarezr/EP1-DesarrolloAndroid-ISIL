package com.huarezreyes.evaluacionpermanente1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme

@OptIn(ExperimentalMaterial3Api::class)
class MasInformacionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionPermanente1Theme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = stringResource(id = R.string.title_activity_mas_informacion),
                                    style = MaterialTheme.typography.titleLarge
                                )
                            },

                            colors = TopAppBarDefaults.smallTopAppBarColors(
                                containerColor = MaterialTheme.colorScheme.secondary
                            ),

                            navigationIcon = {
                                IconButton(onClick = {
                                    finish()
                                }) {
                                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                                }
                            },

                            actions = {
                                IconButton(onClick = {
                                    startActivity(Intent(this@MasInformacionActivity, TerminosActivity::class.java))
                                }) {
                                    Icon(imageVector = Icons.Filled.Info, contentDescription = null )
                                }
                            }
                        )
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(vertical = 10.dp, horizontal = 15.dp)
                    ) {
                        Card  (
                            modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                            shape = RoundedCornerShape(size = 10.dp)
                        ) {
                            Image(painter = painterResource(id = R.drawable.banner1),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp),
                                contentScale = ContentScale.Crop)
                            Text(text = "Coleccion Primavera 2023",
                                modifier = Modifier.padding(10.dp))

                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (
                            modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                            shape = RoundedCornerShape(size = 10.dp)
                        ) {
                            Image(painter = painterResource(id = R.drawable.banner3), contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp),
                                contentScale = ContentScale.Crop)
                            Text(text = "Línea Niños",
                                modifier = Modifier.padding(10.dp))
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (
                            modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                            shape = RoundedCornerShape(size = 10.dp)
                        ) {
                            Image(painter = painterResource(id = R.drawable.banner2), contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp),
                                contentScale = ContentScale.Crop)
                            Text(text = "Diseños Personalizados",
                                modifier = Modifier.padding(10.dp))
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (
                            modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                            shape = RoundedCornerShape(size = 10.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.banner4), contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp),
                                contentScale = ContentScale.Crop,
                                )

                            Text(text = "Línea de Juguitos",
                                modifier = Modifier.padding(10.dp))
                        }

                        Spacer(modifier = Modifier.height(15.dp))
                        Card (
                            modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(size = 10.dp)
                            ),
                            shape = RoundedCornerShape(size = 10.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.banner5), contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp),
                                contentScale = ContentScale.Crop)
                            Text(text = "Mascarillas",
                                modifier = Modifier.padding(10.dp))
                        }
                    }
                }
            }

        }
    }
}

