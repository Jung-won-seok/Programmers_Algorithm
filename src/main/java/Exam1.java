import java.util.ArrayList;
import java.util.Arrays;

public class Exam1 {
    static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        //src[] 를 복사해서 dest[]에 붙여넣는다. srcPos부터 length까지 복사해서 destPos에 붙여넣는다.
        // arraycopy(a, 1, c, 3, 5)
        //arraycopy(a, 3, c, 1, 5)
        //arraycopy(b, 4, b, 2, 5)
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = srcPos; i < srcPos+length; i++) { //1~6
            arr.add(src[i]);
        }
        int x = 0;
        for (int i = destPos; i < destPos+length; i++) {
            dest[i] = arr.get(x);
            x++;
        }

    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = a.clone();
        int[] c = new int[a.length];
        int[] d = new int[a.length];

        // 1-1 서로 다른 배열로 복사(5)
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("c : " + Arrays.toString(c));
        System.out.println("d : " + Arrays.toString(d));
        System.out.println("System.arraycopy(a, 1, c, 3, 5)");
        arraycopy(a, 1, c, 3, 5);
        System.out.println("c : " + Arrays.toString(c));
        System.out.println("arraycopy(b, 1, d, 3, 5)");
        System.arraycopy(b, 1, d, 3, 5);
        System.out.println("d : " + Arrays.toString(d));
        System.out.println("Arrays.equals(c, d) = " + Arrays.equals(c, d));

        // 1-2 같은 배열로 복사(5)
        System.out.println("System.arraycopy(a, 1, a, 3, 5)");
        System.arraycopy(a, 1, a, 3, 5);
        System.out.println("arraycopy(b, 1, b, 3, 5)");
        arraycopy(b, 1, b, 3, 5);
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
        System.out.println("System.arraycopy(a, 4, a, 2, 5)");
        System.arraycopy(a, 4, a, 2, 5);
        System.out.println("arraycopy(b, 4, b, 2, 5)");
        arraycopy(b, 4, b, 2, 5);
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
    }
}