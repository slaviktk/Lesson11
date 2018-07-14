public class lesson11 {
    public static void main (String [] args) {
        String p1 = "Java";
        String p2 = "Dont worry by happy";
        String p3 = "Help my please";
        String p4 = "Give our money";
        System.out.println(p1.contains("YZ"));
        printA(5);
        printStr(p1);
        printStr(p1.toUpperCase());
        printStr(p2.toLowerCase());
        printStr(p4.replace("money", "$$$"));
        printABC(30,20,40);
        printStr (doubleStr(p4));
        sumAndPrint(5, 10);
        sliceStr("abcd");
    }
    public static void printA(int A) {
        String S = String.format("int A = %d",A);
                System.out.println(S);
    }
    public static void printStr(String A){
        String S = String.format("String A = '%s'",A);
                System.out.println(S);
    }
    public static void printABC(int A, int B, int C) {
        String S = String.format("int A = %d, int B = %d, int C = %d",A,B,C);
        System.out.println(S);
    }
    public static String doubleStr(String A){
        return String.format("int A = %s%s", A,A);
    }
    public static void sumAndPrint (int a, int b){
        String S =  String.format("%d+%d=%d",a,b,a+b);
        System.out.println(S);
    }
    public static void sliceStr(String a){
        String S = a.substring(a.length()/2);
        System.out.println(S);
    }
}
