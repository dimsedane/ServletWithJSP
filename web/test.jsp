<%-- 
    Document   : index
    Created on : 18-09-2011, 11:28:08
    Author     : sw701a
--%>
<%@ page import="java.util.ArrayList,entities.Item" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Items for all!</h1>
        <form action="" method="get">
		<input type="text" value="Write something here" name="NEWITEMNAME" id="NEWITEMNAME" />
		<input type="text" value="0" name="NEWITEMAMOUNT" id="NEWITEMAMOUNT" />
		<input type="submit" value="Buy" />
	</form>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Item</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for(Item i : (ArrayList<Item>) session.getAttribute("LISTNAME")) {
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(i.getName());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(i.getAmount());
                        out.println("</td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
