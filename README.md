# QuickSilver

## Big-Oh Runtime
  * Best Case : O(nlogn) 
  * Average Case : O(n^2)
  * Worst Case : O(nlogn)
  
## Methodology
  We generated arrays that were randomized, sorted in ascending order, and sorted backwards. These arrays were listed in a larger array, 
  so that the tester could test multiple arrays at the same time. We then got estimated runtimes by dividing the time by the number of 
  arrays that were sorted. We also ran the test using two different pivot points, one at the beginning of the array and the other at the 
  middle of the array, in order to see if the pivot points mattered. 

## Data
[Results](https://docs.google.com/spreadsheets/d/1ojRcGFM_Q5E_6y7UBWRjculBVSIGnfbGKXgVfCofx6Q/pubhtml)


## Conclusions
 Based on our data, it seems like the selection of the pivot point does not matter because the two algorithms using the midpoint and the beginning of the array as pivot points generated similar results. However, the sorted-ness of the array seems to affect run time. The backward array generated the fastest run times and the sorted array generated slightly longer run times, whereas the average case had a significantly longer runtime than the aforementioned ones.
