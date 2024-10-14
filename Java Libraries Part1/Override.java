public class Override {

    int i;

    public Override() {

        i=10;
    }

    

    public  String toString(){
        return "OverridetoString Method";
    }
    
    public int hashCode(){

        return 16582187;
    }

    public boolean equals(Object o){

        Override o1=(Override) o;

       if (o1.i==this.i){
        return true;
       }
       else{
        return false;
       }
    }

    public static void main(String[] args) {
        Override ov=new Override();
        Override ov1=new Override();
        System.out.println(ov.toString());
        System.out.println(ov1.hashCode());
        System.out.println(ov.equals(ov1));
    }
}
