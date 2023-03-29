import java.util.Scanner;


public class HinhTron extends HinhHoc{
    public float R;

    public HinhTron(float R){
        this.R = R;
    }


    @Override
    public String toString() {
        return "HinhTron{" + "R=" + R + '}';
    }
    @Override
    public double Dientich()
    {
        float Dientich = PI* R * R;
        System.out.println("Dien tich Hinh Tron:"+Dientich);
        return Dientich;
    }
    
}
