package com.catalin.comicslibrary.viewpractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ScreenComposeRenderer {

    @Composable
    @Preview(showBackground = true)
    fun render() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp,40.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFFFEA300), Color(0xFFFFE6A5)),
                        )
                    )
            )
        }
    }
}