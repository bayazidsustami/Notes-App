package com.example.notesapp.activity.editor;

public interface EditorView {
    void showPorgres();
    void hideProgres();
    void onRequestSuccess(String message);
    void onRequestError(String message);
}
