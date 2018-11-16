import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author Andrew Helgeson
 * @version 11.16.2018
 */
public class Creature
{
   private int hp = 10;
   private int strength = 10;
   private Random rand;
   
   //constructor takes strength and hitpoints
   public Creature(int hitpoints, int str){
       hp = hitpoints;
       strength = str;
       rand = new Random();
       
   }
   
   //damage() method deals a random damage number between 1 and strength
   public int damage(){
       int rand_damage = rand.nextInt((strength - 1)) + 1;
       return rand_damage;
    }
   
    
    
   //isAlive() returns true if hp > 0
   public boolean isAlive()
   {
      if (hp > 0)
      {
          return true;
      }
      else
          return false;
   }
    
}
