package checkgoodnessusingerrorcalculation;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class CheckGoodnessUsingErrorCalculation {

    public static void main(String[] args) {
        System.out.println("x:{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "y:{1,4,2,5,2,1,5,3,2,5,2,3,2,4,2,3,4,1,3,4}\n"
                + "yp:{3,4,2,5,3,6,3,2,4,2,5,3,2,4,5,2,3,2,4,3}\n"
                + "Goodness of Fit::" + calculateGoodNessOfFit(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, new int[]{1, 4, 2, 5, 2, 1, 5, 3, 2, 5, 2, 3, 2, 4, 2, 3, 4, 1, 3, 4}, new int[]{3, 4, 2, 5, 3, 6, 3, 2, 4, 2, 5, 3, 2, 4, 5, 2, 3, 2, 4, 3}));
        System.out.println("x:{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "y:{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}\n"
                + "yp:{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}\n"
                + "Goodness of Fit::" + calculateGoodNessOfFit(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1}, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}));

    }

    private static float calculateGoodNessOfFit(int[] x, int[] y, int[] yp) {
        if (y.length != yp.length) {
            return 0;
        }
        float xbar = findMean(x);
        float ybar = findMean(y);
        float ypbar = findMean(yp);
        float numeratorOfmean = 0;
        float denomenatorOfmean = 0;
        float numeratorOfmeanPredicted = 0;
        float denomenatorOfmeanPredicted = 0;
        for (int i = 0; i < y.length; i++) {
            numeratorOfmean += (((float) x[i] - xbar) * ((float) y[i] - ybar));
            denomenatorOfmean += (((float) x[i] - xbar) * ((float) x[i] - xbar));
            numeratorOfmeanPredicted += (((float) x[i] - xbar) * ((float) yp[i] - ypbar));
            denomenatorOfmeanPredicted += (((float) x[i] - xbar) * ((float) x[i] - xbar));
        }
        float mean = numeratorOfmean / denomenatorOfmean;
        float meanPredicted = numeratorOfmeanPredicted / denomenatorOfmeanPredicted;
        float c = ybar - mean * xbar;
        float cp = ypbar - meanPredicted * xbar;
        System.out.println("y = " + mean + "x + (" + c + ")");
        System.out.println("y = " + meanPredicted + "x + (" + cp + ")");
        return 0;

    }

    private static float findMean(int[] y) {
        float sum = 0;
        for (int i = 0; i < y.length; i++) {
            sum += y[i];
        }
        return (sum / (y.length));
    }
}
