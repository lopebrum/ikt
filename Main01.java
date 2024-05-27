import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        while (in.hasNextInt()) {
            int num = in.nextInt();
            numbers.add(num);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (frequencyMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}

import java.util.ArrayList;
        import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (in.hasNext()){
            numbers.add(in.nextInt());
            if(numbers.size() == 7){
                break;
            }

        }
        numbers.stream()
                .filter(x-> x>0)
                .forEach(x-> System.out.print(x + " "));

    }
}

import java.util.ArrayList;
        import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                row.add(in.nextInt());
            }
            matrix.add(row);
        }

        for (int i = N - 1; i >= 0; i--) {
            ArrayList<Integer> row = matrix.get(i);
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

import java.util.HashSet;
        import java.util.Scanner;
        import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);
    }
}

import java.util.HashSet;
        import java.util.Scanner;
        import java.util.Set;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (numbers.contains(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

