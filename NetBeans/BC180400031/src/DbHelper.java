
/**
 *
 * @author Jawwad
 */

import java.sql.*;

public class DbHelper {
    ResultSet rs;
    Statement st;
    Connection con;
    
    public void DbConnect()
    {
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Jawwad\\Desktop\\BC180400031\\assets\\bc180400031.accdb");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    
    public DebitCard loadData(String c, int p)
    {
        DebitCard dc1= new DebitCard();
        String u_n ="";
        int pin=0;
        String usr="";
        int idd=0;
        Long blc;
        try      
        {
            DbConnect();
            String query = "select * from User WHERE cardNo = '"+c+"' AND cardPin = '"+p+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            while(rs.next())
            {
                u_n= rs.getString("cardNo");
                pin= rs.getInt("cardPin");
                usr= rs.getString("userName");
                idd= rs.getInt("id");
                blc= rs.getLong("balance");
                
                dc1.setId(idd);
                dc1.setUsername(usr);
                dc1.setbalance(blc);
                dc1.setcardNo(u_n);
                dc1.setpin(pin);
                
                }
        }
        catch(Exception e)
        {
            System.out.println(e);  
        }
        return dc1;
    }
    
    
    public boolean Login(String Card_no, int P)
    {
        String u_n ="";
        int pin=0;
        boolean x=false;
        
        try      
        {
            DbConnect();
            String query = "select * from User";
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            while(rs.next())
            {
                u_n= rs.getString("cardNo");
                pin= rs.getInt("cardPin");
                
                if(u_n.equals(Card_no) && pin==P)
                {
                    x = true;
                    return x;
                }
                else
                {
                    x = false;
                }
            }
        }
      catch(Exception e)
        {
            System.out.println(e);  
        }
        return x;
    }
    
    
    public void SaveData(Long b, int id)
    {
       // DatabaseHelper hlp = new DatabaseHelper();
        //Statement stmt = null;
        try 
        { 
            DbConnect();
            String query = " Update User SET balance = ? WHERE id = ? ";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setLong(1, b);
            preparedStmt.setInt(2, id);
            preparedStmt.executeUpdate();
            con.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());  
        }
    }

    
}
