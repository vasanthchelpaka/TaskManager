package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("a",1);
        Task task2 = new Task("b",20);
        Task task3 = new Task("c",3);


        ArrayTaskList task = new ArrayTaskList();
        //Add elements in custom ArrayList
        task.add(task1);
        task.add(task2);
        task.add(task3);

        //task.display();
       //System.out.println( task.remove(task1));

//        task.display();
//        System.out.println();
//        System.out.println(task.size());
//        System.out.println(task.getTask(3));
        System.out.println("@@1");
      ArrayList<Task> t= task.incoming(0,5);
        System.out.println(t.size());
        for (int i=0;i<t.size();i++){
            System.out.println(t.get(i));
        }

//      for(Task t1 : t){
//          System.out.println("@@");
//          System.out.println(t1);
//      }



    }
}
