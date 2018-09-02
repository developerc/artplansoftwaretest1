public class Main {

    public static void main(String[] args) {
        String keyboardString = "";
        StrReverce strReverce = new StrReverce();
        keyboardString = strReverce.getKeyboardStr();
        System.out.println("keyboardString=" + keyboardString);
        strReverce.setInputStr(keyboardString);
        strReverce.makeReverce();
        System.out.println("Развернутая строка:" + strReverce.getRevercedStr());
        for (int cntLoop = 1000; cntLoop <= 100000; cntLoop = cntLoop * 10){
            strReverce.setCountLoop(cntLoop);
            strReverce.makeLoop();
            System.out.println("Продолжительность " + strReverce.getCountLoop() + " циклов = " + strReverce.getDuration() + " нсек");
        }
    }
}
