
package com.mycompany.assignmentone;

import javax.swing.JOptionPane;


public class AssessmentOneGui extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AssessmentOneGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("How many integers?");
        jButton1.setToolTipText("");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 516, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String numberOfIntegersInput = JOptionPane.showInputDialog(this, "Enter the number of enters you want:"); 
        
        if (isANumber(numberOfIntegersInput) && Integer.parseInt(numberOfIntegersInput) > 0) {
            int arraySize = Integer.parseInt(numberOfIntegersInput);
            int[] arrayOfIntegers = new int[arraySize];
            
            arrayOfIntegers = fillArrayWithIntegers(arrayOfIntegers);
            
            printFromFirstToLast(arrayOfIntegers);
            printfromLastToFirst(arrayOfIntegers);
            printMinimum(arrayOfIntegers);
            printMaximum(arrayOfIntegers);
            printTotal(arrayOfIntegers);
            printAverage(arrayOfIntegers);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssessmentOneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssessmentOneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssessmentOneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssessmentOneGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssessmentOneGui().setVisible(true);
            }
        });
    }

    private boolean isANumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
           
        }
        
        return false;
    }
    
    private int[] fillArrayWithIntegers(int[] arrayOfIntegers) {
        int[] resultArray = new int[arrayOfIntegers.length];
        
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            String input = JOptionPane.showInputDialog(this, "Enter the value for integer number " + (i + 1) + " or enter `s` to stop: ");
            
            if (input.equalsIgnoreCase("s")) {
                break;
            } else {
                if (isANumber(input)) {
                    resultArray[i] = Integer.parseInt(input);
                }
            }
        }
        
        return resultArray;
    }
    
    private void printFromFirstToLast(int[] arrayOfIntegers) {
        String numbers = "";
        
       for (int i = 0; i < arrayOfIntegers.length; i++) {
           numbers += arrayOfIntegers[i] + " ";
       }
       
       String message = "From first to last: \n" + numbers;
       
       JOptionPane.showMessageDialog(this, message);
    }
    
    private void printfromLastToFirst(int[] arrayOfIntegers) {
        String numbers = "";
        
       for (int i = arrayOfIntegers.length - 1; i >= 0; i--) {
           numbers += arrayOfIntegers[i] + " ";
       }
       
       String message = "From last to first: \n" + numbers;
       
       JOptionPane.showMessageDialog(this, message);
    }
    
    private void printMinimum(int[] arrayOfIntegers) {
        int minimum = findMinimum(arrayOfIntegers);
        
        String message = "Minimum: " + minimum;
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void printMaximum(int[] arrayOfIntegers) {
        int maximum = findMaximum(arrayOfIntegers);
        
        String message = "Maximum: " + maximum;
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void printTotal(int[] arrayOfIntegers) {
        int total = calculateTotal(arrayOfIntegers);
        
        String message = "Total: " + total;
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void printAverage(int[] arrayOfIntegers) {
        double average = calculateAverage(arrayOfIntegers);
        
        String message = "Average: " + average;
        JOptionPane.showMessageDialog(this, message);
    }
    
    private int findMinimum(int[] arrayOfIntegers) {
        int minimum = arrayOfIntegers[0];
        
        for (int i = 0; i < arrayOfIntegers.length; i++) {
           if (arrayOfIntegers[i] < minimum) {
               minimum = arrayOfIntegers[i];
           }
        }
        
        return minimum;
    }
    
    private int findMaximum(int[] arrayOfIntegers) {
        int maximum = arrayOfIntegers[0];
        
        for (int i = 0; i < arrayOfIntegers.length; i++) {
           if (arrayOfIntegers[i] > maximum) {
               maximum = arrayOfIntegers[i];
           }
        }
        
        return maximum;
    }
    
    private int calculateTotal(int[] arrayOfIntegers) {
        int total = 0;
        
        for (int i = 0; i < arrayOfIntegers.length; i++) {
           total += arrayOfIntegers[i];
        }
        
        return total;
    }
    
    private double calculateAverage(int[] arrayOfIntegers) {
        double average = (double)calculateTotal(arrayOfIntegers) / arrayOfIntegers.length;
        
        return average;
    }
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
