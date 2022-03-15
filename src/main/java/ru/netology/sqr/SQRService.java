package ru.netology.sqr;

public class SQRService {

    public static void main(int numberOccurence) {


    }
}

class OccurenceCounter {
    public int occurenceOfCount() {
        int numberOccurence = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i < 300)
                if (i * i > 200) {
                    System.out.println("Количество вхождений: " + numberOccurence);
                    numberOccurence++;
                }
        }
        return numberOccurence++;
    }
}
