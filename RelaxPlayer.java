package sdp4;

public class RelaxPlayer implements MusicStreamingService {
    @Override
    public void playSong(String song) {
        System.out.println("Relax Player:Playing " + song);
    }
}
