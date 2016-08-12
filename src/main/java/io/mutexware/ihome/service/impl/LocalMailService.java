package io.mutexware.ihome.service.impl;

import io.mutexware.ihome.service.MailService;
import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Service;

/**
 * Created by tymur on 8/11/16.
 */
@Service
public class LocalMailService implements MailService {

    @Override
    public void sendMessage(MailMessage message) {
        //TODO implement stub
        throw new RuntimeException("send messaging not implemented yet");
    }
}
