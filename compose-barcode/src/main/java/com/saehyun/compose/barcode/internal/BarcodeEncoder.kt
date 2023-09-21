package com.saehyun.compose.barcode.internal

import android.graphics.Bitmap
import android.graphics.Color
import com.google.zxing.common.BitMatrix

internal object BarcodeEncoder {
    private const val TRANSPARENT = Color.TRANSPARENT
    private const val BLACK = 0xFF000000.toInt()

    fun createBitmap(matrix: BitMatrix): Bitmap {
        val width = matrix.width
        val height = matrix.height
        val pixels = IntArray(width * height)
        for (y in 0 until height) {
            val offset = y * width
            for (x in 0 until width) {
                pixels[offset + x] = if (matrix[x, y]) BLACK else TRANSPARENT
            }
        }

        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height)
        return bitmap
    }
}