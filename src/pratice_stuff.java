import java.util.Arrays;




public class pratice_stuff {
    public static void main(String[] args) {
        int[] arrayOne = {
                1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456,};

        String [] arrayTwo = {
                "java", "python", "PHP", "C#",
                "C Programming", "C++"
        };
        System.out.println("OG numbers array: " + Arrays.toString(arrayOne));
        Arrays.sort(arrayOne);
        System.out.println("Sorted Numbers array: " + Arrays.toString(arrayOne));

        System.out.println("OG String array: " + Arrays.toString(arrayTwo));
        System.out.println("Sorted String array: " + Arrays.toString(arrayTwo));
    }
}
