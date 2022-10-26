package mx.tc.j2se.tasks;
import java.util.Iterator;

import java.util.ArrayList;

public abstract class AbstractTaskList implements Iterable<Task> {
    public abstract void add(Task task);
    public abstract void display();
    public abstract int size();
    public abstract void remove(Task obj);
    public abstract Task getTask(int index);
    public abstract ArrayList incoming(int from,int to);

    public Iterator<Task> iterator()
    {
        // OverRiding Default List Iterator //
        Iterator<Task> it = new Iterator<Task>()
        {
            private int currentIndex = 0;
            @Override
            public boolean hasNext()
            {
                // OverRiding Default hasNext  Method//
                return currentIndex < size() && getTask(currentIndex) != null;
            }
            @Override
            public Task next()
            {
                // OverRiding Default next  Method//
                return getTask(currentIndex++);
            }
            @Override
            public void remove()
            {
                // OverRiding Default Remove  Method.
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}


