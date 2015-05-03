package codes;



import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class dbConnection {

    public void setMyObject(HttpServletRequest request) {

        Connection con = null;

        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://cs2.bradley.edu:3306/books_ashrivastava2", "username", "password");
        }catch(Exception e){
            System.out.println("Error in Connection");
        }

        HttpSession session = request.getSession();
        session.setAttribute("connection", con);
    }

}
