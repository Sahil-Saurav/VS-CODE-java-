import java.util.ArrayList;

public class PairSum1 {
    public static void pair(ArrayList<Integer> arr,int key){
        int Lp = 0;
        int Rp = arr.size()-1;
        //int sum;
        while(Lp<Rp){
            if(arr.get(Lp)+arr.get(Rp)==key){
                System.out.println(arr.get(Lp)+" "+arr.get(Rp));
                break;
            }
            else{
                /*if(arr.get(Rp)>key){
                    Rp--;
                }*/
                if(arr.get(Lp)+arr.get(Rp)>key){
                    Rp--;
                }
                else{
                    Lp++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        pair(arr, 6);
    }
}