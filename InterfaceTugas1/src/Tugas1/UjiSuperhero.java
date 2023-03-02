package Tugas1;

public class UjiSuperhero implements Superhero{
    public void superman(){
         System.out.println("superman");
     }
    public void spiderman(){
        System.out.println("spiderman");
    }
    public void Thor(){
        System.out.println("Thor");
    }
    public static void main(String[] args) {
        UjiSuperhero obj = new UjiSuperhero();
        obj.superman();
        obj.spiderman();
        obj.Thor();
    }
}
