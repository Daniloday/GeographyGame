package com.missclick.geographygame.ui.victoryScreen

import androidx.lifecycle.ViewModel

class VictoryScreenViewModel : ViewModel() {

    fun getScore():Int{
        return (300..400).random()
    }

}