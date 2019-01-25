package goodnessoffit;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class GoodnessOfFit {

    public static void main(String[] args) {
        System.out.println("x:{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "y:{1,4,2,5,2,1,5,3,2,5,2,3,2,4,2,3,4,1,3,4}\n"
                + "yp:{3,4,2,5,3,6,3,2,4,2,5,3,2,4,5,2,3,2,4,3}\n"
                + "Goodness of Fit::" + calculateGoodNessOfFit(new int[]{1, 4, 2, 5, 2, 1, 5, 3, 2, 5, 2, 3, 2, 4, 2, 3, 4, 1, 3, 4}, new int[]{3, 4, 2, 5, 3, 6, 3, 2, 4, 2, 5, 3, 2, 4, 5, 2, 3, 2, 4, 3}));
        System.out.println("x:{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "y:{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}\n"
                + "yp:{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}\n"
                + "Goodness of Fit::" + calculateGoodNessOfFit(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1}, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}));

    }

    private static float calculateGoodNessOfFit(int[] y, int[] yp) {
        if (y.length != yp.length) {
            return 0;
        }
        float ybar = findMean(y);
        float numerator = 0;
        float denomenator = 0;
        for (int i = 0; i < y.length; i++) {
            numerator += (((float) yp[i] - ybar) * ((float) yp[i] - ybar));
            denomenator += (((float) y[i] - ybar) * ((float) y[i] - ybar));
        }
        return (numerator / denomenator);
    }

    private static float findMean(int[] y) {
        float sum = 0;
        for (int i = 0; i < y.length; i++) {
            sum += y[i];
        }
        return (sum / (y.length));
    }
}
