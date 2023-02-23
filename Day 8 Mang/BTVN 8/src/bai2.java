public class bai2 {
    public static void main(String[] args) {
        /*
         * 2. Cho 3 mảng int[] a = {1,2,3,2,1}. Kiểm tra xem mảng có mảng đối xứng hay
         * không. Nếu đúng thì in ra: "Mảng một chiều vừa nhập là mảng đối xứng", còn
         * không in ra: "Mảng một chiều vừa nhập không là mảng đối xứng"
         * 
         */

        int[] a = { 1, 2, 3, 4, 5, 3, 2, 1 };
        boolean check = false;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {// tru 1 vi vi tri index chi la 7
                check = true;
            }
        }
        if (check) {
            System.out.println("khong doi xung");
        } else {
            System.out.println("doi xung");
        }
    }
}
