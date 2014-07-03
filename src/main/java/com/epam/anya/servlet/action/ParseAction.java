package com.epam.anya.servlet.action;

import com.epam.anya.servlet.entity.Text;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.parser.Parser;

public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        String sourse = request.getParameter("textarea");

           Text text = Parser.parseText(sourse);
           //  Text text = Text.fromString(sourse);

        request.setAttribute("text", text);
        return "WEB-INF/index.jsp";
    }
}
