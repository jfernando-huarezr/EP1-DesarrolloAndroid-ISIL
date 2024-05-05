package com.huarezreyes.evaluacionpermanente1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme
import org.json.JSONArray

val campos =
    arrayOf(
        "idproveedor",
        "nombreempresa",
        "nombrecontacto",
        "cargocontacto",
        "direccion",
        "ciudad",
        "region",
        "codigopostal",
        "pais",
        "telefono",
        "fax"
    )

class SociosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        leerServicio()

    }

    private fun leerServicio() {
        val queue = Volley.newRequestQueue(this)
        val url = "https://servicios.campus.pe/proveedores.php"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                Log.d("DATOS", response)
                llenarLista(response)
            },
            {
                Log.d("DATOSERROR", it.message.toString())
            })

        queue.add(stringRequest)
    }

    private fun llenarLista(response: String?) {
        val jsonArray = JSONArray(response)
        val arrayList = ArrayList<HashMap<String,String>>()
        val auxArrayValues = ArrayList<String>()

        for(i in 0 until jsonArray.length()) {


            for(j in 0 until campos.size) {
                val valor = jsonArray.getJSONObject(i).getString(campos[j])

                if(valor == "null") {
                    auxArrayValues.add("No hay datos")
                }
                else {
                    auxArrayValues.add(valor)
                }
            }

            Log.d("PRUEBA", auxArrayValues.toString())

            val map =  HashMap<String,String>()


            for(i in 0 until campos.size) {
                map.put(campos[i], auxArrayValues.get(i))
            }

            arrayList.add(map)
            auxArrayValues.clear()
        }

        dibujar(arrayList)
    }

    private fun dibujar(arrayList: ArrayList<HashMap<String, String>>) {
        setContent {
            EvaluacionPermanente1Theme {
                Column (
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                ) {
                    Text(
                        text = stringResource(id = R.string.title_activity_socios),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                                    .padding(30.dp)
                    )

                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        content ={
                            items(
                                items = arrayList,
                                itemContent = {socio ->

                                    Box (
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Column(
                                            modifier = Modifier
                                                .padding(all = dimensionResource(id = R.dimen.espacio2))
                                                .border(
                                                    width = 1.dp,
                                                    color = Color.Gray,
                                                    shape = RectangleShape
                                                )
                                                .background(MaterialTheme.colorScheme.primary)
                                                .padding(all = dimensionResource(id = R.dimen.espacio))

                                                .height(400.dp)
                                                .width(200.dp),


                                            ) {
                                            for (i in 0 until campos.size) {
                                                Text(text = socio[campos[i]].toString(),
                                                    style =
                                                    if (i==1) {
                                                        MaterialTheme.typography.titleLarge
                                                    }
                                                    else {
                                                        MaterialTheme.typography.titleMedium
                                                    }

                                                )
                                            }
                                        }
                                    }
                                }
                            )
                        }
                    )
                }
            }

        }
    }
}

