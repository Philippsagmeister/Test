package Schiffe_versenken;
public class Gebiet
{
   // Eigenschaften
   private boolean feldWurdeBeschossen;
   private boolean schiffIstAufFeld;

    // Konstruktor
   public Gebiet()
   {
      feldWurdeBeschossen=false;
      schiffIstAufFeld=false;
      //kommentar ignorieren
   }

   // Methoden
   public boolean beschiesseFeld(){
        feldWurdeBeschossen=true;
        if (schiffIstAufFeld) {
            versenkeSchiff();
            return true;
        }
        else return false;
   }

   public void setzeSchiff(){
        schiffIstAufFeld=true;
   }
   
   public void versenkeSchiff(){
        schiffIstAufFeld=false;
   }   
   
   public boolean isFeldWurdeBeschossen(){
        return feldWurdeBeschossen;
   }
   
   public boolean isSchiff(){
        return schiffIstAufFeld;
   }   
} // Ende der Klasse