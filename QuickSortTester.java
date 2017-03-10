//Team QuickSilver - Fabiha Ahmed, Judy Liu, Tiffany Moi
//APCS2 pd5
//Lab01
//2017-03-09
/*****************************************************
For generating execution times, we created methods to generate arrays for the average case, best case, and worst case. In the best case, the array is already in order and the pivot number is already in the middle. In the worst case the array is backwards and the pivot number is in one of the extremes. For the average case we are using the array is sorted with randomly generated numbers. 
 *****************************************************/
public class QuickSortTester{
    //tester method for testing runTime of array of length n
    public static double tester(int n) {

	//create 2D array for testing of length 1000 x n
	int[][] tester = new int[1000][n];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = (int) (Math.random() * 1000);
	    }
	}

	//get start time
	long startTime = System.currentTimeMillis();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    QuickSort.qsort(arr);
	}

	//get end time
	long endTime = System.currentTimeMillis();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)(endTime - startTime) / 1000.0;
    }
    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArrayB( int s ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = i;
	return retArr;
    }
    public static int[] buildArrayW( int s ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ ){
	    retArr[i] = s-i;
	}
	return retArr;
    }
    public static void main(String[] args){
	//int[] arr = buildArrayW(1000);
	int[] arr2 = buildArrayB(1000);
	QuickSort.qsort(arr2);
	//System.out.println("10000: " + tester(10000));
    }
}
