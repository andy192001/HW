import java.util.Arrays;

public class Test {

    public void testReverse(){
        Main.array = new int[] {2, 4, 3, 8};
        int[] arr = Main.array;

        Main.reverseArray();

        if (Arrays.equals(arr, new int[]{8, 3, 4, 2}))
            System.out.println("You good!");
        else
            System.out.println("Hmm, something wrong(");
    }

    public void testFindSumOfNegative(){
        Main.array = new int[] {-2, 4, -3, 8};
        int[] arr = Main.array;

        int sum = Main.findSumOfNegative();

        if (sum == -5)
            System.out.println("You good!");
        else
            System.out.println("Hmm, something wrong(");
    }

    public void testInsertArrayFromString(){
        Main.array = null;

        String data = "2 3 6 4 8";
        Main.insertArrayFromString(data);

        if (Arrays.equals(Main.array, new int[]{2, 3, 6, 4, 8}))
            System.out.println("You good!");
        else
            System.out.println("Hmm, something wrong(");
    }

    public void run() {
        testReverse();
        testFindSumOfNegative();
        testInsertArrayFromString();
    }
}
