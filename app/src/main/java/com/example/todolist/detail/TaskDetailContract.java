package com.example.todolist.detail;


import com.example.todolist.BasePresenter;
import com.example.todolist.BaseView;
import com.example.todolist.model.Task;

public interface TaskDetailContract {

    interface View extends BaseView {
        void showTask(Task task);

        void setDeleteButtonVisibility(boolean visible);

        void showError(String error);

        void returnResult(int resultCode, Task task);
    }

    interface Presenter extends BasePresenter<View> {
        void deleteTask();

        void saveChanges(int importance, String title);

    }
}
