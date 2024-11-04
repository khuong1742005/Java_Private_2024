package KT1;

import java.util.*;

public class Main {
    public static class Bai1 {
        private int s;

        Bai1() {
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextInt();
        }

        public String solve() {
            String[] donVi = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
            String[] chuc10 = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười năm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
            String[] chuc = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
            if (s == 0) {
                return "không";
            }
            if (s < 10) {
                return donVi[s];
            }
            if (s < 20) {
                return chuc10[s - 10];
            }
            if (s < 100) {
                return chuc[s / 10] + (s % 10 != 0 ? " " + donVi[s % 10] : "");
            }
            if (s < 1000) {
                String ss = Integer.toString(s);
                int tmp = s % 100;
                String ans = "";
                ans = chuc[tmp / 10] + (tmp % 10 != 0 ? " " + donVi[tmp % 10] : "");
                if (ss.charAt(1) == '0') {
                    return donVi[s / 100] + " trăm linh " + donVi[s % 100];
                } else if (ss.charAt(2) == '0') {
                    return donVi[s / 100] + " trăm " + donVi[ss.charAt(1) - 48] + " mươi";
                }
                return donVi[s / 100] + " trăm " + (s % 100 != 0 ? " " + ans : "");
            }
            return "";
        }

        public void preMain() {
            nhap();
            System.out.println("So sang chuoi: " + solve());
        }
    }

    public static class Bai2 {
        private String s;

        Bai2() {
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
        }

        public void solve() {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp >= 48 && tmp <= 57) s2.append(tmp);
                else s1.append(tmp);
            }
            System.out.println("Chuoi so: " + s2.toString());
            System.out.println("Chuoi ky tu: " + s1.toString());
        }

        public void preMain() {
            nhap();
            solve();
        }
    }

    public static class bai3 {
        private float x;
        private String y;
    }

    public static class Bai4 {
        private long[] a;
        private int n;

        Bai4() {
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        }

        public void solve() {
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();
            long[] preFix = new long[n + 1];
            preFix[0] = a[0];
            for (int i = 1; i < n; i++) {
                preFix[i] = preFix[i - 1] + a[i];
            }

            for (int i = 0; i < q; i++) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                if (l > 0) System.out.println(preFix[r] - preFix[l - 1]);
                else if (l == 0) System.out.println(preFix[r]);
            }
        }

        public void preMain() {
            nhap();
            solve();
        }
    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1();
        b1.preMain();
//        Bai3 b3 = new Bai3();
        Bai2 b2 = new Bai2();
        b2.preMain();
        Bai4 b4 = new Bai4();
        b4.preMain();
    }
}
