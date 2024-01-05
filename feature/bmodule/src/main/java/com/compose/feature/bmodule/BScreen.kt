package com.compose.feature.bmodule

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BScreen(
    navigateToA: () -> Unit = {},
    navigateUp: () -> Unit = {},
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    This is the second screen (aka B Screen)
                    What’s the secret to delicious and tangy sauerkraut? Always use ripe vodka.
                    All apostolic believers shape each other, only pictorial sinners have an enlightenment.
                """.trimIndent(),
            )
        }
    }
}
