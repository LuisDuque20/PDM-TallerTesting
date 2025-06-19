package com.example.testeableapp.utils

fun calculateTip(amount: Double, tipPercent: Int, roundUp: Boolean): Double {
    if (amount < 0) return 0.0

    var tip = amount * tipPercent / 100
    if (roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return tip
}
