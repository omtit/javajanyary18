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
public class TypeRollingStock extends References{
    String Cod;
    String Name;
//    String CodeSeats;
//    String [] TypeSeats = {"НижняяПолка","ВерхняяПолка","БоковаНижняяПолка","БоковаяВерхняяПолка"};
    
ArrayList<RowStructureAccommodation> StructureAccommodation  = new ArrayList<>();       
}

class RowStructureAccommodation {
   String CodeSeats;
   String [] TypeSeats = {"НижняяПолка","ВерхняяПолка","БоковаНижняяПолка","БоковаяВерхняяПолка"};
 RowStructureAccommodation(String CS_) { 
 CodeSeats = CS_;
 }
    
}