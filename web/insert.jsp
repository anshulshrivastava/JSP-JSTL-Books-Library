<html>
    <head>
        <title>Anshul NoteBook </title>


        <link rel="stylesheet" type="text/css" href="my/style1.css"/>


        <link rel="stylesheet" type="text/css" href="my/reset1.css">
        <link rel="stylesheet" type="text/css" href="my/structure2.css">
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
                <strong><h2>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspInsert into <b>Book</b></h2></strong>
                <br>

                <table>
                    <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            </td>
                        <td>
                <label>Enter AuthorID -</label>
                <input type="text" tabindex="1" name="insert1" placeholder="Enter AuthorID..." required>
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                        
                         <td>
                <label>Enter Author First Name -</label>
                <input type="text" tabindex="1" name="insert2" placeholder="Enter First Name..." required>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            </td>
                        <td>
                <label>Enter Author Last Name -</label>
                <input type="text" tabindex="1" name="insert3" placeholder="Enter Last Name..." required>
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                        
                         <td>
                <label>Enter Book ISBN -</label>
                <input type="text" tabindex="1" name="insert4" placeholder="Enter ISBN..." required>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            </td>
                        <td>
                <label>Enter Book Title -</label>
                <input type="text" tabindex="1" name="insert5" placeholder="Enter Title..." required>
                        </td>
                        <td>
                            <input type="hidden" name="pageName" values="login"/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                        
                         <td>
                <label>Enter Book Edition Number -</label>
                <input type="text" tabindex="1" name="insert6" placeholder="Enter Edition Number..." required>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            </td>
                        <td>
                <label>Enter Book Copyright Year -</label>
                <input type="text" tabindex="1" name="insert7" placeholder="Enter Copyright..." required>
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                      <td>
	 </td>
                    </tr>
                    <tr>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br></td>
                 
                        <td>
                            <fieldset>  <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br><input type="submit" name="insertion" class="btnLogin" value="Insert" tabindex="4"></fieldset>
                        </td>
                    </tr>
                </table>

                
            </fieldset>
            
           



        </form>







    </body>
</html>