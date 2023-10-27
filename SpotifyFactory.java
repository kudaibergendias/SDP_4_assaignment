package sdp4;

public class SpotifyFactory implements MusicStreamingServiceFactory{
    @Override
    public MusicStreamingService createMusicPlayer() {
        return new Spotify();
    }
}
