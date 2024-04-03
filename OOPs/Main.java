package OOPs;

public class Main {
    public static void main(String[] args) {
//        SingletonClass mySingleton= SingletonClass.getInstance();
        Box box1=new Box();
        System.out.println(box1.l + " " + box1.h + " " +box1.w);
        Box box2= new Box(4.5,23,43);
        System.out.println(box2.l + " " + box2.h + " " +box2.w);
        InheritenceBox box3=new InheritenceBox();
        System.out.println(box3.l + " " + box3.h + " " +box3.w + " " + box3.weight);
        InheritenceBox box4=new InheritenceBox(34.5,65.6,44.2,45.6);
        System.out.println(box4.l + " " + box4.h + " " +box4.w + " " + box4.weight);



    }
}
