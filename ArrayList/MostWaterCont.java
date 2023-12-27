import java.util.ArrayList;
public class MostWaterCont {
    public static int water(ArrayList<Integer> arr){
        int size = arr.size();
        int max_Area = 0;
        for(int i=0;i<size;i++){
            int width;
            int Area;
            for(int j=i+1;j<size;j++){
                width = j-i;
                int min = Math.min(arr.get(i), arr.get(j));
                Area = width * min;
                if(Area>max_Area){
                    max_Area = Area;
                }
            }
        }
        return max_Area;
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
