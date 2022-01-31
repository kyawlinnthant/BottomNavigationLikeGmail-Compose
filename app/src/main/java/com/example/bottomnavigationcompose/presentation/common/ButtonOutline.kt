package com.example.bottomnavigationcompose.presentation.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CommonOutlinedButton(
    modifier: Modifier = Modifier,
    text: String = "This is common outlined button",
    clickCallBack: (() -> Unit)? = null
) {
    OutlinedButton(
        modifier = modifier.fillMaxWidth(),
        onClick = clickCallBack!!
    ) {
        Text(text = text)
    }
}


@Preview(showBackground = true)
@Composable
fun CommonOutlineButtonPreview() {
    Surface {
        CommonOutlinedButton()
    }
}

