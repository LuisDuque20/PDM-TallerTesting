package com.example.testeableapp

import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.testeableapp.utils.calculateTip

class Propina20 {

    @Test
    fun testPropina20() {
        val amount = 100.0
        val tipPercent = 20
        val roundUp = false
        val esperado = 20.0
        val resultado = calculateTip(amount, tipPercent, roundUp)
        println("Resultado: $resultado")
        assertEquals(esperado, resultado, 0.01)
    }
}
