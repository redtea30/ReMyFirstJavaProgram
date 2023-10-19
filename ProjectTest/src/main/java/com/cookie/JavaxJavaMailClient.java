package com.cookie;

import org.junit.jupiter.api.Test;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Package-name: com.cookie
 * Project-name:Default (Template) Project
 * Author: Neko
 * 19/10/2023-10-2023 17-37
 * Describe：
 */

public class JavaxJavaMailClient {

    public String emailHost = "smtp.qq.com";       //发送邮件的主机
    public String transportType = "smtp";           //邮件发送的协议
    public String fromUser = "Neko";           //发件人名称
    public String fromEmail = "qxddyx@qq.com";  //发件人邮箱
    public String authCode = "xxxxxxxxxxxxxxxx";    //发件人邮箱授权码
    public String toEmail = "xiaofeng504@qq.com";   //收件人邮箱
    public String subject = "电子专票开具";           //主题信息

    @Test
    public void ClientTestA() throws UnsupportedEncodingException, javax.mail.MessagingException {

        //初始化默认参数
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", transportType);
        props.setProperty("mail.host", emailHost);
        props.setProperty("mail.user", fromUser);
        props.setProperty("mail.from", fromEmail);
        //获取Session对象
        Session session = Session.getInstance(props, null);
        //开启后有调试信息
        session.setDebug(true);

        //通过MimeMessage来创建Message接口的子类
        MimeMessage message = new MimeMessage(session);
        //下面是对邮件的基本设置
        //设置发件人：
        //设置发件人第一种方式：直接显示：antladdie <antladdie@163.com>
        //InternetAddress from = new InternetAddress(sender_username);
        //设置发件人第二种方式：发件人信息拼接显示：蚂蚁小哥 <antladdie@163.com>
        String formName = MimeUtility.encodeWord("蚂蚁小哥") + " <" + fromEmail + ">";
        InternetAddress from = new InternetAddress(formName);
        message.setFrom(from);

        //设置收件人：
        InternetAddress to = new InternetAddress(toEmail);
        message.setRecipient(Message.RecipientType.TO, to);

        //设置抄送人(两个)可有可无抄送人：
        List<InternetAddress> addresses = Arrays.asList(new InternetAddress("1457034247@qq.com"), new InternetAddress("575814158@qq.com"));
        InternetAddress[] addressesArr = (InternetAddress[]) addresses.toArray();
        message.setRecipients(Message.RecipientType.CC, addressesArr);

        //设置密送人 可有可无密送人：
        //InternetAddress toBCC = new InternetAddress(toEmail);
        //message.setRecipient(Message.RecipientType.BCC, toBCC);

        //设置邮件主题
        message.setSubject(subject);

        //设置邮件内容,这里我使用html格式，其实也可以使用纯文本；纯文本"text/plain"
        message.setContent("<h1>蚂蚁小哥祝大家工作顺利！</h1>", "text/html;charset=UTF-8");

        //保存上面设置的邮件内容
        message.saveChanges();

        //获取Transport对象
        Transport transport = session.getTransport();
        //smtp验证，就是你用来发邮件的邮箱用户名密码（若在之前的properties中指定默认值，这里可以不用再次设置）
        transport.connect(null, null, authCode);
        //发送邮件
        ((Transport) transport).sendMessage(message, message.getAllRecipients()); // 发送
    }
}