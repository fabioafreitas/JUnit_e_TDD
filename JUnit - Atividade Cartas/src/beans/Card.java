package beans;
/* Card.java
 */

public class Card {

    private int cardId;
    private int cardNumber;
    private String front;

    public Card(int cardId, int cardNumber, String front) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.front = front;
    }

    public boolean isAce() {
        return cardNumber == 0;
    }

    public int rank() {
        if (cardNumber == 0) {
            return 1;
        }
        if (cardNumber >= 10) {
            return 10;
        }
        return cardNumber + 1;
    }

    public String toString() {
        return this.front;
    }
}