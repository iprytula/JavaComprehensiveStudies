import java.util.Scanner;

public class FairShare {

  public static void main(String[] args) {
    System.out.println("Number of bottles in total?");
    int total = new Scanner(System.in).nextInt();

    int captainLoot = (int) (total / 2);
    System.out.println("Bottles for the captain: " + captainLoot);

    int crewLoot = total - captainLoot;
    System.out.println("Bottles for all crew members: " + crewLoot);

    System.out.println("Number of crew members");
    int numberOfCrewMembers = new Scanner(System.in).nextInt();

    System.out.println("Fair share without reminder? " + (crewLoot % numberOfCrewMembers == 0));
  }

}
