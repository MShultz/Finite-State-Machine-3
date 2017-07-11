package Program;

import StateInfo.Machine;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mary on 6/29/2017.
 */
public class Program {
    private Random rand;
    private Scanner scan;
    private Machine machine;


    public Program() {
        rand = new Random();
        scan = new Scanner(System.in);
        machine = new Machine();
    }

    public void run() {
        String input;
        System.out.println("Welcome to Chat Bot!");
        for (; ; ) {
            input = scan.nextLine() + "\n";
            for (int i = 0; i < input.length() && !machine.getFoundState().contains("Found"); ++i) {
                machine.handleCharacter(input.charAt(i));
            }
            printResponse();
            machine.reset();
        }
    }


    private void printResponse(){
        String response;
        switch(machine.getFoundState()){
            case "doFound":
                response = Responses.doResponses[rand.nextInt(Responses.doResponses.length)];
                break;
            case "doingFound":
                response = Responses.doingResponses[rand.nextInt(Responses.doingResponses.length)];
                break;
            case "youFound":
                response = Responses.youResponses[rand.nextInt(Responses.youResponses.length)];
                break;
            case "ahoyFound":
                response = Responses.ahoyResponses[rand.nextInt(Responses.ahoyResponses.length)];
                break;
            default:
                response = Responses.none[rand.nextInt(Responses.none.length)];
                break;
        }

        System.out.println(response);
    }


}
