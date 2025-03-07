import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        
        System.out.print("Enter number of players: ");
        int players = input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        input.close();
        
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards for the given players and cards per player.");
            return;
        }
        
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printDistributedCards(distributedCards);
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] distributedCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributedCards[i][j] = deck[index++];
            }
        }
        return distributedCards;
    }

    public static void printDistributedCards(String[][] distributedCards) {
        for (int i = 0; i < distributedCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : distributedCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
}
