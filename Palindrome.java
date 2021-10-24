package practice;

public class Palindrome {

    public void Palindrome(String str) {
        int length = str.length();
        System.out.println("length :" + length);

        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse:" + reverse);
        if (reverse.equals(str)) {
            System.out.println("it is a palindorme");
        } else {
            System.out.println("it i NOT palindrome");
        }
    }


  public void Palindrome(int number){
        int rev = 0;
        int temp = number;
        while (number > 0){
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
       System.out.println("Reverse;" + rev);
        if (rev == temp){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is NOT palindrome");
        }
  }



    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.Palindrome("anna");
        palindrome.Palindrome(121);
    }
}



