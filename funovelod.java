public class funovelod{
    // method overloading or funtion overloading
    // we can't use same funtion name  twice 
    // at same we can use same funtion name with different parameter is possible 
    // for your ref given below
    void sum(int a,int b){
        System.out.print(a+b);

    }
    void sum(int a,int b ,int c){
        System.out.print(a+b+c);
    }

    public static void main(String [] args){
        funovelod obj = new funovelod();
        obj.sum(2,5);
        obj.sum(7,9,1);


    }

}