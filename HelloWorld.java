import java.util.*;
public class HelloWorld{
    public static void main(String[] args){
        System.out.println(Math.sqrt(-1) == Math.sqrt(-1));
        OtherClass.hello();
    }
}

class OtherClass{
    public static void hello(){
      System.out.println("Hello World.");
    }
}
