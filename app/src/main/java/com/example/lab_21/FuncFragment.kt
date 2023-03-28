package com.example.lab_21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.lab_21.databinding.FragmentAboutBinding
import com.example.lab_21.databinding.FragmentFuncBinding
import com.example.lab_21.databinding.FragmentNewsletterBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random


class FuncFragment : Fragment() {

    private lateinit var binding: FragmentFuncBinding
    private lateinit var viewModel: FuncViewModel



    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        // Setup ViewBinding
        binding = FragmentFuncBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        //viewModel = ViewModelProviders.of(this).get(FuncViewModel::class.java)
        //viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[FuncViewModel::class.java]
        //viewModel = ViewModelProvider(this)[FuncViewModel().javaClass]
        val viewModel = ViewModelProvider(this).get(FuncViewModel::class.java)
        binding.hotdTvTxt.setText(viewModel.currentString)// Ljuger inte om denna kod tog mig 3 dagar att fatta och lösa


        // ID
        val mainButtonInFunc = binding.btnMainTo
        val hotdButtonClick = binding.btnClick
        val tvTextForHotd = binding.hotdTvTxt

        // onClick
        mainButtonInFunc.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_funcFragment_to_mainFragment)
        }

        hotdButtonClick.setOnClickListener(){
            viewModel.generateRandomString()
            val currentString = viewModel.currentString
            tvTextForHotd.text = currentString
        }

        return binding.root // or View
    }


}

