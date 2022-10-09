public class MassSort {

    public void miniSort() {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] miniArray : array) {
            int counetr = 0;
            for (int j : miniArray) {
                if (counetr < miniArray.length - 1) {
                    System.out.print(j + ",");
                } else {
                    System.out.print(j + "}");
                }
                counetr++;
            }
            System.out.println();
        }
    }

}
