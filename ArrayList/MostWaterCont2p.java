import java.util.ArrayList;
import java.lang.Math;
public class MostWaterCont2p {
    public static int water(ArrayList<Integer> arr){
        int Lp = 0;
        int Rp = arr.size()-1;
        int max_water = 0;
        int curr_water;
        while(Lp<Rp){
            int width = Rp-Lp;
            int Ht = Math.min(arr.get(Rp), arr.get(Lp));
            curr_water = width*Ht;
            if(curr_water>max_water){
                max_water = curr_water;
            }
            if(arr.get(Lp)<arr.get(Rp)){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return max_water;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(water(arr));
    }
}
