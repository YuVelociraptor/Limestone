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
            String line = IO.readln();

            if (line.equals("exit")){
                break;
            }

            run(line);
        }
    }

    private static void run(String source){

        IO.println(source);
    }
}
