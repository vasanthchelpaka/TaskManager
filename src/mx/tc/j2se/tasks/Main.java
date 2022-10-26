package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;
import java.lang.Iterable;

import java.util.ArrayList;


import static mx.tc.j2se.tasks.ListTypes.types.ARRAY;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("a",1);
        Task task2 = new Task("b",20);
        Task task3 = new Task("c",3);
        Task task4 = new Task("chelpaka",33,111,5);
        Task task5 = new Task("running",504,90,1);


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

//        //Incoming method of LinkedList
//        //adding tasks
//        LinkedTaskList ll=new LinkedTaskList();
//        ll.add(task1);
//        ll.add(task2);
//        ll.add(task3);
//        ll.add(task4);
//        ll.add(task5);
//
//        // Giving from and to and storing the return in arraylist,
//        // iterate it for displaying
//        ArrayList<Task> t= ll.incoming(0,300);
//        System.out.println(t.size());
//        for (int i=0;i<t.size();i++){
//            System.out.println(t.get(i));
//        }


          //ABSTRACT FACTORY
        //'AbstractTaskList ab/bc' has the instance of the arrayList/LinkedList in it,
        // so it is possible to call the methods in their classes.


//        TaskListFactory tf =new TaskListFactory();
//        AbstractTaskList ab = tf.createTaskList(ListTypes.types.ARRAY);
//        ab.add(task3);
//        ab.display();
//        AbstractTaskList bc = tf.createTaskList(ListTypes.types.LINKED);
//        bc.add(task4);
//        bc.display();

       // CustomList<Task> Listt = new CustomList<Task>(data);
        // creating a CustomList Object Which OverRides.
        //The Iterator and Use The Custom Iterator Which is Defined in The Code.
        AbstractTaskList.Iterator temp =Listt.iterator();  //getting Custom iterator from List.
        while (temp.hasNext())
        {   //custom hasNext() Method
            String value = temp.next().toString();   // Custom Method Return The Current Index
            System.out.print(value + ", ");
        }
    }
}
