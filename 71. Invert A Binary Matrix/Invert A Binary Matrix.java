/* Given a binary matrix representing an image, we want to flip the image horizontally, then invert it. 
To flip an image horizontally means that each row of the image is reversed.
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. */

public static int[][] flipAndInvertImage(int[][] arr) {
    //Flip
    for(int[] a : arr) {
		swap(a);
    }
    //Invert
    for(int[] a : arr) {
        for(int i = 0; i < a.length; i++) 
            a[i] = a[i] ^ 1;
    }
    return arr;
}

public static void swap(int[] t) {
    int j = t.length - 1;
    for(int i = 0; i < (t.length + 1)/2; i++) {
        int temp = t[i];
        t[i] = t[j];
        t[j--] = temp;
    }
}