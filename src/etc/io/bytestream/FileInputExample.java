package etc.io.bytestream;

import etc.io.FileExample;

import java.io.FileInputStream;

public class FileInputExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileExample.Root_Path + "/hello.txt")) {

            int data = 0;
            // fis.read()를 통해 지정된 파일의 내용을 바이트 단위로 읽어들임.
            // 더 이상 읽어들일 데이터가 없다면 -1을 리턴
            while ((data = fis.read()) != -1) {
                // 출력 공간에 읽어드린 데이터를 쓰기.
                System.out.write(data);
            }
            // 미리 작성헸던 출력 데이터를 한 번에 비워내기.
            System.out.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
