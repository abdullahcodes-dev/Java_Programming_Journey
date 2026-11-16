interface Camera {
    abstract void takePhoto();
}

interface MusicPlayer {
    abstract void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo.");
    }

    public void playMusic() {
        System.out.println("Smartphone is playing music.");
    }
}

public class MultipleInheritanceInterfaces {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}
