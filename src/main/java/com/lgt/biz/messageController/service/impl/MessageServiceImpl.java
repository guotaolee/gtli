//package com.lgt.biz.messageController.service.impl;
//
//import com.lgt.biz.messageController.service.MessageService;
//import com.lgt.dbaccess.message.Message;
//import com.lgt.dbaccess.message.dao.MessageDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class MessageServiceImpl implements MessageService {
//
//    @Autowired
//    private MessageDao messageDao;
//
//    public List<Message> queryMessageList(String command, String description) {
//        return messageDao.queryMessageList();
//    }
//}
