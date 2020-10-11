import java.util.Scanner;

class MovieRating {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the movie name");
  String title = scan.nextLine();

  System.out.println ("please enter the ruuning time on mintues");
  int time = scan.nextInt();

  System.out.println ("Please enter ratings from the movie review website.");
  int web1 = scan.nextInt();
  int web2 = scan.nextInt();
  int web3 = scan.nextInt();  

  System.out.println("Please enter ratings from the focus group");
  double  group1 = scan.nextDouble();
  double  group2 = scan.nextDouble();

   System.out.println ("Please enter the average movie critic rating.");
   double  critic = scan.nextDouble();


   double AvgWeb = (double)(web1 + web2 + web3) / 3;

   double AvgGroup = (double) (group1 + group2) / 2;

   int rating = (int)(AvgWeb * 0.2 + AvgGroup * 0.3 + critic * 0.5);

  System.out.println("Title" + title);
  System.out.println("Running Time" + time / 60  + "h" + time % 60);
  System.out.println("Average Website rating" + AvgWeb);
  System.out.println("Average foucs group rating" + AvgGroup);
  System.out.println("Average movie critic rate " + critic );
  System.out.println("Overall movie rating" + rating );


        
    }
}