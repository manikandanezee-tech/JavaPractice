import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students>{
    int id;
    String name;
    int age;
    String dept;
   static  ArrayList<Students>list=new ArrayList<>();
public Students(int id,String name, int age, String dept){
    this.id=id;
    this.name=name;
    this.age=age;
    this.dept=dept;
    list.add(this);
}

    @Override
    public int compareTo(Students s) {
        return this.name.compareTo(s.name);
    }

    public static  void stds(){
    System.out.println(list);
}
    @Override
    public String toString() {

        return id + " " +
                name + " " +
                age + " " +
                dept;
    }
    public static void main(String[] args) {
    Students students=new Students(1,"mani",22,"msc");
    ArrayList<Students>s= new ArrayList<>(Arrays.asList(new Students(2,"hari",23,"bsc"),
            new Students(3,"sam",21,"bca")));
        Collections.sort(list);
Students.stds();

    }}
