package ru.netology.sqr;

public class SQRService {



    public int entry(int lowerLimit, int upperLimit) {

        int numberOccurence = 0;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;

            if (j > lowerLimit && j < upperLimit) {
                System.out.println("Количество вхождений: " + numberOccurence++);

            }
        }
        return numberOccurence++;
    }
}
