package com.saehyun.compose.barcode

import android.graphics.Point
import com.google.zxing.BarcodeFormat


enum class ComposeBarcodeType(val defaultSize: Point, val format: BarcodeFormat) {
    AZTEC(defaultSize = Point(128, 128), format = BarcodeFormat.AZTEC),
    CODABAR(defaultSize = Point(200, 200), format = BarcodeFormat.CODABAR),
    CODE_39(defaultSize = Point(200, 100), format = BarcodeFormat.CODE_39),
    CODE_93(defaultSize = Point(200, 100), format = BarcodeFormat.CODE_93),
    CODE_128(defaultSize = Point(200, 100), format = BarcodeFormat.CODE_128),
    DATA_MATRIX(defaultSize = Point(32, 32), format = BarcodeFormat.DATA_MATRIX),
    EAN_8(defaultSize = Point(200, 100), format = BarcodeFormat.EAN_8),
    EAN_13(defaultSize = Point(200, 100), format = BarcodeFormat.EAN_13),
    ITF(defaultSize = Point(200, 100), format = BarcodeFormat.ITF),
    MAXICODE(defaultSize = Point(32, 32), format = BarcodeFormat.MAXICODE),
    PDF_417(defaultSize = Point(400, 150), format = BarcodeFormat.PDF_417),
    QR_CODE(defaultSize = Point(128, 128), format = BarcodeFormat.QR_CODE),
    RSS_14(defaultSize = Point(200, 100), format = BarcodeFormat.RSS_14),
    RSS_EXPANDED(defaultSize = Point(200, 150), format = BarcodeFormat.RSS_EXPANDED),
    UPC_A(defaultSize = Point(200, 100), format = BarcodeFormat.UPC_A),
    UPC_E(defaultSize = Point(200, 100), format = BarcodeFormat.UPC_E),
    UPC_EAN_EXTENSION(defaultSize = Point(50, 50), format = BarcodeFormat.UPC_EAN_EXTENSION)
}