public class _Practice02 {
    public static void main(String[] args) {
        int n=10,
        first_term=0,
        second_term=1;
        System.out.println("Fibonacci Series till" + n +"terms:");
        for(int i=1; i<=10; i++) {
            System.out.println(first_term+",");
            int next_term =first_term +second_term;
            first_term=second_term;
            second_term=first_term;
        }
        }
    }

