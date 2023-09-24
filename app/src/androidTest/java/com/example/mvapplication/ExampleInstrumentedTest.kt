package com.example.mvapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.mvapplication", appContext.packageName)
    }
    @Test
    fun input_text_isValid() {
        // Crie uma instância de MainActivity
        val activity = MainActivity()

        // Chame o método ErrorMessage com um texto não vazio
        val result = activity.ErrorMessage("Texto não vazio")

        // Verifique se o resultado é verdadeiro
        assertEquals(result, "Texto não vazio")
    }
}