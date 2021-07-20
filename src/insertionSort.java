public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,6,7,7,8,8,10};
        int i, key, j;
        for (i = 1; i < arr.length; i++)
        {
            key = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

    }

}
