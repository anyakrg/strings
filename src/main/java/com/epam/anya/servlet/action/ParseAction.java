package com.epam.anya.servlet.action;

import com.epam.anya.servlet.entity.Text;
import com.epam.anya.servlet.parser.Parser;
import javax.servlet.http.HttpServletRequest;


public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        String sourse = request.getParameter("textarea");

          // Text text = Parser.parseText(sourse);
           //  Text text = Text.fromString(sourse);

        //request.setAttribute("text", text);
        return "WEB-INF/index.jsp";
    }
}
