import java.util.ArrayList;

public class PairSum2 {
    public static void pair(ArrayList<Integer> arr,int tar){
        int pivot = 0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                pivot = i;
            }
        }
        int Lp = pivot;
        int Rp = pivot+1;
        while(arr.get(Lp)!=arr.get(Rp)){
            int sum = arr.get(Lp)+arr.get(Rp);
            if(sum==tar){
                System.out.println(arr.get(Lp)+" "+arr.get(Rp));
                break;
            }
            if(sum>tar){
                Lp--;
                if(Lp<0){
                    Lp = arr.size()-1;
                }
            }
            if(sum<tar){
                Rp++;
                if(Rp>arr.size()-1){
                    Rp = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(15);
        pair(arr, 16);
    }
}