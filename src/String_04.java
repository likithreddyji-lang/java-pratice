public class String_04 {
    public static String palindrome(String str){
        String str1=" ";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1+=ch;

        }
        if(str.equals(str1)){
            return "palindrome";
        }else{
            return "not palindrome";
        }


    }
    public static void main(String[] args) {
        String str2=palindrome("aba");
        System.out.println(str2);




    }
}
