SubArray ::
A subarray is a continuous (contiguous) part of an array. <br/>

Example :: <br/>
int[] arr = {1, 2, 3, 4}; <br/>
Valid Subarrays <br/>
{1} <br/>
{2} <br/>
{3} <br/>
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

If an array has n elements, total number of subarrays: n * (n + 1)/2





