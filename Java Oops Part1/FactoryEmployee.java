//Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.



 class Factory {

    int empid;
    String empname;
    String dept;

    Factory(int a,String b,String c){

        empid=a;
        empname=b;
        dept=c;
        
    }

    public void Display(){
        System.out.println("employee name is :"+empname);
        System.out.println("employee id is :"+empid);
        System.out.println("employee department is :"+dept);
    }
    
}

 class FactoryEmployee extends Factory{
       
    int bus_no;
    String emp_boards;

    FactoryEmployee(int a,String b,String c,int bus,String board){
             super(a,b,c);
             bus_no=bus;
             emp_boards=board;
    }

    public void Display(){
        super.Display();
        System.out.println("Bus No is :"+bus_no);
        System.out.println("Emp Boards at :"+emp_boards);
    }
    

    



    
    
    public static void main(String[] args) {

        FactoryEmployee f1=new FactoryEmployee(101,"indrajeet","XYZ",111,"9am");
        f1.Display();
        
    }

}