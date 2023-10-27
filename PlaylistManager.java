package sdp4;

public class PlaylistManager implements MusicObserver{
    @Override
    public void update(String song) {
        System.out.println("Playlist Manager: Song changed to: " + song);
    }
}
