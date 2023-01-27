/*
    ITSPA3 - Group 2
    Executive Books Register
    
 */

package executivebooks;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Register extends JFrame implements ActionListener
{
    private JLabel lblHeading;
    
    private JLabel space1;
    
    private JLabel lblName;
    private JTextField txtName;
    
    private JLabel lblSurname;
    private JTextField txtSurname;
    
    private JLabel lblNumber;
    private JTextField txtNumber;
    
    private JLabel lblUsername;
    private JTextField txtUsername;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    
    private JLabel lblEmail;
    private JTextField txtEmail;
    
    private JLabel lblAddress;
    private JTextField txtAddress;
    
    private JButton btnRegister;
    
    Connection cn;
    
    public Register()
    {
        super("Bookstore Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout(9, 2);
        setLayout(gl);
        
        lblHeading = new JLabel("<html><b COLOR=RED> Welcome</b>" + "<b><i COLOR=#006363> To </i></b>" +
			"<b><u COLOR=#BF3030>Executive </u><u COLOR=#8170D8>Books</u><u COLOR=#00CC00>!!</u><u COLOR=BLUE>!!</u></b>");
        
        space1 = new JLabel();
        
        lblName = new JLabel("Enter your name: ");
        txtName = new JTextField(15);
        
        lblSurname = new JLabel("Enter your surname: ");
        txtSurname = new JTextField(15);
        
        lblNumber = new JLabel("Enter your contact number: ");
        txtNumber = new JTextField(15);
        
        lblUsername = new JLabel("Enter a username: ");
        txtUsername = new JTextField(15);
        
        lblPassword = new JLabel("Please enter a password: ");
        txtPassword = new JPasswordField(15);
        
        lblEmail = new JLabel("Enter your email: ");
        txtEmail = new JTextField(15);
        
        lblAddress = new JLabel("Please enter your billing address: ");
        txtAddress = new JTextField(15);
        
        btnRegister = new JButton("Register!");
        
        add(lblHeading);
        
        add(space1);
        
        add(lblName);
        add(txtName);
        
        add(lblSurname);
        add(txtSurname);
        
        add(lblNumber);
        add(txtNumber);
        
        add(lblUsername);
        add(txtUsername);
        
        add(lblPassword);
        add(txtPassword);
        
        add(lblEmail);
        add(txtEmail);
        
        add(lblAddress);
        add(txtAddress);
        
        add(btnRegister);
        
        btnRegister.setToolTipText("Click here to Register");
        
        btnRegister.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                String uName = txtUsername.getText() ;
                String uPass = txtPassword.getText() ;
                String name = txtName.getText()  ;
                String sName = txtSurname.getText() ;
                String num = txtNumber.getText() ;
                String uEmail = txtEmail.getText() ;
                String uAddress = txtAddress.getText() ;

                int dialogButton = JOptionPane.YES_NO_OPTION ;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Confirm Account Creation?","Warning",dialogButton);

                if ( dialogResult == JOptionPane.YES_OPTION )
                {

                    try
                    {
                        
                        connection()  ;

                        PreparedStatement ps = cn.prepareStatement("insert into user (username, password, name, surname, cellNumber, email, address)values(?,?,?,?,?,?,?)");

                        ps.setString(1, uName);
                        ps.setString(2, uPass);
                        ps.setString(3, name);
                        ps.setString(4, sName);
                        ps.setString(5, num);
                        ps.setString(6, uEmail);
                        ps.setString(7, uAddress);

                        ps.execute() ;

                        cn.close() ;

                        JOptionPane.showMessageDialog(null, "Saved successfully") ;

                        txtUsername.setText("") ;
                        txtPassword.setText("") ;
                        txtName.setText("") ;
                        txtSurname.setText("") ;
                        txtNumber.setText("") ;
                        txtEmail.setText("") ;
                        txtAddress.setText("") ;

                        Login Form = new Login() ;
                        Form.setVisible(true) ;
                        Form.setSize(450, 250) ;    
                        Form.setLocationRelativeTo(null) ;
                        Register.this.dispose() ;


                    } 
                    
                    catch (Exception ex) 
                    {

                        JOptionPane.showMessageDialog(null, ex.getMessage());

                    }
                                   
                }
                                
                
            }

        });
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
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
    
}
