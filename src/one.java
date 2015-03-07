/**
 * Created by rilfi on 3/6/2015.
 */

import com.asprise.ocr.Ocr;

import java.io.File;

public class one {
    public static void main(String[] args) {
        Ocr.setUp();
        Ocr ocr=new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String s = ocr.recognize(new File[] {new File("1.PNG")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        System.out.println("Result: " + s);
        ocr.stopEngine();
    }
}
