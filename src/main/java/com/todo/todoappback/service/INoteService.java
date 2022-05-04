package com.todo.todoappback.service;

import com.todo.todoappback.entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
