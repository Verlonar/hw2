package ru.verlonar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //задача 1
        byte b = 1;
        short s = 100;
        int i = 10_000;
        long l = 1_000_000L;

        float f = 10.02f;
        double d = 100.12424;

        char c = 'c';
        boolean t = 5 > 1;
        boolean fls = 5 < 1;

        //задача 2

        separate();

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        boxersWeight(firstBoxerWeight, secondBoxerWeight);

        separate();

        //задача 3
        byte bananasAmount = 5;
        byte iceCreamAmount = 2;
        byte eggsAmount = 4;

        //указывается в мл
        short milkAmount = 200;

        System.out.println("Вес завтрака = " + breakfastCalculate(bananasAmount, iceCreamAmount, eggsAmount, milkAmount)  + " кг.");

        separate();

        //задача 4
        byte needToLoseKg = 7;
        short slowWeightLoss = 250;
        short quickWeightLoss = 500;

        weightLossDaysCalculate(needToLoseKg, slowWeightLoss, quickWeightLoss);

        separate();

        //задача 5
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;

        System.out.println("Маша " + salaryCalculate(masha));
        System.out.println("Денис " + salaryCalculate(denis));
        System.out.println("Кристина " + salaryCalculate(kristina));

        separate();
    }

    private static void boxersWeight(float firstBoxerWeight, float secondBoxerWeight) {
        float generalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        float difference = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Общий вес бойцов = " + generalBoxersWeight + " кг.");
        System.out.println("Разница в весе бойцов = " + difference + " кг.");
    }

    private static float breakfastCalculate(byte bananasAmount, byte iceCreamAmount, byte eggsAmount, short milkAmount) {
        byte bananaWeight = 80;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        byte milkWeight = 105;

        int generalBananasWeight = bananaWeight * bananasAmount;
        int generalIceCreamWeight = iceCreamWeight * iceCreamAmount;
        int generalEggsWeight = eggWeight * eggsAmount;
        short grPerKg = 1_000;

        int generalMilkWeight = milkAmount / 100 * milkWeight;

        int breakfastWeight = generalBananasWeight + generalIceCreamWeight + generalEggsWeight + generalMilkWeight;

        float breakfastWeightKg = (float) breakfastWeight / grPerKg;

        return breakfastWeightKg;
    }

    private static void weightLossDaysCalculate(short needToLoseKg, int slowWeightLoss, int quickWeightLoss) {
        int grPerKg = 1_000;
        float slowWeightLossKg = (float) slowWeightLoss / grPerKg;
        float quickWeightLossKg = (float) quickWeightLoss / grPerKg;
        int slowDays = (int) (needToLoseKg / slowWeightLossKg);
        int quickDays = (int) (needToLoseKg / quickWeightLossKg);

        float averageDays = (float) (quickDays + slowDays) / 2;

        System.out.println("Если спортсмен будет худеть по " + slowWeightLoss + " грамм в день, то он похудеет на " + needToLoseKg + " кг за " + slowDays + " дней");
        System.out.println("Если спортсмен будет худеть по " + quickWeightLoss + " грамм в день, то он похудеет на " + needToLoseKg + " кг за " + quickDays + " дней");
        System.out.println("Среднее количество дней для похудения = " + averageDays);
    }

    private static String salaryCalculate(int oldSalary) {
        float rate = 1.1f;
        double newSalary = oldSalary * rate;
        double difference = newSalary - oldSalary;
        return ("теперь получает " + newSalary + " рублей. Годовой доход вырос на " + difference + " рублей");
    }

    private static void separate() {
        System.out.println("----------------------------------------------");
    }
}
