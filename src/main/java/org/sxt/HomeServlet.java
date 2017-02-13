package org.sxt;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaotong on 2/13/2017.
 */
@javax.servlet.annotation.WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<String> names = new ArrayList<String>();
        names.add("Apple");
        names.add("Banana");
        names.add("kiwi");
        request.setAttribute("names", names);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
        rd.forward(request, response);
    }
}
