package com.itcollege.lug;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class FlashCard {

    public FlashCard(String question, String answer) {
        //ToDo
        throw new NotImplementedException();
    }

    public String getQuestion() {
        //ToDo
        throw new NotImplementedException();
    }

    public String getAnswer() {
        //ToDo
        throw new NotImplementedException();
    }

    HashMap<String, String> getRepresentation() {
        //ToDo
        throw new NotImplementedException();
    }

}

class FlashCardDeck {

    private ArrayList<FlashCard> cards;
    private String deckName;
    private Scanner reader = new Scanner(System.in);

    public FlashCardDeck() {
        System.out.println("Creating new deck.\nGive a name to deck: \n");
        deckName = reader.nextLine();
        String response;
        while (true) {
            System.out.println("Create next card?");
            response = reader.nextLine();
            if (response.equals("n")) {
                if (cards.size() > 1) {
                    break;
                } else {
                    System.out.println("Not enough card, please enter at least 2 cards.");
                }
            }
            else if (response.equals("y")) {
                createCard();
            }
            else {
                System.out.println("Invalid Input!");
            }
        }
        while (true) {
            System.out.println("Save deck? (y/n)");
            response = reader.nextLine();
            if (response.equals("y")) {
                saveDeck();
                break;
            } else if (response.equals("n")){
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

    public FlashCardDeck(HashMap<String, String> data) {
        loadDeckFromJson();
    }

    public FlashCard getRandomCard() {
        //ToDo
        throw new NotImplementedException();
    }

    private void saveDeck() {
        //ToDo
        throw new NotImplementedException();
    }

    private void loadDeckFromJson() {
        //ToDo
        throw new NotImplementedException();
    }

    private void createCard() {
        //ToDo
        throw new NotImplementedException();
    }

}

class FlashCardExercise {

    private FlashCard currentCard;
    private FlashCardDeck deck;
    private Scanner reader = new Scanner(System.in);

    public FlashCardExercise() {
        deck = promptForDeck();
    }

    public void start() {
        String response;
        while (true) {
            giveInstructionsCard();
            System.out.println("What do you want to do next?");
            response = reader.nextLine();
            if (response.equals("n")) {
                askQuestion();
                System.out.println("Press enter for answer.");
                giveAnswer();
            } else if (response.equals("q")) {
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
        //ToDo
        throw new NotImplementedException();
    }

    private FlashCardDeck promptForDeck() {
        String response;
        while (true) {
            giveInstructionsDeck();
            response = reader.nextLine();
            if (response.equals("-n")) {
                //ToDo
                throw new NotImplementedException();
            } else if (response.equals("-l")) {
                return loadDeck();
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

    private void createNewDeck() {
        //ToDo
        throw new NotImplementedException();
    }

    private FlashCardDeck loadDeck() {
        String response;
        while (true) {
            System.out.println("Enter name of deck: ");
            response = reader.nextLine();
            //ToDo
            throw new NotImplementedException();
        }
    }

    private void askQuestion() {
        //ToDo
        throw new NotImplementedException();
    }

    private void giveAnswer() {
        //ToDo
        throw new NotImplementedException();
    }

    private void giveInstructionsCard() {
        System.out.println("n next card\nq quit\n");
    }

    private void giveInstructionsDeck() {
        System.out.println("-n create new deck\n-l load existing deck");
    }
}

public class Main {

    public static void main(String[] args) {
	    FlashCardExercise exercise = new FlashCardExercise();
        exercise.start();
    }
}
