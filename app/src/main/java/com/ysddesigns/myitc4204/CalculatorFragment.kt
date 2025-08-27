package com.ysddesigns.myitc4204

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorFragment : Fragment() {

    private lateinit var display: TextView
    private var currentExpression: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calculator, container, false)
        display = view.findViewById(R.id.display)

        // Collect all buttons from GridLayout
        val gridLayout = view.findViewById<ViewGroup>(R.id.gridLayout)
        for (i in 0 until gridLayout.childCount) {
            val button = gridLayout.getChildAt(i) as? MaterialButton
            button?.setOnClickListener { onButtonClick(button.text.toString()) }
        }

        return view
    }

    private fun onButtonClick(value: String) {
        when (value) {
            "=" -> calculateResult()
            else -> {
                currentExpression += value
                display.text = currentExpression
            }
        }
    }

    private fun calculateResult() {
        try {
            val expression = ExpressionBuilder(currentExpression.replace("×", "*").replace("÷", "/")).build()
            val result = expression.evaluate()
            display.text = result.toString()
            currentExpression = result.toString()
        } catch (e: Exception) {
            display.text = "Error"
            currentExpression = ""
        }
    }
}
