package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera, MusicPlay {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MultipleInterface {

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.takePhoto();
        s.playMusic();
    }
}