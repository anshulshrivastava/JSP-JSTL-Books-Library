<%@page import="java.sql.Connection"%>
<%@taglib uri="/WEB-INF/upd.tld" prefix="tt"%>





<jsp:useBean id="inSession" scope="request" class="codes.dbConnection"/>

<%
    inSession.setMyObject(request); // pass request object to bean
%>
<%    Connection con = null;

    con = (Connection) session.getAttribute("connection");
    Connection conn = con;
%>



   
      <% String inserts1 = request.getParameter("insert1");
      String inserts2 = request.getParameter("insert2");
      String inserts3 = request.getParameter("insert3");
      String inserts4 = request.getParameter("insert4");
      String inserts5 = request.getParameter("insert5");
      String inserts6 = request.getParameter("insert6");
      String inserts7 = request.getParameter("insert7");
      String insertions = request.getParameter("insertion");
      
      
      
           String deleteoptions = request.getParameter("deleteoption");
      String deletevalues = request.getParameter("deletevalue");
      String pageNames = request.getParameter("pageName");
      
      
        String updateoptions = request.getParameter("updateoption");
      String setvalues = request.getParameter("setvalue");
      String radios = request.getParameter("choose");
      String getvalues = request.getParameter("getvalue");
      
      
      
      
      %>
      <% 
session.removeAttribute("connection"); 

%>
      
      
      
<tt:test insert1="<%=inserts1%>" insert2="<%=inserts2%>" insert3="<%=inserts3%>" insert4="<%=inserts4%>" insert5="<%=inserts5%>" insert6="<%=inserts6%>" insert7="<%=inserts7%>" insertion="<%=insertions%>" con="<%=conn%>" deleteoption="<%=deleteoptions%>" deletevalue="<%=deletevalues%>" pageName="<%=pageNames%>" updateoption="<%=updateoptions%>" setvalue="<%=setvalues%>" radio="<%=radios%>" getvalue="<%=getvalues%>"  />