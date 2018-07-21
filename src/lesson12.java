public class lesson12 {
    public static void main (String [] args){
        int [] appleKorzina = new int[5];
        appleKorzina [0] = 200;
        appleKorzina [1] = 100;
        appleKorzina [2] = 250;
        appleKorzina [3] = 175;
        appleKorzina [4] = 125;

        int ves = 0;
        for(int i=0;i<appleKorzina.length;i++){
            ves += appleKorzina[i];
            System.out.println(String.format("'%d' -> '%d' -> '%d'",i + 1,appleKorzina[i], ves));
            }
            System.out.println("Общий вес = " + 1.0 * ves / appleKorzina.length);
    }
    public static int sumArray(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
        public static int arrayCount (int[] A) {
            for (int i = 0; i < A.length; i++) {
                System.out.println(i + 1);
            }
            return 0;
        }
}
