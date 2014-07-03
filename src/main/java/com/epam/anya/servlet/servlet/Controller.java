package com.epam.anya.servlet.servlet;

import com.epam.anya.servlet.action.Action;
import com.epam.anya.servlet.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    ActionFactory factory = new ActionFactory();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //resp.getWriter().println("HELLOOO!!!!!!!!!!");
       // Action action = new ParseAction();
//        String actionName = request.getParameter("action");
//        Action action = ActionFactory.getAction();
//        String result = action.execute(request);
        request.setCharacterEncoding("UTF-8");



        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
       // request.getRequestDispatcher(result).forward(request,response);
    }
}
