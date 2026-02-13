package jp.complexalpha;

public class Main {
    static void main(String[] args) {

        if(args.length == 0){
            runPrompt();
        }
    }

    private static void runPrompt() {

        for(;;){
            String s = IO.readln();
            IO.println(s);
            IO.println( s.length());

            if (s.equals("exit")){
                break;
            }
        }
    }
}
