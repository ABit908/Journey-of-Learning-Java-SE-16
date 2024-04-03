package OOPs;

public class SingletonClass {
    private static SingletonClass instance;//private static instance of the class
    private SingletonClass()// private constructor to prevent instantiation from outside the class
    {
        System.out.println("hey this is a example  of SingletonClass");
    }
    public static SingletonClass getInstance()
    {
        if(instance==null)
            instance=new SingletonClass();
        return instance;
    }
}
