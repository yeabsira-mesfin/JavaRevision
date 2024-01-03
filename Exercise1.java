/**
 * Exercise1
 */
public class Exercise1 {

    public static void main(String[] args) {
        int[] array = {4,56,90,2};
        Exercise1 obj = new Exercise1();
        int result = obj.largestAdjacentSum(array);
        System.out.println("The largest sum value is " + result);
    }
    public int largestAdjacentSum(int[ ] a){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<a.length-1;i++){
            
            int sum = a[i] + a[i+1];
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

}