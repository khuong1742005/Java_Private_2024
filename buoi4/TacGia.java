package buoi4;

public class TacGia {
    private String tenTacGia;
    private int namSinh;
    private String queQuan;

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh, String queQuan) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "tenTacGia='" + tenTacGia + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'';
    }
}
