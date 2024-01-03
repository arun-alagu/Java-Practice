import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        String A = sc.nextLine();
        String[] text = new String[M];

        for (int i = 0; i < M; i++) {
            text[i] = sc.nextLine();
        }

        if (text.length == 0) return;

        int[] order = new int[M + 1];
        Arrays.fill(order, -1);

        for (int i = 0; i < text.length; i++) {
            int countA = countFinder(text[i], A);
            order[countA] = i;
        }

        for (int i : order) {
            if (i >= 0) System.out.println(text[i]);
        }

    }

    public static int countFinder(String t, String A) {
        String[] temp = t.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(A, 0);
        for (String s : temp) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        return hm.get(A);
    }
}