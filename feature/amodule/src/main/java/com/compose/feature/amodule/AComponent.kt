package com.compose.feature.amodule

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.compose.domain.share.Component

class AComponent : Component {
    @Composable
    override fun Greeting(modifier: Modifier, text: String) {
        Text(
            modifier = Modifier,
            text = text,
        )
    }

    @Composable
    override fun ButtonComponent(modifier: Modifier, text: String, onClick: () -> Unit) {
        Button(
            modifier = Modifier,
            onClick = onClick,
        ) {
            Text(text = text)
        }
    }
}
