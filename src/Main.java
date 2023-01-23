import java.util.*;
public class Main {
    interface MyLambda{
        public void display(String s);
    }
    public static void main(String[] args) {

        MyLambda obj1 = (String x)->System.out.println("Hello "  + x);
        String s="Jhon";
        obj1.display(s);
        String s1 =  "Java";
        int x = 10;
        String sf1=  String.format("%-15s%05d%n",s1,x);
        System.out.println(sf1);
        int val=100;
        System.out.println(Math.sqrt(val));
    }
}