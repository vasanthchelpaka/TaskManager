package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.Iterator;

public class Tasks {

    public  static Iterator<Task> incoming(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end){
    /*    int j = 0;
        for ( ; tasks.hasNext() ; ++j ) tasks.next();
        final int i=j;

        Iterator<Task> iter = new Iterator<Task>() {
           public int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }
            @Override
            public Task next() {
                if (hasNext()) return getTask(currentIndex++);
                else
                    throw new UnsupportedOperationException("Not supported yet.");
            }
        };
*/
        AbstractTaskList a=new ArrayTaskList();


        Iterator<Task> iter=a.iterator();

       // System.out.println("3");
        while(tasks.hasNext())
        {
            //System.out.println("4");
          //  Task i=(tasks.next());
            Task as=tasks.next();
            System.out.println(as.getStartTime());
            if((as.getStartTime().isAfter(start)   && as.getStartTime().isBefore(end) ))
            {
                a.add(as);
                //System.out.println("5");
            }
           // System.out.println("1");
        }
        return a.iterator();
    }
}

//)