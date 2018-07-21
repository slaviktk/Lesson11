public class lesson12 {
    public static void main(String[] args) {
        int[] appleKorzina = new int[4];
        appleKorzina[0] = 100;
        appleKorzina[1] = 200;
        appleKorzina[2] = 300;
        appleKorzina[3] = 400;

        int ves = 0;
        for (int i = 0; i < appleKorzina.length; i++) {
            ves += appleKorzina[i];
            System.out.println(String.format("'%d' -> '%d' -> '%d'", i + 1, appleKorzina[i], ves));
        }
        System.out.println();
        System.out.println("Средний вес = " + 1.0 * ves / appleKorzina.length);
        System.out.println();
        int S = sumArray(appleKorzina);
        int C = arrayCount(appleKorzina);
        printArray(appleKorzina);
        arrayDecrease(appleKorzina, 15);
        printArray(appleKorzina);
        arrayIncrease(appleKorzina, 20);
        printArray(appleKorzina);//Вызываем функцию которая нам выведет массив
        System.out.println();
        System.out.println( "Средний вес яблок = " + S / C);
        System.out.println();
    }

    public static int sumArray(int[] A) {//объявляем функцию которая будет считать колиличество элементов в массиве
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static int arrayCount(int[] A) {              //
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] A) {            //Функция которая выводит весь массив на экран
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("]");
    }

    public static void arrayDecrease(int [] A, int decreaseValue) {    //Функция которая отнимает от каждого элемента массива заданное число
        for (int i = 0; i < A.length; i++){
            A[i] = A[i] - decreaseValue;
        }

    }
    public static void arrayIncrease(int [] A, int increaseValue) {    //Функция которая прибавляет к каждому элементу массива заданное число
        for (int i = 0; i < A.length; i++){
            A[i] = A[i] + increaseValue;
        }

    }
}
