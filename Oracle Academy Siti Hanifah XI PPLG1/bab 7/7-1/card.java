public class card {
    String suit, name;
    int points;
    public card(int n1, int n2) {
        suit = (n1==1)?"Diamonds":(n1==2)?"Clubs":(n1==3)?"Spades":"Hearts";
        name = (n2==1)?"Ace":(n2==11)?"Jack":(n2==12)?"Queen":(n2==13)?"King":String.valueOf(n2);
        points = (n2==1)?11:(n2>=10)?10:n2;
    }
    public String toString() { return "The " + name + " of " + suit; }
}

