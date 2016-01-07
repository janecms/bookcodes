package com.apress.springrecipes.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apress.springrecipes.board.domain.Message;
import com.apress.springrecipes.board.service.MessageBoardService;

public class MessageDeleteController extends AbstractController {

    private MessageBoardService messageBoardService;

    public void setMessageBoardService(MessageBoardService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Long messageId =
            ServletRequestUtils.getRequiredLongParameter(request, "messageId");
        Message message = messageBoardService.findMessageById(messageId);
        messageBoardService.deleteMessage(message);
        return new ModelAndView("redirect:messageList.htm");
    }
}
