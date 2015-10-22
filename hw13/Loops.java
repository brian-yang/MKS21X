public class Loops {
    public static void main(String[] args) {
        /*
        // Problem 1
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        for (i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
--------------------------------------------------
--------------------------------------------------
        // Problem 2
        int j= 2;
        while (j<= 20) {
            System.out.print(j+ " ");
            j+= 2;
        }

        for (j= 2; j<= 20; j+=2) {
            System.out.print(j+ " ");
        }
--------------------------------------------------
--------------------------------------------------
        // Problem 3
        int k = 3;
        while (k<= 20) {
            System.out.print(k+ " ");
            k+=3;
        }

        for (k = 3; k<= 20; k+=3) {
            System.out.print(k+ " ");
        }
--------------------------------------------------
--------------------------------------------------
        // Problem 4
        int l= 1;
        while (l<= 20) {
            System.out.print(Math.pow(l, 2) + " ");
            l+=2;
        }

        for (l= 1; l<= 20; l+=2) {
            System.out.print(Math.pow(l, 2) + " ");
        }
--------------------------------------------------
--------------------------------------------------
        // Problem 5
        int m = 1;
        while (m <= 20) {
            if (m != 20) {
                System.out.print(m + " + ");
            } else {
                System.out.print(m);
            }
            m += 1;
        }
        System.out.println();

        for (m = 1; m <= 20; m+=1) {
            if (m != 20) {
                System.out.print(m + " + ");
            } else {
                System.out.print(m);
            }
        }
        System.out.println();
--------------------------------------------------
--------------------------------------------------
        // Problem 6
        int n = 1;
        int sum = 0;
        while (n <= 20) {
            sum += n;
            System.out.print(sum + " ");
            n += 2;
        }
        System.out.println();

        sum = 0;
        for (n = 1; n <= 20; n += 2) {
            sum += n;
            System.out.print(sum + " ");
        }
        System.out.println();
--------------------------------------------------
--------------------------------------------------
        // Problem 7
        int n = 1;
        double sum = 0;
        while (n <= 20) {
            sum += (1 / Math.pow(3, n)); // Needs to be a double
            if (n != 20) {
                System.out.print("1/" + Math.pow(3, n) + " + ");
            } else {
                System.out.print("1/" + Math.pow(3, n) + " ");
            }
            n += 1;
        }
        System.out.print(sum + "\n");

        sum = 0;
        for (n = 1; n <= 20; n += 1) {
            sum += (1 / Math.pow(3, n)); // Needs to be a double
            if (n != 20) {
                System.out.print("1/" + Math.pow(3, n) + " + ");
            } else {
                System.out.print("1/" + Math.pow(3, n) + " ");
            }
        }
        System.out.print(sum + "\n");
--------------------------------------------------
--------------------------------------------------
        */

        // Problem 8
        int n = 1;
        double sum = 0;
        while (n <= 20) {
            sum += (1 / (Math.pow(n, 3)));
            if (n != 20) {
                System.out.print("1/" + n + "^3 + ");
            } else {
                System.out.print("1/" + n + "^3 ");
            }
            n += 1;
        }
        System.out.print(sum + "\n");

        sum = 0;
        for (n = 1; n <= 20; n += 1) {
            sum += (1 / (Math.pow(n, 3)));
            if (n != 20) {
                System.out.print("1/" + n + "^3 + ");
            } else {
                System.out.print("1/" + n + "^3 ");
            }
        }
        System.out.print(sum + "\n");

    }
}
