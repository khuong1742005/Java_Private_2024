package buoi4;

import java.util.Scanner;

public class TacGiaFuncion {
    static Scanner scanner = new Scanner(System.in);

    public static TacGia enterTacGia() {
        System.out.println("Nhap ten tac gia: ");
        String tenTacGia = scanner.nextLine();
        System.out.println("Nhap so sach cua tac gia: ");
        int soSach = scanner.nextInt();
        System.out.println("Nhap que quan cua tac gia: ");
        scanner.nextLine();
        String queQuan = scanner.nextLine();
        return new TacGia(tenTacGia, soSach, queQuan);
    }

    public static TacGia editTacGia()
    {
        TacGia tacGia = new TacGia();
        System.out.println("Nhap ten tac gia: ");
        tacGia.setTenTacGia(scanner.nextLine());
        System.out.println("Nhap so sach cua tac gia: ");
        tacGia.setNamSinh(scanner.nextInt());
        System.out.println("Nhap que quan cua tac gia: ");
        scanner.nextLine();
        tacGia.setQueQuan(scanner.nextLine());
        return tacGia;
    }
}
