public class SquareRootSolution {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        int left = 1;
        int right = x;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left - 1;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
}
