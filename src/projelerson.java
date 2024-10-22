import java.util.Scanner;


public class projeler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesap Makinesi");
        int n1,n2;
        System.out.println("Lütfen birinci sayiyi giriniz");
        n1 = input.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        n2 = input.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println(" 1.toplama\n 2.çıkarma\n 3.çarpma\n 4.bölme\n");
        int secim = input.nextInt();
        switch(secim){
            case 1:
                System.out.println("toplama sonucu :"+ (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma  sonucu :"+ (n1 - n2));
                break;
            case 3:
                System.out.println("çarpma sonucu :"+ (n1 * n2));
                break;
            case 4:
                System.out.println("bölme sonucu :"+ (n1 / n2));
                break;
            default:
                System.out.println("Hatalı giriş yaptiniz");

        }
    }

}
