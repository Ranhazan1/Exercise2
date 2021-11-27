import java.util.Scanner;

public class PhoneNumber {
    public static String checkPhoneNumber(String number) {
        String finalNumber = new String();
        if ((number.length()==10)||(number.length()==11)||(number.length()==12)) {
            char newNumber[] = new char[11];
            newNumber[0] = '0';
            newNumber[1] = '5';
            newNumber[3] = '-';
            if (number.length() == 11) {
                newNumber[2] = number.charAt(2);
                if ((number.charAt(0) == '0') && (number.charAt(1) == '5') && (number.charAt(3) == '-')) {
                    for (int i = 4; i < number.length(); i++) {
                        newNumber[i] = number.charAt(i);
                    }
                }
            } else if (number.length() == 12) {
                if ((number.charAt(0) == '9') && (number.charAt(1) == '7') && (number.charAt(2) == '2')) {
                    newNumber[2] = number.charAt(4);
                    int j = 4;
                    for (int i = 4; i <newNumber.length; i++) {
                        j = j + 1;
                        newNumber[i] = number.charAt(j);
                    }
                }
            } else if (number.length() == 10) {
                newNumber[2] = number.charAt(2);
                for (int i = 4; i <= number.length(); i++) {
                    newNumber[i] = number.charAt(i - 1);
                }
            } finalNumber=new String(newNumber);
        }else{
            finalNumber=new String();
        }return finalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter phone number");
        String number= scanner.nextLine();
        System.out.println(checkPhoneNumber(number));

    }
}

