public class DuplicateCharRemove{
    
    public static void removeDuplicate(String str,int pos,StringBuilder sb,boolean[] arr){
        if(pos == str.length()-1){
            System.out.println(sb);
                return;
        }
        int curr = str.charAt(pos)-'a';
        if(arr[curr] == true){
            removeDuplicate(str, pos+1, sb, arr);
        }
        else{
            arr[curr] = true;
            removeDuplicate(str, pos+1, sb.append(str.charAt(pos)), arr);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("apnacollege", 0, new StringBuilder(""), new boolean[25]);
    }
}