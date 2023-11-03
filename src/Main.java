import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        MyClass myClass1 = new MyClass("Zaripbek","Kursanov", new String[]{"Teoria","Practica","English","Soft Skill"},"Kuurdak");

        System.out.println(myClass1.myName+ "\n" + myClass1.mySurName + "\n" + Arrays.toString(myClass1.lessons) + "\n" + myClass1.favoriteFood + "\n");


        MyClass myClass2 = new MyClass("Zaripbek","Kursanov","Football","Plov");

        System.out.println(myClass2.myName+ "\n" + myClass2.mySurName + "\n" + myClass2.myHobby+ "\n" + myClass2.favoriteFood);

    }
}





































//        int n = 5;
//        int sum = sumOfDigits(n);
//        System.out.println("Сумма цифр от 0 до " + n + ": " + sum);
//    }
//
//    public static int sumOfDigits(int n) {
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += getDigitSum(i);
//        }
//        return sum;
//    }
//
//    public static int getDigitSum(int num) {
//        int digitSum = 0;
//        while (num > 0) {
//            digitSum += num % 10;
//            num /= 10;
//        }
//        return digitSum;
//    }
