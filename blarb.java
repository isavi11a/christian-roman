import java.util.Scanner;

class blarb {

  public static String intToRoman() {
  String s = " ";
  Scanner scan = new Scanner(System.in);
    
  System.out.println("hey dude enter a number and it will become a ROMAN NUMBERAL!!! ");
  int input = scan.nextInt();
    //its -= because it has to subtract the value after it replaces it with the roman numeral!! and then it goes again again
    while (input >= 1000) {
      s += "M";
      input -= 1000;
    }
    while (input >= 500) {
      s += "D";
      input -= 500;
    }
    while (input >= 400) {
      s += "CD";
      input -= 400;
    }
    while (input >= 100) {
      s += "C";
      input -= 100;
    }
    while (input >= 90) {
      s += "XC";
      input -= 90;
    }
    while (input >= 50) {
      s += "L";
      input -= 50;
    }
    while (input >= 40) {
      s += "XL";
      input -= 40;
    }
    while (input >= 10) {
      s += "X";
      input -= 10;
    }
    while (input >= 9) {
      s += "IX";
      input -= 9;
    }
    while (input >= 5) {
      s += "V";
      input -= 5;
    }
    while (input >= 4) {
      s += "IV";
      input -= 4;
    }
    while (input >= 1) {
      s += "I";
      input -= 1;
    }
    return s;
  }
}