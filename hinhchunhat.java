import java.util.Scanner;
public class HinhChuNhat extends HinhHoc{
    public float cd;
    public float cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }


    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }
    @Override
    public double Dientich()
    {
        float Dientich = cd*cr;
        System.out.println("Dien tich Hinh Chu Nhat la:"+Dientich);
        return Dientich;
    }
}
