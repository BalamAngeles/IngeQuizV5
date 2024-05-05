package com.example.quizella.presentation.questions

data class DialogState(
    val state: Boolean = false,
    val text: String = "¿Seguro que quieres salir de la app? Tu progreso se perdera."
)