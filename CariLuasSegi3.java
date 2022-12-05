import java.util.Scanner;
public class CariLuasSegi3 {

    public static void main(String[] args) {

                //deklarasi data
                int alas, tinggi, luas;

                //instalasi scanner
                Scanner masukkan = new Scanner(System.in);

                //variabel data
                alas = masukkan.nextInt();
                tinggi = masukkan.nextInt();

                //penginput jawaban
                luas = (alas * tinggi)/2;

                System.out.println(luas);


            }
        }
