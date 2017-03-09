//Team QuickSilver - Fabiha Ahmed, Judy Liu, Tiffany Moi
//APCS2 pd5
//Lab01
//2017-03-09
/*****************************************************
 * class QuickSort
 * (skeleton)
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Uses partition to sort the array into two sides and
 * continues to split up the sides to sort them.
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *     The worst pivot choice is if the number ends up at one of the 
 *     extremes and the worst array state is when the array is backwards.
 *     Runtime: O(n^2)
 *
 * 2b. Best pivot choice / array state and associated runtime:
 *     Best pivot choice is if the number ends up at the middle of the
 *     array and the best array state is if it is already in order.
 *     Runtime: O(nlogn)
 *
 * 3. Approach to handling duplicate values in array:
 *    Partition takes care of the values.
 *****************************************************/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort(int[] arr){
	halp(arr, 0, arr.length-1);
    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.
    public static void halp(int[] arr, int start, int end){
	int target = (start + end)/2;
	int i = partition(arr, start, end, target);
	if (end - i - 1 > 0){
	    halp(arr, i+1, end);
	}
	if (i-1-start > 0){
	    halp(arr, start, i-1);
	}
    }
    public static int partition(int[] arr, int start, int end, int pvPos){
	int pvVal = arr[pvPos];
	arr[pvPos]=arr[end];
	arr[end]=pvVal;
	int lNum = start;
	int[] ar2 = new int[end-start];
	for (int i = 0; start < end; i ++){
	    ar2[i] = start;
	    start++;
	}
	for (int i : ar2){
	    if (arr[i] < pvVal){
		int t = arr[lNum];
		arr[lNum] = arr[i];
		arr[i] = t;
		lNum++;
	    }
	}
	pvVal = arr[end];
	arr[end] = arr[lNum];
	arr[lNum] = pvVal;
	
	return lNum;
    }
    //main method for testing
    public static void main( String[] args ) 
    {
	 
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/




	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);

	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
