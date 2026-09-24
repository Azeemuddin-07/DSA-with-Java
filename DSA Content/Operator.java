public class Operator {
    static void main() {
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;
        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedThisWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        //Relational operator - a==b, a!=b, a>b, a<b, a>=b, a<=b

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak <= targetStreak);
        System.out.println(currentStreak >= targetStreak);

        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        // Assignment operator

        

    }
}
