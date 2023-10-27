package sdp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a music streaming service: ");
        System.out.println("1.Spotify\n2.Relax Player");
        System.out.println("Enter the service nunmer: ");
        int serviceChoose = scanner.nextInt();

        MusicStreamingServiceFactory serviceFactory;
        if(serviceChoose == 1){
            serviceFactory = new SpotifyFactory();
        }else if(serviceChoose == 2){
            serviceFactory = new RelaxPlayerFactory();
        }else {
            System.out.println("Invaild service choice");
            return;
        }

        MusicPlayer musicPlayer = new MusicPlayer();

        System.out.println("Enter User 1 name: ");
        scanner.nextLine();
        String userN1 = scanner.nextLine();
        System.out.println("Enter User 2 name: ");
        String userN2 = scanner.nextLine();

        MusicObserver user1 = new User(userN1);
        MusicObserver user2 = new User(userN2);

        musicPlayer.addObserver(user1);
        musicPlayer.addObserver(user2);


        System.out.println("Enter the fisrt song: ");
        String song1 = scanner.nextLine();
        System.out.println("Enter the second song: ");
        String song2 = scanner.nextLine();

        MusicStreamingService streamingService = serviceFactory.createMusicPlayer();
        streamingService.playSong(song1);
        streamingService.playSong(song2);

        musicPlayer.playSong(song1);
        musicPlayer.playSong(song2);
    }
}