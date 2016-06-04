
/*
 * MainJFrame.java
 *
 * Created on Sep 14, 2013, 11:45:11 PM
 */
package bprm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author kaveh
 */
public class Mainframe extends javax.swing.JFrame {

    /** Creates new form MainJFrame */
    public Mainframe() {
        initComponents();   
    }
        private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btn_open_new = new javax.swing.JButton();
        btn_open_brp = new javax.swing.JButton();
        title_icon = new javax.swing.JLabel();
        lbl_middle = new javax.swing.JLabel();
        lbl_wblg = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BPRM");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        
        jPanel1.setBackground(Color.white);

        title.setBackground(Utils.main_color);
        title.setFont(new java.awt.Font("Iranian Sans", 1, 12)); // NOI18N
        title.setForeground(Color.WHITE);
        title.setText("جعبه لایتنر تصویری قدرت ذهن");
        title.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        //title.setContentAreaFilled(true);
        title.setOpaque(true);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setEnabled(true);
        title.setFocusable(false);
        
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleActionPerformed(evt);
            }
        });

        btn_open_new.setFont(new java.awt.Font("Iranian Sans", 1, 12)); // NOI18N
        btn_open_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("gtk-new.png"))); // NOI18N
        btn_open_new.setText("فلش کارت جدید");
        btn_open_new.setToolTipText("ساخت فلش کارت جدید");
        btn_open_new.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_open_new.setName("btn_create_brp"); // NOI18N
        btn_open_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_open_new.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open_newActionPerformed(evt);
            }
        });
        btn_open_brp.setFont(new java.awt.Font("Iranian Sans", 1, 12)); // NOI18N
        btn_open_brp.setIcon(new javax.swing.ImageIcon(getClass().getResource("gtk-open.png"))); // NOI18N
        btn_open_brp.setText("باز کردن فلش کارت");
        btn_open_brp.setToolTipText("باز کردن و ویرایش فلش کارت");
        btn_open_brp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_open_brp.setName("btn_open_brp"); // NOI18N
        btn_open_brp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_open_brp.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open_brpActionPerformed(evt);
            }
        });
        title_icon.setBackground(Utils.main_color);
        title_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("brain.png"))); // NOI18N
        title_icon.setFocusable(false);
        title_icon.setOpaque(true);
        lbl_middle.setFont(new java.awt.Font("Iranian Sans", 1, 15)); // NOI18N
        lbl_middle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_middle.setText("برنامه ساخت فلش کارت تصویری نسخه ۰.۹");

        lbl_wblg.setForeground(new java.awt.Color(0, 51, 204));
        lbl_wblg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_wblg.setText("www.BrainPower.Blogsky.com");
        lbl_wblg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_wblg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        
        lbl_wblg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                open_weblog(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title_icon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_open_brp, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_open_new, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_wblg, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(lbl_middle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(title_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_middle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_open_brp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_open_new, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_wblg)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

private void titleActionPerformed(java.awt.event.MouseEvent evt) {                                      
   
}                                     

private void btn_open_newActionPerformed(java.awt.event.ActionEvent evt) {                                             
    open_new_getname(evt);
}                                            

private void btn_open_brpActionPerformed(java.awt.event.ActionEvent evt) {                                             
    select_brp(evt);
}      
/**
 * click on weblog link and open in def browser
 * @param evt 
 */
private void open_weblog(java.awt.event.MouseEvent evt) {                             
     try {
         //Set your page url in this string. For eg, I m using URL for Google Search engine
         String url = "http://brainpower.blogsky.com";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
}                            
/**
 * open filechooser and select flashcard to load
 * @param evt 
 */
private void select_brp(java.awt.event.ActionEvent evt) {                            
    JFileChooser jfc=new JFileChooser();
    jfc.addChoosableFileFilter(new FcFilter());
    int ret=jfc.showOpenDialog(jPanel1);
    
    //user selected a file
    if(ret==JFileChooser.APPROVE_OPTION) 
    {
        File brp=jfc.getSelectedFile();
        String extension=brp.getName().substring(brp.getName().lastIndexOf(".")+1);
        //selected file is BRP
        if(extension.equalsIgnoreCase("BRP"))
        {
            
        }
        //selected file is CSV
        else if(extension.equalsIgnoreCase("CSV"))
        {
            
        }
        //selected file is TXT
        else if(extension.equalsIgnoreCase("TXT"))
        {
            
        }
        //other formats, file is invalid
        else
        {
            JOptionPane.showMessageDialog(jPanel1, "فایل نامعتبر است");
        }
    }
    //no file selected by user
    else
    {
        
    }
}                           
/**
 * open a dialog and get name of flashcard
 * @param evt
 * 
 */
private void open_new_getname(java.awt.event.ActionEvent evt) {                                  
    String name=JOptionPane.showInputDialog(jPanel1, "نام فلش کارت را وارد کنید" , "فلش کارت");
    //name of new flashcard
    if(name!=null && !name.trim().equalsIgnoreCase(""))
    {
        Utils.flashcard_name=name;
        setVisible(false);
      //  CardList cl=new CardList();
        TabCards cl=new TabCards();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        cl.setLocation(dim.width/2-cl.getSize().width/2, dim.height/2-cl.getSize().height/2);
        cl.setVisible(true);
       // cl.manageForm();
    }
    //user canceled 
    else
    {
       
    }
}                                 

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_open_brp;
    private javax.swing.JButton btn_open_new;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_middle;
    private javax.swing.JLabel lbl_wblg;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title_icon;
    // End of variables declaration                   
}