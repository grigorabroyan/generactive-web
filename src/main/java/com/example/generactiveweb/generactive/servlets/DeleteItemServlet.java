package com.example.generactiveweb.generactive.servlets;

import com.example.generactiveweb.generactive.model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "deleteItem", value = "/delete")
public class DeleteItemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession();

        if (req.getParameter("remove") != null) {
            String item = req.getParameter("item");
            ArrayList<Item> items = (ArrayList<Item>) req.getServletContext().getAttribute("name");

            items.removeIf(name -> name.getName().equals(item));

            session.setAttribute("name", items);
            req.getRequestDispatcher("item").forward(req, resp);
        }
    }
}
