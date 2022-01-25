package com.example.sumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.sumcalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var lastNumeric: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button0.setOnClickListener {
                onDigit(it)
            }
            button1.setOnClickListener {
                onDigit(it)
            }
            button2.setOnClickListener {
                onDigit(it)
            }
            button3.setOnClickListener {
                onDigit(it)
            }
            button4.setOnClickListener {
                onDigit(it)
            }
            button5.setOnClickListener {
                onDigit(it)
            }
            button6.setOnClickListener {
                onDigit(it)
            }
            button7.setOnClickListener {
                onDigit(it)
            }
            button8.setOnClickListener {
                onDigit(it)
            }
            button9.setOnClickListener {
                onDigit(it)
            }
            buttonTopla.setOnClickListener {
                onOperator(it)
            }
            buttonEsittir.setOnClickListener {
                onEqual()
            }

            buttonTemizle.setOnClickListener {
                onClear()
            }

        }
    }

    private fun onDigit(view: View) {
        binding.textViewHesaplama.append((view as Button).text)
        lastNumeric = true
    }

    private fun onOperator(view: View) {
        binding.textViewHesaplama.append((view as Button).text)
        lastNumeric = false
    }

    private fun onClear() {
        binding.textViewHesaplama.text = ""
        binding.textViewSonuc.text = ""
        lastNumeric = false
    }

    private fun onEqual() {
        val textViewHesaplama = binding.textViewHesaplama.text.toString()
        val expression = ExpressionBuilder(textViewHesaplama).build()
        try {
            val result = expression.evaluate()
            binding.textViewSonuc.text = "= ${result}"
        } catch (ex: ArithmeticException) {
            binding.textViewSonuc.text = "Error"
            lastNumeric = false
        }
    }
}