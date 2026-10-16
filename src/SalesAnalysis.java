public class SalesAnalysis {

    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        double[] salesChange = {
                12, -8, 15, 18, -22, 10,
                14, -5, 20, 8, -25, 6
        };

        analyzeSales(months, salesChange);
    }

    public static void analyzeSales(String[] months, double[] salesChange) {
        double maxCombinedChange = Double.NEGATIVE_INFINITY;
        int bestStartIndex = -1;
        int bestEndIndex = -1;

        for (int startPosition = 0; startPosition < salesChange.length; startPosition++) {
            double currentWindowSum = 0;

            for (int endPosition = startPosition; endPosition < salesChange.length; endPosition++) {
                currentWindowSum += salesChange[endPosition];

                if (currentWindowSum > maxCombinedChange) {
                    maxCombinedChange = currentWindowSum;
                    bestStartIndex = startPosition;
                    bestEndIndex = endPosition;
                }
            }
        }
        displayResults(months[bestStartIndex], months[bestEndIndex], maxCombinedChange);
    }

    public static void displayResults(String startMonth, String endMonth, double totalChange) {
        System.out.println("---Sales Analysis---");
        System.out.println("Start Month: " + startMonth);
        System.out.println("End Month:   " + endMonth);
        System.out.println("Total Sales Change: " + totalChange + " million");
    }
}
