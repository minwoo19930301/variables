
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] a = {3};
        int[] b = {4};

        a=b;
        a[0] = 5;
        System.out.println(b[0]);

    }
}