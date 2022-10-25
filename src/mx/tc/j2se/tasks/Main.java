package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;

import java.util.ArrayList;


import static mx.tc.j2se.tasks.ListTypes.types.ARRAY;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("a",1);
        Task task2 = new Task("b",20);
        Task task3 = new Task("c",3);
        Task task5 = new Task("chelpaka",33,111,5);
        Task task6 = new Task("running",54,90,1);


     /*    code for ArrayTaskList

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
 String title,boolean status,boolean repeat,int time,int start,int end, int interval,int current
 String title, int start, int end, int interval

      */


       /* LinkedTaskList ll = new LinkedTaskList();
        Task task4 = new Task("vasanth",22,33,4);



        ll.add(task4);
        ll.add(task5);
        ll.add(task6);
//        ll.display();
//        ll.deleteNode("chelpaka");
//        ll.display();
       System.out.println( ll.getTask(1).getTitle());

        */



        TaskListFactory tf =new TaskListFactory();
        AbstractTaskList ab = tf.createTaskList(ListTypes.types.ARRAY);
        ab.add(task3);
        //ab.display();

        LinkedTaskList ll=new LinkedTaskList();

        ll.add(task1);

        ArrayList<Task> t= ll.incoming(0,300);
        System.out.println(t.size());
        for (int i=0;i<t.size();i++){
            System.out.println(t.get(i));
        }








    }
}
