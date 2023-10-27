package sdp4;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<MusicObserver> observerList = new ArrayList<>();
    private String currentSong;

    public String getCurrentSong() {
        return currentSong;
    }
    public void playSong(String song){
        this.currentSong = song;
        notifyObserver();
    }
    public void addObserver(MusicObserver observer){
        observerList.add(observer);
    }
    public void removeObserver(MusicObserver observer){
        observerList.remove(observer);
    }
    public void notifyObserver(){
        for(MusicObserver observer : observerList){
            observer.update(currentSong);
        }
    }
}
