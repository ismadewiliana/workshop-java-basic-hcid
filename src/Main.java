//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Biodata{
    String nama;
    String hobi;
    int umur;

    Biodata(String nama, String hobi, int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    // tipe function ada public dan private,
    // jika menggunakan public maka fungsi tersebut bisa di gunakan dimana saja (diluar class Biodata) dan memberikan return sebuah nilai
    // sedangkan private, fungsi tsb akan hanya bisa dipanggil dan digunakan hanya di dalam class tersebut (class Biodata)

    public static int nilai() {
        return 100;
    }

    public static void logic(int a) {
        if (a == 10) {
            System.out.println(a);
        }
    }

    void menyapa() {
        System.out.println("Nama : "+nama);
    }
}

public class Main {
    public static void calculator (int a, int b, char operator) {
        if (operator == '+') {
            System.out.println("Total: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Total: " + (a - b));
        } else if (operator == 'x') {
            System.out.println("Total: " + (a * b));
        } else if (operator == ':') {
            System.out.println("Total: " + (a / b));
        } else if (operator == '%') {
            System.out.println("Total: " + (a % b));
        } else {
            System.out.println("Coba masukin operator yang benar");
        }
    }
    public static void main(String[] args) {
//        Tipe Data
//        System.out.println("Hello World");
//
//        String name = "Princess Isma";
//        System.out.println(name);
//        System.out.println("Name saye: " + name);
//
//        int a = 25;
//        int b = 6;
//        int minus = a - b;
//        int multiple = a * b;
//        int devide = a / b;
//
//        System.out.println(a + b);
//        System.out.println(a % b);
//        System.out.println(minus);
//        System.out.println(multiple);
//        System.out.println(devide);

        // Operator logika atau, dan & bukan
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);

//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        System.out.println(!true);
//        System.out.println(!false);

//        System.out.println(false && (true || !false));

        // < > == <= >=
//        int a = 30;
//        int b = 36;
//
//        System.out.println(a < b);
//        System.out.println(a == b);
//        System.out.println(a > b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);

        // Condition case
//        int saldo = 5000;
//        int tarik = 1002 ;
//
//        if ( tarik > 1000 && tarik <= saldo ) {
//            System.out.println("Saldo suficiente, tax 10%");
//        } else if( tarik <= saldo ) {
//            System.out.println("Saldo suficiente");
//        } else {
//            System.out.println("Saldo insuficiente");
//        }
//
//        int number = 0;
//        while ( number <= 10 ){
//            System.out.println(number);
//            number += 1;
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Looping " + i);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nama kamu siapa? ");
//        String nama = scanner.nextLine();
//
//        System.out.println("Oh Halo " + nama + "!");
////        System.out.println(nama = "isma");
//        if (nama.equals("isma")) {
//            System.out.println("Salam kenal!");
//        } else {
//            System.out.println("Ewh, kita beda kasta. beda segalanya");
//        }
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        char y = "Y".charAt(0);
//
//        while (y == "Y".charAt(0)) {
//            System.out.print("Input nilai A: ");
//            int a = scanner.nextInt();
//
//            System.out.print("Input nilai B: ");
//            int b = scanner.nextInt();
//
//            System.out.print("Input Operator: ");
//            char operator = scanner.next().charAt(0);
//
//            calculator(a, b, operator);
//
//            System.out.println("Lanjot? (Y/N)");
//            y = scanner.next().charAt(0);
//        }
//
//        scanner.close();

        Biodata dataSaya = new Biodata("Isma","Makan",28);

        dataSaya.menyapa();
        System.out.println(dataSaya.umur);
    }
}