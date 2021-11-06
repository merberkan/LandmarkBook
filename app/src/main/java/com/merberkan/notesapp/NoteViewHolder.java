package com.merberkan.notesapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.merberkan.notesapp.R;

import java.text.BreakIterator;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView noteTitle, noteContent;
    View view;
    CardView myCardView;
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);

        noteTitle = itemView.findViewById(R.id.titles);
        noteContent = itemView.findViewById(R.id.content);
        // I created view to handle click to this view in next steps
        myCardView = itemView.findViewById(R.id.noteCard);
        view = itemView;
    }
}
