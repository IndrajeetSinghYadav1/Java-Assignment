// Create classes to store details for two different types of Products,
// a) ImportedProducts which have import duty.
// b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting.




 class Products{
    String name;
    int base_price;
    

    public Products(String name,int bp) {
        this.name=name;
        base_price=bp;
    }

    public void setPrice(int n){
        base_price=n;
    }
    
    void print(){
        System.out.println("Name is :"+name);
        System.out.println("Price is :"+base_price);
    }
    

 }

 class ImportedProducts extends Products{
    
    int importduty;
    int np;

    public ImportedProducts(String name,int bp){
        super(name, bp);
    }

    void setImportDuty(int id){
        importduty=id;
    }
    
    void getNetPrice(){
        np=base_price+(base_price*importduty)/100;
        System.out.println("Net Price:"+np);
    }
   
    
 }
 class DiscountedProducts extends Products{

    int discountrate;
    int dnp;

    public DiscountedProducts(String name,int bp){
        super(name, bp);
    }

    void setDiscountRate(int dr){
        discountrate=dr;
    }

    void getNetPrice(){
        dnp=base_price-(base_price*discountrate)/100;
        System.out.println("Net Price:"+dnp);
    }
    
 }

 class DiscountProd{

    public static void main(String[] args) {
        Products p1=new ImportedProducts("Gowtham", 76);
        p1.setPrice(23);
       
        System.out.println("-----------------");
        ImportedProducts ip=(ImportedProducts)p1;
        ip.setPrice(65);
        ip.setImportDuty(12);
        ip.getNetPrice();
        ip.print();

        System.out.println("-----------");
        Products p2=new DiscountedProducts("apple", 100);
        p2.print();
        
        System.out.println("----------");
        DiscountedProducts d=(DiscountedProducts)p2;
        d.setDiscountRate(10);
        d.getNetPrice();
        d.print();

    }
 }