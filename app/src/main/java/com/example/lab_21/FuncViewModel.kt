package com.example.lab_21

import androidx.lifecycle.ViewModel

class FuncViewModel : ViewModel() {

    // Array list of House of the dragon houses
    private val stringArray = arrayOf("House Targaryen", "House Hightower", "House Velaryon", "House Strong", "House Baratheon",
        "House Lannister","House Cole", "House Amber", "House Clegane", "House Frey", "House Greyjoy", "House Karlstark","House Stark",
        "House Tully", )

    var currentString = ""

    // Gör funcen

    fun generateRandomString(){
        val randomIndex = (0 until stringArray.size).random() // Generate random index
        currentString = stringArray[randomIndex]
    }
}