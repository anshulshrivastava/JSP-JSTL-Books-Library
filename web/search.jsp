<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%@page import="java.sql.Connection"%>
<jsp:useBean id="inSession" scope="request" class="codes.dbConnection"/>

<%
  inSession.setMyObject(request); // pass request object to bean
%>

<html>
<head>
 <title>Anshul NoteBook </title>

        
        <link rel="stylesheet" type="text/css" href="my/style.css"/>
        

		<link rel="stylesheet" type="text/css" href="my/reset1.css">
<link rel="stylesheet" type="text/css" href="my/structure1.css">
        <script src="js/config.js"></script>
        <script src="js/skel.min.js"></script>
        <noscript>

       

        </noscript>

        
        
         <script type="text/javascript">
    function configureDropDownLists(ddl1,ddl2) {
        var colours = new Array('---Select One---','AuthorISBN.AuthorID', 'AuthorISBN.ISBN');
        var shapes = new Array('---Select One---','Authors.AuthorID', 'Authors.FirstName', 'Authors.LastName');
        var names = new Array('---Select One---','Titles.ISBN', 'Titles.Title', 'Titles.EditionNumber','Titles.Copyright');

        switch (ddl1.value) {
            case 'AuthorISBN':
                document.getElementById(ddl2).options.length = 0;
                for (i = 0; i < colours.length; i++) {
                    createOption(document.getElementById(ddl2), colours[i], colours[i]);
                }
                break;
            case 'Authors':
                document.getElementById(ddl2).options.length = 0; 
            for (i = 0; i < shapes.length; i++) {
                createOption(document.getElementById(ddl2), shapes[i], shapes[i]);
                }
                break;
            case 'Titles':
                document.getElementById(ddl2).options.length = 0;
                for (i = 0; i < names.length; i++) {
                    createOption(document.getElementById(ddl2), names[i], names[i]);
                }
                break;
                default:
                    document.getElementById(ddl2).options.length = 0;
                break;
        }

    }

    function createOption(ddl, text, value) {
        var opt = document.createElement('option');
        opt.value = value;
        opt.text = text;
        ddl.options.add(opt);
    }
</script>

        <style> 

        </style>

</head>

<body>
<%
  Object conn = session.getAttribute("connection");
%>



 <!-- Nav -->
        <nav id="nav">
            <ul class="container">
                <li><a href="http://localhost:8090/Assignment_2/index.html">Home</a></li>
                <li><a href="http://localhost:8090/jspcustomtag/search.jsp">Search</a></li>
                <li><a href="http://localhost:8090/jspcustomtag/insert.jsp">Insert</a></li>
                <li><a href="http://localhost:8090/jspcustomtag/delete.jsp">Delete</a></li>
                <li><a href="http://localhost:8090/jspcustomtag/update.jsp">Update</a></li>
            </ul>
        </nav>

        <!-- Home -->
        
        <div class="clean"></div>
      <form class="box login" action="sqlQuery.jsp" method="post">
	<fieldset class="fieldfield">
	<strong><h2>Search By <b>Condition</b></h2></strong>
        <label><br>Select Table -&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<select id="ddl" onchange="configureDropDownLists(this,'ddl2')" name="table">
                    <option>---Select One---</option>
                    <option value="AuthorISBN">AuthorISBN</option>
                    <option value="Authors">Authors</option>
                    <option value="Titles">Titles</option>
</select></label>
          
	</fieldset>
	<br>
	
	
	<div>
	<label></label>
	<table>
	<tr>
	<td>
	<label></label></td>
	
	<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
	<td>
	<label></label></td>
</tr>
<tr>
	<td>
	<label></label></td>
	
	<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
	<td>
	<label></label></td>
</tr>
</table>
	</div>
        	
	<div>
	<label></label>
	<table>
	<tr>
	<td>
	<label></label></td>
	
	<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
	<td>
	<label></label></td>
</tr>

</table>
	</div>
        
        
        <fieldset class="boxBody">
            <label><br>Select Column -&nbsp&nbsp&nbsp&nbsp<select id="ddl2" name="column">
                    <option>---Select One---</option>
</select></label>
	<br>
	</fieldset>
        
        
        <fieldset class="boxBody">
            <label>Select Operator -&nbsp&nbsp&nbsp&nbsp&nbsp <b><</b> &nbsp&nbsp<input type="radio" name="operator" value="<">&nbsp&nbsp&nbsp&nbsp&nbsp = &nbsp&nbsp<input type="radio" name="operator" value="=">&nbsp&nbsp&nbsp&nbsp&nbsp > &nbsp&nbsp<input type="radio" name="operator" value=">"></label>
        </fieldset>
        <fieldset class="boxBody">
          
            <label><label>Enter Value -</label>
          <input type="text" tabindex="1" name="operatorvalue" placeholder="" required style="width: 200px;"></label>

	</fieldset>
        
        
        
        
	
	
		<fieldset class="fieldfield" >
	  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" class="btnLogin" value="Search" tabindex="4">
	  
	</fieldset>
</form>
      




</body>
</html>