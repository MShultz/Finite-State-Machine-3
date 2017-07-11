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
            input = scan.nextLine();
            for (int i = 0; i < input.length() && machine.getFoundState().equals("Default"); ++i) {
                machine.handleCharacter(input.charAt(i));
            }
            printResponse();
            machine.reset();
        }
    }


    private void printResponse(){
        String response;
        switch(machine.getFoundState()){
            case "Hi":
                response = Responses.hiResponses[rand.nextInt(Responses.hiResponses.length)];
                break;
            case "Hello":
                response = Responses.helloResponses[rand.nextInt(Responses.helloResponses.length)];
                break;
            case "Howdy":
                response = Responses.howdyResponses[rand.nextInt(Responses.howdyResponses.length)];
                break;
            case "Aloha":
                response = Responses.alohaResponse[rand.nextInt(Responses.howdyResponses.length)];
                break;
            case "Thank":
                response = Responses.thanksResponse[rand.nextInt(Responses.thanksResponse.length)];
                break;
            default:
                response = Responses.nonHiResponses[rand.nextInt(Responses.thanksResponse.length)];
                break;
        }

        System.out.println(response);
    }


}
