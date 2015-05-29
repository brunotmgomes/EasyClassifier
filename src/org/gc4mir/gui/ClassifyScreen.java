/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gc4mir.gui;

import jAudio.JAudioCommandLine;
import jAudioFeatureExtractor.Controller;
import jAudioFeatureExtractor.OuterFrame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.gc4mir.controllers.BaseRecordings;
import org.gc4mir.core.Core;
import org.gc4mir.core.JaudioThread;
import org.gc4mir.util.ACECommunicator;

/**
 *
 * @author Bruno
 */
public class ClassifyScreen extends javax.swing.JFrame {

    private DefaultTableModel tableModelRecordings;
    private DefaultTableModel tableModelClassifiers;
    private JFileChooser load_recording_chooser = null;
    private Core core;
    private JFrame results;
    private ACECommunicator aceCommunicator;
    
    /**
     * Creates new form OpenScreen
     */
    public ClassifyScreen() {
        initComponents();
        this.setLocationRelativeTo( null );

        System.out.println("null results error");
        setLocationRelativeTo(null);
        
        this.core = Core.getInstance();
        
        this.tableModelRecordings = new DefaultTableModel();
        this.tableModelRecordings.addColumn("Name");
        this.tableModelRecordings.addColumn("Path");
        jTable1.setModel(this.tableModelRecordings);
        
        this.tableModelClassifiers = new DefaultTableModel();
        this.tableModelClassifiers.addColumn("Choose Classifier");
        jTable2.setModel(this.tableModelClassifiers);
    }
    
    public ClassifyScreen(JFrame results) {
        initComponents();
        this.setLocationRelativeTo( null );
        aceCommunicator = ACECommunicator.getInstance();
        
        this.results = results;
        
        setLocationRelativeTo(null);
        
        this.core = Core.getInstance();
        
        this.tableModelRecordings = new DefaultTableModel();
        this.tableModelRecordings.addColumn("Name");
        this.tableModelRecordings.addColumn("Path");
        jTable1.setModel(this.tableModelRecordings);
        
        this.tableModelClassifiers = new DefaultTableModel();
        this.tableModelClassifiers.addColumn("Choose Classifier");
        jTable2.setModel(this.tableModelClassifiers);
        
        //will be true if help is enabled
        if(core.getHelp()){
            jCheckBoxMenuItem1.setSelected(true);
        }else{
            jCheckBoxMenuItem1.setSelected(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        extractButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        continueButton1 = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyClassifier");

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Path"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Continue");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Select Audios", jPanel1);

        extractButton.setText("Extract automatically");
        extractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Easy. Extract default features.");

        jButton1.setText("Open Jaudio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fine tune. Control the extraction process.");

        continueButton1.setText("Continue");
        continueButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButton1ActionPerformed(evt);
            }
        });

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(extractButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extractButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton1)
                    .addComponent(backButton1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Extract Features", jPanel2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Choose Classifier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Classify");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test", jPanel3);

        jMenu1.setText("Change Perspective");

        jMenuItem2.setText("Create Classifier");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Export Classifier");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("View");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });

        jMenuItem1.setText("Results Window");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Help");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void extractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractButtonActionPerformed

        
        if(!core.getBaseRecordings().isEmpty()){
            results.setVisible(true);
            try{
                //true in the second argument will extract features from uncategorized audios
                new JaudioThread(this,true).start();
            }catch(Exception e){
                System.out.println("erro: " + e);
            }
        }else{
            JOptionPane.showMessageDialog(this,
                    "There are no audios to extract features from.",
                    "No audios",
                    JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_extractButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller c = new Controller();
        new OuterFrame(c);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void continueButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_continueButton1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new BasicMainScreen(core.getResults()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (load_recording_chooser == null) {
            load_recording_chooser = new JFileChooser();
            load_recording_chooser.setCurrentDirectory(new File("."));
            load_recording_chooser
            .setFileFilter(new jAudioFeatureExtractor.jAudioTools.FileFilterAudio());
            load_recording_chooser
            .setFileSelectionMode(JFileChooser.FILES_ONLY);
            load_recording_chooser.setMultiSelectionEnabled(true);
        }

        // Read the user's choice of load or cancel
        int dialog_result = load_recording_chooser.showOpenDialog(null);

        // Add the files to the table and to recording_list
        if (dialog_result == JFileChooser.APPROVE_OPTION) // only do if OK
        // chosen
        {
            File[] load_files = load_recording_chooser.getSelectedFiles();
            try {
                for(int i = 0; i < load_files.length; i++){
                    // Verify that the file exists
                    if(load_files[i].exists()){
                        core.addRecording(load_files[i].getName(), load_files[i].getPath());
                    }
                }
                refreshRecordingTable();
                createFiles();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    public void createFiles(){
        try {
            String content = "";
            content = content + "<?xml version=\"1.0\"?>\n" +
                    "<!DOCTYPE classifications_file [\n" +
                    "   <!ELEMENT classifications_file (comments, data_set+)>\n" +
                    "   <!ELEMENT comments (#PCDATA)>\n" +
                    "   <!ELEMENT data_set (data_set_id, misc_info*, role?, classification)>\n" +
                    "   <!ELEMENT data_set_id (#PCDATA)>\n" +
                    "   <!ELEMENT misc_info (#PCDATA)>\n" +
                    "   <!ATTLIST misc_info info_type CDATA \"\">\n" +
                    "   <!ELEMENT role (#PCDATA)>\n" +
                    "   <!ELEMENT classification (section*, class*)>\n" +
                    "   <!ELEMENT section (start, stop, class+)>\n" +
                    "   <!ELEMENT class (#PCDATA)>\n" +
                    "   <!ELEMENT start (#PCDATA)>\n" +
                    "   <!ELEMENT stop (#PCDATA)>\n" +
                    "]>\n"
                    + "<classifications_file>\n" +
                    "\n" +
                    "   <comments></comments>\n"
                    + "\n";
            
            for(int i = 0; i < core.getBaseCategories().getCategories().size(); i++){
                
            }
            
            for(int j = 0; j < core.getBaseRecordings().getRecordingsSize(); j++){
                    String instance = "<data_set>\n" +
                                    "		<data_set_id>"
                                    + core.getBaseRecordings().getRecording(j).getPath() +
                                    "</data_set_id>\n" +
                                    "		<role>training</role>\n" +
                                    "    	<classification><class>"
                                    + "classifying" +
                                    "</class></classification>\n" +
                                    "   </data_set>\n";
                    content = content + instance;
                }
            
            content = content + "\n</classifications_file>";
            
            FileWriter featuresNewFile;
            featuresNewFile = new FileWriter(new File("Instances.xml"));
            featuresNewFile.write(content);
            featuresNewFile.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GC4MIRMainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void refreshRecordingTable(){
        tableModelRecordings.setRowCount(0);
        for(int i = 0; i < core.getRecordingsSize(); i++){
            String name = core.getBaseRecordings().getRecording(i).getName();
            String path = core.getBaseRecordings().getRecording(i).getPath();
            tableModelRecordings.addRow(new Object[]{name, path});
        }
    }
    
    private void loadClassifiers(){
        tableModelClassifiers.setRowCount(0);
        core.getBaseClassifiers().loadClassifiers();
        
        for(int i = 0; i < core.getBaseClassifiers().getSize(); i++){
            String name = core.getBaseClassifiers().getName(i);
            tableModelClassifiers.addRow(new Object[]{name});
        }
    }
    
    
    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String path;

        int[] indexes = jTable1.getSelectedRows();
        for(int i = 0; i< indexes.length; i++){
            path = tableModelRecordings.getValueAt(indexes[i], 1).toString();
            core.getBaseRecordings().removeRecording(path);
        }

        refreshRecordingTable();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        results.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String model;

        int index = jTable2.getSelectedRow();
        
        model = tableModelClassifiers.getValueAt(index,0).toString();

        results.setVisible(true);

        aceCommunicator.classify(model);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
         if(core.getHelp()){
            jCheckBoxMenuItem1.setSelected(false);
            core.setHelp(false);
        }else{
            jCheckBoxMenuItem1.setSelected(true);
            core.setHelp(true);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int s = jTabbedPane1.getSelectedIndex();
        
        if(core==null){
            core = Core.getInstance();
        }
        
        if(core.getHelp()){
            switch(s){
            case 0:
                JOptionPane.showMessageDialog(this,
                    "First: you need a set of audios to classify.\n"
                            + "Add audios and continue.");
                break;
            case 1:
                 JOptionPane.showMessageDialog(this,
                    "Second: you have to extract audio caracteristics.\n"
                    + "These are named features.");
                break;
            case 2:
                JOptionPane.showMessageDialog(this,
                    "Third: Choose a classifier and press classify.\n"
                    + "A xml will be generated with the audio files \n"
                            + "classified according to the selected classifier.");
                break;
            }
        }
        
        if(s == 2){
            loadClassifiers();
        }
        
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = jTable2.getSelectedRow();
        
        //confirmation dialog
        Object[] options = {"Cancel", "Delete"};
        int n = JOptionPane.showOptionDialog(this,
        "Do you want to delete this classifier?.\n"
                + "This operation cannot be undone.",
        "Delete Classifier?",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
    
        if((n == 0)||(n==-1)){
            //0 means cancel, -1 means closed
        }else{
            core.getBaseClassifiers().removeClassifier(index);
            loadClassifiers();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        core.setResults((ResultsScreen)results);
        
        new ExportScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        if(core.getHelp()){
            jCheckBoxMenuItem1.setSelected(true);
        }else{
            jCheckBoxMenuItem1.setSelected(false);
        }
    }//GEN-LAST:event_jMenu3MenuSelected

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassifyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassifyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassifyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassifyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassifyScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton continueButton1;
    private javax.swing.JButton extractButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}