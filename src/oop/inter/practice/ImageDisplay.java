package oop.inter.practice;

public class ImageDisplay extends MediaPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지가 재생된다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 일시정지 된다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 정지된다.");
    }
}
