package buoi1;

import static java.lang.System.*;
import java.util.*;


public class Buoi1 {

    static class Bai1
    {
        private int n;
        private final int coSo;
        public Bai1(int n, int coSo)
        {
            this.n = n;
            this.coSo = coSo;
        }
        public String convert()
        {
            String digits = "0123456789ABCDEF";
            StringBuilder sb = new StringBuilder();
            if (n == 0) return "0";
            while(n > 0)
            {
                int tmp = n % coSo;
                sb.append(digits.charAt(tmp));
                n /= coSo;
            }
            return sb.reverse().toString();
        }

    }

    static class Bai2
    {
        private final int n;
        public Bai2(int n){this.n = n;}
        public int tinhTich() {
            int tmp = (n < 0) ? -n : n;
            int ans = 1;
            while (tmp > 0) {
                ans *= tmp % 10;
                tmp /= 10;
            }
            return ans;
        }
    }

    static class Bai3{
        private final int[] a;
        private final int n;
        public Bai3(int n, int[] a) {
            this.a = a;
            this.n = n;
        }
        public Map.Entry<Integer, Integer> dO(){
            int max1;
            int max2;
            Arrays.sort(a);
            max1 = a[n-1];
            max2 = a[n-2];

            return new AbstractMap.SimpleEntry<>(max1, max2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int coSo;
        out.println("Nhap so nguyen duong co so 10: ");
        n = sc.nextInt();
        out.println("Nhap co so can chuyen: ");
        coSo = sc.nextInt();
        while (coSo < 2 || coSo > 16) {
            out.println("Khong hop le xin moi nhap lai");
            coSo = sc.nextInt();
        }
        Bai1 b1 = new Bai1(n, coSo);
        String ans = b1.convert();
        out.println("So " + n + " o co so 10 duoc chuyen thanh so " + ans + " o co so " + coSo);

        out.println("Bai 2: Nhap so can tinh tich: ");
        int nbai2 = sc.nextInt();
        Bai2 b2 = new Bai2(nbai2);
        out.println("Tich cac chu so: " + b2.tinhTich());
        out.println("Bai 3: Nhap so phan tu: ");
        int nbai3 = sc.nextInt();
        int[] a = new int[nbai3];
        for(int i = 0; i < nbai3; i++)
        {
            out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        Bai3 b3 = new Bai3(nbai3, a);
        out.println( "So lon nhat la " + b3.dO().getKey() + ", So lon thu 2 la " + b3.dO().getValue());
    }
}

