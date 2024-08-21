package etc.io.bytestream;

import etc.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 바이트 기반 출력 스티림; 영상, 이미지, 텍스 등 모든 데이터 출력 가능.
public class FileOutputExample {

    public static void main(String[] args) {

        String message = "Hello World! Today is 8/21, Wednesday~!";

        //try with resoutce : close가 필요한 하드웨어 접근 코드에 대해
        // 메모리 자원 반납 처리를 동기화 해주는 문법.(1.8부터 사용가능)
        // close 하려는 객체가 AutoCLoseable 인터ㅔ이스의 구현체여야 합니다.

//        FileOutputStream fos = null;
        try(FileOutputStream fos = new FileOutputStream(FileExample.Root_Path + "/hello.txt")){
//            fos = new FileOutputStream(FileExample.Root_Path + "/backend2408/hellow.txt");
            fos.write(message.getBytes());// 파일 출력 명령
        } catch (Exception e) {
            e.printStackTrace();
        }

//        finally {
//            try {
//                fos.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//

        }

    }

