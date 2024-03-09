package com.teams.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teams.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private var  value1 : Int ?= null
    private var  value2 : Int ?= null
    private var  value3 : Int ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
         setOnclick()
    }
    private fun setOnclick(){
        binding.imageview1.setOnClickListener {
            start()
        }
    }
    private fun start(){
        value1=binding.value1.text.toString().toInt()
//        value2=binding.value2.text.toString().toInt()


//        value3 = value1!!+ value2!!


        if (value1!! >=18){
            letsDo1()
        }
        else
        {
            letsDo2()
        }

    }

    private fun letsDo1()
    {
        binding.answer.text=value1.toString()
        binding.answer2.text="you are eligble to vote"
    }
    private fun letsDo2()
    {
        binding.answer.text=value1.toString()
        binding.answer2.text="you are not eligble to vote"
    }

    private fun test1(){

    }

    private fun test2(){

    }



}