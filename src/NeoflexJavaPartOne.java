public class NeoflexJavaPartOne {
    //    1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte valByte = 100;
        short valShort = 1_500;
        int valInt = 1_000_000;
        long valLong = 1_000_000_000_000L;
        float valFloat = 3.14f;
        double valDouble = -1964.0211;
        char valChar = '!';
        boolean valBoolean = true;

        int a = 7;
        int b = 5;
        int c = 0;
        int d = -3;
//3.
        System.out.println(mathExpression(a, b, c, d));

//4.
        System.out.println(compareSumOfTwoNumbers(a, b));

//5.
        positiveOrNegative(c);

//6.
        System.out.println(negativeIsTrue(d));

//7.
        String thisName = "Леопольд";
        helloName(thisName);

        //8.
        int year = 1964;
        leapYear(year);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – входные параметры этого метода
    static int mathExpression(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;
    static boolean compareSumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное ли число передали, или отрицательное;
//    Замечание: ноль считаем положительным числом.
    static void positiveOrNegative(int c) {
        if (c < 0) {
            System.out.println("Число " + c + " является отрицательным");
        } else {
            System.out.println("Число " + c + " является положительным");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
// если число отрицательное;
    static boolean negativeIsTrue(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void leapYear(int year) {
        if (!(year % 4 == 0) || (year % 100 == 0) && (!(year % 400 == 0))) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год - високосный");
        }
    }
}
