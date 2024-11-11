package buoi3Off;

public class Person {
    private String maCanCuocCongDan;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String soDienThoai;

    public Person(){}
    public Person(String maCanCuocCongDan, String ten, int tuoi, String diaChi, String soDienThoai)
    {
        this.maCanCuocCongDan = maCanCuocCongDan;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaCanCuocCongDan() {
        return maCanCuocCongDan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getTen() {
        return ten;
    }

    public String display()
    {
        return "Ma can cuoc cong dan: " + maCanCuocCongDan + "\n" +
               "Ten: " + ten + "\n" +
               "Tuoi: " + tuoi + "\n" +
               "Dia chi: " + diaChi + "\n" +
               "So dien thoai: " + soDienThoai;
    }
}
