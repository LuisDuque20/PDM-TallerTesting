package com.example.testeableapp

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testeableapp.ui.Screens.TipCalculatorScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PruebasCalculadoraPropinas {

    @get:Rule
    val regla = createComposeRule()

    @Test
    fun cambiaPropinaConRedondeo() {
        regla.setContent {
            TipCalculatorScreen()
        }

        regla.onNodeWithText("Monto de la cuenta").performTextInput("100")
        regla.onNodeWithText("Propina: $15.00").assertExists()
        regla.onNodeWithText("Redondear propina").performClick()
        regla.onNodeWithText("Propina: $16.00").assertExists()
    }

    @Test
    fun cambiaPropinaConSlider() {
        regla.setContent {
            TipCalculatorScreen()
        }

        regla.onNodeWithText("Monto de la cuenta").performTextInput("100")
        regla.onNodeWithTag("slider").performSemanticsAction(SemanticsActions.SetProgress) {
            it(50f)
        }
        regla.onNodeWithText("Porcentaje de propina: 50%").assertExists()
        regla.onNodeWithText("Propina: $50.00").assertExists()
    }

    @Test
    fun elementosVisiblesEnPantalla() {
        regla.setContent {
            TipCalculatorScreen()
        }

        regla.onNodeWithText("Monto de la cuenta").assertExists()
        regla.onNodeWithText("Porcentaje de propina: 15%").assertExists()
        regla.onNodeWithText("Número de personas: 1").assertExists()
    }
}
