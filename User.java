package sdp4;

public class User implements MusicObserver{
    private String name;
    @Override
    public void update(String song) {
        System.out.println("User " + name + ": Now playing " + song);
    }
    public User(String name){
        this.name = name;
    }
}
