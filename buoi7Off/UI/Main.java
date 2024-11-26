package buoi7Off.UI;

import buoi7Off.models.PhysicalProduct;
import buoi7Off.models.Product;
import buoi7Off.models.Role;
import buoi7Off.models.User;
import buoi7Off.service.IMPL.IUserServiceIMPL;
import buoi7Off.service.IMPL.ProductManagerIMPL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        ProductManagerIMPL productPM = new ProductManagerIMPL();
        IUserServiceIMPL userPM = new IUserServiceIMPL();

        userPM.login();

        if (userPM.getCurUser().getRole().equals(Role.AMIN)) {
            while(true){
                System.out.println("======= Quản Lý Sản Phẩm (Admin) =======");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiện thị danh sách sản phẩm");
                System.out.println("3. Tìm kiếm sản phẩm theo tên");
                System.out.println("4. Xóa sản phẩm theo mã");
                System.out.println("5. Cập nhật thông tin sản phẩm");
                System.out.println("6. Thoát");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        if (productPM.addProduct(sc)) System.out.println("Thêm thành công");
                        else System.out.println("Thêm thất bại");
                        break;
                    case 2:
                        productPM.displayProduct();
                        break;
                    case 3:
                        System.out.println("Nhập tên sản phẩm cần tìm: ");
                        String name = sc.nextLine();
                        if(productPM.searchByName(name)) System.out.println("Tìm thành công");
                        else System.out.println("Tìm thất bại");
                        break;
                    case 4:
                        System.out.println("Nhập mã sản phẩm cần xóa: ");
                        String id = sc.nextLine();
                        if (productPM.deleteById(id)) System.out.println("Xóa thành công");
                        else System.out.println("Xóa thất bại");
                        break;
                    case 5:
                        System.out.println("Nhập mã sản phẩm cần cập nhật: ");
                        String idUpdate = sc.nextLine();
                        if(productPM.updateProductByID(idUpdate, sc)) System.out.println("Cập nhật thành công");
                        else System.out.println("Cập nhật thất bại");
                        break;
                    case 6:
//                        userPM.logout();
//                        System.out.println("Đăng xuất thành công");
                        System.exit(0);
                        System.exit(0);
                        break;
                }
            }
        }
        else{
            while(true){
                System.out.println("======= Xem Sản Phẩm (User) =======");
                System.out.println("1. Hiện thị danh sách sản phẩm");
                System.out.println("2. Tìm kiếm sản phẩm theo tên");
                System.out.println("3. Thoát");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        productPM.displayProduct();
                        break;
                    case 2:
                        System.out.println("Nhập tên sản phẩm cần tìm: ");
                        String name = sc.nextLine();
                        if(productPM.searchByName(name)) System.out.println("Tìm thành công");
                        else System.out.println("Tìm thất bại");
                        break;
                    case 3:
//                        userPM.logout();
//                        System.out.println("Đăng xuất thành công");
                        System.exit(0);
                        System.exit(0);
                        break;
                }
            }
        }


    }
}
