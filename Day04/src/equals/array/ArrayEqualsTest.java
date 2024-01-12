package equals.array;
import java.util.Arrays;


public class ArrayEqualsTest {

	public static void main(String[] args) {
		int[] intArray1 = {1,2,3,4,45};
		System.out.println("배열1의 주소 : "+intArray1);
		
		System.out.println("배열1의 실제 값 : "+Arrays.toString(intArray1));
		System.out.println("-------------------------");
		
		
		int[] intArray2 = intArray1.clone();
		System.out.println("배열1과 배열2 간의 동등성 비교 : "+(intArray1.equals(intArray2)));
		intArray1[0] = 100;
		System.out.println("배열1의 실제 값 : "+Arrays.toString(intArray1));
		System.out.println("배열2의 실제 값 : "+Arrays.toString(intArray2));
		System.out.println("배열2의 주소 : "+intArray2);
	}
}
