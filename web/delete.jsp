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

        <style> 

        </style>

    </head>


    



    <body>

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





        <form class="box login" action="sqlUpdate.jsp" method="post">
            <fieldset class="fieldfield">
                <strong><h2>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspDelete by <b>Selection</b></h2></strong>
                <br>

                <table>
                    <tr>
                        
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
                          <br> 
                        </td>
                        
                        <td>
                            
              <br><br>  Make Selection : <select id="ddl" onchange="configureDropDownLists(this,'ddl2')" name="deleteoption">
                    <option>---Select One---</option>
                    <option value="delete1">AuthorID</option>
                    <option value="delete2">First Name</option>
                    <option value="Authors.LastName">Last Name</option>
                    <option value="delete4">ISBN</option>
                    <option value="delete5">Title</option>
                    <option value="delete6">Edition Number</option>
                    <option value="delete7">Copyright</option>
</select>
                        </td>
                        <td>
                            <input type="hidden" name="pageName" values="register"/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                        
                        
                    </tr>
                    <tr>
                        <td>
                    <br>
                        </td>
                    </tr>
                    
                    
                    
                    
                    
                   <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            </td>
                        <td>
                <br><label>Enter Value -</label>
                <input type="text" tabindex="1" name="deletevalue" placeholder="Enter Value..." required>
                        </td>
                        <td>
                           &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                   </tr>
                   
                   <tr>
                        <td><br></td>
                 
                        <td>
                           <br><br><fieldset class="fieldfield" >
                               &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="deletion" class="btnLogin" value="Delete" tabindex="4">
	  
	</fieldset> </td>
                    </tr>
                   
                </table>

                
            </fieldset>
            
           



        </form>







    </body>
</html>