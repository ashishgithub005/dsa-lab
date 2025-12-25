<pre>
  <b>Sliding Window Pattern ::</b>
    => Sliding Window is an algorithmic technique used to process contiguous subarrays / substrings by maintaining 
  a window over the data and sliding it forward instead of recalculating from scratch.
    => It reduces time complexity from O(n²) to O(n) in many problems.

 <b>Why Sliding Window is Needed :: </b>
    ❌ Brute Force
    For every subarray → calculate answer → O(n²) or O(n³)
    Example :: Find maximum sum of subarray of size k.
    arr = [2, 1, 5, 1, 3, 2]
    k = 3
    
    Analysis ::
    [2,1,5] → 8
    [1,5,1] → 7
    [5,1,3] → 9 ✅
    [1,3,2] → 6

    So here we are calculating sum again and again. and also some number is repeating in subarray. 
    TC = O(n^2)
    SC = O(1)

    So we can remove this problem by Sliding Window.
    
    ✅ Sliding Window
    Reuse previous computation → O(n)
    arr = [2, 1, 5, 1, 3, 2]
    k = 3
    max = Integer.MIN;
    sum = 8 ==> 2, 1, 5
    max = max(sum, max); => 8
    sum = sum + 1 - 2 
        = 7 ==> 1, 5, 1
    max = max(sum, max); => 8
    repeat this step unti we got maxsum
    SO this process reduced TC from O(n^2) to O(n)
                            
    
    
</pre>





