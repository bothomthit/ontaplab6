public class GiaoDichVang extends GiaoDich{
    public String loaivang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String loaivang, String MaGD, String NgayGD, float soluong, double dongia) {
        super(MaGD, NgayGD, soluong, dongia);
        this.loaivang = loaivang;
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }
    @Override
    public void Thanhtien()
    {
        System.out.println("Tien vang:"+soluong*dongia);
    }
}
