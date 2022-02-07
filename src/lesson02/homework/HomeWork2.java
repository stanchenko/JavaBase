package lesson02.homework;

public class HomeWork2 {
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
    }
}
