<html>
    <head>
        <title>Anshul NoteBook </title>


        <link rel="stylesheet" type="text/css" href="my/style1.css"/>


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
                <strong><h2>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspUpdate by <b>Selection</b></h2></strong>
                <br>

                <table>


                    <tr>

                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
                            <br> 
                        </td>

                        <td>

                            <br>  <font size="3">Select One - </font><select id="ddl" onchange="configureDropDownLists(this, 'ddl2')" name="updateoption">
                                <option>---Select One---</option>

                                <option value="Authors.FirstName">First Name</option>
                                <option value="Authors.LastName">Last Name</option>
                                <option value="Titles.ISBN">ISBN</option>
                                <option value="Titles.Title">Title</option>
                                <option value="Titles.EditionNumber">Edition Number</option>
                                <option value="Titles.Copyright">Copyright</option>
                            </select> </td>


                    </tr>
                    <tr>
                        <td>



                        </td>
                    </tr>







                    <tr>
                        <td>
                        </td>
                        <td>
                            <br><label>Enter Value -</label>
                            <input type="text" tabindex="1" name="setvalue" placeholder="Enter Value..." required>
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                    </tr>


                    <tr>
                        <td>

<br>
<br>
                        </td>
                    </tr>




                    <tr>

                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<br>
                            <br>
                            <br>
                        </td>

                        <td>

                            <br>  <font size="3"> Update By - </font><br><br><br>AuthorID</b> &nbsp&nbsp<input type="radio" name="choose" value="AuthorISBN.AuthorID">&nbsp&nbsp First Name &nbsp&nbsp<input type="radio" name="choose" value="Authors.FirstName">&nbsp&nbsp&nbsp&nbsp&nbsp Last Name &nbsp&nbsp<input type="radio" name="choose" value="Authors.LastName">
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
                        <td>
                        </td>
                        <td>
                            <br><label>Enter Value -</label>
                            <input type="text" tabindex="1" name="getvalue" placeholder="Enter Value..." required>
                        </td>
                        <td>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </td>
                    </tr>



                    <tr>
                        <td><br></td>

                        <td>
                            <br><fieldset class="fieldfield" >
                                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="updation" class="btnLogin" value="Update" tabindex="4">

                            </fieldset> </td>
                    </tr>

                </table>


            </fieldset>





        </form>







    </body>
</html>