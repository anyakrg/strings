package com.epam.anya.servlet.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private static Logger logger = LoggerFactory.getLogger(ActionFactory.class);
    static Map<String, Action> actionMap = new HashMap<>();

    private static final Map<String, Action> actions = new HashMap<>();{



    }

    public static Action getAction(String actionName) {
        return actionMap.get(actionName);
    }
//    static {
//        actions.put("parse", new ParseAction());
//        actions.put("parse", new ParseAction());
//        actions.put("parse", new ParseAction());
//        actions.put("parse", new ParseAction());
//        actions.put("parse", new ParseAction());
//        actions.put("parse", new ParseAction());
//    }
//
//    public static Action getAction(String actionName) {
//        return actions.get(actionName);
//    }
}
