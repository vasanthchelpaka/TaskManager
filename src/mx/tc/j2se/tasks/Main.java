package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;
import java.lang.Iterable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.*;


import static mx.tc.j2se.tasks.ListTypes.types.ARRAY;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("task1", LocalDateTime.of(2020, Month.valueOf("AUGUST"),20,8,0,0),LocalDateTime.of(2020, Month.valueOf("DECEMBER"),20,8,0,0), LocalTime.of(22,45,5));
        Task task2 = new Task("task2",LocalDateTime.of(2021, Month.valueOf("AUGUST"),20,8,0,0));
        Task task3 = new Task("task3",LocalDateTime.of(2022, Month.valueOf("AUGUST"),20,8,0,0));
        Task task4 = new Task("task4",LocalDateTime.of(2023, Month.valueOf("AUGUST"),20,8,0,0));
        Task task5 = new Task("task5",LocalDateTime.of(2024, Month.valueOf("AUGUST"),20,8,0,0));
    //    System.out.println(task1.getEndTime());
    //    System.out.println(task1.nextTimeAfter(LocalDateTime.of(2020,Month.valueOf("NOVEMBER"),3,5,3,33)));


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
//        AbstractTaskList.Iterator temp =Listt.iterator();  //getting Custom iterator from List.
//        while (temp.hasNext())
//        {   //custom hasNext() Method
//            String value = temp.next().toString();   // Custom Method Return The Current Index
//            System.out.print(value + ", ");
//        }


    /*// starts here
        AbstractTaskList abobject2 = new ArrayTaskList();
        abobject2.add(task4);
        abobject2.add(task3);
        abobject2.add(task2);
        abobject2.add(task5);
        Iterator<mx.tc.j2se.tasks.Task> itr = abobject2.iterator();
        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        System.out.print("\nUSING ITERATORS TO DISPLAY THE ARRAYLIST ELEMENTS ");
        while (itr.hasNext()) {
            //  Moving cursor to next element

            Task i = itr.next();
//            System.out.println("in list");
            // Getting elements one by one
            System.out.print(i.getTitle() + " ");
            // Removing odd elements
        }
        System.out.print("\nDISPLAY THE ARRAYLIST ELEMENTS ");
        abobject2.display();*/






   /*     //EQUALS
        AbstractTaskList obj2 = new ArrayTaskList();
        obj2.add(task1);
        obj2.add(task2);
        obj2.add(task3);
        obj2.add(task4);

        AbstractTaskList obj1 = new ArrayTaskList();
        obj1.add(task1);
        obj1.add(task2);
        obj1.add(task3);
        obj1.add(task1);

        boolean tf= AbstractTaskList.equals(obj1,obj2);
        System.out.println((tf));*/


   /*     // hashcode
        AbstractTaskList obj2 = new ArrayTaskList();
        obj2.add(task1);
        obj2.add(task2);
        obj2.add(task3);
        obj2.add(task4);

        AbstractTaskList obj1 = new ArrayTaskList();
        obj1.add(task1);
        obj1.add(task2);
        obj1.add(task3);
        obj1.add(task1);

        boolean hc = AbstractTaskList.hashcode(obj1,obj2);
        System.out.println(hc);*/


/*

// incoming using iterator
        // make it compatible with linked list also

        AbstractTaskList abobject2 = new ArrayTaskList();
        abobject2.add(task1);
        abobject2.add(task2);
        abobject2.add(task3);
        abobject2.add(task4);
       // abobject2.display();
//System.out.println(abobject2.size());
        Iterator<Task> iter = abobject2.iterator();
    //    System.out.println("2");
        Iterator<Task> b = Tasks.incoming(iter,LocalDateTime.of(2021,Month.valueOf("JANUARY"),3,5,3,33),LocalDateTime.of(2024,Month.valueOf("DECEMBER"),13,3,33,4));
        //System.out.println("bye");
        while (b.hasNext()) {
            Task i = b.next();
            //System.out.println("hi");
            System.out.print(i);
        }
*/




        // streams old. won't work
     /*   AbstractTaskList abobject2 = new ArrayTaskList();
        abobject2.add(task1);
        abobject2.add(task2);
        abobject2.add(task3);
        abobject2.add(task4);

        //System.out.println(abobject2.getStream().findFirst().get().getTask(0).getTitle());
        //AbstractTaskList ab=abobject2.getStream();
        abobject2.getStream().forEach(n-> System.out.println(n));*/


      /*  AbstractTaskList abobject2 = new ArrayTaskList();
        abobject2.add(task1);
        abobject2.add(task2);
        abobject2.add(task3);
        abobject2.add(task4);

        abobject2.getStream();
       // System.out.println(abobject2.getStream().findFirst().get().getStartTime());
        Stream<Task> t=abobject2.getStream();
                t.forEach(System.out::println);*/


        // streams linked list
   /*     LinkedTaskList abobject3 = new LinkedTaskList();
        abobject3.add(task1);
        abobject3.add(task2);
        abobject3.add(task3);
        abobject3.add(task4);
        //abobject3.display();
//        List<AbstractTaskList> aList = new ArrayList<AbstractTaskList>(abobject3);
//        abobject3.getStream();
        //LinkedTaskList l=new LinkedTaskList();
        Stream<Task> a= abobject3.getStream();
        System.out.println("Linked list stream Obj data:");
        System.out.println('\n');
        a.forEach(System.out::println); */




    }
}
