package dao;

import com.lgt.dbaccess.message.dao.MessageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class MessageDaoTest {
    @Resource
    private MessageDao messageDao;

    @Test
    public void tesQuery(){
        messageDao.queryMessageList();

    }
}
