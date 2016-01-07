package com.apress.springrecipes.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apress.springrecipes.board.domain.Message;
import com.apress.springrecipes.board.service.MessageBoardService;

public class MessagePostController extends SimpleFormController {

    private MessageBoardService messageBoardService;

    public MessagePostController() {
        setCommandClass(Message.class);
    }

    public void setMessageBoardService(MessageBoardService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    protected ModelAndView onSubmit(HttpServletRequest request,
            HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        Message message = (Message) command;
        message.setAuthor(request.getRemoteUser());
        messageBoardService.postMessage(message);
        return new ModelAndView(getSuccessView());
    }
}
