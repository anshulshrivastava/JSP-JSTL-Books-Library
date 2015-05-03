
package codes;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class dbUpdate extends TagSupport {
    
    Connection con = null;
     String insert1="";
     String insert2="";
     String insert3="";
     String insert4="";
     String insert5="";
     String insert6="";
     String insert7="";
      String insertion="";
      
      
     String deleteoption="";
     String deletevalue="";
      String pageName="";
      
      
     String updateoption="";
     String setvalue="";
     String radio="";
      String getvalue="";
       
       
     
         ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<String>();
        ArrayList<String> list6 = new ArrayList<String>();
        ArrayList<String> list7 = new ArrayList<String>();
        ArrayList<String> list8 = new ArrayList<String>();
        ArrayList<String> list9 = new ArrayList<String>();
        
        
            public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
        
         public String getInsert1() {
        return insert1;
    }

    public void setInsert1(String insert1) {
        this.insert1 = insert1;
    }

    public String getInsert2() {
        return insert2;
    }

    public void setInsert2(String insert2) {
        this.insert2 = insert2;
    }

    public String getInsert3() {
        return insert3;
    }

    public void setInsert3(String insert3) {
        this.insert3 = insert3;
    }

    public String getInsert4() {
        return insert4;
    }

    public void setInsert4(String insert4) {
        this.insert4 = insert4;
    }

    public String getInsert5() {
        return insert5;
    }

    public void setInsert5(String insert5) {
        this.insert5 = insert5;
    }

    public String getInsert6() {
        return insert6;
    }

    public void setInsert6(String insert6) {
        this.insert6 = insert6;
    }

    public String getInsert7() {
        return insert7;
    }

    public void setInsert7(String insert7) {
        this.insert7 = insert7;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }



    public String getDeleteoption() {
        return deleteoption;
    }

    public void setDeleteoption(String deleteoption) {
        this.deleteoption = deleteoption;
    }

    public String getDeletevalue() {
        return deletevalue;
    }

    public void setDeletevalue(String deletevalue) {
        this.deletevalue = deletevalue;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getUpdateoption() {
        return updateoption;
    }

    public void setUpdateoption(String updateoption) {
        this.updateoption = updateoption;
    }

 

    public String getSetvalue() {
        return setvalue;
    }

    public void setSetvalue(String setvalue) {
        this.setvalue = setvalue;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getGetvalue() {
        return getvalue;
    }

    public void setGetvalue(String getvalue) {
        this.getvalue = getvalue;
    }
    
    
     
     @Override
               public int doStartTag()  {
                   
                   
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
             Object[] obj = op.sqlUpdate(con, insert1, insert2, insert3, insert4, insert5, insert6, insert7, insertion, deleteoption, deletevalue, pageName, updateoption, setvalue, radio, getvalue);
     
             
                
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
           
out.println(con+" "+insert1+" "+insert2+"</br>");
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
