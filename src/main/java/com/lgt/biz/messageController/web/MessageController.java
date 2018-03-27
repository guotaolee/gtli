//package com.lgt.biz.messageController.web;
//
//import com.lgt.biz.messageController.service.MessageService;
//import com.lgt.dbaccess.message.Message;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/message")
//public class MessageController {
//
//    @Autowired
//    private MessageService messageService;
//
//    @RequestMapping("/query")
//    public String queryMessageList(Model model, Message message){
//        List<Message> messageList = messageService.queryMessageList("","");
//        model.addAttribute("messageList",messageList);
//        return "/messageList";
//    }
//}
