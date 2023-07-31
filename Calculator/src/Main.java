import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;



public class Main {
   public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
      // System.out.println(b);
       //System.out.println(calc(b));
       calc(b);
   }


    public static String calc(String input) throws IOException {
        //System.out.println(input);
        String ret = new String();
        //ret = input;
        String[] vvod = input.split(" ");
        String[] rimvvod = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        if (vvod.length == 3) {
            //System.out.println(vvod[0]);
            //System.out.println(vvod[1]);
            //System.out.println(vvod[2]);

            if ((Arrays.asList(rimvvod).contains(vvod[0])) && (Arrays.asList(rimvvod).contains(vvod[2]))) {

                Rimlian rimlian1 = Rimlian.valueOf(vvod[0]);
                Rimlian rimlian2 = Rimlian.valueOf(vvod[2]);
               // System.out.println(rimlian1);
                //System.out.println(rimlian2);
                int arabic1 = rimlian1.getArab();
                int arabic2 = rimlian2.getArab();
                //System.out.println(arabic1);
                //System.out.println(arabic2);
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
                                } /*else {throw new IOException();}*/
                                    /*if (out1 > 10) {
                                    end[0] = out1 / 10;
                                    end[1] = out1 % 10;
                                    switch (end[0]) {

                                        case 2:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 3:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 4:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XL" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 5:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("L" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 6:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 7:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 8:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 9:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XC" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        default:

                                    }
                                }*/
                            }else {
                                throw new IOException();
                            }
                        }
                        //otvet(out1);
                        break;
                    case "-":
                        out1 = arabic1 - arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            //int end[] = new int[2];
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                }/* else {throw new IOException();}*/
                                    /*if (out1 > 10) {
                                    end[0] = out1 / 10;
                                    end[1] = out1 % 10;
                                    switch (end[0]) {

                                        case 2:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 3:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 4:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XL" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 5:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("L" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 6:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 7:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 8:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 9:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XC" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        default:

                                    }
                                }*/
                            }else {
                                throw new IOException();
                            }


                        }
                        //otvet(out1);
                        break;
                    case "*":
                        out1 = arabic1 * arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            //int end[] = new int[2];
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                } /*else {throw new IOException();}*/
                                    /*if (out1 > 10) {
                                    end[0] = out1 / 10;
                                    end[1] = out1 % 10;
                                    switch (end[0]) {

                                        case 2:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 3:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 4:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XL" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 5:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("L" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 6:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 7:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 8:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 9:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XC" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        default:

                                    }
                                }*/
                            }else {
                                throw new IOException();
                            }


                        }
                        //otvet(out1);
                        break;
                    case "/":
                        out1 = arabic1 / arabic2;
                        for (Rimlian perevod: Rimlian.values()) {  //перебор с Инам
                            //int end[] = new int[2];
                            if(out1 > 0 ) {
                                if (perevod.getArab() == out1) {
                                    System.out.println(perevod.toString());
                                    break;
                                }/* else {throw new IOException();}*/
                                    /*if (out1 > 10) {
                                    end[0] = out1 / 10;
                                    end[1] = out1 % 10;
                                    switch (end[0]) {

                                        case 2:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 3:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 4:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XL" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 5:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("L" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 6:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 7:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 8:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("LXXX" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        case 9:
                                            if (perevod.getArab() == end[1]) {
                                                System.out.println("XC" + perevod.toString());
                                                break;
                                            }
                                            break;

                                        default:

                                    }
                                }*/
                            }else {
                                throw new IOException();
                            }


                        }
                        //otvet(out1);
                        break;
                    default:
                        System.out.println("Выраженеи введено неправильно");
                }
                // System.out.println(arabic1);
                //System.out.println(arabic2);
                //Arab arabica = new Arab();

                //System.out.println("Good");

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
