import java.util.Scanner;
public class Kubus24 {

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi); 
    }

    public static void main(String[] args) {
        int sisiKubus = 5;

        int volume = hitungVolume(sisiKubus);
        int luasPermukaan = hitungLuasPermukaan(sisiKubus);

        System.out.println("Panjang sisi kubus: " + sisiKubus);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
