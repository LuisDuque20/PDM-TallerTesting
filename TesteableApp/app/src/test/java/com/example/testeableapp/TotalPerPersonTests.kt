package com.example.testeableapp
import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Test
import org.junit.Assert.*
/**
 * Pruebas unitarias para el cálculo de total por persona.
 * Verifica la lógica de división de la cuenta incluyendo propina.
 */
class TotalPerPersonTests {
    /**
     * Prueba que verifica el cálculo del total por persona cuando hay 0 personas.
     *
     * Escenario: Cuando el número de personas es 0
     * Resultado esperado: El total por persona debe ser 0 (para evitar división por cero)
     */
    @Test
    fun calculateTotalPerPerson_withZeroPeople_returnsZero() {
        val bill = 100.0
        val tipPercent = 20
        val roundUp = false
        val numberOfPeople = 0
        val tip = calculateTip(bill, tipPercent, roundUp)
        val totalPerPerson = if (numberOfPeople > 0) (bill + tip) / numberOfPeople else 0.0
        assertEquals(0.0, totalPerPerson, 0.01)
    }
}