public class ShortestDistance {
    public static int shortestDistance(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y += 1;
            }
            else if(str.charAt(i)=='S'){
                y -= 1;
            }
            else if(str.charAt(i)=='E'){
                x += 1;
            }
            else if(str.charAt(i)=='W'){
                x -= 1;
            }
        }
        return (int)Math.sqrt(((x*x)-0)+((y*y)-0));
    }
    public static void main(String[] args) {
        System.out.println(shortestDistance("SNS"));
    }
}
