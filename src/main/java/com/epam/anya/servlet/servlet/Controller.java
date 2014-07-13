package com.epam.anya.servlet.servlet;

import com.epam.anya.servlet.action.Action;
import com.epam.anya.servlet.action.ActionFactory;
import com.epam.anya.servlet.action.ParseAction;
import com.epam.anya.servlet.entity.Paragraph;
import com.epam.anya.servlet.entity.Sentence;
import com.epam.anya.servlet.entity.SentencePart;
import com.epam.anya.servlet.entity.Text;
import com.epam.anya.servlet.parser.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Action parser = new ParseAction();
        String result = parser.execute(req);

        req.getRequestDispatcher(result).forward(req, resp);
    }
}
