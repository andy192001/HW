public class Main {

    public static int[] array;

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

    // Потрібно розвернути елементи в обратну сторону
    // Приклад 2, 4, 3, 8 -> 8, 3, 4, 2
    public static void reverseArray(){

    }

    // Цей метод повинен повертати суму негативних чисел в масиві
    // Приклад -2, 4, -3, 8 -> -5
    public static int findSumOfNegative(){
        return 0;
    }

    // Це мабуть самий складний метод, але самий цікавий)
    // Потірбно зі строки чисел через пробіл, зробити масив чисел
    // PS. дивись перетворення типів
    public static void insertArrayFromString(String data){

    }


    // Приклад методу, це метод чисто для тебе, тут не потрібно нічого писати)
    public static void print(){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
