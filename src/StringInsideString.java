import java.util.Scanner;
public class StringInsideString {
    public static boolean checkString(String first,String second ){
       boolean check=false;
        String shorter;
        String longer;
        if (first.length()<second.length()) {
            shorter=first;
            longer=second;
        }else {
            shorter=second;
            longer=first;
        }
        for (int i=0;i<shorter.length();i++){
            for (int j=0;j<longer.length();j++){
                if (shorter.charAt(i)==longer.charAt(j)){
                check=true;
                break;
                }else{
                    check=false;
                }
            }
        }return check;
    }

    public static void main(String[] args) {
        System.out.println(checkString("i like eating apples","apple"));
    }
}
