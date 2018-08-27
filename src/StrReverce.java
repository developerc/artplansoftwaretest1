import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrReverce {

    private String inputStr;
    private String revercedStr;
    private int countLoop;
    private long duration;


    public StrReverce(){
        //пустой конструктор по умолчанию
    }

    public void makeReverce(){
        revercedStr = "";
        char[] strToArray = inputStr.toCharArray();
        int iterOfArr = strToArray.length;
        char[] revercedCharArr = new char[iterOfArr];
        if (iterOfArr > 0) {
            for (int i = 0; iterOfArr > 0; i++) {
                revercedCharArr[i] = strToArray[iterOfArr - 1];
                iterOfArr--;
            }
            revercedStr = new String(revercedCharArr);
        } else {
            System.out.println("Введена пустая строка");
        }
    }

    public String getKeyboardStr() {
        String keyboardStr = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            keyboardStr = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return keyboardStr;
    }

    public void makeLoop(){
        long start = System.nanoTime();
        for (int i = 0; i < countLoop; i++){
            makeReverce();
        }
        long stop = System.nanoTime();
        duration = stop - start;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String getRevercedStr() {
        return revercedStr;
    }

    public void setCountLoop(int countLoop) {
        this.countLoop = countLoop;
    }

    public long getDuration() {
        return duration;
    }

    public int getCountLoop() {
        return countLoop;
    }
}
