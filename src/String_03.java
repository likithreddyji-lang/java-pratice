public class String_03 {
    public static String reverse(String str){
        String str1=" ";
        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i);
            str1+=ch;
        }
        return str1;

    }
    public static void main(String[] args) {
        String str2=reverse("likith");
        System.out.println(str2);

    }
}
