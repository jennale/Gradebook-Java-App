/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs2212.team4;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

/**
 *
 * @author Mike
 */
public class GradebookGUI extends javax.swing.JFrame {

    Gradebook gradebook = new Gradebook();
    
    int currentCourse=0;
    
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    DefaultListModel model3 = new DefaultListModel();
    
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
        popupExit = new javax.swing.JLabel();
        addNewStudentText = new javax.swing.JLabel();
        studentEmail = new javax.swing.JTextField();
        studentNumber = new javax.swing.JTextField();
        studentLastName = new javax.swing.JTextField();
        studentFirstName = new javax.swing.JTextField();
        inputTermText = new javax.swing.JTextField();
        inputCourseCode = new javax.swing.JTextField();
        inputCourseTitle = new javax.swing.JTextField();
        inputDeliverableWeight = new javax.swing.JTextField();
        inputDeliverableName = new javax.swing.JTextField();
        deliverableType = new javax.swing.JComboBox();
        popupDeliverableTitle = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        okButtonStudent = new javax.swing.JLabel();
        okButtonCourses = new javax.swing.JLabel();
        okButtonDeliverable = new javax.swing.JLabel();
        addCourseTitle = new javax.swing.JLabel();
        popup = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list3 = new JList(model3);
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new JList(model2);
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new JList(model);
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
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gradebook");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        popupExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/exit.png"))); // NOI18N
        popupExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popupExitMouseClicked(evt);
            }
        });
        getContentPane().add(popupExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 196, -1, -1));
        popupExit.setVisible(false);

        addNewStudentText.setText("Add New Student");
        getContentPane().add(addNewStudentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, -1));
        addNewStudentText.setVisible(false);

        studentEmail.setText("Student email");
        getContentPane().add(studentEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, -1));
        studentEmail.setVisible(false);

        studentNumber.setText("Student number");
        studentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNumberActionPerformed(evt);
            }
        });
        getContentPane().add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 180, -1));
        studentNumber.setVisible(false);

        studentLastName.setText("Last name");
        getContentPane().add(studentLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));
        studentLastName.setVisible(false);

        studentFirstName.setText("First name");
        studentFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(studentFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 180, -1));
        studentFirstName.setVisible(false);

        inputTermText.setText("Term");
        inputTermText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTermTextActionPerformed(evt);
            }
        });
        getContentPane().add(inputTermText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, -1));
        inputTermText.setVisible(false);

        inputCourseCode.setText("Code");
        getContentPane().add(inputCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 180, -1));
        inputCourseCode.setVisible(false);

        inputCourseTitle.setText("Title");
        inputCourseTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCourseTitleActionPerformed(evt);
            }
        });
        getContentPane().add(inputCourseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));
        inputCourseTitle.setVisible(false);

        inputDeliverableWeight.setText("Weight");
        getContentPane().add(inputDeliverableWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 180, -1));
        inputDeliverableWeight.setVisible(false);

        inputDeliverableName.setText("Name");
        inputDeliverableName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDeliverableNameActionPerformed(evt);
            }
        });
        getContentPane().add(inputDeliverableName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));
        inputDeliverableName.setVisible(false);

        deliverableType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assignment", "Exam", "Other"}));
        getContentPane().add(deliverableType, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, -1));
        deliverableType.setVisible(false);

        popupDeliverableTitle.setText("Add New Deliverable");
        getContentPane().add(popupDeliverableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));
        popupDeliverableTitle.setVisible(false);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/cancel.png"))); // NOI18N
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));
        cancelButton.setVisible(false);

        okButtonStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/ok.png"))); // NOI18N
        okButtonStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonStudentMouseClicked(evt);
            }
        });
        getContentPane().add(okButtonStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));
        okButtonStudent.setVisible(false);

        okButtonCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/ok.png"))); // NOI18N
        okButtonCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonCoursesMouseClicked(evt);
            }
        });
        getContentPane().add(okButtonCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));
        okButtonCourses.setVisible(false);

        okButtonDeliverable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/ok.png"))); // NOI18N
        okButtonDeliverable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okButtonDeliverable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonDeliverableMouseClicked(evt);
            }
        });
        getContentPane().add(okButtonDeliverable, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));
        okButtonDeliverable.setVisible(false);

        addCourseTitle.setText("Add New Course");
        getContentPane().add(addCourseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, -1));
        addCourseTitle.setVisible(false);

        popup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/popup.png"))); // NOI18N
        getContentPane().add(popup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
        popup.setVisible(false);

        list3.setModel(model3);
        jScrollPane3.setViewportView(list3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, 330));

        list2.setModel(model2);
        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 110, 110, 180));
        jScrollPane2.setVisible(false);

        list.setModel(model);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 260));

        addDelivarable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/addbuttonYellow.png"))); // NOI18N
        addDelivarable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addDelivarable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDelivarableMouseClicked(evt);
            }
        });
        getContentPane().add(addDelivarable, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 400, -1, -1));

        addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/addbuttonGrey.png"))); // NOI18N
        addStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentMouseClicked(evt);
            }
        });
        getContentPane().add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 427, -1, -1));

        addDeliverableText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/addDeliverableText.png"))); // NOI18N
        getContentPane().add(addDeliverableText, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 402, -1, -1));

        addStudentText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/addStudentText.png"))); // NOI18N
        getContentPane().add(addStudentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 428, -1, -1));

        myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/myCourses.png"))); // NOI18N
        myCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myCoursesMouseClicked(evt);
            }
        });
        getContentPane().add(myCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 53, -1, 50));

        createCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/addbuttonGreen.png"))); // NOI18N
        createCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseMouseClicked(evt);
            }
        });
        getContentPane().add(createCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 295, -1, -1));
        createCourse.setVisible(false);

        createCourseText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/createCourseText.png"))); // NOI18N
        getContentPane().add(createCourseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 297, -1, -1));
        createCourseText.setVisible(false);

        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/gradesSelected.png"))); // NOI18N
        gradesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gradesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradesButtonMouseClicked(evt);
            }
        });
        getContentPane().add(gradesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/setupUnselected.png"))); // NOI18N
        setupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setupButtonMouseClicked(evt);
            }
        });
        getContentPane().add(setupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/reportingUnselected.png"))); // NOI18N
        reportingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportingButtonMouseClicked(evt);
            }
        });
        getContentPane().add(reportingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 80, -1, -1));

        reportingFlow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/tempReportingFlow.png"))); // NOI18N
        getContentPane().add(reportingFlow, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 103, -1, -1));
        reportingFlow.setVisible(false);

        setupFlow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/tempSetupFlow.png"))); // NOI18N
        getContentPane().add(setupFlow, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 103, -1, -1));
        setupFlow.setVisible(false);

        gradesDivider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/gradesDivider.png"))); // NOI18N
        getContentPane().add(gradesDivider, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 103, -1, -1));

        myCoursesDropDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/myCoursesDropDown.png"))); // NOI18N
        getContentPane().add(myCoursesDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 103, -1, -1));
        myCoursesDropDown.setVisible(false);

        jLabel2.setText("Save");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2212/team4/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 670, 555);
    }// </editor-fold>//GEN-END:initComponents

        
    private void addDelivarableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDelivarableMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
           jScrollPane2.setVisible(false);
       }
       addDelivarable.setEnabled(false);
       addStudent.setEnabled(false);
       myCourses.setEnabled(false);
       gradesButton.setEnabled(false);
       setupButton.setEnabled(false);
       reportingButton.setEnabled(false);
       popup.setVisible(true);
       popupExit.setVisible(true);
       popupDeliverableTitle.setVisible(true);
       okButtonDeliverable.setVisible(true);
       cancelButton.setVisible(true);
       inputDeliverableName.setVisible(true);
       inputDeliverableWeight.setVisible(true);
       deliverableType.setVisible(true);
    }//GEN-LAST:event_addDelivarableMouseClicked

    private void addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseClicked
        if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
           jScrollPane2.setVisible(false);
       }
        
       addDelivarable.setEnabled(false);
       addStudent.setEnabled(false);
       myCourses.setEnabled(false);
       gradesButton.setEnabled(false);
       setupButton.setEnabled(false);
       reportingButton.setEnabled(false);
       popup.setVisible(true);
       popupExit.setVisible(true);
       addNewStudentText.setVisible(true);
       okButtonStudent.setVisible(true);
       cancelButton.setVisible(true);
       studentFirstName.setVisible(true);
       studentLastName.setVisible(true);
       studentNumber.setVisible(true);
    }//GEN-LAST:event_addStudentMouseClicked

    private void myCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myCoursesMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
           jScrollPane2.setVisible(false);
       }
       else
       {
           myCoursesDropDown.setVisible(true);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCoursesSelected.png")));
           createCourse.setVisible(true);
           createCourseText.setVisible(true);
           jScrollPane2.setVisible(true);
       }
       
        
        
    }//GEN-LAST:event_myCoursesMouseClicked

    private void createCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCourseMouseClicked
       addDelivarable.setEnabled(false);
       addStudent.setEnabled(false);
       myCourses.setEnabled(false);
       gradesButton.setEnabled(false);
       setupButton.setEnabled(false);
       reportingButton.setEnabled(false);
       popup.setVisible(true);
       popupExit.setVisible(true);
       addCourseTitle.setVisible(true);
       okButtonCourses.setVisible(true);
       cancelButton.setVisible(true);
       
       inputTermText.setVisible(true);
       inputCourseTitle.setVisible(true);
       inputCourseCode.setVisible(true);
    }//GEN-LAST:event_createCourseMouseClicked

    private void gradesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
       }
        
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("setupUnselected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("gradesSelected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("reportingUnselected.png")));
        addDelivarable.setVisible(true);
        addDeliverableText.setVisible(true);
        addStudent.setVisible(true);
        addStudentText.setVisible(true);
        gradesDivider.setVisible(true);
        reportingFlow.setVisible(false);
        setupFlow.setVisible(false);
        list.setVisible(true);
        jScrollPane1.setVisible(true);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_gradesButtonMouseClicked

    private void setupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setupButtonMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
       }
        
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("setupSelected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("gradesUnselected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("reportingUnselected.png")));
        addDelivarable.setVisible(false);
        addDeliverableText.setVisible(false);
        addStudent.setVisible(false);
        addStudentText.setVisible(false);
        gradesDivider.setVisible(false);
        reportingFlow.setVisible(false);
        setupFlow.setVisible(true);
        list.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_setupButtonMouseClicked

    private void reportingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportingButtonMouseClicked
       if(myCoursesDropDown.isVisible()==true)
       {
           myCoursesDropDown.setVisible(false);
           myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("myCourses.png")));
           createCourse.setVisible(false);
           createCourseText.setVisible(false);
       }
        
        setupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("setupUnselected.png")));
        gradesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("gradesUnselected.png")));
        reportingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("reportingSelected.png")));
        addDelivarable.setVisible(false);
        addDeliverableText.setVisible(false);
        addStudent.setVisible(false);
        addStudentText.setVisible(false);
        gradesDivider.setVisible(false);
        reportingFlow.setVisible(true);
        setupFlow.setVisible(false);
        list.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_reportingButtonMouseClicked

    private void popupExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupExitMouseClicked
       addDelivarable.setEnabled(true);
       addStudent.setEnabled(true);
       myCourses.setEnabled(true);
       gradesButton.setEnabled(true);
       setupButton.setEnabled(true);
       reportingButton.setEnabled(true);
       popup.setVisible(false);
       popupExit.setVisible(false);
       popupDeliverableTitle.setVisible(false);
       okButtonDeliverable.setVisible(false);
       cancelButton.setVisible(false);
       inputDeliverableName.setVisible(false);
       inputDeliverableWeight.setVisible(false);
       deliverableType.setVisible(false);
       
       addCourseTitle.setVisible(false);
       okButtonCourses.setVisible(false);
       inputTermText.setVisible(false);
       inputCourseTitle.setVisible(false);
       inputCourseCode.setVisible(false);
       
       addNewStudentText.setVisible(false);
       okButtonStudent.setVisible(false);
       studentFirstName.setVisible(false);
       studentLastName.setVisible(false);
       studentNumber.setVisible(false);
       studentEmail.setVisible(false);
    }//GEN-LAST:event_popupExitMouseClicked

    private void inputDeliverableNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDeliverableNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDeliverableNameActionPerformed

    private void okButtonDeliverableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonDeliverableMouseClicked
        if (currentCourse>=0){
        Course course = gradebook.getCourse(currentCourse);
        try
        {
            String name = inputDeliverableName.getText();
            String type = (String)deliverableType.getSelectedItem();
            double weight = Double.parseDouble(inputDeliverableWeight.getText());
            
            course.addDeliverable(inputDeliverableName.getText(), 
                    ((String)deliverableType.getSelectedItem()).toLowerCase(), Double.parseDouble(inputDeliverableWeight.getText()));
            addDelivarable.setEnabled(true);
            addStudent.setEnabled(true);
            myCourses.setEnabled(true);
            gradesButton.setEnabled(true);
            setupButton.setEnabled(true);
            reportingButton.setEnabled(true);
            popup.setVisible(false);
            popupExit.setVisible(false);
            popupDeliverableTitle.setVisible(false);
            okButtonDeliverable.setVisible(false);
            cancelButton.setVisible(false);
            inputDeliverableName.setVisible(false);
            inputDeliverableWeight.setVisible(false);
            deliverableType.setVisible(false);
            jScrollPane2.setVisible(false);
            
            String string = new String(name+" "+type+" "+" " +weight+"%");

            int pos = list.getModel().getSize();
            model.add(pos, string);
            
            inputDeliverableName.setText("Name");          
            inputDeliverableWeight.setText("Weight");
            }
        
        catch (NumberFormatException e)
        {
            System.out.println("Has to be a number");
            
        }}
        System.out.println("No Course");
    }//GEN-LAST:event_okButtonDeliverableMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        addDelivarable.setEnabled(true);
        addStudent.setEnabled(true);
        myCourses.setEnabled(true);
        gradesButton.setEnabled(true);
        setupButton.setEnabled(true);
        reportingButton.setEnabled(true);
        popup.setVisible(false);
        popupExit.setVisible(false);
        popupDeliverableTitle.setVisible(false);
        okButtonDeliverable.setVisible(false);
        cancelButton.setVisible(false);
        inputDeliverableName.setVisible(false);
        inputDeliverableWeight.setVisible(false);
        deliverableType.setVisible(false);
        
        okButtonCourses.setVisible(false);
        addCourseTitle.setVisible(false);
        inputTermText.setVisible(false);
        inputCourseTitle.setVisible(false);
        inputCourseCode.setVisible(false);
         
       addNewStudentText.setVisible(false);
       okButtonStudent.setVisible(false);
       studentFirstName.setVisible(false);
       studentLastName.setVisible(false);
       studentNumber.setVisible(false);
       studentEmail.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listMouseClicked

    private void inputCourseTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCourseTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCourseTitleActionPerformed

    private void okButtonCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonCoursesMouseClicked
        
            String title = inputCourseTitle.getText();
            String code = inputCourseCode.getText();
            String term = inputTermText.getText();
            
            if (gradebook.addCourse(title, term, code)){
            addDelivarable.setEnabled(true);
            addStudent.setEnabled(true);
            myCourses.setEnabled(true);
            gradesButton.setEnabled(true);
            setupButton.setEnabled(true);
            reportingButton.setEnabled(true);
            popup.setVisible(false);
            popupExit.setVisible(false);
            addCourseTitle.setVisible(false);
            okButtonCourses.setVisible(false);
            cancelButton.setVisible(false);
            inputTermText.setVisible(false);
            inputCourseTitle.setVisible(false);
            inputCourseCode.setVisible(false);
            
            Course crs = gradebook.getCourse(currentCourse);
            String str = new String(crs.getTitle()+" "+crs.getCode()+" "+crs.getTerm());
            
            
            int pos = list2.getModel().getSize();
            model2.add(pos, str);
            currentCourse=list2.getModel().getSize();
            }
            
            inputCourseTitle.setText("Title");
            inputCourseCode.setText("Code");
            inputTermText.setText("Term");
    }//GEN-LAST:event_okButtonCoursesMouseClicked

    private void list2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MouseClicked
        currentCourse=list2.getSelectedIndex();
        
        for(int i =0; i<list.getModel().getSize();i++)model.remove(i);
        int i=0, j=0;
        Deliverable deliver;
        try
        {
            Course crs=gradebook.getCourse(currentCourse);
        while((deliver=crs.getDeliverable(i))!=null)
        {
            String name=deliver.getName();
            String type=deliver.getType();
            Double weight=deliver.getWeight();
            String string = new String(name+" "+type+" "+" " +weight+"%");
            int pos = list.getModel().getSize();
            model.add(pos, string);
            i++;
        }
        Student stud;
        while((stud=crs.getStudent(j))!=null)
        {
            String nameFirst=stud.getNameFirst();
            String nameLast=stud.getNameLast();
            int num=stud.getNumber();
            String email=stud.getEmail();
            String string = new String(nameFirst+" "+nameLast+" "+" " +num+" "+email);
            int pos = list3.getModel().getSize();
            model3.add(pos, string);
            j++;
        }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            
        }
        catch (IndexOutOfBoundsException e)
        {
            
        } 
        
    }//GEN-LAST:event_list2MouseClicked

    private void studentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentFirstNameActionPerformed

    private void studentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNumberActionPerformed

    private void okButtonStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonStudentMouseClicked
        try{    
        String firstName = studentFirstName.getText();
            String lastName = studentLastName.getText();
            int studentNum = Integer.parseInt(studentNumber.getText());
            String studentMail= studentEmail.getText();
            
            addDelivarable.setEnabled(true);
            addStudent.setEnabled(true);
            myCourses.setEnabled(true);
            gradesButton.setEnabled(true);
            setupButton.setEnabled(true);
            reportingButton.setEnabled(true);
            studentEmail.setVisible(true);
            popup.setVisible(false);
            popupExit.setVisible(false);
            cancelButton.setVisible(false);
            addNewStudentText.setVisible(false);
            okButtonStudent.setVisible(false);
            studentFirstName.setVisible(false);
            studentLastName.setVisible(false);
            studentNumber.setVisible(false);
            
            Course crs = gradebook.getCourse(currentCourse);
            crs.addStudent(firstName, lastName, studentNum, studentMail);
            String str = new String(firstName+" "+lastName+" "+studentNum+" "+studentMail);
            
            
            int pos = list3.getModel().getSize();
            model3.add(pos, str);
        }
        catch(NumberFormatException e)
        {
            
        }
            studentFirstName.setText("First name");
            studentLastName.setText("Last name");
            studentNumber.setText("Student Number");
    }//GEN-LAST:event_okButtonStudentMouseClicked

    private void inputTermTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTermTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTermTextActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        gradebook.store("data.dat");
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JLabel addCourseTitle;
    private javax.swing.JLabel addDelivarable;
    private javax.swing.JLabel addDeliverableText;
    private javax.swing.JLabel addNewStudentText;
    private javax.swing.JLabel addStudent;
    private javax.swing.JLabel addStudentText;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel createCourse;
    private javax.swing.JLabel createCourseText;
    private javax.swing.JComboBox deliverableType;
    private javax.swing.JLabel gradesButton;
    private javax.swing.JLabel gradesDivider;
    private javax.swing.JTextField inputCourseCode;
    private javax.swing.JTextField inputCourseTitle;
    private javax.swing.JTextField inputDeliverableName;
    private javax.swing.JTextField inputDeliverableWeight;
    private javax.swing.JTextField inputTermText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList list;
    private javax.swing.JList list2;
    private javax.swing.JList list3;
    private javax.swing.JLabel myCourses;
    private javax.swing.JLabel myCoursesDropDown;
    private javax.swing.JLabel okButtonCourses;
    private javax.swing.JLabel okButtonDeliverable;
    private javax.swing.JLabel okButtonStudent;
    private javax.swing.JLabel popup;
    private javax.swing.JLabel popupDeliverableTitle;
    private javax.swing.JLabel popupExit;
    private javax.swing.JLabel reportingButton;
    private javax.swing.JLabel reportingFlow;
    private javax.swing.JLabel setupButton;
    private javax.swing.JLabel setupFlow;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentFirstName;
    private javax.swing.JTextField studentLastName;
    private javax.swing.JTextField studentNumber;
    // End of variables declaration//GEN-END:variables
}
