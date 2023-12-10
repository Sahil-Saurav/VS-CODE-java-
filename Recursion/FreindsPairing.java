public class FreindsPairing {
    
    public static int func(int n){
        //base
        
        if(n==1 || n==2){
            return n;
        }

        //recursive
        else{
            int single = func(n-1);
            int pair = func(n-2);
            return single + (n-1)*pair;
        }
    }
    
    public static void main(String[] args){
        System.out.println(func(4));
    }
}
