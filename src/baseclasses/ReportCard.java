/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseclasses;

import forms.AddClassroom;
import forms.AddCourse;
import forms.AddFaculty;
import forms.AddStudent;
import forms.Help;
import java.util.ArrayList;
import reports.ListClassrooms;
import reports.ListCourses;
import reports.ListFaculty;
import reports.ListStudents;

/**
 *
 * @author mkdesign
 */
public class ReportCard extends javax.swing.JFrame {

    DataContainer datacontainer = new DataContainer();
/*
    ArrayList<Classroom> listOfClassrooms = new ArrayList();
    ArrayList<Course> listOfCourses = new ArrayList();
    ArrayList<Faculty> listOfFaculty = new ArrayList();
    ArrayList<Student> listOfStudents = new ArrayList();
*/  
    /**
     * Creates new form ReportCard
     */
    public ReportCard() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileInputAddClassroom = new javax.swing.JMenu();
        fileInputAddClassrooms = new javax.swing.JMenuItem();
        fileInputAddCourses = new javax.swing.JMenuItem();
        fileInputAddFaculty = new javax.swing.JMenuItem();
        fileInputAddStudents = new javax.swing.JMenuItem();
        fileReportListClassrooms = new javax.swing.JMenu();
        fileReportList1 = new javax.swing.JMenuItem();
        fileReportList2 = new javax.swing.JMenuItem();
        fileReportList3 = new javax.swing.JMenuItem();
        fileReportList4 = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        fileOpenMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        fileInputAddClassroom.setText("Input");

        fileInputAddClassrooms.setText("Add Classroom");
        fileInputAddClassrooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fileInputAddClassroomsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileInputAddClassroomsMouseReleased(evt);
            }
        });
        fileInputAddClassroom.add(fileInputAddClassrooms);

        fileInputAddCourses.setText("Add Course");
        fileInputAddCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileInputAddCoursesMouseReleased(evt);
            }
        });
        fileInputAddClassroom.add(fileInputAddCourses);

        fileInputAddFaculty.setText("Add Faculty");
        fileInputAddFaculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileInputAddFacultyMouseReleased(evt);
            }
        });
        fileInputAddClassroom.add(fileInputAddFaculty);

        fileInputAddStudents.setText("Add Student");
        fileInputAddStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileInputAddStudentsMouseReleased(evt);
            }
        });
        fileInputAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileInputAddStudentsActionPerformed(evt);
            }
        });
        fileInputAddClassroom.add(fileInputAddStudents);

        jMenu1.add(fileInputAddClassroom);

        fileReportListClassrooms.setText("Report");

        fileReportList1.setText("List Classrooms");
        fileReportList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileReportList1MouseReleased(evt);
            }
        });
        fileReportListClassrooms.add(fileReportList1);

        fileReportList2.setText("List Courses");
        fileReportList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileReportList2MouseReleased(evt);
            }
        });
        fileReportListClassrooms.add(fileReportList2);

        fileReportList3.setText("List Faculty");
        fileReportList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileReportList3MouseReleased(evt);
            }
        });
        fileReportListClassrooms.add(fileReportList3);

        fileReportList4.setText("List Students");
        fileReportList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileReportList4MouseReleased(evt);
            }
        });
        fileReportListClassrooms.add(fileReportList4);

        jMenu1.add(fileReportListClassrooms);

        saveMenu.setText("Save");
        saveMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveMenuMouseReleased(evt);
            }
        });
        jMenu1.add(saveMenu);

        fileOpenMenuItem.setText("Open");
        fileOpenMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fileOpenMenuItemMouseReleased(evt);
            }
        });
        jMenu1.add(fileOpenMenuItem);

        jMenuBar1.add(jMenu1);

        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpMenuMousePressed(evt);
            }
        });
        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileInputAddClassroomsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputAddClassroomsMousePressed

    }//GEN-LAST:event_fileInputAddClassroomsMousePressed

    private void fileInputAddClassroomsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputAddClassroomsMouseReleased
        AddClassroom newClassroom = new AddClassroom(datacontainer);
        newClassroom.setVisible(true);
    }//GEN-LAST:event_fileInputAddClassroomsMouseReleased

    private void fileInputAddCoursesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputAddCoursesMouseReleased
        AddCourse newCourse = new AddCourse(datacontainer);
        newCourse.setVisible(true);
    }//GEN-LAST:event_fileInputAddCoursesMouseReleased

    private void fileInputAddFacultyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputAddFacultyMouseReleased
        AddFaculty newFaculty = new AddFaculty(datacontainer);
        newFaculty.setVisible(true);

    }//GEN-LAST:event_fileInputAddFacultyMouseReleased

    private void fileInputAddStudentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileInputAddStudentsMouseReleased
        AddStudent newStudent = new AddStudent(datacontainer);
        newStudent.setVisible(true);
    }//GEN-LAST:event_fileInputAddStudentsMouseReleased

    private void helpMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMousePressed
        Help newHelp = new Help();
        newHelp.setVisible(true);
    }//GEN-LAST:event_helpMenuMousePressed

    private void fileReportList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileReportList1MouseReleased
        ListClassrooms classroomsList = new ListClassrooms(datacontainer.getListOfClassrooms());
        classroomsList.setVisible(true);
    }//GEN-LAST:event_fileReportList1MouseReleased

    private void fileReportList2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileReportList2MouseReleased
        ListCourses coursesList = new ListCourses(datacontainer.getListOfCourses());
        coursesList.setVisible(true);
    }//GEN-LAST:event_fileReportList2MouseReleased

    private void fileReportList3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileReportList3MouseReleased
        ListFaculty facultyList = new ListFaculty(datacontainer.getListOfFaculty());
        facultyList.setVisible(true);
    }//GEN-LAST:event_fileReportList3MouseReleased

    private void fileReportList4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileReportList4MouseReleased
        ListStudents studentsList = new ListStudents(datacontainer.getListOfStudents());
        studentsList.setVisible(true);
    }//GEN-LAST:event_fileReportList4MouseReleased

    private void fileInputAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileInputAddStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileInputAddStudentsActionPerformed

    private void saveMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuMouseReleased
        datacontainer.writeXML();
    }//GEN-LAST:event_saveMenuMouseReleased

    private void fileOpenMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileOpenMenuItemMouseReleased
        datacontainer.readXML();
    }//GEN-LAST:event_fileOpenMenuItemMouseReleased

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
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileInputAddClassroom;
    private javax.swing.JMenuItem fileInputAddClassrooms;
    private javax.swing.JMenuItem fileInputAddCourses;
    private javax.swing.JMenuItem fileInputAddFaculty;
    private javax.swing.JMenuItem fileInputAddStudents;
    private javax.swing.JMenuItem fileOpenMenuItem;
    private javax.swing.JMenuItem fileReportList1;
    private javax.swing.JMenuItem fileReportList2;
    private javax.swing.JMenuItem fileReportList3;
    private javax.swing.JMenuItem fileReportList4;
    private javax.swing.JMenu fileReportListClassrooms;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables
}
