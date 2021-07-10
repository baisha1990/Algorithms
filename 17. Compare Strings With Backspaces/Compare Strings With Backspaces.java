/* Given two strings containing backspaces (identified by the character ‘#’), check if the two strings are equal.*/

public static boolean compare(String str1, String str2) {
    int index1 = str1.length() - 1, index2 = str2.length() - 1;
    while(index1 >= 0 || index2 >= 0) {
        int i1 = get(str1, index1);
        int i2 = get(str2, index2);

        if(i1 < 0 && i2 < 0)
            return true;
        if(i1 < 0 || i2 < 0)
            return false;
        if(str1.charAt(i1) != str2.charAt(i2))
            return false;

        index1 = i1 - 1;
        index2 = i2 - 1;
    }
    return true;
}

public static int get(String S, int index) {
    int m = 0;
    while(index >= 0) {
        if(S.charAt(index) == '#')
            m++;
        else if(m > 0)
            m--;
        else
            break;

        index--;
    }
    return index;
}