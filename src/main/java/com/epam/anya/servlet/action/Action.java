package com.epam.anya.servlet.action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
    String execute(HttpServletRequest request);
}
