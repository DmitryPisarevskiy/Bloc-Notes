package com.dmitry.pisarevskiy.bloc_notes.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.dmitry.pisarevskiy.bloc_notes.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

//1. Создать структуру пакетов приложения.
//2. Реализовать классы доступа к данным.
//3. Создать разметку главного экрана.
//3.1 Вынести размеры в dimens.xml, а строки в strings.xml.
//4. Создать классы UI и убедиться, что все работает.
//5. *В классе Repository обойтись без блока init и метода getNotes().
//6.*В методе bind() класса ViewHolder попробовать использовать функцию with(note) { } из стандартной библиотеки Kotlin.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolBar)
        setSupportActionBar(toolbar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val rvNotesAdapter: RVNotesAdapter = RVNotesAdapter();
        val rvNotes: RecyclerView = findViewById(R.id.rvNotes);
        rvNotes.adapter = rvNotesAdapter;
        viewModel.viewState().observe(this, Observer<MainViewState> { t -> t?.let { rvNotesAdapter.notes = it.notes } })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }
}