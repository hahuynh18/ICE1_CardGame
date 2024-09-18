/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int value = rand.nextInt(13)+1;
            c.setValue(value);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int cardValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=C1ubs, 3=Spades): ");
        String suit = scanner.next();

        
        // and search magicHand here
        //Then report the result here
        
        for(Card c : magicHand){
            System.out.println(c);            
            if(c.getValue() == cardValue && c.getSuit().equalsIgnoreCase(suit))
            System.out.println("Your card is in the magic hand.");
        }
        System.out.println("Sorry, your card is in the magic hand.");
     
        
        // add one luckcard hard code 2,clubs
    }
    
}
