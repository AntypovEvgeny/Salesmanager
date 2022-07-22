public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {
        int sum = 0;
        if (sales.length >= 3) {
            for (int sale : sales) {
                sum += sale;
            }
        }
        return (sum - max() - min()) / (sales.length - 2);
    }
}