package com.example.testeableapp

import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.testeableapp.utils.calculateTip

class Propina15R {

    @Test
    fun testPropina15ConRedondeo() {
        val amount = 85.0
        val tipPercent = 15
        val roundUp = true
        val esperado = 13.0
        val resultado = calculateTip(amount, tipPercent, roundUp)
        println("Resultado: $resultado")
        assertEquals(esperado, resultado, 0.01)
    }
}
