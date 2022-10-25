package mx.tc.j2se.tasks;

import java.util.ArrayList;

public abstract class AbstractTaskList {
    public abstract void add(Task task);
    public abstract void display();
    public abstract void remove(Task obj);
    public abstract Task getTask(int index);
    public abstract ArrayList incoming(int from,int to);

}
