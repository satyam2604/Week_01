import java.util.Scanner;

class DeckOfCards {
    public static void main(String[] args) {
        // Initialize suits and ranks
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // Calculate total number of cards
        int numOfCards = suits.length * ranks.length;

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks, numOfCards);

        // Shuffle the deck
        shuffleDeck(deck);

        // Take user input for the number of players and cards per player
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numOfPlayers = sc.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        if (numOfPlayers * cardsPerPlayer <= numOfCards) {
            String[][] players = distributeCards(deck, numOfPlayers, cardsPerPlayer);

            // Print the players and their cards
            printPlayersAndCards(players);
        } else {
            System.out.println("Not enough cards to distribute.");
        }

        sc.close(); // Close Scanner
    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks, int numOfCards) {
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            // Swap the current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
}
