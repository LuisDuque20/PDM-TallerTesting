package com.example.testeableapp
import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Test
import org.junit.Assert.*
/**
 * Pruebas unitarias para el cálculo de propinas individuales.
 * Verifica la lógica de cálculo de porcentajes de propina.
 */
class TipCalculationTests {
    /**
     * Prueba que verifica que el cálculo de propina con 0% retorne 0.
     *
     * Escenario: Cuando el porcentaje de propina es 0%
     * Resultado esperado: La propina calculada debe ser 0
     */
    @Test
    fun calculateTip_withZeroPercent_returnsZero() {
        val amount = 100.0
        val tipPercent = 0
        val roundUp = false
        val result = calculateTip(amount, tipPercent, roundUp)
        assertEquals(0.0, result, 0.01)
    }
}