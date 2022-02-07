package lesson02.listing4;

public class Lesson2Listing4 {
    public static void main(String[] args) {

        //Вариант 1
        System.out.println("Вариант 1");
        int a =5;
        System.out.println("Block #1");
        if(a<0) {
            System.out.println("Block #2"); //cлучай когда он может выполнятся а может нет
        }
        System.out.println("Block #3");

        System.out.println();

        //Вариант 2
        System.out.println("Вариант 2");
        System.out.println("Block #1");
        if(a<0) {
            System.out.println("Block #2.1"); //обязательно должен выполнится или 2.1 или 2.2
        }else{
            System.out.println("Block #2.2");
        }
        System.out.println("Block #3");
        //код отрабатывается сверху вниз и как только нашли совпадение, выполняем условие, и дальше проверку не делаем,
        // выходим из конструкции проверки

        System.out.println();

        //Вариант 3
        a=-1;
        System.out.println("Вариант 3");
        System.out.println("Block #1");
        if(a<0) {
            System.out.println("Block #2.1"); //обязательно должен выполнится или 2.1 или 2.2
        }else if(a>0 && a<10){ //Условия можно объединять - результат одновременное выполнение двух условий
            System.out.println("Block #2.2");
        }else {
            System.out.println("Block #2.3");
        }
        System.out.println("Block #3");

        //Huggarden 65
        //leffe 55
        //Stella artua 45
        //Chernihivske 30
        //Obolon 7
        //Программа должна определить какое максимально дорогое пиво вы можете купить.

    }
}
