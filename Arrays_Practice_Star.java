import java.util.Arrays;

public class Arrays_Practice_Star {
    public static void main(String[] args) {

        int[][] TwoDimArray = {{1}, {1, 2, 3, 4, 5, 6, 7}};
        //for (int i = 0; i < TwoDimArray.length; i++) { { //Пробовал через цикл, получалась хрень, не настолько пока что владею, просьба пнуть в правильную сторону
        //System.out.println(i)};
        Arrays.stream(TwoDimArray).forEach(s -> Arrays.stream(s).forEach(System.out::println)); // Мало что понял, но думаю, дойдем еще.
    }
}
