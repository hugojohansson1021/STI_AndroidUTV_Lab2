package com.example.lab_21

import androidx.lifecycle.ViewModel

class MailViewModel : ViewModel() {

    private val array = mutableListOf<String>()

    fun addItemToArray(item: String) {
        array.add(item)
    }

    fun clearArray() {
        array.clear()
    }

    fun getArray(): MutableList<String> {
        return array
    }
}