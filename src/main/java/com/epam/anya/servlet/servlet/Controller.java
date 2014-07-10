package com.epam.anya.servlet.servlet;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Text text = Parser.parseString(request.getParameter("text"));

        List<SentencePart> sentenceParts = new ArrayList<>();
        List<Sentence> sentences = new ArrayList<>();
        for (Paragraph paragraph : text.parts) {
            sentences.addAll(paragraph.parts);
            for (Sentence sentence : paragraph.parts) {
                sentenceParts.addAll(sentence.parts);
            }
        }
        request.setAttribute("paragraphs", text.parts);
        request.setAttribute("sentences", sentences);
        request.setAttribute("sentenceParts", sentenceParts);

        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


      //  ActionFactory factory = new ActionFactory();

//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //resp.getWriter().println("HELLOOO!!!!!!!!!!");
       // Action action = new ParseAction();
//        String actionName = request.getParameter("action");
//        Action action = ActionFactory.getAction();
//        String result = action.execute(request);
//        request.setCharacterEncoding("UTF-8");
//
//
//
//        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
//       // request.getRequestDispatcher(result).forward(request,response);
//    }
}
