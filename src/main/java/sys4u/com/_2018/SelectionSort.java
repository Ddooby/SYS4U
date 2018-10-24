package sys4u.com._2018;

//--- 선택정렬
public class SelectionSort {
	
	public static void selectionSort ( int [] arr ) {
		
		//--- 최저 값을 담을 요소
		int min = 0;
		
		for ( int i = 0; i < arr.length-1; i++ ) {
			//--- 첫번째 요소 선택
			min = i ;
			
			for ( int j = i+1; j < arr.length; j++ ) {
				//--- 첫번째 요소와 가장 적은 값을 찾는 비교 연산
				if ( arr[j] < arr[min] ) {
					min = j;
				}
			}
			swap( arr, min, i );
			System.out.println("선택 정렬 " + ( i+1) + " 단계 : ");
			printArr( arr );
		}
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}