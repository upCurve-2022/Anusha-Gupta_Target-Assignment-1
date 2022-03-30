public class String_1 {
    public static void check(Object x, Object y) {
        if (x == y) {
            System.out.println("same references");

        } else {
            System.out.println("different references");
        }
    }
    public static void main(String[] args) {
        String st1 = "Target";
        String st2 = "Target";
        System.out.println("Before Modification");
        check(st1, st2);
        st1 += "target";
        System.out.println("After Modification");
        check(st1, st2);
    }
}
