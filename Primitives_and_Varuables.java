public class Primitives_and_Varuables {
    public static void main(String[] args) {
        // Примитивы:
        byte name127 = 127; //обработка "сырых данных"
        short econom = 255; //экономия памяти
        long big = -9223372036854L; //БОЛЬШИЕ ЧИСЛА, при работе со временем или с большими расстояниями
        int name = 5; //целое число (числовой целый тип данных)
        float name1 = 5.5F; //дробное число (числовой дробный тип данных)
        double doubleValue = 59.36; //для работы с десятичными числами
        boolean name2 = true; //Истина, 1
        boolean name3 = false; // Ложь, 0
        char name4 = 'D'; // только 1 символ или знак
        System.out.println("Обработка 'сырых данных', byte = " + name127);
        System.out.println("Экономия памяти, short = " + econom);
        System.out.println("БОЛЬШИЕ ЧИСЛА, при работе со временем или с большими расстояниями, long = " + big);
        System.out.println("Целое число (числовой целый тип данных), int = " + name);
        System.out.println("Дробное число (числовой дробный тип данных), float = " + name1);
        System.out.println("Для работы с десятичными числами, double = " + doubleValue);
        System.out.println("Истина, boolean, 1 = " + name2);
        System.out.println("Ложь, boolean, 0 = " + name3);
        System.out.println("Только 1 символ или знак, char = " + name4);
    }
}
