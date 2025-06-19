package com.example.testeableapp

import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.testeableapp.utils.calculateTip

class Negativo {

    @Test
    fun testMontoNegativo() {
        val amount = -50.0
        val tipPercent = 20
        val roundUp = false
        val esperado = 0.0
        val resultado = calculateTip(amount, tipPercent, roundUp)
        println("Resultado: $resultado")
        assertEquals(esperado, resultado, 0.01)
    }
}
