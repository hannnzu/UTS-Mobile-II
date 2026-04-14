package com.example.unscramble.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.unscramble.R

@Composable
fun HistoryScreen(
    allGuesses: List<GameUiState>,
    onNavigateBack: () -> Unit
) {
    val mediumPadding = dimensionResource(R.dimen.padding_medium)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .safeDrawingPadding()
            .padding(mediumPadding)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Riwayat Jawaban Benar",
            style = typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (allGuesses.isEmpty()) {
            Text(
                text = "Belum ada riwayat jawaban yang benar.",
                style = typography.bodyLarge
            )
        } else {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    allGuesses.forEach { guess ->
                        if (guess.correctWord.isNotEmpty()) {
                            Text(
                                text = "- ${guess.correctWord}",
                                style = typography.bodyLarge
                            )
                        }
                    }
                }
            }
        }

        Button(
            onClick = onNavigateBack,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Kembali ke Permainan")
        }
    }
}
