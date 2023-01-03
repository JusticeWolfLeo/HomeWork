import java.util.Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"}; //Времена года
        String[] month = {"December", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November"}; // Месяцы
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; //Дни недели
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Числа месяца, все указывать не стал
        System.out.println(seasons[0]);
        System.out.println(Arrays.toString(month)); // полностью вывел месяцы
        System.out.println(week[2]);
        System.out.println(days[3]);
        int key = Arrays.binarySearch(days, 8); //попробовал поиск в массиве, число 8 на позиции 7
        System.out.println(key);
    }
}
