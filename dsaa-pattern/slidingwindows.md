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

<b style="color: red;">If an array has n elements, total number of subarrays:</b> n * (n + 1)/2 
Example :: a = {1,2,3} <br/>
  Total possible subarray is :: 6
  1 length : {1}, {2}, {3}      
  2 length :  {1,2}, {2,3} 
  3 length :  {1,2,3} 







</pre>

