package homework.h02;

// base
// https://leetcode.com/problems/a-number-after-a-double-reversal/description/
public class T1 {
public boolean isSameAfterReversals(int num) {
    int original = num;

    int rev1 = reverse(num);
    int rev2 = reverse(rev1);

    return rev2 == original;
}

public int reverse(int num) {
    int reversed = 0;
    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    return reversed;
}
}