package oop.inter.practice1;

public class MediaPlayer  {

    class MediaPlayer {
        private MediaPlayable[] mediaList = new MediaPlayable[0];

        public void addMedia(MediaPlayable media) {
            // 주어진 media를 mediaList배열에 추가
            int[] temp = new int[mediaList.length+1];
            for (int i = 0; i < mediaList.length; i++) {
                temp[i] = mediaList[i];
                mediaList[] = temp[];
                mediaList[i+1] = media;
            }
        }

        public void playAll() {

            // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        }
    }
}