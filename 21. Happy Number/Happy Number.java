/* Identify if the given number is a happy number. Any number will be called a happy number if, after repeatedly replacing it with a number equal to the sum of the square of all of its digits, leads us to number ‘1’ */

public static boolean find(int num) {
    int slow = num, fast = num;
    do {
        slow = getSquare(slow);
        fast = getSquare(getSquare(fast));
    } while(slow != fast);

    return (slow == 1);
}

public static int getSquare(int num) {
    int sum = 0, digit = 0;
    while(num > 0) {
        digit = num % 10;
        sum += digit * digit;
        num = num / 10;
    }
    return sum;
}