package Practice;

public class Problem3 {

	public static void main(String[] args) {
		
		
//		/*
//		 * * 길이가 5인 정수형 배열을 만들고,
//해당 배열의 각 요소에 접근하여
//원하는 값을 넣고,
//배열의 모든 요소들을 출력해보기
//		 */
		
		int a[] = new int[5];
		
		
		for ( int i = 0; i < 5; ++i) {
			a[i] = (i+1)*10;
			System.out.println(a[i]);
		}


	}

}
