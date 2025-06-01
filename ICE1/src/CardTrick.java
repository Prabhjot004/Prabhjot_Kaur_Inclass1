
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * name: prabhjot kaur
 * student number: 991804031
 * modified date: 31 may, 2025
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        
        Random rand = new Random();
        
        for (int i = 0; i<magicHand.length; i++)
        {
            Card card = new Card();
            card.setValue(rand.nextInt(13) + 1);
            card.setSuit(suits[rand.nextInt(suits.length)]);
            magicHand[i] = card;
        }
        
        Card luckyCard = new Card();
        //CHANGE LUCKYCARD VALUE TO 8
        luckyCard.setValue(8);
        luckyCard.setSuit("Diamonds");
        
        boolean found = false;
        for(Card card : magicHand)
        {
            if (card.getValue() == luckyCard.getValue() && 
                    card.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                found= true;
                break;
            }
        }
        
        System.out.println("Your lucky card:" + luckyCard.getValue() + "of" + luckyCard.getSuit());
        if (found) {
            System.out.println("Congrats, your card is in magic hand");
        }
        else{
            System.out.println("Sorry, your card is not in magic hand");
        }
                }
    
}
