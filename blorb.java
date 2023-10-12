import java.util.Scanner;

class blorb {
    static private int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static int strToNumb() {
        Scanner scan = new Scanner(System.in);
        int t = 0;
        String input = "";
        System.out.println("ok dude now enter a roman numberal that will be converted into a number(USE ALL CAPS) ");
        input = scan.next();
//res is short for results did you know that
        int res = 0;

        for (int i = 0; i < input.length(); i++) {

            int s1 = value(input.charAt(i));
          if (s1 == -1) {
    System.out.println("this do not exist");
    return -1;
}

            if (i + 1 < input.length()) {
                int s2 = value(input.charAt(i + 1));

                if (s1 >= s2) {

                    res = res + s1;
                } else {

                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }
}