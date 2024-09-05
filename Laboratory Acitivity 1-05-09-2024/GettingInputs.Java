import java.util.Scanner;
class GettingInputs {
    public static void main(String[] args)
    {
        Scanner cont = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = cont.nextInt();
        
        Scanner contain = new Scanner (System.in);
        
        System.out.print("Enter the genre: ");
        String genre = contain.nextLine();
        System.out.print("Enter the album: ");
        String album = contain.nextLine();
        System.out.print("Enter the song title: ");
        String title = contain.nextLine();
        System.out.print("Enter the Artist: ");
        String artist = contain.nextLine();
        
        System.out.println("----------------------");
        System.out.println("SONG DETAILS");
        System.out.println("----------------------");
        
        System.out.println("Year Released: " +year);
        System.out.println("Genre: " +genre);
        System.out.println("Album: " +album);
        System.out.println("Title: " + "\"" +title + "\"");
        System.out.println("Artist: " +artist);
        cont.close();
        contain.close();
    }
}
