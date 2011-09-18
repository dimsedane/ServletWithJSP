/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entities.Item;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruj
 */
public class ShopServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        if (request.getSession().getAttribute("LISTNAME") == null) {
            request.getSession().setAttribute("LISTNAME", new ArrayList<Item>());
        } else if ((request.getParameter("NEWITEMNAME") != null) && (request.getParameter("NEWITEMAMOUNT") != null)) {
            ArrayList<Item> items = (ArrayList<Item>) request.getSession().getAttribute("LISTNAME");

            Item newItem = new Item();
            newItem.setName(request.getParameter("NEWITEMNAME").toString());

            newItem.setAmount(request.getParameter("NEWITEMAMOUNT").toString());

            items.add(newItem);
        }
        
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }
}
