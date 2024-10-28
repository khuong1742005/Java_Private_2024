package buoi2;

import java.util.Scanner;

public class Main {

    public static class Bai1 {
        private int[] a;
        private int k;

        Bai1() {
        }

        public void nhap() {
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            k = scanner.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        }

        public int solve() {
            int left = 0, right = a.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (a[mid] == k) {
                    return mid;
                } else if (a[mid] < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }

        public void xuat() {
            System.out.println((solve() == -1) ? "-1" : ("Vi tri cua phan tu la: " + solve()));
        }

        public void preMain() {
            nhap();
            xuat();
        }

    }

    public static class Bai2 {
        private int[] a;
        private int k;
        private int n;

        Bai2() {
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            k = scanner.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        }

        public int solve() {
            int[] preFixsum = new int[n + 1];
            preFixsum[0] = a[0];
            for (int i = 1; i < n; i++) {
                preFixsum[i] = preFixsum[i - 1] + a[i];
            }
            int maxSum = Integer.MIN_VALUE;
            int minPrefix = Integer.MAX_VALUE;
            for (int i = k; i <= n; i++) {
                minPrefix = Math.min(minPrefix, preFixsum[i - k]);
                maxSum = Math.max(maxSum, preFixsum[i] - minPrefix);
            }
            return maxSum;
        }

        public void xuat() {
            System.out.println("Ket qua la : " + solve());
        }

        public void preMain() {
            nhap();
            xuat();
        }
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.preMain();
        Bai2 bai2 = new Bai2();
        bai2.preMain();
    }
}
