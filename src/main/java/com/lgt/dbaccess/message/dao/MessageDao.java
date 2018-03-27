package com.lgt.dbaccess.message.dao;

import com.lgt.dbaccess.message.Message;

import java.util.List;

public interface MessageDao {
    List<Message> queryMessageList();
}
