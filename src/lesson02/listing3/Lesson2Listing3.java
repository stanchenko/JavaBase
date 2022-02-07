package lesson02.listing3;

public class Lesson2Listing3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = 3;
        System.out.println("b/a="+b/a); //результат действия двух целочисленных переменных может дать только целое число
        System.out.println("b/c="+b/c); //если в операции присутствует более старший тип результат приводится к нему
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/3.0);

        int g = 90;
        char d = (char) g;
        System.out.println(d); //можно целочислинные значения приводить к типу char

        // В языках с динамической типизацией === это значит тождественно равно, т.е сравниваются не только значения но и типы переменных
        // два равно == сравниваются только значения
        // жава язык строгой типизации поэтому три равно быть не может, не можем стравнивать разнотипные значения

        int q = 5;
        int w = 10;
        System.out.println("q=5, w=10, q равно w ? q=w ? - "+ (q==w));
        System.out.println("q=5, w=10, q не равно w ? q!=w ? - "+ (q!=w));
        System.out.println("q=5, w=10, q больше w ? q>w ? - "+ (q>w));
        System.out.println("q=5, w=10, q меньше w ? q<w ? - "+ (q<w));
        System.out.println("q=5, w=10, q больше или равно w ? q>=w ? - "+ (q>=w));
        System.out.println("q=5, w=10, q меньше или равно w ? q<=w ? - "+ (q<=w));

        int e = 5;
        System.out.println(" e=++e + e++ = " + (e=++e + e++));
        e=5;
        System.out.println(" e=++e + ++e = " + (e=++e + ++e));
        e=5;
        System.out.println(++e == e++);
        e=5;
        System.out.println(++e +"=="+ e++);


    }
}
