package com.epam.anya.servlet.action;

import com.epam.anya.servlet.entity.Paragraph;
import com.epam.anya.servlet.entity.Sentence;
import com.epam.anya.servlet.entity.SentencePart;
import com.epam.anya.servlet.entity.Text;
import com.epam.anya.servlet.parser.Parser;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        Text text = Parser.parseString(request.getParameter("text"));

        List<SentencePart> sentenceParts = new ArrayList<>();
        List<Sentence> sentences = new ArrayList<>();
        for (Paragraph paragraph : text.elements) {
            sentences.addAll(paragraph.elements);
            for (Sentence sentence : paragraph.elements) {
                sentenceParts.addAll(sentence.elements);
            }
        }
        request.setAttribute("paragraphs", text.elements);
        request.setAttribute("sentences", sentences);
        request.setAttribute("sentenceParts", sentenceParts);
        return "/WEB-INF/structure.jsp";
    }
//        String sourse = request.getParameter("textarea");
//
//          // Text text = Parser.parseText(sourse);
//           //  Text text = Text.fromString(sourse);
//
//        //request.setAttribute("text", text);
//        return "WEB-INF/index.jsp";
    }
}
