/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountingtrainticckets.references;
import accountingtrainticckets.references.References;
import java.util.ArrayList;

/**
 *
 * @author 1
 */
public class Composition_ extends References {
    String Cod;
    String Name;   
    ArrayList<RowComposition> wagons  = new ArrayList<>();   
}

class RowComposition {
   int WagonNomber;
   TypeRollingStock WagonType; 
   
 RowComposition( int WN_,TypeRollingStock WT_) {  
 WagonNomber = WN_;
 WagonType = WT_;
     
 }
    
}
