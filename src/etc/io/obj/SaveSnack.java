package etc.io.obj;

import etc.io.FileExample;
import oop.modi.member.pac1.A;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {

    public static void main(String[] args) {

        List<Snack> snacksList = new ArrayList<>();

        Collections.addAll(snacksList,
                    new Snack("콘칩", 1970, 1500, Snack.Taste.Good ),
                    new Snack("사브레", 1980, 2500, Snack.Taste.BAD),
                    new Snack("오징어칩",  1985, 1800,Snack.Taste.SOSO )
                );

        try(FileOutputStream fos = new FileOutputStream(FileExample.Root_Path + "/snack.sav")){

            // 객체를 출력할 수 있는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snacksList);


        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
