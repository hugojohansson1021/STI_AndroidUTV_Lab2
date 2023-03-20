package com.example.lab_21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab_21.databinding.FragmentAboutBinding
import com.example.lab_21.databinding.FragmentMainBinding


class aboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Setup ViewBinding
        binding = FragmentAboutBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        // ID
        val btnMain = binding.btnMain


        // onClick
        btnMain.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_mainFragment)
        }

        return view
    }


}