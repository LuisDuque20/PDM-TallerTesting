package com.example.testeableapp

import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.testeableapp.utils.calculateTip

class CalculoPPersona {

    @Test
    fun testTotalPorPersona() {
        val amount = 120.0
        val tipPercent = 10
        val roundUp = false
        val numberOfPeople = 4
        val tip = calculateTip(amount, tipPercent, roundUp)
        val esperado = (amount + tip) / numberOfPeople
        val totalPorPersona = if (numberOfPeople > 0) (amount + tip) / numberOfPeople else 0.0
        println("Total por persona: $totalPorPersona")
        assertEquals(esperado, totalPorPersona, 0.01)
    }
}
