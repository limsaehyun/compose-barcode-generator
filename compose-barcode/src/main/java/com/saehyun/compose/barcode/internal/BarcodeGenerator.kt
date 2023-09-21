package com.saehyun.compose.barcode.internal

import android.graphics.Bitmap
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.saehyun.compose.barcode.ComposeBarcodeType

internal object BarcodeGenerator {
    fun getCouponBarcodeBitmap(type: ComposeBarcodeType, pinNumber: Int): Bitmap {
        val multiFormatWriter = MultiFormatWriter()

        try {
            val bitMatrix: BitMatrix = multiFormatWriter.encode(
                pinNumber.toString(),
                type.format,
                type.defaultSize.x,
                type.defaultSize.y,
            )
            return BarcodeEncoder.createBitmap(bitMatrix)
        } catch (e: WriterException) {
            throw e
        }
    }
}
