import javax.annotation.processing.ProcessingEnvironment;

public class bai2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j == 0) {
                    System.out.print(" * ");
                } else if (i == a - 1) {
                    System.out.print(" * ");
                }else if (i == a - 2 && j == b - 2){
                    System.out.print(" * ");
                }

            }
        }System.out.println();
    }
}
