package sdp4;

public class RelaxPlayerFactory implements MusicStreamingServiceFactory{
    @Override
    public MusicStreamingService createMusicPlayer() {
        return new RelaxPlayer();
    }
}
