package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {

class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }

        return num ^ mask;
    }
}