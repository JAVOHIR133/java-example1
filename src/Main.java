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
//
//
//        int kopaytma = 1;
//
//        while (true) {
//            System.out.print("Son kiriting (0 tugatadi): ");     77-misol;
//            int son = scanner.nextInt();
//
//            if (son == 0) {
//                break;
//            }
//
//            kopaytma = kopaytma * son;
//        }
//
//        System.out.println("Ko‘paytma: " + kopaytma);
//
//
//        System.out.println("a sonini kiriting (a < b):");          78-qisim;
//        int a = scanner.nextInt();
//
//        System.out.println("b sonini kiriting (b > a):");
//        int b = scanner.nextInt();
//
//        if (a >= b) {
//            System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak.");
//        } else {
//            int sonlar = 0;
//
//            System.out.println("a dan b gacha bo‘lgan sonlar (a va b ham qo‘shiladi):");
//            for (int i = a; i <= b; i++) {
//                System.out.print(i + " ");
//                sonlar++;
//            }
//
//            System.out.println("Chiqarilgan sonlar soni: " + sonlar);
//        }
//
//        System.out.println("Kamida bitta raqami 8 bo‘lgan 2 xonali sonlar:");
//
//        for (int son = 10; son <= 99; son++ ) {                70-misol;
//            int onlik = son / 10;
//            int birlik = son % 10;
//
//            if (onlik==8||birlik==8){
//                System.out.println(son+" ");
//            }
//
//
//        }
//
//
//        System.out.println("onliklar xonasida qatnashgan 7 soni  :");
//
//        for (int son  = 100  ; son  <=999 ; son ++) {
//            int onlik = (son/10)%10;
//
//            if (onlik==7){
//                System.out.println(son+ " ");
//            }
//
//
//        }
//
//        System.out.println(" dsgnljhabsljnszlkvjcn");       81-misol;
//
//        for (int son = 10; son <=999 ; son++) {
//            int yuzlar = son/100;
//            int birlar = son %10;
//
//            if (yuzlar==3 && birlar==3){
//                System.out.println(son+ "  ");
//            }
//
//        }

//        System.out.println("3 xonali palinndrom sonlar ");
//
//        for (int i = 100; i <=999; i++) {
//            int yuzlik = i/100;
//            int birlik = i%10;
//            if (birlik==yuzlik){
//                System.out.println(i+" ");
//            }
//
//
//        System.out.println("raqamlar yigindisi 9 yoki 15 bolagan 2 honali sonlar ");
//
//        for (int i = 10; i <= 99; i++) {             83-misol;
//            int onlar = i / 10;
//            int birlar = i % 10;
//            int yigindi = onlar + birlar;
//
//            if (yigindi == 9 || yigindi == 15) {
//                System.out.println(i + "");
//
//
//        }
//    }
//
//        System.out.println("3 honali 20 ga teng bolgan sonlar : ");
//
//        for (int i = 10; i < 999; i++) {           85-misol;
//            int onlar = (i/10)%10;
//            int yuzlar = i/100;
//            int birlik = i %10;
//            int yigindi = onlar+yuzlar+birlik;
//
//            if (yigindi==20){
//                System.out.println(i);
//            }
//
//
//        }

//
//   int sanash = 0 ;
//
//            for (int i = 100; i <= 999; i++) {        85-misol;
//                if (i % 3 == 0 && i % 5 == 0) {
//                    sanash++;
//                }
//            }
//
//            System.out.println("3 ga va 5 ga bo'linadigan 3 xonali sonlar soni: " + sanash);
//
//
//
//        System.out.println("Raqamlari yig'indisi 12 dan katta bo'lgan ikki xonali sonlar:");
//
//        for (int i = 10; i <= 99; i++) {
//            int birlik = i % 10;
//            int onlik = i / 10;
//            int yigindi = birlik + onlik;
//
//            if (yigindi > 12) {
//                System.out.println(i);
//            }
//        }

//
//        System.out.print("1 kg konfet narxini kiriting: ");
//        double narx1kg = scanner.nextDouble();
//
//
//        System.out.println("1.1 kg dan 2.0 kg gacha konfet narxlari:");
//        for (double kg = 1.1; kg <= 2.1; kg += 0.1) {
//            double narx = kg * narx1kg;
//            System.out.printf("%.1f kg konfet narxi: %.2f so'm\n", kg, narx);
//        }
//    }
//
//
//        System.out.print("N sonini kiriting (N > 1): ");
//        int N = scanner.nextInt();
//
//
//        if (N <= 1) {
//            System.out.println("N soni 1 dan katta bo'lishi kerak!");
//            return;
//        }
//
//        System.out.println("0 dan " + N + " gacha bo‘lgan sonlarning ildizlari:");
//
//
//        for (int i = 0; i <= N; i++) {
//            double ildiz = Math.sqrt(i);
//            System.out.printf("%d ning ildizi = %.4f\n", i, ildiz);
//        }
//
//        System.out.println("a= ");
//        int a = scanner.nextInt();
//
//        System.out.println("b= ");
//        int b = scanner.nextInt();
//
//
//        if (a >= b) {
//            System.out.println("Xatolik: a soni b sonidan kichik bo'lishi kerak (a < b)");
//        } else {
//            int natija = 1;
//
//            for (int i = a; i <= b; i++) {
//                natija = natija * i;
//            }
//
//            System.out.println("a dan b gacha bo‘lgan barcha sonlar ko‘paytmasi: " + natija);
//        }
//
//        System.out.print("1 kg konfet narxini kiriting: ");
//        double narx = scanner.nextDouble();
//
//        System.out.println("0.1 kg dan 1.0 kg gacha konfet narxlari:");
//
//        for (double ogirlik = 0.1; ogirlik <= 1.0; ogirlik += 0.1) {
//            double umumiyNarx = ogirlik * narx;
//            System.out.printf("%.1f kg konfet narxi: %.2f so'm\n", ogirlik, umumiyNarx);
//        }
//
//
//        System.out.print("Sonni kiriting: ");
//        int son = scanner.nextInt();
//
//
//        son = Math.abs(son);
//
//
//        if (son == 0) {
//            System.out.println("Bu son 1 xonali.");
//        } else {
//            int xonalar = 0;
//            while (son > 0) {
//                son = son / 10;
//                xonalar++;
//            }
//            System.out.println("Bu son " + xonalar + " xonali.");
//        }
//
//
//        System.out.print("a ni kiriting: ");         92-misol;
//        int a = scanner.nextInt();
//
//        System.out.print("b ni kiriting: ");
//        int b = scanner.nextInt();
//
//
//        for (int i = a + 1; i < b; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.print("n sonini kiriting: ");          93-misol;
//        int son = scanner.nextInt();
//
//        System.out.print("Teskari raqamlar: ");
//
//
//        if (son < 0) {
//            System.out.print("-");
//            son = Math.abs(son);
//        }
//
//
//        while (son > 0) {
//            int raqam = son % 10;
//            System.out.print(raqam);
//            son = son / 10;}
//
//        System.out.print("N sonini kiriting: ");      94-misol;
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(n);
//        }
//
//
//        System.out.print("n ni kiriting: ");
//        int n = scanner.nextInt();
//
//        double S = 1.0;
//
//        for (double i = 1; i <= n; i+=0.1) {                 //95-misol;
//            S *=   i;
//        }
//
//        System.out.printf("Natija: %.6f\n", S);
//
////
//
//        int son;
//        int sanovchi = 0;
//
//        System.out.println("Butun sonlarni kiriting (manfiy son kiritsangiz, dastur to‘xtaydi):");
//
//        while (true) {
//            son = scanner.nextInt();                   //96-misol;
//
//            if (son < 0) {
//                break;
//            }
//
//            if (son % 5 == 0) {
//                sanovchi++;
//            }
//        }
//
//        System.out.println("5 ga karrali sonlar soni: " + sanovchi);
//
////
//
//
//
//
//        System.out.print("Butun son kiriting: ");
//        int n = scanner.nextInt();
//
//
//        int absN = Math.abs(n);                   97-misol;
//
//        int raqamYigindisi = 0;
//        int raqamlarSoni = 0;
//
//
//        if (absN == 0) {
//            raqamlarSoni = 1;
//            raqamYigindisi = 0;
//        } else {
//            while (absN > 0) {
//                int raqam = absN % 10;
//                raqamYigindisi += raqam;
//                raqamlarSoni++;
//                absN /= 10;
//            }
//        }
//
//        System.out.println("Raqamlar yig'indisi: " + raqamYigindisi);
//        System.out.println("Raqamlar soni: " + raqamlarSoni);
//
//
//
//        System.out.print("Butun son kiriting: ");
//        int son = scanner.nextInt();
//
//        son = Math.abs(son);
//
//        boolean beshBor = false;
//
//        while (son > 0) {
//            int raqam = son % 10;           98-misol
//            if (raqam == 5) {
//                beshBor = true;
//                break;
//            }
//            son = son / 10;
//        }
//
//        if (beshBor) {
//            System.out.println("Bu sondagi raqamlarda 5 raqami bor.");
//        } else {
//            System.out.println("Bu sondagi raqamlarda 5 raqami yo'q.");
//        }
//

//
//        System.out.print("Butun son kiriting: ");
//        int son = scanner.nextInt();
//
//
//        if (son < 0) {
//            System.out.print("-");
//            son = -son;
//        }


//        System.out.print("Teskari tartibda: ");
//        if (son == 0) {
//            System.out.print(0);
//        } else {
//            while (son > 0) {
//                int raqam = son % 10;
//                System.out.print(raqam);
//                son = son / 10;
//            }
//        }
//
//
//        int n = 465215;               100-misol;
//        int k = 5;
//
//        if (k == 0) {
//            System.out.println("Error: k 0 ga teng bo'lishi mumkin emas.");
//            return;
//        }
//
//        int butunQism = 0;
//        int qoldiq = n;
//
//        while (qoldiq >= k) {
//            qoldiq = qoldiq - k;
//            butunQism++;
//        }
//
//        System.out.println("n = " + n + ", k = " + k);
//        System.out.println("Butun qism  = " + butunQism);
//        System.out.println("Qoldiq  = " + qoldiq);
//
//        System.out.println("sonni kiriting :");
//
//        int n = Math.abs(scanner.nextInt());            101-misol;
//        boolean bor = false;
//
//        while (n > 0) {
//            if ((n % 10) % 2 == 0) {
//                bor = true;
//                break;
//            }
//            n /= 10;
//        }
//
//        System.out.println(bor ? "Juft raqam bor" : "Juft raqam yo'q");
//
//
//        System.out.println("sonlarni kirting : ");
//        int N= scanner.nextInt();
//
//        for (int i = 1; i < N; i++) {               102-misol;
//            int count = 0;
//            while (count < i) {
//                System.out.print(i);
//                count++;
//            }
//            System.out.println();
//        }
//
//
//        int k = 1;
//        while (k <= N) {
//            System.out.print(k);
//            k++;
//        }

//        System.out.println("harifni kiriting : ");          103-misol;
//        int N = scanner.nextInt();

//        for (int i = 0; i < N; i++) {
//            char harf = (char)('A' + (N - 1 - i));
//            int soni = N - i;
//
//            for (int j = 0; j < soni; j++) {
//                System.out.print(harf);
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("sonni kiriting : ");           104-misol;
//        int N = scanner.nextInt();
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        System.out.println("sonni kiriting : ");
//        int N = scanner.nextInt();
//
//        for (int i = N; i >= 1; i--) {
//            for (int j = i; j <= N; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        System.out.println("n sonini kiriting :");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <i; j++) {
//                System.out.println("");
//
//            }
//            System.out.println(i);
//        }
//
//
//        System.out.println("n sonni kiriting :");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j<i ; j++) {
//                System.out.println("");
//
//            }
//            System.out.print(n-i);
//
//        }


//        System.out.println("n sonini kiriting : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < ; i++) {
//
//        }
//
//
//        System.out.print("Sonni kiriting: ");
//        int n = scanner.nextInt();
//
//        boolean tub = true;
//
//        if (n <= 1) {
//            tub = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    tub = false;
//                    break;
//                }
//            }
//        }
//
//        if (tub) {
//            System.out.println(n + " tub son.");
//        } else {
//            System.out.println(n + " tub emas.");
//
//
//
//        }
//
//
//        System.out.print("N ni kiriting: ");
//        int n = scanner.nextInt();
//
//        boolean murakkab = false;
//
//        if (n <= 1) {
//            System.out.println("Murakkab emas");
//        } else {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    murakkab = true;
//                    break;
//                }
//            }
//
//            if (murakkab) {
//                System.out.println("Murakkab son");
//            } else {
//                System.out.println("Murakkab son emas");
//            }
//        }
//


//        System.out.print("Son kiriting (masalan: 2): ");
//        int son = scanner.nextInt();
//
//        int i = 1;
//        System.out.println(son + " karra jadvali:");
//        while (i <= 10) {
//            System.out.println(son + " x " + i + " = " + (son * i));
//            i++;
//        }
//
//
//
//        System.out.println("sonni kiriting : ");
//        int son = scanner.nextInt();
//
//        while (son <= 10) {
//            int i = 1;
//
//            System.out.println(" " + son + " ning karra jadvali 2 ");
//
//
//            while (i <= 10) {
//                System.out.println(son + " x " + i + " = " + (son * i));
//                i++;
//            }
//
//            System.out.println();
//            son += 2;
//
//        }
//        System.out.print("Son kiriting (masalan: 2): ");
//        int son = scanner.nextInt();
//
//
//
//        while (son <= 8) {
//            System.out.println(son + " karra jadvali:");
//
//            int i = 1;
//            while (i <= 10) {
//                System.out.println(son + " x " + i + " = " + (son * i));
//                i++;
//            }
//
//            System.out.println();
//            son += 2;
//        }
//
//
//        System.out.println("n kiriting : ");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println("n kiriting :");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n; j++) {
//                if (i==0||i==n-1 || j==0 || j==n-1){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//        System.out.println("n kiritng : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0||i==n-1 || j==0 || j==n-1){
//                    System.out.println("*");
//                }else {
//                    System.out.println("");
//                }
//
//
//            }
//            System.out.println();
//        }
//        System.out.println("n kiriting :");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n; j++) {
//                if (i%2==0||j==n/2||j==0||j==n-1){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//        System.out.println("sonni kiriting : ");
//        int N = scanner.nextInt();
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//
//                if (j == 0 || j == N - 1 || i == N/2) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//
//        System.out.println("sonni kiriitng : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==j ||i+j==n-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print("");
//                }
//
//            }
//            System.out.println();
//
//
//        System.out.print("n sonini kiriting : ");
//        int n = scanner.nextInt();
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || i + j == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//       }

//        System.out.print("n sonini kiriting: ");
//        int n = scanner.nextInt();
//
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//
//        System.out.println("sonni kiriting : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = rd5
//            }

//        }

//
//        System.out.print("N sonini kiriting: ");
//        int N = scanner.nextInt();
//
//
//        for (int i = N; i >= 1; i--) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("sonni kiriting : ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//
//            for (int k = 0; k < n - i; k++) {
//                System.out.print("*");
//            }
//
//    }
//
//
//        System.out.println("sonni kiriting : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i+j>=4) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");               120-MISOL
//                }
//            }
//            System.out.println();

//        }

//
//        System.out.println("sonni kiriitng : ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j+i<=4){
//
//                    System.out.print("*");
//                }else {
//                    System.out.print("");
//                }
//            }
//            System.out.println();
//
//        }

//
//        System.out.print("n ni kiriting: ");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i ==j || i==n-1 || j==+1   ) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();


//        }


//
//        System.out.print("1-sonni kiriting: ");
//        int a = scanner.nextInt();
//
//        System.out.print("2-sonni kiriting: ");
//        int b = scanner.nextInt();

//
//
//        while (a != b) {
//            if (a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        }
//
//        System.out.println("EKUB = " + a);
//
//
//        System.out.println("sonni kiriting : ");
//        int son = scanner.nextInt();
//        int umumiy=0;
//
//        for (int i = 1; i <=son; i+=2) {
//            umumiy+=i*i;
//
//
//
//
//        }
//        System.out.println(umumiy);
//
//        int[] array =new int[]{1,5,15,-6,-9};
//
//        System.out.println("sonni kiriting : ");
//        int son = scanner.nextInt();
//
//        int musbatsonlar =0 ;
//        for (int i = 0; i <= son; i++) {
//         musbatsonlar++;
//
//        }if (son<=0){
//            System.out.println(array);
//        }

//
//      int nums [];
//      nums=new int [4];
//      int son []=new int [6];
//      nums=new int []{2,4,6,5};//nums [0]
//        System.out.println(nums[2]);
//
//
//        int[] array =new int[]{3,4,3,5,-9,7};
//        System.out.println("sonni kiriting : "+array[4]);
//        int summ=0;
//        for (int j : array) {
//            if (j > 0) {
//                summ++;
//            }
//        }
//        System.out.println(summ);
//
//        int[]massiv = new int[5];
//        massiv[0]=3;
//        massiv[1]=-9;
//        massiv[4]=5;


//        System.out.print("n ni kiriting: ");
//        int n = scanner.nextInt();
//
//       int summ = 0;
//
//        for (int i = 1; i <= n; i++) {
//            summ += 1 / i;
//        }
//
//        System.out.println(" S = " + summ);

        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();



        for (int i = a; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);


            }
        }

            
        }
    }

