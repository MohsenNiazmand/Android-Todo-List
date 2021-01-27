package com.example.todolist.main;




import com.example.todolist.BasePresenter;
import com.example.todolist.BaseView;
import com.example.todolist.model.Task;

import java.util.List;

public interface MainContract {

    interface View extends BaseView {
        void showTasks(List<Task> tasks);

        void clearTasks();

        void updateTask(Task task);

        void addTask(Task task);

        void deleteTask(Task task);

        void setEmptyStateVisibility(boolean visible);

    }

    interface Presenter extends BasePresenter<View> {
        void onDeleteAllBtnClick();

        void onSearch(String q);

        void onTaskItemClick(Task task);

    }
}
