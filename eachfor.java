public class eachfor {
    public static void main(String[] args) {
        int[] num={12,42,15,35};
        String[] v={"my","you","we"};
        for(int i=0;i<4;++i){
            System.out.println(num[i]);
        }
        //for loop for each concept 
        //it mostly uses for array and string array methord
        for(int var:num)
        {
           
            System.out.println(var);
        }
        //for string loop in each method
        for (String m:v){
            System.out.println(m);
        }
    }
    
}
