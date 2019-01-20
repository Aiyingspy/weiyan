package com.example.weiyanapp.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.weiyanapp.R;
import com.example.weiyanapp.adapter.template.ModelAdapter;
import com.example.weiyanapp.model.Note;
import com.example.weiyanapp.widget.NoteViewHolder;

import java.util.ArrayList;


public class NoteAdapter extends ModelAdapter<Note, NoteViewHolder> {
	public NoteAdapter(ArrayList<Note> items, ArrayList<Note> selected, ClickListener<Note> listener) {
		super(items, selected, listener);
	}

	@Override
	public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new NoteViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false));
	}
}