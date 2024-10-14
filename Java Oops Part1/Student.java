//Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
// —> Courses are: JAVA, PYTHON.
// —> The total fees for java is 10k and for python is 7.5k.
// —> Provide a constructor to take required details.The default course is JAVA.
// —> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).




public class Student {
    int admin_no;
    String stu_name;
    String course;
    int fees_paid;
    int tot_fee;

    Student (int a,String b,int c){
        course="java";
        admin_no=a;
        stu_name=b;
        fees_paid=c;
    }

    Student(int a,String b,String c,int d){
          admin_no=a;
          stu_name=b;
          course=c;
          fees_paid=d;
    }

    public void getTotalFee(){
        if (course.equalsIgnoreCase("java")){
            tot_fee=10000;
            System.out.println("Fees for  Java is "+tot_fee);
        }
        else if (course.equalsIgnoreCase("Python")){
            tot_fee=7500;
            System.out.println("Fees for Python is :"+tot_fee);
        }
        else{
            System.out.println("Enter Valid Course");
        }
    }

    public void getDue(){
        System.out.println("Total Due Fees is :"+(tot_fee-fees_paid));
    }

    public void getFeePaid(){
        System.out.println("Total Paid Fees is :"+(fees_paid));
    }

    public void payment(int p){
        fees_paid+=p;
        System.out.println("you Sucessfully Paid :"+p);
    }



    public static void main(String[] args) {
        Student s1=new Student(102,"indrajeet",5000);
        s1.getTotalFee();
        s1.getDue();
        s1.payment(2000);
        s1.getDue();
    }
}
