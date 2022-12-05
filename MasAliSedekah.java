import java.util.*;
public class MasAliSedekah {

    public static void main(String[] args) {
        double gaji, insentif, total;

        Scanner masukkan = new Scanner(System.in);

        gaji = masukkan.nextDouble();
        insentif = masukkan.nextDouble();

        total = gaji + (insentif * 0.15) - 100000;

        System.out.println(total);
    }
}

