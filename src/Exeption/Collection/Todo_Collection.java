package Exeption.Collection;

import java.util.ArrayList;
import java.util.List;

public class Todo_Collection {
    //    public static void main(String[] args) {
    private List<String> todoList = new ArrayList<>();

    public void addToList(String task) {
        todoList.add(task);
    }

    public void addTolistAddPosition(int position, String task) {
        todoList.add(position, task);
    }

    public void printToDoList() {
//            for (String s:todoList) {
//                System.out.println(s);
//
//            }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public void changeTask(int index, String task) {
        todoList.set(index, task);
    }

    public void removeTask(String task) {
        todoList.remove(task);
    }

    public int getPriority(String task) {
        return todoList.indexOf(task);
    }
}

