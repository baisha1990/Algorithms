/* In a non-empty array of numbers, every number appears exactly twice except two numbers that appear only once. Find the two numbers that appear only once. */

public static int[] findSingleNumbers(int[] nums) {
    int n1xn2 = 0;
    for(int i : nums) {
        n1xn2 = n1xn2 ^ i;
    }
    int rightmost = 1;
    while((rightmost & n1xn2) == 0)
		rightmost = rightmost << 1;
    int n1 = 0, n2 = 0;
    for(int i : nums) {
        if((i & rightmost) == 0)
            n1 = n1 ^ i;
        else
            n2 = n2 ^ i;
    }
    return new int[] { n1, n2 };
}