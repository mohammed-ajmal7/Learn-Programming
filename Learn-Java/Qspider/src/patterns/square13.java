class square13 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) { // how many time i want to repeat the line
            for (int j = 0; j < n; j++) { // how many times i want to repeat the letter inside it

                if (i == n / 2 || j == n / 2) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(); // move to the next line after the line
        }

    }
}