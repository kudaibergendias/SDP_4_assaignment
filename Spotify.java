package sdp4;

public class Spotify implements MusicStreamingService {
    @Override
    public void playSong(String song) {
        System.out.println("Spotify: Playing " + song);
    }
}
