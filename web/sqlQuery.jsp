<%@page import="java.sql.Connection"%>
<%@taglib uri="/WEB-INF/my.tld" prefix="tt"%>
<%
  int a=1;
  String name="ABC";
  String authorId = "anshul";
%>




<jsp:useBean id="inSession" scope="request" class="codes.dbConnection"/>

<%
    inSession.setMyObject(request); // pass request object to bean
%>
<%    Connection con = null;

    con = (Connection) session.getAttribute("connection");
    Connection conn = con;
%>



   
      <% String tablename = request.getParameter("table");
      String columnname = request.getParameter("column");
      String operatorname = request.getParameter("operator");
      String operatorvaluename = request.getParameter("operatorvalue");
      
      
      %>
      <% 
session.removeAttribute("connection"); 

%>
      
      
      
<tt:test no="<%=a%>" name="<%=name%>" authorIds="<%=authorId%>" table="<%=tablename%>" column="<%=columnname%>" operator="<%=operatorname%>" operatorvalue="<%=operatorvaluename%>" con="<%=conn%>" />