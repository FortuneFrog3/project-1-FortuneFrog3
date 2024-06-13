package com.example.musictriviagame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musictriviagame.ui.theme.MusicTriviaGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicTriviaGameTheme {
                TriviaGameScreen()
            }
        }
    }
}

@Composable
fun TriviaGameScreen() {
    var score by remember { mutableStateOf(0) }
    var currentQuestionIndex by remember { mutableStateOf(0) }
    val questions = getQuestions()

    if (currentQuestionIndex >= questions.size) {
        currentQuestionIndex = 0
    }

    val question = questions[currentQuestionIndex]

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = question.textResId),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            question.choiceIds.forEach { choiceId ->
                ClickableText(
                    text = AnnotatedString(stringResource(id = choiceId)),
                    onClick = {
                        if (choiceId == question.answerId) {
                            score += 10
                        }
                        currentQuestionIndex++
                    },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            Text(
                text = stringResource(id = R.string.score_text, score),
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

fun getQuestions(): List<Question> {
    return listOf(
        Question(R.string.question_1, R.string.answer_1_1, listOf(
            R.string.answer_1_1, R.string.answer_1_2, R.string.answer_1_3, R.string.answer_1_4)),
        Question(R.string.question_2, R.string.answer_2_4, listOf(
            R.string.answer_2_1, R.string.answer_2_2, R.string.answer_2_3, R.string.answer_2_4)),
        Question(R.string.question_3, R.string.answer_3_2, listOf(
            R.string.answer_3_1, R.string.answer_3_2, R.string.answer_3_3, R.string.answer_3_4)),
        Question(R.string.question_4, R.string.answer_4_2, listOf(
            R.string.answer_4_1, R.string.answer_4_2, R.string.answer_4_3, R.string.answer_4_4)),
        Question(R.string.question_5, R.string.answer_5_3, listOf(
            R.string.answer_5_1, R.string.answer_5_2, R.string.answer_5_3, R.string.answer_5_4))
    )
}

@Preview(showBackground = true)
@Composable
fun TriviaGameScreenPreview() {
    MusicTriviaGameTheme {
        TriviaGameScreen()
    }
}