import java.util.Scanner;
public class palindrom {
    static int testnumber;
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0,lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println(reverseNumber);
            System.out.println("------------------------------------");
        }
        testnumber = reverseNumber;
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int number1 = input.nextInt();
        isPalindrom(number1);
        if(testnumber == number1){
            System.out.println("Bu bir polindrom sayidir");
        }else{
            System.out.println("Bu bir polindrom sayi degildir");
        }
    }
}
