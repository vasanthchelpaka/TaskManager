package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class AbstractTaskList implements Iterable<Task> {

    private mx.tc.j2se.tasks.Task Task;

    public abstract void add(Task task);

    public abstract void display();

    public abstract int size();

    public abstract void remove(Task obj);

    public abstract Task getTask(int index);

    public abstract ArrayList incoming(LocalDateTime from, LocalDateTime to);


    public Iterator<Task> iterator() {
        Iterator<Task> iter = new Iterator<Task>() {
            private int currentIndex = 0;
//            System.out.print("in iterator");

            @Override
            public boolean hasNext() {

                return currentIndex < size();
            }

            @Override
            public mx.tc.j2se.tasks.Task next() {
                if (hasNext()) return getTask(currentIndex++);
                else
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return iter;
    }

    public static boolean equals(AbstractTaskList obj1, AbstractTaskList obj2) {
        int i = 0;

        if (obj1.size() != obj2.size()) {

            return false;
        } else {
            Task t2;
            for (Task t1 : obj1) {

                t2 = obj2.getTask(i);

                if (t1.getTitle() == t2.getTitle()) {
                    i++;
                } else {

                    return false;
                }
            }
        }

        return true;
    }

    public static boolean hashcode(AbstractTaskList task1, AbstractTaskList task2) {
//        if(task1.toString().equals(task2.toString())) {
//            System.out.println("hashcode of t1:" + task1.hashCode() );
//            System.out.println("hashcode of t2:" + task2.hashCode() + " ");
//        }
//        System.out.println("hash codes of equal tasks");
        Integer s1 = task1.hashCode();
        Integer s2 = task2.hashCode();

        if (s1 == s2) {
            return true;
        } else {
            return false;
        }
    }


public Stream<AbstractTaskList> getStream(){
    List<AbstractTaskList> number = Arrays.asList(this);
    return number.stream();

    }

}

