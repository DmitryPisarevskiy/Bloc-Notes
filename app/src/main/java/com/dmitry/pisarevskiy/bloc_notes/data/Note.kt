package com.dmitry.pisarevskiy.bloc_notes.data

import java.time.LocalDate

class Note(
        val title: String,
        val text: String,
        val creationDate: LocalDate,
        val toDoDate: LocalDate,
        val category: Category,
)