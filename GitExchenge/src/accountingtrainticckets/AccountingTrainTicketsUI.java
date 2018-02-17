/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

 */
package accountingtrainticckets;

import accountingtrainticckets.references.References;

import java.util.ArrayList;

import javax.swing.JDesktopPane;

import java.io.File;

import static java.lang.reflect.Array.set;

import java.net.URL;

import java.util.Arrays;

import java.util.HashSet;

import java.util.Set;

import java.util.logging.Level;

import java.util.logging.Logger;

import java.util.stream.Collectors;

/**
 *
 *
 *
 * @author 1
 *
 */
public class AccountingTrainTicketsUI extends javax.swing.JFrame {

    JDesktopPane desktop;

    /**
     *
     * Creates new form AccountingTrainTiccketsUI
     *
     */
    public AccountingTrainTicketsUI() {

        //Set up the GUI.
        desktop = new JDesktopPane(); //a specialized layered pane

        initComponents();

        this.setVisible(rootPaneCheckingEnabled);

        setContentPane(desktop);

    }

    //   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        documents = new javax.swing.JMenu();
        reference = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        documents.setText("documents");
        jMenuBar1.add(documents);

        reference.setText("reference");
        reference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                referenceMouseEntered(evt);
            }
        });
        jMenuBar1.add(reference);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void referenceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_referenceMouseEntered
        try {
            ArrayList<Class> RefList = new ArrayList<>();

            RefList.addAll(CreateReferencList());

            SelectReferenceUI SelectRefForm = new SelectReferenceUI();

            SelectRefForm.jList1.setListData(RefList.toArray());

            SelectRefForm.setVisible(true); //necessary asof 1.3

            //   SelectRefForm.show();
            desktop.add(SelectRefForm);

            try {

                SelectRefForm.setSelected(true);

            } catch (java.beans.PropertyVetoException e) {

            }

            /*   Class [] Cl_ = References.class.getClasses();

           

            int L_ = Cl_.length;

            System.out.println(L_);

            int counter_ = 0;

            while (counter_<= L_){

            System.out.println(Cl_[counter_].getName());

            counter_++;

            }*/
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(AccountingTrainTicketsUI.class.getName()).log(Level.SEVERE, null, ex);

        }


    }//GEN-LAST:event_referenceMouseEntered

    public static Set<Class<?>> CreateReferencList() throws ClassNotFoundException {

        //Class cl_;
        //while (cl_.getClassLoader()  {
        //    Object next = it.next();
        //}
        //((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs();
        //ClassLoader cl = ClassLoader.getSystemClassLoader();
        //URL[] urls = ((URLClassLoader) cl).getURLs();
        //URL[] urls = ((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs();
        //for (URL url : urls) {
        //    System.out.println(url.getFile());
        // }
        Set<Class<?>> s = loadClasses("accountingtrainticckets").stream()
                .filter(i -> checkAllParents(i, References.class))
                .collect(Collectors.toSet());

        return s;

    }

    public static Set<Class<?>> loadClasses(String packageName)
            throws ClassNotFoundException {

        Set<Class<?>> classes = new HashSet<>();

        URL resource = Thread.currentThread()
                .getContextClassLoader()
                .getResource(packageName.replace('.', '/'));

        File directory
                = new File(resource.getFile());

        if (!directory.exists()) {

            System.out.println("That path doesn't exist: " + directory);

            return classes;

        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {

            return classes;

        }

        for (File file : files) {

            //в другие пакеты уходить ненужно
            if (file.isFile() && file.getName().endsWith(".class")) {

                classes.add(Class
                        .forName(String.format("%s.%s",
                                packageName,
                                file.getName().substring(0, file.getName().indexOf(".")))));

            } else if (file.isDirectory()){
             
                File[] innerFiles = file.listFiles();
                if (innerFiles != null && innerFiles.length != 0){
                for (File f : innerFiles)  {
                    
                    
                    
                }  
                    
                } 
                
            }

        }

        return classes;

    }

    public static boolean checkAllParents(Class<?> type, Class<?> hasParentType) {

        Class<?> parent = type.getSuperclass();

        if (parent == Object.class) {

            return false;

        }

        if (parent.getClass() == hasParentType.getClass()) {

            return true;

        }

        return checkAllParents(parent, hasParentType);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu documents;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu reference;
    // End of variables declaration//GEN-END:variables
}
