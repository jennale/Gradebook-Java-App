/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackage;

/**
 *
 * @author Mike
 */
public class GradebookGUI extends javax.swing.JFrame {

    /**
     * Creates new form GradebookGUI
     */
    public GradebookGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addDelivarable = new javax.swing.JLabel();
        addStudent = new javax.swing.JLabel();
        addDeliverableText = new javax.swing.JLabel();
        addStudentText = new javax.swing.JLabel();
        myCourses = new javax.swing.JLabel();
        createCourse = new javax.swing.JLabel();
        createCourseText = new javax.swing.JLabel();
        gradesButton = new javax.swing.JLabel();
        setupButton = new javax.swing.JLabel();
        reportingButton = new javax.swing.JLabel();
        reportingFlow = new javax.swing.JLabel();
        setupFlow = new javax.swing.JLabel();
        gradesDivider = new javax.swing.JLabel();
        myCoursesDropDown = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gradebook");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDelivarable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/addbuttonYellow.png"))); // NOI18N
        addDelivarable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addDelivarable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDelivarableMouseClicked(evt);
            }
        });
        getContentPane().add(addDelivarable, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 400, -1, -1));

        addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/addbuttonGrey.png"))); // NOI18N
        addStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentMouseClicked(evt);
            }
        });
        getContentPane().add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 427, -1, -1));

        addDeliverableText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/addDeliverableText.png"))); // NOI18N
        getContentPane().add(addDeliverableText, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 402, -1, -1));

        addStudentText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/addStudentText.png"))); // NOI18N
        getContentPane().add(addStudentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 428, -1, -1));

        myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/myCourses.png"))); // NOI18N
        myCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myCoursesMouseClicked(evt);
            }
        });
        getContentPane().add(myCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 53, -1, 50));

        createCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/addbuttonGreen.png"))); // NOI18N
        createCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseMouseClicked(evt);
            }
        });
        getContentPane().add(createCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 295, -1, -1));
        createCourse.setVisible(false);

        createCourseText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/createCourseText.png"))); // NOI18N
        getContentPane().add(createCourseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 297, -1, -1));
        createCourseText.setVisible(false);

        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/gradesSelected.png"))); // NOI18N
        gradesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gradesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradesButtonMouseClicked(evt);
            }
        });
        getContentPane().add(gradesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/setupUnselected.png"))); // NOI18N
        setupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setupButtonMouseClicked(evt);
            }
        });
        getContentPane().add(setupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/reportingUnselected.png"))); // NOI18N
        reportingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportingButtonMouseClicked(evt);
            }
        });
        getContentPane().add(reportingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        reportingFlow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/tempReportingFlow.png"))); // NOI18N
        getContentPane().add(reportingFlow, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 103, -1, -1));
        reportingFlow.setVisible(false);

        setupFlow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/tempSetupFlow.png"))); // NOI18N
        getContentPane().add(setupFlow, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 103, -1, -1));
        setupFlow.setVisible(false);

        gradesDivider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/gradesDivider.png"))); // NOI18N
        getContentPane().add(gradesDivider, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 103, -1, -1));

        myCoursesDropDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/myCoursesDropDown.png"))); // NOI18N
        getContentPane().add(myCoursesDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 103, -1, -1));
        myCoursesDropDown.setVisible(false);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 670, 555);
    }// </editor-fold>//GEN-END:initComponents

        
    private void addDelivarableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDelivarableMouseClicked
        System.out.println("Create a pop up screen to add deliverable info?");
    }//GEN-LAST:event_addDelivarableMouseClicked

    private void addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addStudentMouseClicked

    private void myCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myCoursesMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
       }
       else
       {
           myCoursesDropDown.setVisible(true);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/myCoursesSelected.png")));
           createCourse.setVisible(true);
           createCourseText.setVisible(true);
       }
       
        
        
    }//GEN-LAST:event_myCoursesMouseClicked

    private void createCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCourseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createCourseMouseClicked

    private void gradesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseClicked
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/setupUnselected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/gradesSelected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/reportingUnselected.png")));
        addDelivarable.setVisible(true);
        addDeliverableText.setVisible(true);
        addStudent.setVisible(true);
        addStudentText.setVisible(true);
        gradesDivider.setVisible(true);
        reportingFlow.setVisible(false);
        setupFlow.setVisible(false);
    }//GEN-LAST:event_gradesButtonMouseClicked

    private void setupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setupButtonMouseClicked
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/setupSelected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/gradesUnselected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/reportingUnselected.png")));
        addDelivarable.setVisible(false);
        addDeliverableText.setVisible(false);
        addStudent.setVisible(false);
        addStudentText.setVisible(false);
        gradesDivider.setVisible(false);
        reportingFlow.setVisible(false);
        setupFlow.setVisible(true);
    }//GEN-LAST:event_setupButtonMouseClicked

    private void reportingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportingButtonMouseClicked
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/setupUnselected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/gradesUnselected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/reportingSelected.png")));
        addDelivarable.setVisible(false);
        addDeliverableText.setVisible(false);
        addStudent.setVisible(false);
        addStudentText.setVisible(false);
        gradesDivider.setVisible(false);
        reportingFlow.setVisible(true);
        setupFlow.setVisible(false);
    }//GEN-LAST:event_reportingButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradebookGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel addDelivarable;
    private javax.swing.JLabel addDeliverableText;
    private javax.swing.JLabel addStudent;
    private javax.swing.JLabel addStudentText;
    private javax.swing.JLabel createCourse;
    private javax.swing.JLabel createCourseText;
    private javax.swing.JLabel gradesButton;
    private javax.swing.JLabel gradesDivider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel myCourses;
    private javax.swing.JLabel myCoursesDropDown;
    private javax.swing.JLabel reportingButton;
    private javax.swing.JLabel reportingFlow;
    private javax.swing.JLabel setupButton;
    private javax.swing.JLabel setupFlow;
    // End of variables declaration//GEN-END:variables
}