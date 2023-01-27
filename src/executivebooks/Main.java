
 
package executivebooks;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    Connection cn ;
    
    public Main() {
        
        initComponents();
        connection() ;
        
        loadData(tblBooks) ;
        
        btnAdd.setEnabled( false ) ;
        btnCheckout.setEnabled( false ) ;
        
    }
    
    public Main(String data)
    {
        
        initComponents();        
        connection() ;
        
        loadData(tblBooks) ;
        
        lblCookie.setText(data) ;
        
        if ( data.equals("admin") )
        {
            
            btnManagement.setEnabled(true) ;
            btnCheckout.setEnabled(true) ;
            
        }
        
        else
        {
            
            btnManagement.setEnabled(false) ;
            btnCheckout.setEnabled(false) ;
            
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

        jPanel1 = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
        lblCart = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblLoggedIn = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        lblCookie = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        txtAuthor = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnManagement = new javax.swing.JButton();
        lblBooks = new javax.swing.JLabel();
        lblBookStore = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblBgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        lblPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrice.setText("Price:");

        lblCart.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCart.setText("Cart");

        txtTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total:");

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitle.setText("Title:");

        lblLoggedIn.setText("Logged in as: ");

        lblAuthor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAuthor.setText("Author:");

        btnCheckout.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCheckout.setText("Checkout");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        lblCookie.setText("username");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCart);
        if (tblCart.getColumnModel().getColumnCount() > 0) {
            tblCart.getColumnModel().getColumn(0).setResizable(false);
            tblCart.getColumnModel().getColumn(1).setResizable(false);
            tblCart.getColumnModel().getColumn(2).setResizable(false);
            tblCart.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtAuthor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtId.setText("0");

        lblId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblId.setText("ID:");

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBooks);
        if (tblBooks.getColumnModel().getColumnCount() > 0) {
            tblBooks.getColumnModel().getColumn(0).setResizable(false);
            tblBooks.getColumnModel().getColumn(1).setResizable(false);
            tblBooks.getColumnModel().getColumn(2).setResizable(false);
            tblBooks.getColumnModel().getColumn(3).setResizable(false);
        }

        btnManagement.setText("Management");
        btnManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagementActionPerformed(evt);
            }
        });

        lblBooks.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooks.setText("Books");

        lblBookStore.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblBookStore.setForeground(new java.awt.Color(0, 0, 0));
        lblBookStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookStore.setText("EXECUTIVE BOOKS");

        lblTotalPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalPrice.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBookStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCookie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCookie, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBookStore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblTotalPrice)
                                            .addComponent(lblTotal)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(43, 43, 43)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblBgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/executivebooks/bookStack_2.jpg"))); // NOI18N
        lblBgImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblBgImage.setFocusable(false);
        lblBgImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblBgImage.setMaximumSize(new java.awt.Dimension(977, 807));
        lblBgImage.setMinimumSize(new java.awt.Dimension(977, 807));
        lblBgImage.setPreferredSize(new java.awt.Dimension(977, 807));
        getContentPane().add(lblBgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagementActionPerformed
        // TODO add your handling code here:
        
        Inventory Form = new Inventory(lblCookie.getText()) ;
        Form.setVisible(true) ;
        Form.setLocationRelativeTo(null) ;
        
        this.dispose();
        
    }//GEN-LAST:event_btnManagementActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        
        String tot = lblTotalPrice.getText() ;
        
        Checkout Form = new Checkout(lblCookie.getText() , tot ) ;
        Form.setVisible(true) ;
        Form.setLocationRelativeTo(null) ;
        
        this.dispose() ;
        
    }//GEN-LAST:event_btnCheckoutActionPerformed

    int sum = 0 ;
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
        connection();
        
        String bookId = txtId.getText();
        String bTitle = txtTitle.getText();
        String bAuthor = txtAuthor.getText();
        String bPrice = txtPrice.getText();
        
        int prices = Integer.parseInt(bPrice) ;
        
        int total = prices ;
        
        String tot = String.valueOf(total) ;
               
        try{
            
            PreparedStatement ps = cn.prepareStatement("insert into cart (cart_id, book_title, book_author, total)values(?,?,?,?)");
            ps.setString(1, bookId);
            ps.setString(2, bTitle);
            ps.setString(3, bAuthor);
            ps.setString(4, tot);
            
            ps.execute();
            loadData(tblBooks);
            cn.close();
            
            txtId.setText("0");
            txtTitle.setText("");
            txtAuthor.setText("");
            txtPrice.setText("");
            
            loadCart(tblCart) ;
            
            sum = sum + total ;
            lblTotalPrice.setText(""+sum);
            
        }catch(Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
        btnCheckout.setEnabled(true);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        
        btnAdd.setEnabled(true) ;
        
        int rowIndex = tblBooks.getSelectedRow();
        
        txtId.setText(tblBooks.getValueAt(rowIndex, 0).toString());
        txtTitle.setText(tblBooks.getValueAt(rowIndex, 1).toString());
        txtAuthor.setText(tblBooks.getValueAt(rowIndex, 2).toString());
        txtPrice.setText(tblBooks.getValueAt(rowIndex, 3).toString());
        
    }//GEN-LAST:event_tblBooksMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       
        try{
            
            connection();
        
            int i = Integer.parseInt(lblTotalPrice.getText()) ;
            int ii = Integer.parseInt(txtPrice.getText()) ;
            int t = i - ii ;

            String f = String.valueOf(t) ;
            lblTotalPrice.setText(f) ; 
            
            String id = txtId.getText();
            
            if (id.equals("0"))
            {
                
                JOptionPane.showMessageDialog(null, "Nothing selected");
                
            }
            else
            {
               PreparedStatement ps = cn.prepareStatement("delete from cart where cart_id like '"+id+"' ");
               ps.execute();
               cn.close();
               
               loadCart(tblCart);
               
               txtId.setText("0");
               txtTitle.setText("");
               txtAuthor.setText("");
               txtPrice.setText("");
            }
       
        }catch(Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, "Nothing selected");
            
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartMouseClicked
        
        btnRemove.setEnabled(true) ;
        
        int rowIndex = tblCart.getSelectedRow();
        txtId.setText(tblCart.getValueAt(rowIndex, 0).toString());
        txtTitle.setText(tblCart.getValueAt(rowIndex, 1).toString());
        txtAuthor.setText(tblCart.getValueAt(rowIndex, 2).toString());
        txtPrice.setText(tblCart.getValueAt(rowIndex, 3).toString());
        
    }//GEN-LAST:event_tblCartMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void connection()
    {
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver") ;
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "") ;
                        
        } 
        
        catch (Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        
    }
    
    public void loadData(JTable table) 
    {
        
        try
        {
            
            connection() ;
            
            PreparedStatement pStat = cn.prepareStatement("Select * from inventory") ;
            ResultSet rSet = pStat.executeQuery() ;
            
            DefaultTableModel tblModel = (DefaultTableModel)table.getModel() ;
            
            tblModel.setRowCount(0) ;
            
            Object [] row ;
            
            while(rSet.next())
            {
                
                row = new Object[4] ;
                
                row [0] = rSet.getInt(1) ;
                row [1] = rSet.getString(2) ;
                row [2] = rSet.getString(3) ;
                row [3] = rSet.getInt(4) ;
                
                tblModel.addRow( row ) ; 
                
            }
                                    
            cn.close() ;
            
        }
        
        catch (Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, ex.getMessage()) ;
            
        }
        
    }
    
    public void loadCart(JTable table) 
    {
        
        try
        {
            
            connection() ;
            
            PreparedStatement pStat = cn.prepareStatement("Select * from cart") ;
            ResultSet rSet = pStat.executeQuery() ;
            
            DefaultTableModel tblModel = (DefaultTableModel)table.getModel() ;
            
            tblModel.setRowCount(0) ;
            
            Object [] row ;
            
            while(rSet.next())
            {
                
                row = new Object[4] ;
                
                row [0] = rSet.getInt(1) ;
                row [1] = rSet.getString(2) ;
                row [2] = rSet.getString(3) ;
                row [3] = rSet.getInt(4) ;
                
                tblModel.addRow( row ) ; 
                
            }
                                    
            cn.close() ;
            
        }
        
        catch (Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, ex.getMessage()) ;
            
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnManagement;
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBgImage;
    private javax.swing.JLabel lblBookStore;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblCookie;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLoggedIn;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTable tblCart;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
