public class Counter {
    int count;
    Counter(){
        count=0;
        System.out.println("This is Default Constructor");
    }

    public Counter(int count) {
        this.count = count;
    }
    
    public void Increment(){
        count++;
        System.out.println(count);
    }

    public void Decrement(){
        count--;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c=new Counter();
        Counter c1=new Counter(5);
        c.Increment();
        c.Increment();
        c.Decrement();
        c1.Increment();
    }
    
}
