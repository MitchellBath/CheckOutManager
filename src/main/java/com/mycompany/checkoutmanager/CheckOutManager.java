/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checkoutmanager;
import java.io.*;
/**
 *
 * @author mbath
 */
public class CheckOutManager {

    public static void main(String[] args) {
        System.out.println("Check in/out manager by Mitch Bath. 6.24.2022");
        
        // deserialize model
        Model model = null;
        try {
         FileInputStream fileIn = new FileInputStream("/tmp/list.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         model = (Model) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
      } catch (ClassNotFoundException c) {
         System.out.println("Model class not found");
         c.printStackTrace();
         return;
      }
        
        // new model if needed
        if (model == null) {
            model = new Model();
        }
        
        MainFrame mainframe = new MainFrame(model);
        mainframe.pack();
        mainframe.setVisible(true);
        
    }
}
