


// Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, and also use treeset for the same for circle objects and see what happens.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Circle implements Comparable<Object>{
    int x,y;

    public Circle(int x,int y){
        this.x=x;
        this.y=y;
    }

    

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + "]";
    }



    public static void main(String[] args) {
        Circle c1=new Circle(12, 2);
        Circle c2=new Circle(14, 24);
        Circle c3=new Circle(3, 22);
        Circle c4=new Circle(11, 21);
        Circle c5=new Circle(4, 5);

        Set<Circle> Hs=new HashSet<>();
        Hs.add(c1);
        Hs.add(c2);
        Hs.add(c3);
        Hs.add(c4);
        Hs.add(c5);

        Set<Circle> Ts=new TreeSet<>();
        Ts.add(c1);
        Ts.add(c2);
        Ts.add(c3);
        Ts.add(c4);
        Ts.add(c5);

        for(Circle c:Hs){
            System.out.println(c);
        }

        System.out.println("-------");

        for(Circle d:Ts){
            System.out.println(d);
        }


        System.out.println("HashSet is :"+Hs);
        
        System.out.println("TreeSet is :"+Ts);

    }
}
