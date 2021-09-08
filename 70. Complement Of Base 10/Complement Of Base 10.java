/* For a given positive number N in base-10, return the complement of its binary representation as a base-10 integer. */

public static int bitwiseComplement(int n) {
    int num = n, bits = 0;
    while(num > 0) {
        bits++;
        num = num >> 1;
    }
    int all_set = (int) Math.pow(2, bits) - 1;
    return n ^ all_set;
}