package com.ronak.BootP01Revise;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email: you have got new email message.";
    }
}
