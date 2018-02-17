/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountingtrainticckets;


/**
 *
 * @author 1
 */
public class AccountingTrainTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AccountingTrainTicketsUI UsrInterface = new AccountingTrainTicketsUI();
            }
        });
        
    }
    
}
