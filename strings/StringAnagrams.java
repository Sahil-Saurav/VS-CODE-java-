public class StringAnagrams {
    public static boolean anagramsString(String str11,String str22){
        int found;
        String str1 = str11.toLowerCase();
        String str2 = str22.toLowerCase();
        for(int i=0;i<str1.length();i++){
            found = 0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    found = 1;
                    break;
                }
            }
            if(found == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "Ecar";
        System.out.println(anagramsString(str1, str2));
    }
}
