package ru.netology;

public class StatService {
    public int calcSum(int[] byes) { //расчет суммы продаж
        int sum = 0;
        for (int bye : byes) {
            sum = sum + bye;
        }
        return sum;
    }

    public double calcAverSum(int[] byes) { //<> сумма в мес
        double sum = calcSum(byes);
        double averSum = sum / byes.length;
        return averSum;
    }

    public int calcMaxMont(int[] byes) { //№ мес мах продажи
        int maxMont = 0;
        for (int i = 1; i < byes.length; i++) {
            if (byes[maxMont] <= byes[i]) {
                maxMont = i;
            }
        }
        maxMont = maxMont + 1;
        return maxMont;
    }

    public int calcMinMont(int[] byes) { //№ мес мин продаж
        int minMont = 0;
        for (int i = 1; i < byes.length; i++) {
            if (byes[minMont] >= byes[i]) {
                minMont = i;
            }
        }
        minMont = minMont + 1;
        return minMont;
    }

    public int calcCountUnAver(int[] byes) { //колво мес, где продажи < средней
        int count = 0;
        double averSum = calcAverSum(byes);
        for (int bye : byes) {
            if (bye < averSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcCountUpAver(int[] byes) { //колво мес, где продажи > средней
        int count = 0;
        double averSum = calcAverSum(byes);
        for (int bye : byes) {
            if (bye > averSum) {
                count = count + 1;
            }
        }
        return count;
    }
}