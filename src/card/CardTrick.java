/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Student name: Ha Huynh
 * Student ID: 991748395
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int value = rand.nextInt(13)+1;
            c.setValue(value);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        luckyCard.setValue(8);
        luckyCard.setSuit(Card.SUITS[2]);

        for(Card c : magicHand){
            System.out.println(c);            
            if(luckyCard.equals(c))
            System.out.println("You are winning.");
        }
        System.out.println("Sorry, you lost.");
        
    }
    
}
