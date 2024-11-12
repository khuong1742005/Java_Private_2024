package buoi4;

public class FairyBook extends Book{
    private double rating;

    public FairyBook(int maSach, String tenSach, TacGia tacGia, int namSanXuat, String tomTatNoiDung, double giaTien, double rating) {
        super(maSach, tenSach, tacGia, namSanXuat, tomTatNoiDung, giaTien);
        this.rating = rating;
    }

    public FairyBook() {
    }


}
