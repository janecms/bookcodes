package com.apress.springrecipes.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apress.springrecipes.board.service.MessageBoardService;

public class MessageListController extends AbstractController {

    private MessageBoardService messageBoardService;

    public void setMessageBoardService(MessageBoardService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        return new ModelAndView("messageList",
                "messages", messageBoardService.listMessages());
    }
}
