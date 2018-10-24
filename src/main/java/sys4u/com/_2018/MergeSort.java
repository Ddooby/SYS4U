package sys4u.com._2018;

import java.util.List;

//--- 합병정렬
public class MergeSort {
	
	//--- 블로그 참조 메소드
	public static int[] sortedTest = new int[30];
	
	public static void mergeSortTest( int[] arr, int m, int n ) {
		// TODO Auto-generated method stub
		//System.out.println("mergeSortTest Start");
		//System.out.println("arr length = "+ arr.length);
		//System.out.println("before arr = "+ arr);
		
		int middle;
		if ( m < n ) {
			middle = (m+n) / 2;
			mergeSortTest( arr, m, middle );
			mergeSortTest( arr, middle + 1, n );
			mergeTest( arr, m, middle, n );
		}
	}

	private static void mergeTest(int[] arr, int m, int middle, int n) {
		// TODO Auto-generated method stub
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
		SelectionSort.printArr(arr);
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
}