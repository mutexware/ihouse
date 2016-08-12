package io.mutexware.ihome.service;

import org.springframework.mail.MailMessage;

/**
 * Created by tymur on 7/21/16.
 */
public interface MailService {

    void sendMessage(MailMessage message);
}
