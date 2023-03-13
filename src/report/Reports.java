package report;

import java.sql.*;
import javax.swing.JOptionPane;

//itex's libraries
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reports extends javax.swing.JFrame {

    public Reports() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitle = new javax.swing.JLabel();
        jLname = new javax.swing.JLabel();
        jLlastname = new javax.swing.JLabel();
        jLsection = new javax.swing.JLabel();
        jLage = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_last_name = new javax.swing.JTextField();
        txt_section = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        bttsafe = new javax.swing.JToggleButton();
        bttchange = new javax.swing.JButton();
        bttdelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        bttsearch = new javax.swing.JButton();
        jLstatus = new javax.swing.JLabel();
        bttpdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLtitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLtitle.setText("Students");

        jLname.setText("Name:");

        jLlastname.setText("Last Name:");

        jLsection.setText("Section:");

        jLage.setText("Age:");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        bttsafe.setText("Safe");
        bttsafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsafeActionPerformed(evt);
            }
        });

        bttchange.setText("Modify");
        bttchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttchangeActionPerformed(evt);
            }
        });

        bttdelete.setText("Delete");
        bttdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttdeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Type Student ID:");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        bttsearch.setText("Search");
        bttsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsearchActionPerformed(evt);
            }
        });

        jLstatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        bttpdf.setText("Download PDF");
        bttpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLlastname)
                                    .addComponent(jLname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLsection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txt_last_name)
                                    .addComponent(txt_section)
                                    .addComponent(txt_age)))
                            .addComponent(jLstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bttsafe, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(bttchange)
                                .addGap(29, 29, 29)
                                .addComponent(bttdelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(bttpdf)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLname)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlastname)
                    .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsection)
                    .addComponent(txt_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLage)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttsafe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttchange, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttsearch)
                .addGap(45, 45, 45)
                .addComponent(jLstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttsafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsafeActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_student", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT into students values (?,?,?,?,?)");

            pst.setInt(1, 0);
            pst.setString(2, txt_name.getText().toUpperCase().trim());
            pst.setString(3, txt_last_name.getText().toUpperCase().trim());
            pst.setString(4, txt_section.getText().toUpperCase().trim());
            pst.setString(5, txt_age.getText().trim());
            pst.executeUpdate();

            txt_name.setText("");
            txt_last_name.setText("");
            txt_section.setText("");
            txt_age.setText("");
            jLstatus.setText("Student added to the system");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Bad Connection");
        }
    }//GEN-LAST:event_bttsafeActionPerformed

    private void bttchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttchangeActionPerformed
        try {
            String ID = txt_id.getText().toUpperCase().trim();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_student", "root", "");
            PreparedStatement pst = con.prepareStatement("Update students SET name = ?, last_name = ?, section = ?, age = ? WHERE ID = " + ID);

            //  pst.setInt(1,0);
            pst.setString(1, txt_name.getText().toUpperCase().trim());
            pst.setString(2, txt_last_name.getText().toUpperCase().trim());
            pst.setString(3, txt_section.getText().toUpperCase().trim());
            pst.setString(4, txt_age.getText().trim());
            pst.executeUpdate();

            txt_name.setText("");
            txt_last_name.setText("");
            txt_section.setText("");
            txt_age.setText("");
            jLstatus.setText("Changes have been added to the system");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Bad Connection");
        }
    }//GEN-LAST:event_bttchangeActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void bttsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsearchActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_student", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * from students Where ID = ?");
            pst.setString(1, txt_id.getText().trim());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_name.setText(rs.getString("name"));
                txt_last_name.setText(rs.getString("last_name"));
                txt_section.setText(rs.getString("section"));
                txt_age.setText(rs.getString("age"));
            } else {
                JOptionPane.showMessageDialog(null, "Student is not in the system");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Bad Connection");
        }
    }//GEN-LAST:event_bttsearchActionPerformed

    private void bttdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttdeleteActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_student", "root", "");
            PreparedStatement pst = con.prepareStatement("DELETE FROM students WHERE ID = ?");
            pst.setString(1, txt_id.getText().trim());
            pst.executeUpdate();

            txt_name.setText("");
            txt_last_name.setText("");
            txt_section.setText("");
            txt_age.setText("");
            jLstatus.setText("Student have been delete");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Bad Connection");
        }
    }//GEN-LAST:event_bttdeleteActionPerformed

    private void bttpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttpdfActionPerformed

        try {
            // Creating a PdfDocument object   
            String dest = "user.Desktop.B.pdf";
            PdfWriter writer = new PdfWriter(dest);

            // Creating an Image object   
            String imFile = "src/img/header.png";
            ImageData data = ImageDataFactory.create(imFile);
            Image image = new Image(data);
            image.scaleToFit(523, 700);

            // Creating a PdfDocument object      
            PdfDocument pdf = new PdfDocument(writer);

            // Creating a Document object       
            Document doc = new Document(pdf);

            // Creating Paragraphs 
            String para1 = "Students' Report \n\n".toUpperCase();
            Paragraph p1 = new Paragraph(para1);
   

            // Adding paragraphs to document       
            doc.add(p1.setBold().setTextAlignment(TextAlignment.CENTER));
           
            // Adding image to the document       
            doc.add(image);

            // Creating a table       
            float[] pointColumnWidths = {150, 150, 150, 150, 150};
            Table table = new Table(pointColumnWidths);

            // Adding cells to the table 
            table.addCell("ID").setTextAlignment(TextAlignment.CENTER);
            table.addCell("NAME");
            table.addCell("LAST NAME");
            table.addCell("SECTION");
            table.addCell("AGE");

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_student", "root", "");
                PreparedStatement pst = con.prepareStatement("SELECT * FROM students");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell(rs.getString(5));
                    } while (rs.next());
                    doc.add(table);

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                //JOptionPane.showMessageDialog(null, "Bad Connection");
            }
            doc.close();
            JOptionPane.showMessageDialog(null, "You have a new Report");
        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error in the Image");
        }

    }//GEN-LAST:event_bttpdfActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Reports().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttchange;
    private javax.swing.JButton bttdelete;
    private javax.swing.JButton bttpdf;
    private javax.swing.JToggleButton bttsafe;
    private javax.swing.JButton bttsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLage;
    private javax.swing.JLabel jLlastname;
    private javax.swing.JLabel jLname;
    private javax.swing.JLabel jLsection;
    private javax.swing.JLabel jLstatus;
    private javax.swing.JLabel jLtitle;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_section;
    // End of variables declaration//GEN-END:variables
}
