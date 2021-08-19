package com.example.demo.Maildemonstration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired 
    private JavaMailSender javaMailSender; 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String add()
	{
		return "hello";
	}
	
	@RequestMapping(value="/sendmail", method=RequestMethod.POST)
	public String Sendmail(@RequestBody Mail obj)
	{
		
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(obj.getTo());
        msg.setSubject(obj.getSubject());
        msg.setText(obj.getBody());

        javaMailSender.send(msg); 
        return "Mail Sent Successfully"; 
		
	}

}
