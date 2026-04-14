package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Query
import com.example.unscramble.ui.GameUiState

@Dao
interface GuessDao {

    @Query("SELECT * FROM game_ui_state")
    fun getAll(): List<GameUiState>

}