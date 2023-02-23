public class App {
    public static void main(String[] args) {
        // int m = 5;
        // int n = 6;
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // Key Word BREAK, CONTINUE
        int sum = 0;
        int n = 100;
        for (int i = 0; i < n; i++) {
            
            sum += i;
            if (i == 4) {
                break;
            }
        }
        System.out.println(sum);
    }
}
