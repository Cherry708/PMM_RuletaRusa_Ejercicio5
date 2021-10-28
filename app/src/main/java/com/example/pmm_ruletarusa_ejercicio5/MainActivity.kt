package com.example.pmm_ruletarusa_ejercicio5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_ruletarusa_ejercicio5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rango = (1..6)
        var recamara = rango.random()

        binding.btn1.setOnClickListener {
            val boton = binding.btn1.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn1.isEnabled = false
        }

        binding.btn2.setOnClickListener {
            val boton = binding.btn2.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn2.isEnabled = false

        }
        binding.btn3.setOnClickListener {
            val boton = binding.btn3.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn3.isEnabled = false
        }
        binding.btn4.setOnClickListener {
            val boton = binding.btn4.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn4.isEnabled = false
        }
        binding.btn5.setOnClickListener {
            val boton = binding.btn5.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn5.isEnabled = false
        }
        binding.btn6.setOnClickListener {
            val boton = binding.btn6.text.toString().toInt()
            if (boton == recamara){
                binding.root.setBackgroundColor(resources.getColor(R.color.red))
                binding.tvBang.text = getString(R.string.bang)
            }
            binding.btn6.isEnabled = false
        }

        binding.btnReload.setOnClickListener {
            recamara = rango.random()
            binding.root.setBackgroundColor(resources.getColor(R.color.white))
            binding.tvBang.text = ""
            binding.btn1.isEnabled = true
            binding.btn2.isEnabled = true
            binding.btn3.isEnabled = true
            binding.btn4.isEnabled = true
            binding.btn5.isEnabled = true
            binding.btn6.isEnabled = true
        }
    }
}