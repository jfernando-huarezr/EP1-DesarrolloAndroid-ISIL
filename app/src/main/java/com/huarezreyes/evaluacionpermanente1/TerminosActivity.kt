package com.huarezreyes.evaluacionpermanente1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huarezreyes.evaluacionpermanente1.ui.theme.EvaluacionPermanente1Theme

class TerminosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvaluacionPermanente1Theme {
                Box (
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ){
                    Column (
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(text = stringResource(id = R.string.title_activity_terminos),
                            style = MaterialTheme.typography.titleLarge)

                        Spacer(modifier = Modifier.height(30.dp))
                        Text(text = stringResource(id = R.string.terminos))

                        Box (
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.BottomEnd
                        ) {
                            Button(onClick = {
                                finish()
                            }) {
                                Text(text = "Regresar")
                            }
                        }
                    }

                }
            }

        }
    }
}
