
package codes;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;


public class taghandler extends TagSupport {
     String name="";
     String authorIds="";
       int no=0;
     String table="";
     String column="";
     String operator="";
     String operatorvalue="";
     Connection con = null;
    
       
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<String>();
        ArrayList<String> list6 = new ArrayList<String>();
        ArrayList<String> list7 = new ArrayList<String>();
        ArrayList<String> list8 = new ArrayList<String>();
        ArrayList<String> list9 = new ArrayList<String>();

    public String getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(String authorIds) {
        this.authorIds = authorIds;
    }
      
     public void setName(String name) { this.name=name;}
     public String getName() { return name;}
     public void setNo(int no) { this.no=no;}
     public int getNo() { return no;}

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorvalue() {
        return operatorvalue;
    }

    public void setOperatorvalue(String operatorvalue) {
        this.operatorvalue = operatorvalue;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

   

    

 
     
     
    
     @Override
               public int doStartTag()  {
                   
                  String query = new StringBuilder().append(column).append(operator).append(operatorvalue).toString();
                   
                   
                   
         try {
             JspWriter out = pageContext.getOut();
             out.println("<html>");
             out.println("<head>");
             out.println("Anshul NoteBook");
             out.println("<link href=" + "\"http://fonts.googleapis.com/css?family=Open+Sans:300,600,700\"" + "rel=" + "\"stylesheet\"" + "/>");
             out.println("<script src=" + "\"js/config.js\"" + "></script>");
             out.println("<script src=" + "\"js/skel.min.js\"" + "></script>");
             
             out.println("<noscript>");
             
             //out.println("<link rel=" + "\"stylesheet\"" + "href=" + "\"css/style.css\"" + "/>");
             out.println("</noscript>");
             
             out.println("<style type = \"text/css\">\n"
                     + "body{ font-family: sans-serif;\n"
                     + "	  background-color: white; \n"
                     + "	}\n"
                     + "table{ background-color: lightblue;\n"
                     + "		border-collapse: collapse;\n"
                     + "		border:1px solid gray; \n"
                     + "	}\n"
                     + "td { padding: 5px;}\n"
                     + "tr:nth-child(odd){\n"
                     + "background-color: white;}\n"
                     + "</style>");
             
             out.println("</head>");
             out.println("<body>");
             
             out.println("<nav id=" + "\"nav\"");
             out.println("<ul class=" + "\"container\"" + ">");
             out.println(" <li><a href=\"http://localhost:8090/Assignment_2/index.html\">Home</a></li>\n" +
                     "                <li><a href=\"http://localhost:8090/Assignment_2/searchbykeyword.html\">Keyword Search</a></li>\n" +
                     "                <li><a href=\"http://localhost:8090/Assignment_2/conditionsearch.html\">Condition Search</a></li>\n" +
                     "                <li><a href=\"http://localhost:8090/Assignment_2/insertbook.html\">Insert</a></li>\n" +
                     "                <li><a href=\"http://localhost:8090/Assignment_2/deletebyselect.html\">Delete</a></li>\n" +
                     "                <li><a href=\"http://localhost:8090/Assignment_2/updatebyselect.html\">Update</a></li>");
             out.println("</ul>");
             out.println("</nav>");
             
             // out.println("<div class=\"wrapper wrapper-style1 wrapper-first\">");
             out.println("<article class=\"container\" id=\"top\">");
             //out.println("<div class=\"row\">");
             
             out.println("<br>");
             //out.println("<div class=\"8u\">");

//main div where every thing present
             out.println("<table border=1 width=100% height=100% align=" + "left" + ">");
             
             
             JDBC op = new JDBC();
             Object[] obj = op.sqlQuery(con, table, column, operator, operatorvalue);
     
             
                
            String[] array1 = (String[]) obj[0];
            String[] array2 = (String[]) obj[1];
            String[] array3 = (String[]) obj[2];
            String[] array4 = (String[]) obj[3];
            String[] array5 = (String[]) obj[4];
            String[] array6 = (String[]) obj[5];
            String[] array7 = (String[]) obj[6];
            String[] array8 = (String[]) obj[7];
            String[] array9 = (String[]) obj[8];

//values get from jdbc class
            //printing result as a html page
            
            out.println("<strong>Search Result</strong></br>");
            out.println(query);
out.println(con+" "+table+" "+column+" "+operator+" "+operatorvalue+" "+"</br>");
            out.println("<tr>");
            out.println("<td><strong>AuthorId</strong></br>");
            for (int x = 0; x < array1.length; x++) {
                out.println(array1[x] + "</br>");
            }
            out.println("</td>");

            out.println("<td><strong>FirstName</strong></br>");
            for (int x = 0; x < array2.length; x++) {
                out.println(array2[x] + "</br>");
            }
            out.println("</td>");

            out.println("<td><strong>LastName</strong></br>");
            for (int x = 0; x < array3.length; x++) {
                out.println(array3[x] + "</br>");
            }

            out.println("<td><strong>AuthorID</strong></br>");
            for (int x = 0; x < array4.length; x++) {
                out.println(array4[x] + "</br>");
            }

            out.println("<td><strong>ISBN</strong></br>");
            for (int x = 0; x < array5.length; x++) {
                out.println(array5[x] + "</br>");
            }

            out.println("<td><strong>ISBN</strong></br>");
            for (int x = 0; x < array6.length; x++) {
                out.println(array6[x] + "</br>");
            }

            out.println("<td><strong>Title</strong></br>");
            for (int x = 0; x < array7.length; x++) {
                out.println(array7[x] + "</br>");
            }

            out.println("<td><strong>EditionNumber</strong></br>");
            for (int x = 0; x < array8.length; x++) {
                out.println(array8[x] + "</br>");
            }

            out.println("<td><strong>Copyright</strong></br>");
            for (int x = 0; x < array9.length; x++) {
                out.println(array9[x] + "</br>");
            }

            out.println("</td>");

            out.println("</tr>");

            out.println("</table>");

//main div closed            
        /*    out.println("</div>");
            out.println("</div>");*/
            out.println("</article>");
            
            //out.println(" </div>");

            out.println("</html></body>");
          
         } catch (IOException ex) {
             Logger.getLogger(taghandler.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
     
       }
          
       
        
}