package homework.h03;

// base
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];

            }
        }
        int adjustedSum = sum - min - max;
        return (double) adjustedSum / (salary.length - 2);
    }
}

