import java.util.Arrays;

public class Schoolmarks {
    public static void main(String[] args) {
        int[] Schoolmarks = {1, 5, 3, 4, 2, 3, 5};
        Arrays.sort(Schoolmarks);
        for (int values : Schoolmarks) {
            System.out.print(values + ", ");
        }
    }
}
