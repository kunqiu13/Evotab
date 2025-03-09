public class Main1_3 {
    public static void main(String[] args) {
        int[] array = {3, 6, 3, 7, 12, 15, 12, 8, 5, 6, 7, 8, 9, 12, 3, 15, 8, 13, 14, 1};
        System.out.print('[');
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[19]);
        System.out.println(']');

        int[] count = new int[16];
        for (int k = 0; k < array.length; k++) {
            int x = array[k];
            count[x]++;
        }
        for (int s = 1; s < count.length; s++) {
            if (count[s] > 1) {
                System.out.println("Число '" + s + "' встречается " + count[s] + " раза");
            }
        }
    }
}
