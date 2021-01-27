package com.example.todolist;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T view);

    void onDetach();
}
