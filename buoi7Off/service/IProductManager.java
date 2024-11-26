package buoi7Off.service;

import java.util.Scanner;

public interface IProductManager {
    public boolean addProduct (Scanner sc) throws Exception;
    public void displayProduct();
    public boolean searchByName(String name);
    public boolean deleteById(String id);
    public boolean updateProductByID(String id, Scanner sc);
}
