public class Main {

    public static void main(String[] args) {
        String keyboardString = "";
        StrReverce strReverce = new StrReverce();
        keyboardString = strReverce.getKeyboardStr();
        System.out.println("keyboardString=" + keyboardString);
        strReverce.setInputStr(keyboardString);
        strReverce.makeReverce();
        System.out.println("Развернутая строка:" + strReverce.getRevercedStr());
        strReverce.setCountLoop(1000);
        strReverce.makeLoop();
        System.out.println("Продолжительность " + strReverce.getCountLoop() + " циклов = " + strReverce.getDuration() + " нсек");
        strReverce.setCountLoop(10000);
        strReverce.makeLoop();
        System.out.println("Продолжительность " + strReverce.getCountLoop() + " циклов = " + strReverce.getDuration() + " нсек");
        strReverce.setCountLoop(100000);
        strReverce.makeLoop();
        System.out.println("Продолжительность " + strReverce.getCountLoop() + " циклов = " + strReverce.getDuration() + " нсек");
    }
}
