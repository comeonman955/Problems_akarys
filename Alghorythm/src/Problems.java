import java.util.Scanner;

public class Problems {

    public static int Minimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], Minimum(arr, n - 1));
    }

    public static double Average(int[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void permutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i));
            }
        }
    }

    public static boolean Digits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a problem to solve:");
        System.out.println("1. Find minimum element");
        System.out.println("2. Calculate average");
        System.out.println("3. Check if a number is prime");
        System.out.println("4. Find factorial");
        System.out.println("5. Find nth Fibonacci number");
        System.out.println("6. Calculate power");
        System.out.println("7. Print all permutations of a string");
        System.out.println("8. Check if a string consists of all digits");
        System.out.println("9. Find binomial coefficient");
        System.out.println("10. Find GCD");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of elements: ");
                int n1 = scanner.nextInt();
                int[] arr1 = new int[n1];
                System.out.println("Enter the elements:");
                for (int i = 0; i < n1; i++) {
                    arr1[i] = scanner.nextInt();
                }
                int min = Minimum(arr1, n1);
                System.out.println("Minimum element: " + min);
                break;
            case 2:
                System.out.print("Enter the number of elements: ");
                int n2 = scanner.nextInt();
                int[] arr2 = new int[n2];
                System.out.println("Enter the elements:");
                for (int i = 0; i < n2; i++) {
                    arr2[i] = scanner.nextInt();
                }
                double average = Average(arr2, n2);
                System.out.println("Average: " + average);
                break;
            case 3:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (isPrime(num)) {
                    System.out.println(num + " is Prime");
                } else {
                    System.out.println(num + " is Composite");
                }
                break;
            case 4:
                System.out.print("Enter a number: ");
                int factNum = scanner.nextInt();
                int result = factorial(factNum);
                System.out.println(factNum + "! = " + result);
                break;
            case 5:
                System.out.print("Enter a number: ");
                int fibNum = scanner.nextInt();
                int fibResult = fibonacci(fibNum);
                System.out.println("Fibonacci(" + fibNum + ") = " + fibResult);
                break;
            case 6:
                System.out.print("Enter base (a): ");
                int base = scanner.nextInt();
                System.out.print("Enter exponent (n): ");
                int exponent = scanner.nextInt();
                int powerResult = power(base, exponent);
                System.out.println(base + "^" + exponent + " = " + powerResult);
                break;
            case 7:
                System.out.print("Enter a string: ");
                String str = scanner.next();
                permutations(str, "");
                break;
            case 8:
                System.out.print("Enter a string: ");
                String s = scanner.next();
                if (Digits(s)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            case 9:
                System.out.print("Enter n: ");
                int n = scanner.nextInt();
                System.out.print("Enter k: ");
                int k = scanner.nextInt();
                int binomialResult = binomial(n, k);
                System.out.println("C(" + n + ", " + k + ") = " + binomialResult);
                break;
            case 10:
                System.out.print("Enter a: ");
                int a = scanner.nextInt();
                System.out.print("Enter b: ");
                int b = scanner.nextInt();
                int gcdResult = gcd(a, b);
                System.out.println("GCD(" + a + ", " + b + ") = " + gcdResult);
                break;
            default:
                System.out.println("Normalno vyberite nomer");
        }

        scanner.close();
    }
}
