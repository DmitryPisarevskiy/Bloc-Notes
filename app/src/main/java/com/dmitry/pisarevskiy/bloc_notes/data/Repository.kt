package com.dmitry.pisarevskiy.bloc_notes.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.*

object Repository {
    @RequiresApi(Build.VERSION_CODES.O)
    val notes: List<Note> = listOf(
            Note("Заметка №1", "Встать в 6 утра", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.WHITE),
            Note("Заметка №2", "Купить хлеб", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.RED),
            Note("Заметка №3", "Залезсть в инстаграмм", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.GREEN),
            Note("Заметка №4", "Сделать ничего", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.WHITE),
            Note("Заметка №5", "Ничего не сделать", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.BLUE),
            Note("Заметка №6", "Сделать не только лишь все", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.WHITE),
            Note("Заметка №7", "Не забыть все сделать", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.BLACK),
            Note("Заметка №8", "Напомнить мне сделать то, что я должен", LocalDate.parse("2020-11-23"), LocalDate.parse("2020-11-24"), Category.WHITE),
    )

}