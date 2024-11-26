package buoi7Off.service.IMPL;

import buoi7Off.models.PhysicalProduct;
import buoi7Off.models.Product;
import buoi7Off.models.Role;
import buoi7Off.models.User;
import buoi7Off.service.IProductManager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagerIMPL implements IProductManager {
    private ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public boolean addProduct(Scanner sc) throws Exception {
        PhysicalProduct product = new PhysicalProduct();
        try {
            System.out.println("Nhập id: ");
            String id = sc.nextLine();
            for (Product pr : products) {
                if (pr.getId().equals(id)) {
                    throw new Exception("Id đã tồn tại. Vui lòng nhập lại.");
                }
            }
            product.setId(id);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
        System.out.println("Nhập tên: ");
        product.setName(sc.nextLine());
        System.out.println("Nhập giá: ");
        product.setPrice(sc.nextDouble());
        System.out.println("Nhập số lượng: ");
        product.setQuantity(sc.nextInt());
        products.add(product);
        return true;
    }

    @Override
    public void displayProduct() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    @Override
    public boolean searchByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                System.out.println(p.toString());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateProductByID(String id, Scanner sc) {
        for (Product p : products) {
            System.out.println("Nhập tên: ");
            p.setName(sc.nextLine());
            System.out.println("Nhập giá: ");
            p.setPrice(sc.nextDouble());
            System.out.println("Nhập số lượng: ");
            p.setQuantity(sc.nextInt());
            return true;
        }
        return false;
    }
}
