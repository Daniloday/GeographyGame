package com.missclick.geographygame.di

import com.missclick.geographygame.ui.victoryScreen.VictoryScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        VictoryScreenViewModel()
    }
}