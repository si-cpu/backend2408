package oop.inter.practice;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오가 재생된다.");
    }

    @Override
    public void pause() {
        System.out.println("비디오가 일시정지 된다.");
    }

    @Override
    public void stop() {
        System.out.println("비디오가 정지된다.");
    }
}
