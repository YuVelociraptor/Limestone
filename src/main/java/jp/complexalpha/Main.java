package jp.complexalpha;

public class Main {
    static void main(String[] args) {

        if(args.length == 0){
            runPrompt();
        }
    }

    private static void runPrompt() {

        for(;;){
            IO.print(">");
            String s = IO.readLine();
            IO.println(s);
            IO.println( s.length());

            if (s.equals("exit")){
                break;
            }
        }
    }

    private static void run(String source){

        IO.println(source);
    }
}
