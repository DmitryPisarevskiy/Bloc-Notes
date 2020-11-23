package com.dmitry.pisarevskiy.bloc_notes.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dmitry.pisarevskiy.bloc_notes.R
import com.dmitry.pisarevskiy.bloc_notes.data.Note

class RVNotesAdapter : RecyclerView.Adapter<NoteViewHolder>() {
    var notes: List<Note> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(view)
    }

    override fun getItemCount() = notes.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }
}

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title = itemView.findViewById<TextView>(R.id.tvTitle)
    private val text = itemView.findViewById<TextView>(R.id.tvText)

    fun bind(note: Note) {
        title.text = note.title
        text.text = note.text
        itemView.setBackgroundColor(note.category.color)
    }

}
