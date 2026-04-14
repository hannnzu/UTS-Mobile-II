package com.example.unscramble.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unscramble.ui.GameUiState

@Database(entities = [GameUiState::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun guessDao(): GuessDao

}