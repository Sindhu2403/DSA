 class Fibonacci {
     public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }
    public static void main(String[] args) {
        int number = 10; 
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i)+"");
            
        }
    }
}

