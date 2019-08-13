public boolean splitOdd10(int[] nums) {
  return splitPosible(0,nums,0,0);
  
}
private boolean splitPosible(int start,int[] nums,int sum1,int sum2) {
  if (start >= nums.length) return sum1%10 == 0 && sum2%2 > 0;
  
  if (splitPosible(start+1,nums,sum1+nums[start],sum2)) return true;
  
  if (splitPosible(start+1,nums,sum1,sum2+nums[start])) return true;
  
  
  return false;
}