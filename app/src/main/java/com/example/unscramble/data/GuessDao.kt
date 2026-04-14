package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unscramble.ui.GameUiState
import kotlinx.coroutines.flow.Flow

@Dao
interface GuessDao {

    @Query("SELECT * FROM game_ui_state")
    fun getAll(): Flow<List<GameUiState>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(gameState: GameUiState)

}