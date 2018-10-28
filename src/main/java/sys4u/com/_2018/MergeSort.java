package sys4u.com._2018;

import java.util.List;

//--- 합병정렬
public class MergeSort {
	
	public static void mergeSortTest( int[] arr, int m, int n ) {
		// TODO Auto-generated method stub
		//System.out.println("mergeSortTest Start");
		//System.out.println("arr length = "+ arr.length);
		//System.out.println("before arr = "+ arr);
		
		
		//--- 병합정렬
		int middle;
		if ( m < n ) {
			middle = (m+n) / 2;
			
			//--- 1) 길이가 1이 될때까지 반으로 나눈다.
			mergeSortTest( arr, m, middle );
			mergeSortTest( arr, middle + 1, n );
			
			//--- 2) 정렬하면서 합친다.
			mergeTest( arr, m, middle, n );
		}
	}

	private static void mergeTest(int[] arr, int m, int middle, int n) {
		// TODO Auto-generated method stub
		int[] sortedTest = new int[arr.length];
		
		int i, j, k, t;
		
		i = m;
		j = middle + 1;
		k = m;
		
		while ( i <= middle && j <= n ) {
			if ( arr[i] <= arr[j] ) {
				sortedTest[k] = arr[i++];
			} else {
				sortedTest[k] = arr[j++];
			}
			k++;
		}
		
		//--- ?
		if ( i > middle ) {
			for ( t=j; t<=n; t++, k++ )
				sortedTest[k] = arr[t];
		} else {
			for ( t=i; t<=middle; t++, k++ )
				sortedTest[k] = arr[t];
		}		
		
		for ( t=m; t<=n; t++) {
			arr[t] = sortedTest[t];
		}
		
		
		//System.out.println(" 합병정렬 >> ");
		//--- 선택정렬
		//SelectionSort.printArr(arr);
	}
	
		
		
		
		
		
	//--- 구형예정 병합정렬
	public static int[] sorted = new int[30];
	
	public static void mergeSort( List<Integer> arr, int m, int n ) {
		//System.out.println("mergeSort Start");
		//System.out.println("before arr = "+ arr.toString());
		
		int middle;
		if ( m < n ) {
			middle = (m+n) / 2;
			mergeSort( arr, m, middle );
			mergeSort( arr, middle + 1, n );
			merge( arr, m, middle, n );
		}
	}
	
	public static void merge( List<Integer> arr, int m, int middle, int n ) {
		int i, j, k, t;
		
		i = m;
		j = middle + 1;
		k = m;
		
		while ( i <= middle && j <= n ) {
			if ( arr.get(i) <= arr.get(j) ) {
				sorted[k] = arr.get(i++);
			} else {
				sorted[k] = arr.get(j++);
			}
			k++;
		}
		
		if ( i > middle ) {
			for ( t=j; t<=n; t++, k++ )
				sorted[k] = arr.get(t);
		} else {
			for ( t=i; t<=middle; t++, k++ )
				sorted[k] = arr.get(t);
		}
		
		arr.clear();
		
		for ( t=m; t<=n; t++) {
			arr.add( t, sorted[t] );
		}
		
		System.out.println(" 합병정렬 >> ");
		//--- 선택정렬
		//SelectionSort.printArr(arr);
	}

	
	
	
	
	//--- 병합정렬 두번째방법
	public static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		if ( n == 1 ) return;
		
		int [] arr_temp1 = new int [n/2];
		int [] arr_temp2 = new int [n - n/2];
		
		for ( int i = 0; i < n/2; i++ ) {
			arr_temp1[i] = arr[i];
		}
		for ( int i = 0; i < n - n/2; i++ ) {
			arr_temp2[i] = arr[i + n/2];
		}
		
		mergeSort( arr_temp1 );
		mergeSort( arr_temp2 );
		
		merge( arr_temp1, arr_temp2, arr );
	}

	private static void merge(int[] arrA, int[] arrB, int[] arr) {
		// TODO Auto-generated method stub
		
		int k = 0;
		
		int iA = 0;
		int iB = 0;
		while ( iA < arrA.length ) {
			if ( iB < arrB .length ) {
				if ( arrA[iA] < arrB[iB] ) {
					arr[k] = arrA[iA];
					iA++;
				} else {
					arr[k] = arrB[iB];
					iB++;
				}
			
				k++;
			} else {
				while ( iA < arrA.length ) {
					arr[k] = arrA[iA];
					iA++;
					k++;
				}
			}
		}
		
		while (iB < arrB.length ) {
			arr[k] = arrB[iB];
			iB++;
			k++;
		}
	}
	
	public static void printArr ( int[]arr ) {
		
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}