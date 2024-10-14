

import  java.util.*;

 class Product{
    
    int price;
    String name;

    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + " name=" + name + "]";
    }





}




 class CollectionSort {


    public static void main(String[] args) {
        Product c2=new Product("banana", 80);
        Product c3=new Product("kiwi", 240);
        Product c1=new Product("apple", 100);
        Product c4=new Product("orange",42);
        Product c5=new Product("guava", 64);

        List <Product> l1=new ArrayList<>();

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        l1.add(c5);

       // System.out.println(l1);


           Collections.sort(l1, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.price-o2.price;
            }
            
           });

           System.out.println("Sort By price...");

           for (Product p1:l1){
            System.out.println(p1);     
           }


           Collections.sort(l1, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                // TODO Auto-generated method stub
                return o1.name.compareTo(o2.name);
            }
            
           });

           System.out.println("Sort By Name...");

        for (Product p1:l1){
            System.out.println(p1);     
           }
    }
    
}
