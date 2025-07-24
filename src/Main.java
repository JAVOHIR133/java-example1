import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


//        System.out.print("Birinchi sonni kiriting: ");
//        int son1 = scanner.nextInt();

//        System.out.print("Ikkinchi sonni kiriting: ");
//        int son2 = scanner.nextInt();
//
//        System.out.print("Uchinchi sonni kiriting: ");
//        int son3 = scanner.nextInt();
//
//        int musbatSoni = 0;
//
//
//        if (son1 > 0) musbatSoni++;
//        if (son2 > 0) musbatSoni++;
//        if (son3 > 0) musbatSoni++;
//
//
//        System.out.println("Musbat sonlar soni: " + musbatSoni);

//        System.out.print("Birinchi sonni kiriting: ");
//        int son1 = scanner.nextInt();
//
//        System.out.print("Ikkinchi sonni kiriting: ");
//        int son2 = scanner.nextInt();
//
//
//        if (son1 > son2) {
//            System.out.println("Natija: " + son1 + " " + son2);
//        } else {
//            System.out.println("Natija: " + son2 + " " + son1);
//        }


//        System.out.print("1 dan 999 gacha bo'lgan sonni kiriting: ");
//        int son = scanner.nextInt();
//
//
//        if (son < 1 || son > 999) {
//            System.out.println("Xatolik: Son 1 dan 999 gacha bo'lishi kerak!");
//        } else {
//            String xonalik = "";
//            String juftToq = "";
//
//
//            if (son < 10) {
//                xonalik = "bir xonali";
//            } else if (son < 100) {
//                xonalik = "ikki xonali";
//            } else {
//                xonalik = "uch xonali";
//            }
//
//
//            if (son % 2 == 0) {
//                juftToq = "juft son";
//            } else {
//                juftToq = "toq son";
//            }
//
//
//            System.out.println("Natija: " + xonalik + " " + juftToq);
//        }
//
//
//        System.out.print("Birinchi sonni kiriting: ");         62-misol;
//        int a = scanner.nextInt();
//
//        System.out.print("Ikkinchi sonni kiriting: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Uchinchi sonni kiriting: ");
//        int c = scanner.nextInt();
//
//        int ortancha;
//
//
//        if ((a > b && a < c) || (a < b && a > c)) {
//            ortancha = a;
//        } else if ((b > a && b < c) || (b < a && b > c)) {
//            ortancha = b;
//        } else {
//            ortancha = c;
//        }
//        System.out.println("O'rtanchasi: " + ortancha);

//
//        System.out.println("birinchi sonni kiriting : ");            63-misol;
//            int a = scanner.nextInt();
//        System.out.println("ikkinchi sonni kiriting : ");
//        int b = scanner.nextInt();
//        System.out.println("uchunchi sonni kiriting : ");
//        int c = scanner.nextInt();
//
//        if (a < b && b < c) {
//            a *= 2;
//            b *= 2;
//            c *= 2;
//        } else {
//            a = -a;
//            b = -b;
//            c = -c;
//        }
//
//
//        System.out.println("sonlar : " + a + ", " + b + ", " + c);
//
//
//        System.out.print("a ni kiriting: ");
//        int a = scanner.nextInt();
//
//        System.out.print("b ni kiriting: ");
//        int b = scanner.nextInt();
//
//
//        if (a != b) {
//            int sum = a + b;
//            a = sum;
//            b = sum;
//        } else {
//            a = 0;
//            b = 0;
//        }
//
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        System.out.print("Oy raqamini kiriting (1-12): ");
//        int oy = scanner.nextInt();
//        switch (oy) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("qish");
//                break;
//            case 3: case 4: case 5 :
//                System.out.println("bahor");
//                break;
//            case 6: case 7 : case 8 :
//                System.out.println("yoz");
//                break;
//            case 9: case 10 : case 11:
//                System.out.println("kuz");
//                break;
//            default:
//                System.out.println("bunday oy fasli yoq !");
//        }
//
//        System.out.println("1-7 gacha aon kiriting : ");
//        int kun = scanner.nextInt();
//        switch (kun){
//            case 1 :
//                System.out.println("1-kun dushanba ");
//                break;
//            case 2 :
//                System.out.println("2-kun seshanba ");
//                break;
//            case 3 :
//                System.out.println("3-kun chorshanba ");
//                break;
//            case 4 :
//                System.out.println("4-kun payshanba");
//                break;
//            case 5 :
//                System.out.println(" 5- kun juma ");
//                break;
//            case 6 :
//                System.out.println("6 - kun shanba ");
//                break;
//            case 7 :
//                System.out.println("7 - kun yakshanba ");
//                break;
//            default:
//                System.out.println("bunday xafta kuni yoq ");
//
//        }

//        System.out.println("1 dan 12 gacha raqam kiriting :");       67-misol;
//        int oy = scanner.nextInt();
//        switch (oy){
//            case 1 : case 3: case 5: case 7: case 8 : case 10: case 12 :
//                System.out.println("bu oy 31 kundan iborat  ");
//                break;
//            case 4: case 6: case 9 : case 11:
//                System.out.println("bu oy 30  kundan iborat ");
//                break;
//            case 2 :
//                System.out.println("bu oy 28 kundan iborat ");
//                break;
//            default:
//                System.out.println("bunday oy raqam kuni yoq ");
//        }

//
//        System.out.print("Yoshingizni kiriting (20–69): ");           68-misol;
//        int yosh = scanner.nextInt();
//
//        int onlar = yosh / 10;
//        int birlik = yosh % 10;
//
//
//        switch (onlar) {
//            case 1:
//                System.out.print("o'n");
//                break;
//            case 2:
//                System.out.print("yigirma ");
//                break;
//            case 3:
//                System.out.print("o'ttiz");
//                break;
//            case 4 :
//                System.out.print("qirq");
//                break;
//            case 5 :
//                System.out.print("ellik");
//                break;
//            case 6 :
//                System.out.print("oltmish");
//                break;
//            case 7 :
//                System.out.print("yetmish");
//                break;
//            case 8 :
//                System.out.print("sakson");
//                break;
//            case 9 :
//                System.out.print("toqson");
//                break;
//            default:
//                System.out.print("bunday raqam kiritilmagan :");
//
//        }
//
//        switch (birlik) {
//            case 1:
//                System.out.print(" bir");
//                break;
//            case 2:
//                System.out.print(" ikki");
//                break;
//            case 3:
//                System.out.print(" uch");
//                break;
//            case 4:
//                System.out.print(" to'rt");
//                break;
//            case 5:
//                System.out.print(" besh");
//                break;
//            case 6:
//                System.out.print(" olti");
//                break;
//            case 7:
//                System.out.print(" yetti");
//                break;
//            case 8:
//                System.out.print(" sakkiz");
//                break;
//
//            case 9:
//                System.out.print(" toqqiz");
//                break;
//        }
//
//        int i = 1;
//
//        System.out.print("Toq sonlar: ");            69-misol;
//        while (i <= 100) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//
//        System.out.println();
//
//        i = 1;
//        System.out.print("Juft sonlar: ");
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//
//        }
//
//        System.out.print("a ni kiriting: ");
//        int a1 = scanner.nextInt();
//        System.out.print("b ni kiriting: ");
//        int b1 = scanner.nextInt();
//
//
//        System.out.print("a ni kiriting: ");
//        int a2 = scanner.nextInt();
//        System.out.print("b ni kiriting: ");
//        int b2 = scanner.nextInt();
//
//
//        takrorla(a1, b1);
//        takrorla(a2, b2);
//
//
//    }
//
//    public static void takrorla(int a, int b) {
//        for (int i = 0; i < b; i++) {
//            System.out.print(a);
//        }
//        System.out.println();
//
//
//
//        System.out.print("a ni kiriting: ");        71-misol;
//        int a = scanner.nextInt();
//
//        System.out.print("b ni kiriting: ");
//        int b = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = a + 1; i < b; i++) {
//            sum += i;
//        }

//        System.out.println("Yig'indi: " + sum);

//        System.out.println("n = ");                 72-misol;
//        int n = scanner.nextInt();
//
//        System.out.println("a = ");
//        int a = scanner.nextInt();
//        int natija = 1;
//        for (int i = 0; i < n; i++) {i
//            natija = natija*a;
//            System.out.println("natija "+natija);
//
//        }
//
//        System.out.println("natija " +Math.pow(a,n));
//
//        System.out.print("a ni kiriting (a < b): ");
//        int a = scanner.nextInt();
//
//        System.out.print("b ni kiriting (b > a): ");
//        int b = scanner.nextInt();
//
//        int kopaytma = 1;
//        for (int i = a; i <= b; i++) {
//            kopaytma *= i;
//        }
//
//
//
//
//
//        int yigindi = 0;                74-misol;
//
//
//        for (int i = 1; i <= 100; i += 2) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                yigindi += i;
//            }
//        }
//
//
//        System.out.println("Yig‘indi: " + yigindi);
//
//
//        System.out.print("n sonini kiriting: ");             75-misol;
//        int n = scanner.nextInt();
//
//        int son = 1;
//        boolean topildi = false;
//
//        while (son <= n) {
//            if (son == n) {
//                topildi = true;
//                break;
//            }
//            son = son * 3;
//        }
//
//        if (topildi) {
//            System.out.println("3 ning darajasi");
//        } else {
//            System.out.println("3 ning darajasi emas");
//        }
//
//
//        System.out.println("a= ");               76-qisim;
//        int a = scanner.nextInt();
//
//        System.out.println("b= ");
//        int b = scanner.nextInt();
//
//        System.out.println("Natija:");
//
//        for (int i = a + 1; i < b; i++) {
//            if (i % 4 == 0) {
//                System.out.print(i + " ");
//            }
//
//
//        }


        int kopaytma = 1;

        while (true) {
            System.out.print("Son kiriting (0 tugatadi): ");
            int son = scanner.nextInt();

            if (son == 0) {
                break;
            }

            kopaytma = kopaytma * son;
        }

        System.out.println("Ko‘paytma: " + kopaytma);




    }
}
