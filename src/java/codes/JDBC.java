package codes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC {

    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection con = null;

    public Object[] sqlQuery(Connection con1, String tablenames, String columnnames, String operators, String operatorvalues) {

        Connection con = con1;
        String table = tablenames;
        String column = columnnames;
        String operator = operators;
        String operatorvalue = operatorvalues;

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        List<String> list4 = new ArrayList<String>();
        List<String> list5 = new ArrayList<String>();
        List<String> list6 = new ArrayList<String>();
        List<String> list7 = new ArrayList<String>();
        List<String> list8 = new ArrayList<String>();
        List<String> list9 = new ArrayList<String>();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN WHERE " + column + operator + "'" + operatorvalue + "'");

            int i = 0;
            while (rs.next()) {
                int n = rs.getInt("AuthorID");
                String nm = rs.getString("FirstName");
                String s = rs.getString("LastName");
                int n2 = rs.getInt("AuthorID");
                String nm2 = rs.getString("ISBN");
                String nm3 = rs.getString("ISBN");
                String nm4 = rs.getString("Title");
                String nm5 = rs.getString("EditionNumber");
                String nm6 = rs.getString("Copyright");

                list1.add(Integer.toString(n));
                list2.add(nm);
                list3.add(s);
                list4.add(Integer.toString(n2));
                list5.add(nm2);
                list6.add(nm3);
                list7.add(nm4);
                list8.add(nm5);
                list9.add(nm6);

                i++;

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        String[] id = list1.toArray(new String[list1.size()]);
        String[] name1 = list2.toArray(new String[list2.size()]);
        String[] lastname2 = list3.toArray(new String[list3.size()]);
        String[] id2 = list4.toArray(new String[list4.size()]);
        String[] isbn1 = list5.toArray(new String[list5.size()]);
        String[] isbn2 = list6.toArray(new String[list6.size()]);
        String[] title = list7.toArray(new String[list7.size()]);
        String[] edition = list8.toArray(new String[list8.size()]);
        String[] copyright = list9.toArray(new String[list9.size()]);

        return new Object[]{id, name1, lastname2, id2, isbn1, isbn2, title, edition, copyright};

    }

    public Object[] sqlUpdate(Connection conns, String inserts1, String inserts2, String inserts3, String inserts4, String inserts5, String inserts6, String inserts7, String insertbutton, String deleteoptions, String deletevalues, String pageNames, String updateoptions, String setvalues, String radios, String getvalues) {

        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection conn = conns;

        String insert1 = inserts1;
        String insert2 = inserts2;
        String insert3 = inserts3;
        String insert4 = inserts4;
        String insert5 = inserts5;
        String insert6 = inserts6;
        String insert7 = inserts7;
        String insertbuttons = insertbutton;

        String deleteoption = deleteoptions;
        String deletevalue = deletevalues;
        String pageName = pageNames;
        
        String updateoption = updateoptions;
        String setvalue = setvalues;
        String radio = radios;
        String getvalue = getvalues;
        
        
        
        List<String> lists1 = new ArrayList<String>();
        List<String> lists2 = new ArrayList<String>();
        List<String> lists3 = new ArrayList<String>();
        List<String> lists4 = new ArrayList<String>();
        List<String> lists5 = new ArrayList<String>();
        List<String> lists6 = new ArrayList<String>();
        List<String> lists7 = new ArrayList<String>();
        List<String> lists8 = new ArrayList<String>();
        List<String> lists9 = new ArrayList<String>();

               if("delete1".equals(deleteoption)){
            
              try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("DELETE from Authors where AuthorID='" + deletevalue + "'");
                   
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }
               }
              
                else if("delete2".equals(deleteoption)){
                     try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("DELETE from Authors where FirstName='" + deletevalue + "'");
                   
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }
                    
                    
                }
               
               
               
            
               else if("Authors.LastName".equals(deleteoption)){
                     try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("DELETE from Authors where LastName='" + deletevalue + "'");
                   
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }
                    
                    
                }
                
               
               
               
               
               else if("delete4".equals(deleteoption)){
                     try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();
stmt.addBatch("DELETE from AuthorISBN where ISBN='" + deletevalue + "'");
                   stmt.addBatch("DELETE from Titles where ISBN='" + deletevalue + "'");
                    stmt.executeBatch();
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }
                    
                    
                }
               
             else if ("Titles.Copyright".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("UPDATE Titles, Authors SET "+updateoption+" = '"+setvalue+"' WHERE Titles.ISBN = ANY(SELECT AuthorISBN.ISBN FROM AuthorISBN WHERE AuthorISBN.AuthorID = ANY( SELECT AuthorISBN.AuthorID from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID AND "+radio+"='"+getvalue+"'))");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            } 
               
              
             
             
             
             
             
             
             
            else if ("Titles.EditionNumber".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("UPDATE Titles, Authors SET "+updateoption+" = '"+setvalue+"' WHERE Titles.ISBN = ANY(SELECT AuthorISBN.ISBN FROM AuthorISBN WHERE AuthorISBN.AuthorID = ANY( SELECT AuthorISBN.AuthorID from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID AND "+radio+"='"+getvalue+"'))");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
       
        
        
            else if ("Titles.Title".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("UPDATE Titles, Authors SET "+updateoption+" = '"+setvalue+"' WHERE Titles.ISBN = ANY(SELECT AuthorISBN.ISBN FROM AuthorISBN WHERE AuthorISBN.AuthorID = ANY( SELECT AuthorISBN.AuthorID from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID AND "+radio+"='"+getvalue+"'))");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
        
        
       else if ("Authors.FirstName".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch(" UPDATE Authors, AuthorISBN SET FirstName = '"+setvalue+"' WHERE AuthorISBN.AuthorID = Authors.AuthorID AND "+radio+" = '"+getvalue+"'");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
        
        
        
        
        else if ("Authors.LastName".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch(" UPDATE Authors, AuthorISBN SET Authors.LastName = '"+setvalue+"' WHERE AuthorISBN.AuthorID = Authors.AuthorID AND "+radio+" = '"+getvalue+"'");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
        
        
        
        
        
        
       
       
      else if ("Titles.ISBN".equals(updateoption)) {
                try {
                    Statement stmt = conn.createStatement();

                    conn.setAutoCommit(false);
                    stmt = conn.createStatement();

                    stmt.addBatch("UPDATE AuthorISBN, Titles  SET Titles.ISBN = '"+setvalue+"', AuthorISBN.ISBN = '"+setvalue+"' WHERE AuthorISBN.ISBN = Titles.ISBN AND "+radio+" = '"+getvalue+"'");
 
                    stmt.executeBatch();

                    String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                    rs = stmt.executeQuery(sql);
                    int i = 0;
                    while (rs.next()) {
                        int nx = rs.getInt("AuthorID");
                        String nmx = rs.getString("FirstName");
                        String sx = rs.getString("LastName");
                        int n2x = rs.getInt("AuthorID");
                        String nm2x = rs.getString("ISBN");
                        String nm3x = rs.getString("ISBN");
                        String nm4x = rs.getString("Title");
                        String nm5x = rs.getString("EditionNumber");
                        String nm6x = rs.getString("Copyright");

                        lists1.add(Integer.toString(nx));
                        lists2.add(nmx);
                        lists3.add(sx);
                        lists4.add(Integer.toString(n2x));
                        lists5.add(nm2x);
                        lists6.add(nm3x);
                        lists7.add(nm4x);
                        lists8.add(nm5x);
                        lists9.add(nm6x);

                        i++;

                    }

                } catch (Exception e) {
                    System.out.println("Error");
                }

            }
       
       
       
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
               
            
            
           
        
        
        else {
            
    
         
             try {
                Statement stmt = conn.createStatement();

                conn.setAutoCommit(false);
                stmt = conn.createStatement();
                stmt.addBatch("INSERT INTO AuthorISBN(AuthorID,ISBN) VALUES ('" + insert1 + "','" + insert4 + "')");
                stmt.addBatch("INSERT INTO Authors(AuthorID,FirstName,LastName) VALUES ('" + insert1 + "','" + insert2 + "','" + insert3 + "')");
                stmt.addBatch("INSERT INTO Titles(ISBN, Title, EditionNumber, Copyright) VALUES ('" + insert4 + "', '" + insert5 + "', '" + insert6 + "','" + insert7 + "')");
                stmt.executeBatch();

                String sql = "SELECT * from AuthorISBN JOIN Authors ON AuthorISBN.AuthorID=Authors.AuthorID JOIN Titles ON AuthorISBN.ISBN=Titles.ISBN";
                rs = stmt.executeQuery(sql);
                int i = 0;
                while (rs.next()) {
                    int nx = rs.getInt("AuthorID");
                    String nmx = rs.getString("FirstName");
                    String sx = rs.getString("LastName");
                    int n2x = rs.getInt("AuthorID");
                    String nm2x = rs.getString("ISBN");
                    String nm3x = rs.getString("ISBN");
                    String nm4x = rs.getString("Title");
                    String nm5x = rs.getString("EditionNumber");
                    String nm6x = rs.getString("Copyright");

                    lists1.add(Integer.toString(nx));
                    lists2.add(nmx);
                    lists3.add(sx);
                    lists4.add(Integer.toString(n2x));
                    lists5.add(nm2x);
                    lists6.add(nm3x);
                    lists7.add(nm4x);
                    lists8.add(nm5x);
                    lists9.add(nm6x);

                    i++;

                }

            } catch (Exception e) {
                System.out.println("Error");
            }
      
            
        }
        
        
        
       

            
            
            
            
       
        
        
        
        
        
        
        

        String[] idx = lists1.toArray(new String[lists1.size()]);
        String[] name1x = lists2.toArray(new String[lists2.size()]);
        String[] lastname2x = lists3.toArray(new String[lists3.size()]);
        String[] id2x = lists4.toArray(new String[lists4.size()]);
        String[] isbn1x = lists5.toArray(new String[lists5.size()]);
        String[] isbn2x = lists6.toArray(new String[lists6.size()]);
        String[] titlex = lists7.toArray(new String[lists7.size()]);
        String[] editionx = lists8.toArray(new String[lists8.size()]);
        String[] copyrightx = lists9.toArray(new String[lists9.size()]);

        return new Object[]{idx, name1x, lastname2x, id2x, isbn1x, isbn2x, titlex, editionx, copyrightx};
    }

}
