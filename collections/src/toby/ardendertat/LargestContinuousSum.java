package toby.ardendertat;

public class LargestContinuousSum {

  public static int largestSum(int[] sequence) {

    if (sequence == null || sequence.length == 0) {
      return 0;
    }
    // first digit will be initial largest sum
    int currSum = sequence[0];
    int maxSum = currSum;
    
    for (int i = 1; i < sequence.length; i++) {
      if (currSum < 0) {
        currSum = sequence[i];
      } else {
        currSum += sequence[i];
      }
      if (currSum > maxSum) {
        maxSum = currSum;
      }
    }
    return maxSum;
  }

}
