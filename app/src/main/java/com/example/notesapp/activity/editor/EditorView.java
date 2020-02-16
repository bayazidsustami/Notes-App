package com.example.notesapp.activity.editor;

public interface EditorView {
    void showPorgres();
    void hideProgres();
    void onAddSuccess(String message);
    void onAddError(String message);
}
