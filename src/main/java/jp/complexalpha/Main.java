package jp.complexalpha;

public class Main {
    static void main() {

        while (true){
            String s = IO.readln();
            IO.println(s);
            IO.println( s.length());

            if (s.equals("exit")){
                break;
            }
        }
    }
}
