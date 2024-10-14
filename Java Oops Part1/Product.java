public class Product{

     int prod_id;
     String prod_name;
     double price;
     int quantity_on_hand=6;

     
       Product(){
            System.out.println("This is Default Constructor");
       }


       Product (int prod_id,String prod_name, double price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        System.out.println("This is Parameterized Constructor");
     }

     Product(Product p){
        this.prod_id=p.prod_id;
        this.prod_name=p.prod_name;
        this.price=p.price;
        this.quantity_on_hand=p.quantity_on_hand;
        System.out.println("This is Copy Constructor");
     }


    public void getNetPrice(){
        price*=0.12;
        price*=quantity_on_hand;
        System.out.println("The Price is :"+price);
    }

    public void purchase(int quantity){
        quantity_on_hand+=quantity;
        System.out.println("Quantity in hand is :"+quantity_on_hand);

    }

    public void sell(int qunatity){
        if(quantity_on_hand-qunatity>=0){
            quantity_on_hand-=qunatity;
            System.out.println("Quantity in hand is :"+quantity_on_hand);
        }

    }
  
      public static void main(String[] args) {

        Product p1=new Product(101,"apple",6);
        p1.purchase(5);
        p1.getNetPrice();
        p1.sell(6);
        p1.getNetPrice();
        Product p2=new Product(p1);
        p2.purchase(0);
        p2.getNetPrice();

        
      }
}