package lesson03.listing1;

public class Lesson3Listing1 {
    public class Main {
        public static void main(String[] args) {
            int a = -5;
            int b = 10;
            int c = 0;

            if (a>0 || b>0 & c == 0) {  //двойной амперсант это сокращенное И, одинарный амперсант полное И (проверяется и левая и правая часть )
                //есть приоритет операций
                System.out.println("выполнилось первое условие");
            }
            else
                System.out.println("не віполнилось");

            if (a>0) { b =10;}
            else b = -10;
            //тернарную запись можно использовать если действие 1 и 2 это возврат значений

            //  a >0 ? b = 10 : b = -10; //тернарные операции, сокращенная запись if else
            b = a > 0 ? 10 : -10; //первый способ применения тернарного оператора
            System.out.println(a>0 ? "yes" : "no"); //второй способ применения тернарного оператора
            int t =-10;

            if (t<=0) {
                System.out.println("ice");
            } else
            if (t<100) {
                System.out.println("water");}
            else  System.out.println("cloud");


            System.out.println(t<=0 ? "лед" : (t<100) ? "вода" : "пар");


        }
}
