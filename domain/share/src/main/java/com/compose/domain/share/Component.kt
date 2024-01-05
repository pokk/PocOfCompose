package com.compose.domain.share

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface Component {
    @Composable
    fun Greeting(
        modifier: Modifier,
        text: String,
    )

    @Composable
    fun ButtonComponent(
        modifier: Modifier,
        text: String,
        onClick: () -> Unit,
    )
}
