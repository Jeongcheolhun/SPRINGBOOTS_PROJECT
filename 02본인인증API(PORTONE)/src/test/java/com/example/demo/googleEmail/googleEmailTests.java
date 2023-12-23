package com.example.demo.googleEmail;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootTest(properties = "classpath:application.properties")
public class googleEmailTests {



    @Autowired
    private JavaMailSenderImpl mailSender;
    @Test
    public void testEmail() {
        //메일 설정
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(587);
//        mailSender.setUsername("hoon2525@gmail.com");
//        mailSender.setPassword("rfeowiphgsdndmqq");
//
//        Properties mailProps = new Properties();
//        mailProps.put("mail.smtp.auth", "true");
//        mailProps.put("mail.smtp.starttls.enable", "true");
//        mailSender.setJavaMailProperties(mailProps);
//
//
//        System.out.println(mailSender);
//        System.out.println(mailSender.getHost());
//        System.out.println(mailSender.getPort());

        //넣을 값 지정
        String code = (int)((Math.random()*1000000))+"";

        //메일 메시지 만들기
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("cjfgns2525@naver.com");
        message.setSubject("[WEB-Server]임시패스워드 발급");
        message.setText(code);


        //
        mailSender.send(message);
    }
}
