package mx.tc.j2se.tasks;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task {
    String title;

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", repeat=" + repeat +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", current=" + current +
                '}' +
                '\n'
                ;
    }

    boolean status,repeat;

    LocalDateTime time;
    LocalDateTime start;
    LocalDateTime end;
    LocalTime interval;
    LocalDateTime current;

    //non-repetitive task constructor
    Task(String title, LocalDateTime time){
        this.title=title;
        this.time=time;
        this.repeat=false;
//        System.out.println(title);
//        System.out.println(time);
    }

    // repetitive task  constructor
    Task (String title, LocalDateTime start, LocalDateTime end, LocalTime interval){
        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval;
        this.repeat=true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isActive(){
        return status;
    }
    public void setActive(boolean active){
        this.status=active;
    }

    //returns start time if task is repetitive
    //changed a bit to get time without complications, might have to change back
    public LocalDateTime getTime() {
//        if(isRepeated()){
//            return ;
//        }
        //return current;
        return this.time;
    }

    //converts repetitive task to non-repetitive
    public void setTime(LocalDateTime time) {
        this.time = time;
        if(isRepeated()){
            repeat=false;
        }
    }

    //returns time of executions if task is non-repetitive
    public LocalDateTime getStartTime() {
        if(!isRepeated()) {
            return time ;
        }
        return start;

    }

    //returns time of executions if task is non-repetitive
    public LocalDateTime getEndTime() {
        if(!isRepeated()) {
            return time;
        }
        return end;
    }

    //why ?
    public LocalDateTime getCurrentTime(){
        return this.current;
    }
    //why??
    public LocalTime getRepeatInterval(){
        if(!isRepeated()){
            return LocalTime.of(0,0,0);
        }
        return interval;
    }

    //if task is non-repetitive, converts it into repetitive
    public void setTime(LocalDateTime start, LocalDateTime end, LocalTime interval){
        if(!isRepeated()){
            repeat=true;
        }
        this.start=start;
        this.end=end;
        this.interval=interval;
    }

    // checking task for repeatability
    public boolean isRepeated(){
        return repeat;
    }

    //returns next start time of execution after current time
    //I believe the interval should be added to start not current
    public LocalDateTime nextTimeAfter (LocalDateTime current){
        if(current.isBefore( end)) {
            status=true;
            current=current.plusHours(interval.getHour());
            current=current.plusMinutes(interval.getMinute());
            return current;
        }
        else{
            status=false;
            return LocalDateTime.of(0,0,0,0,0,0);
        }
    }


}


