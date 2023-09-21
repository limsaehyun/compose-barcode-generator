package com.saehyun.compose.barcode

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.unit.DpSize
import com.saehyun.compose.barcode.internal.BarcodeGenerator

@Composable
fun ComposeBarcode(
    modifier: Modifier = Modifier,
    pinNumber: Int,
    type: ComposeBarcodeType,
) {
    val barcodePainter = rememberBarcodePainter(pinNumber = pinNumber, type = type)

    Image(
        modifier = modifier,
        painter = barcodePainter,
        contentDescription = "$pinNumber ${type.format.name}",
    )
}

@Composable
fun rememberBarcodePainter(
    pinNumber: Int,
    type: ComposeBarcodeType,
): BitmapPainter {
    val barcodeBitmap: Bitmap = BarcodeGenerator.getCouponBarcodeBitmap(
        type = type,
        pinNumber = pinNumber,
    )

    return remember(key1 = barcodeBitmap) {
        BitmapPainter(
            image = barcodeBitmap.asImageBitmap(),
        )
    }
}
