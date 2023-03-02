package Tugas1;

public class UJiBank implements Bank{
    public void menabung(){
        System.out.println("menabung");
    }
    public void Transfer(){
        System.out.println("Transfer");
    }
    public void Menarik(){
        System.out.println("Menarik");
    }
    public static void main(String[] args) {
    UJiBank obj = new UJiBank();
    obj.menabung();
    obj.Transfer();
    obj.Menarik();
    }
}
