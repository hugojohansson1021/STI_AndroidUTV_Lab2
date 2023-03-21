package com.example.lab_21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.lab_21.databinding.FragmentNewsletterBinding
import com.google.android.material.snackbar.Snackbar


class newsletterFragment : Fragment() {

    private val viewModel: MailViewModel by viewModels()
    private lateinit var binding: FragmentNewsletterBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val viewModel = ViewModelProvider(this).get(MailViewModel::class.java)
        //binding.textViewTv.setText(viewModel.getArray().joinToString())
        ///// Lite kod här och vi har viewmodel här /////

        // Setup ViewBinding
        binding = FragmentNewsletterBinding.inflate(layoutInflater, container, false)
        val view = binding.root



        // ID
        val mainButtonInNews = binding.btnMainTre

        val textViewTv = binding.newsLetterTv
        val submitButtonInNews = binding.btnsubmitNewsletter

        submitButtonInNews.setOnClickListener(){
            // Get user input and add it to the array
            val userInput = binding.editTextTextEmail.text.toString()
            val words = userInput.split(" ")
            for (word in words){
                viewModel.addItemToArray(word)
            }


            // Show the contents of the array in the TextView
            textViewTv.text = viewModel.getArray().joinToString()

            // Show a Snackbar with an "undo" action
            val snackbar = Snackbar.make(binding.root, "Your Email is now added..!", Snackbar.LENGTH_LONG)
            snackbar.setAction("Undo") {
                viewModel.clearArray()
                textViewTv.text = ""
            }
            snackbar.show()
        }

        // onClick go back btn
        mainButtonInNews.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_newsletterFragment_to_mainFragment)
        }

        return view
    }


}