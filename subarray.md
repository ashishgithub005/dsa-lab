<pre>
<b>SubArray</b> ::
A subarray is a continuous (contiguous) part of an array. 

  Example ::
  int[] arr = {1, 2, 3, 4}; 
  Valid Subarrays <br/>
  {1}
  {2} 
  {3} 
  {4}
  {1, 2} 
  {2, 3} 
  {3, 4} 
  {1, 2, 3} 
  {2, 3, 4} 
  {1, 2, 3, 4}
  ✔️ because All elements are continuous
  
  ❌ Not Subarrays (Why?) 
  {1, 3} ❌ (not continuous skipped 2) 
  {2, 4} ❌ (skipped elements 3) 

<b>If an array has n elements, total number of subarrays: n * (n + 1)/2  </b>
  Example :: a = {1,2,3} <br/>
  here n = 3, apply above formula ::
         => 3 * (3 + 1)/2 
         => 3 * (4)/2
         => 6
  Total possible subarray is ::
    1 length : {1}, {2}, {3}      
    2 length : {1,2}, {2,3}      
    3 length : {1,2,3}            
  
    Total Subaraay possible with 1 size => 3
    Total Subaraay possible with 2 size => 2
    Total Subaraay possible with 3 size => 1
    ----------------------------------------
    So total possible subarray => 3 + 2 + 1 
                               => 6

 <b>Code To Generate All Subarray :: </b>
  
  public class SubarrayExample {

    public static void main(String[] args) {

        // Given input array
        int[] arr = {1, 2, 3};

        // Outer loop:
        // This loop decides the START index of the subarray
        for (int start = 0; start < arr.length; start++) {

            // Middle loop:
            // This loop decides the END index of the subarray
            // It always starts from 'start' to keep subarray continuous
            for (int end = start; end < arr.length; end++) {

                // Inner loop:
                // This loop prints elements from index 'start' to 'end'
                // These elements together form ONE subarray
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                // Move to next line after printing one subarray
                System.out.println();
            }
        }
     }
  }


  Output ::
  {1}
  {1, 2}
  {1, 2, 3}
  {2}
  {2, 3}
  {3}

<b>Properties of Subarray :: </b>
   1️⃣ Continuity (Most Important Property) ::
       A subarray is always continuous.
       Example ::
        Valid:   [2, 3, 4]
        Invalid: [2, 4]  ❌ (not continuous)

   2️⃣ Defined by Two Indices (start & end) ::
       Every subarray can be represented as:
       arr[.....start ... end.....]
       Helps in range-based problems
       for (int start = 0; start < n; start++){
          for (int end = start; end < n; end++){
              //logic                     
          }
       }
         
    3️⃣ Order Must be Preserved ::
        Elements keep the same order as original array.
        Array:     [5, 1, 3]
        Subarray:  [1, 3] ✅
        Invalid: [5, 3]  ❌ (not continuous)

    4️⃣ Subarray Length Formula :: 
        int subarray length = end - start + 1
        Example ::
        int[] a = {1,2,3,4,5,6,7,8,9}
        find length sub(2,5) => end - start + 1
                             => 5 - 2 + 1
                             => 4   which is {3,4,5,6}

     <b>Note ::</b> this properties is used to calculate longest / shortest subarray length.
</pre>





