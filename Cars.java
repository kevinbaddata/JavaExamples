public class Cars {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] firstName = { "Kevin", "Carl", "Gustav", "Fredrik", "Albert" };
        String[] lastName = { "Nathan", "Joel", "Arthur", "Ellie", "Sam" };
        int[] age = { 18, 20, 22, 24, 24 };

        for (int i = 0; i < firstName.length; i++) {

            System.out.println(firstName[i] + "\t" + lastName[i] + "\t" + age[i]);
        }
    }

}