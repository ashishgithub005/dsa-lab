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
  Total possible subarray is ::
  1 length : {1}, {2}, {3}      
  2 length : {1,2}, {2,3}      
  3 length : {1,2,3}            

  Total Subaraay possible with 1 size = 3
  Total Subaraay possible with 2 size = 2
  Total Subaraay possible with 3 size = 1
  So total possible subarray = 3 + 2 + 1 
                             = 6

  Using formula :: n = 3
                => 3 * (3 + 1)/2 
                => 3 * (4)/2
                => 6
  
  







</pre>



