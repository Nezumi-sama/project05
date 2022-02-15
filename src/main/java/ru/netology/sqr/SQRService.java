package ru.netology.sqr;

public class SQRService {
    public int countSquaresInRange(int start, int end) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= start && i * i <= end) {
                count++;
            }
        }
        return count;
    }

}
