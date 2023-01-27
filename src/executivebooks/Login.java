

package executivebooks;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.lang.*; 

public class Login extends JFrame implements ActionListener
{

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bookstore"; 
    
    Connection cn;
    
    PreparedStatement prepStat;
    ResultSet resSet;
    
    private JLabel lblHeading;
    
    private JLabel lblUsername;
    private JTextField txtUsername;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    
    private JButton btnLogin;
    private JButton btnRegister;
    
    private JLabel sp1;
    
    public Login()
    {
        super ("Bookstore Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout g = new GridLayout(4, 2);
        setLayout(g);
        
        lblHeading = new JLabel("<html><b COLOR=RED> Welcome</b>" + "<b><i COLOR=#006363> To </i></b>" +
			"<b><u COLOR=#BF3030>Executive </u><u COLOR=#8170D8>Books</u><u COLOR=#00CC00>!!</u><u COLOR=BLUE>!!</u></b>");
        
        
        lblUsername = new JLabel("Username: ");
        txtUsername = new JTextField(15);
        
        lblPassword = new JLabel("Password: ");
        txtPassword = new JPasswordField(15);
              
        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");
        
        sp1 = new JLabel();
        
        add(lblHeading);
        
        add(sp1);
        
        add(lblUsername);
        add(txtUsername);
        
        add(lblPassword);
        add(txtPassword);
        
        add(btnLogin);
        add(btnRegister);
        
        btnLogin.setToolTipText("Click here to login");
        btnRegister.setToolTipText("Click here to register");
               
        btnLogin.addActionListener(new ActionListener() 
        {
            
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                connection() ;
                
                String uName = txtUsername.getText() ;
                String uPass = txtPassword.getText() ;
                
                try 
                {
                
                    Statement stat = cn.createStatement() ;
                    String sql = "select * from user where username like '"+uName+"' and password like '"+uPass+"'";
                    
                    ResultSet rs = stat.executeQuery(sql) ;
                    boolean flag = false ;

                    while (rs.next())
                    {

                        if(uName.equals(rs.getString("username")) && uPass.equals(rs.getString("password")))
                        {

                            JOptionPane.showMessageDialog(null , "Welcome!") ;
                            flag = true ;

                            Main Form = new Main(uName) ;
                            Form.setVisible(true) ;
                            Form.setLocationRelativeTo(null) ;

                            Login.this.dispose() ;

                        }

                        if (flag = false)           
                        {
                            
                            JOptionPane.showMessageDialog(null , "Username or password incorrect.") ;
                            
                        }
                    }
                } 
                
                catch (Exception ex)
                {
                    
                    JOptionPane.showMessageDialog(null, ex);
                    
                }
                
            }
            
        });
        
        btnRegister.addActionListener(new ActionListener() 
        {
            
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               
                Register Form = new Register();
                Form.setVisible(true);
                Form.setSize(500, 600); 
                Form.setLocationRelativeTo(null) ;
                
                Login.this.dispose();
                
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
