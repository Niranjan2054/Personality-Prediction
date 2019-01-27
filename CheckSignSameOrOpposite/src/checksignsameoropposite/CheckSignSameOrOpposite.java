package checksignsameoropposite;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class CheckSignSameOrOpposite {

    public static void main(String[] args) {
        System.out.println("1 & 2  has " + checkSign(1, 2));
        System.out.println("1 & -1  has " + checkSign(1, -1));
        System.out.println("1 & 0  has " + checkSign(1, 0));
        System.out.println("0 & 0  has " + checkSign(0, 0));
        System.out.println("-5 & 3  has " + checkSign(-5, 3));
        System.out.println("-1 & -1 has " + checkSign(-1, -1));
    }

    private static String checkSign(int a, int b) {
        if ((a ^ b) >= 0) {
            return "Same Sign";
        } else {
            return "Opposite Sign";
        }
    }
}
