public class ConvertToUpperCase {
    public static void cnvrtuppercase(String str){
        StringBuilder st = new StringBuilder("");
        st.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                st.append(" ");
                st.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else{
                st.append(str.charAt(i));
            }
        }
        System.out.println(st);
    }
    
    public static void main(String[] args) {
        String str = "my name is Sahil";
        cnvrtuppercase(str);
    }
}
