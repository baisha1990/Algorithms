/* Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.*/

public static int[] makeSquares(int[] arr) {
    int[] squares = new int[arr.length];
    int smax = squares.length - 1, i = 0, j = arr.length-1;
    while(i <= j) {
        int is = arr[i] * arr[i];
        int js = arr[j] * arr[j];
        if(is > js) {
			squares[smax--] = is;
			i++;
        }
        else {
			squares[smax--] = js;
			j--;
        }
    }
    return squares;
}