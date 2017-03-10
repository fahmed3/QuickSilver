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


	//long startTime = System.nanoTime();
	long startTime = System.currentTimeMillis();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    QuickSort.qsort(arr);
	}

	//get end time
	long endTime = System.currentTimeMillis();
	//long endTime = System.nanoTime();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)(endTime - startTime)/ 1000;

    }
    //return int array of size s, with each element fr range [0,maxVal)
    public static double buildArrayB( int s ) {
	int[][] tester = new int[1000][s];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = j;
	    }
	}

		//get start time
	long startTime = System.currentTimeMillis();
	//long startTime = System.nanoTime();
	//System.out.println(startTime);

	for (int[] arr : tester) {
	QuickSort.qsort(arr);
	}
	
	//get end time
	long endTime = System.currentTimeMillis();
	//long endTime = System.nanoTime();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)((endTime - startTime)/1000);
    }
    public static double  buildArrayW( int s ) {
       int[][] tester = new int[1000][s];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = s-j;
	    }
	}

			//get start time
	long startTime = System.currentTimeMillis();
	//long startTime = System.nanoTime();
	//System.out.println(startTime);

	for (int[] arr:tester){
	QuickSort.qsort(arr);
	}
	//get end time
	long endTime = System.currentTimeMillis();
	//long endTime = System.nanoTime();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)((endTime - startTime)/1000);
    }
    public static void main(String[] args){

	//System.out.println ("B 10000: " + buildArrayB(10000)); //best case
	//System.out.println ("W 10000: " + buildArrayW(10000)); //worse case
	System.out.println("10000: " + tester(1000));
    }
}
