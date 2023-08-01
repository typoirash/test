import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;


public class Main {
   public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
       calc(b);
   }

    public static String calc(String input) throws IOException {
        String ret = new String();
        String[] vvod = input.split(" ");
        String[] rimvvod = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        if (vvod.length == 3) {
            if ((Arrays.asList(rimvvod).contains(vvod[0])) && (Arrays.asList(rimvvod).contains(vvod[2]))) {
                Rimlian rimlian1 = Rimlian.valueOf(vvod[0]);
                Rimlian rimlian2 = Rimlian.valueOf(vvod[2]);
                int arabic1 = rimlian1.getArab();
                int arabic2 = rimlian2.getArab();
               
                switch (vvod[1]) {

                    case "+":
                        int out1 = arabic1 + arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            //int end[] = new int[2];
                            //System.out.println(out1);
                            //System.out.println(perevod.getArab());
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                }
                            }else {
                                throw new IOException();
                            }
                        }
                        break;
                    case "-":
                        out1 = arabic1 - arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                }
                            }else {
                                throw new IOException();
                            }
                        }
                        break;
                    case "*":
                        out1 = arabic1 * arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                } 
                            }else {
                                throw new IOException();
                            }
                        }
                        break;
                    case "/":
                        out1 = arabic1 / arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                }
                            }else {
                                throw new IOException();
                            }
                        }
                        break;
                    default:
                        System.out.println("Выраженеи введено неправильно");
                }
            }else if((Integer.parseInt(vvod[0]) > 0) && (Integer.parseInt(vvod[0]) < 11) && (Integer.parseInt(vvod[2]) > 0) && (Integer.parseInt(vvod[2]) < 11)) {
                switch (vvod[1]) {

                    case "+":
                        int out1 = Integer.parseInt(vvod[0]) + Integer.parseInt(vvod[2]);
                        System.out.println(out1);
                        //calc(out);
                        break;
                    case "-":
                        out1 = Integer.parseInt(vvod[0]) - Integer.parseInt(vvod[2]);
                        System.out.println(out1);
                        //calc(out);
                        break;
                    case "*":
                        out1 = Integer.parseInt(vvod[0]) * Integer.parseInt(vvod[2]);
                        System.out.println(out1);
                        // calc(out);
                        break;
                    case "/":
                        out1 = Integer.parseInt(vvod[0]) / Integer.parseInt(vvod[2]);
                        System.out.println(out1);
                        //calc(out);
                        break;
                    default:
                        System.out.println("Выраженеи введено неправильно");
                }
            } else if ((Integer.parseInt(vvod[0]) <= 0) || (Integer.parseInt(vvod[0]) >= 11) || (Integer.parseInt(vvod[2]) <= 0) || (Integer.parseInt(vvod[2]) >= 11)) {
                throw new IOException();
            }
        }else {
            throw new IOException();
        }
        return ret;
    }
}
