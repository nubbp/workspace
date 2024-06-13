package Interface.array;

public class MyArray implements MyArrayUtil {
    //  매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int arr1Sum = 0;
        int arr2Sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1Sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2Sum += arr2[i];
        }
        return (double)(arr1Sum + arr2Sum) / (arr1.length + arr2.length);

    }

    //    매개변수로 받은 배열의 모든 요소가 짝수일 때만 리턴 true
    public boolean isEvenArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count == array.length ? true : false;
    }

}
