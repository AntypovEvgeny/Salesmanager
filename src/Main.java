public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{500, 600, 200});

        System.out.println(salesManager.max());
        System.out.println(salesManager.average());
    }
}