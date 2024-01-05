package com.compose.sharedcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.compose.domain.share.Component
import com.compose.sharedcomponent.ui.theme.SharedComponentTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var acomponent: Component

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SharedComponentTheme {
                MainNavGraph(
                    aComponent = acomponent,
                )
            }
        }
    }
}
