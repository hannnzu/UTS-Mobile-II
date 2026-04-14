package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Query


@Dao
interface GuessDao {

    @Query("SELECT * FROM game_ui_state")
    fun getAll(): List<GameUiState>

}