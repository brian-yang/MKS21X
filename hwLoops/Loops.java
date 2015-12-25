public class Loops {
    public static void main(String[] args) {
        // Problem 1
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        for (i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
	System.out.println();

        // Problem 2
        int j = 2;
        while (j<= 20) {
            System.out.print(j + " ");
            j += 2;
        }
	System.out.println();

        for (j = 2; j <= 20; j += 2) {
            System.out.print(j+ " ");
        }
	System.out.println();

        // Problem 3
        int k = 3;
        while (k <= 20) {
            System.out.print(k+ " ");
            k += 3;
        }
	System.out.println();

        for (k = 3; k <= 20; k += 3) {
            System.out.print(k+ " ");
        }
	System.out.println();

        // Problem 4
        int l= 1;
        while (l<= 20) {
            System.out.print(Math.pow(l, 2) + " ");
            l+=2;
        }
	System.out.println();

        for (l= 1; l<= 20; l+=2) {
            System.out.print(Math.pow(l, 2) + " ");
        }
	System.out.println();

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

        // Problem 7
        int z = 1;
        double sum1 = 0;
        while (z <= 20) {
            sum1 += (1 / Math.pow(3, z)); // Needs to be a double
            if (z != 20) {
                System.out.print("1/" + Math.pow(3, z) + " + ");
            } else {
                System.out.print("1/" + Math.pow(3, z) + " ");
            }
            z += 1;
        }
        System.out.print(sum1 + "\n");

        sum1 = 0;
        for (z = 1; z <= 20; z += 1) {
            sum1 += (1 / Math.pow(3, z)); // Needs to be a double
            if (z != 20) {
                System.out.print("1/" + Math.pow(3, z) + " + ");
            } else {
                System.out.print("1/" + Math.pow(3, z) + " ");
            }
        }
        System.out.print(sum1 + "\n");

        // Problem 8
        int p = 1;
        double sum2 = 0;
        while (p <= 20) {
            sum2 += (1 / (10.0 * p + 3));
            if (p != 20) {
                System.out.print("1/" + p + "^3 + ");
            } else {
                System.out.print("1/" + p + "^3 ");
            }
            p += 1;
        }
        System.out.print(sum2 + "\n");

        sum2 = 0;
        for (p = 1; p <= 20; p += 1) {
            sum2 += (1 / (10.0 * p + 3));
            if (p != 20) {
                System.out.print("1/" + p + "^3 + ");
            } else {
                System.out.print("1/" + p + "^3 ");
            }
        }
        System.out.print(sum2 + "\n");

    }
}
