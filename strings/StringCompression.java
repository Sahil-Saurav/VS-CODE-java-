public class StringCompression{

    public static StringBuilder stringCompression(String str){
        int count = 1;
        StringBuilder st = new StringBuilder("");
        st.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                if(i == str.length()-1){
                    st.append(count);
                }
            }
            else if(str.charAt(i) != str.charAt(i-1)){
                if(count>1){
                    st.append(count);
                }
                count = 1;
                st.append(str.charAt(i));
            }
        }
        return st;
    }
    public static void main(String[] args) {
        String str = "aabbcddd";
        System.out.println(stringCompression(str));
    }
}