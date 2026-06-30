public class Sreing_02 {
    //vowels in a string
    public static int vowelCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int count1=vowelCount("likith");
        System.out.println(count1);

    }
}
