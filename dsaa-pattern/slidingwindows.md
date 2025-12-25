<b>SubArray</b> ::
A subarray is a continuous (contiguous) part of an array. <br/>

Example :: <br/>
int[] arr = {1, 2, 3, 4}; <br/>
Valid Subarrays <br/>
{1} <br/>
{2} <br/>
{3} <br/>
{4} <br/>
{1, 2} <br/>
{2, 3} <br/>
{3, 4} <br/>
{1, 2, 3} <br/>
{2, 3, 4} <br/>
{1, 2, 3, 4} <br/>
✔️ because All elements are continuous <br/>

❌ Not Subarrays (Why?) <br/>
{1, 3} ❌ (not continuous skipped 2) <br/>
{2, 4} ❌ (skipped elements 3) <br/>

<b>If an array has n elements, total number of subarrays:</b> n * (n + 1)/2 <br/>






