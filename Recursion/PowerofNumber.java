public class PowerofNumber {
    public static int optimizedPowerOfNumber(int num,int pow){
        if(pow == 0){
            return 1;
        }
        else if(pow%2 == 0){
            return optimizedPowerOfNumber(num, pow/2)*optimizedPowerOfNumber(num, pow/2);
        }
        else{
            return num*optimizedPowerOfNumber(num, (pow-1)/2)*optimizedPowerOfNumber(num, (pow-1)/2);
        }
    }
    
    public static int powerOfNumber(int num,int pow){
        if(pow == 0 ){
            return 1;
        }
        else{
            return num*powerOfNumber(num, pow-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(optimizedPowerOfNumber(10, 2));
    }
}
