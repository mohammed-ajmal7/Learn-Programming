class square9 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print("a" + " ");
                } else {
                    System.out.print("b" + " ");
                }
            }
            System.out.println();
        }
    }
}