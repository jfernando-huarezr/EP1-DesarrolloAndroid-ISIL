package com.huarezreyes.evaluacionpermanente1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme

class EscritorioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //constante
        val etiquetas =
            arrayOf(
                "Proveedores",
                "Empleados",
                "Tienda",
                "Area clientes",
                "Caja",
                "Salir"
            ) //val es una constante en kotlin
        val iconos = intArrayOf(
            R.drawable.baseline_support_24,
            R.drawable.baseline_person_24,
            R.drawable.baseline_storefront_24,
            R.drawable.baseline_people_24,
            R.drawable.baseline_attach_money_24,
            R.drawable.baseline_exit_to_app_24
        )

        setContent {
            EvaluacionPermanente1Theme {
                Column (
                    modifier = Modifier.background(MaterialTheme.colorScheme.secondary).fillMaxSize()
                ) {

                    Box {
                        AsyncImage(
                            model = "https://flomaster.top/uploads/posts/2021-11/1637948769_41-flomaster-club-p-skhematichnie-risunki-dlya-detei-detskie-50.jpg",
                            contentDescription = "person shopping",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp),
                            contentScale = ContentScale.Crop
                        )

                        Surface(
                            color = Color.Black.copy(alpha = 0.5f),
                            modifier = Modifier.fillMaxWidth().align(Alignment.BottomStart)
                        ) {
                            Text(
                                text = stringResource(id = R.string.title_activity_escritorio),
                                style = MaterialTheme.typography.titleLarge,
                                color = MaterialTheme.colorScheme.tertiary,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }


                    //acomoda varios objetos
                    LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
                        items(etiquetas.size) { index ->
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.primary
                                ),
                                modifier = Modifier
                                    .padding(all = dimensionResource(id = R.dimen.espacio2))
                                    .clickable {
                                        mostrarVentana(index)
                                    }

                            ) {
                                Icon(
                                    painter = painterResource(id = iconos[index]),
                                    contentDescription = null,
                                    modifier = Modifier.padding(
                                        top = dimensionResource(
                                            id = R.dimen.espacio1,
                                        ),
                                        start = dimensionResource(
                                            id = R.dimen.espacio1
                                        )
                                    )
                                )
                                Text(
                                    text = etiquetas[index],
                                    modifier = Modifier.padding(
                                        all = dimensionResource(
                                            id = R.dimen.espacio1
                                        )
                                    )
                                )
                            }
                        }
                    })

                }
            }
        }
    }

    private fun mostrarVentana(posicion: Int) {
        //logcat es como la ventana console log de javascript
        Log.d("PRUEBA", posicion.toString())
        when(posicion) {
            0 -> startActivity(Intent(this@EscritorioActivity, ProveedoresActivity::class.java))
            1 -> startActivity(Intent(this@EscritorioActivity, EmpleadosActivity::class.java))
            2 -> startActivity(Intent(this@EscritorioActivity, TiendaActivity::class.java))
            3 -> startActivity(Intent(this@EscritorioActivity, AreaClientesActivity::class.java))
            4 -> startActivity(Intent(this@EscritorioActivity, CajaActivity::class.java))
            5 -> finish()
        }
    }
}

