package org.unitime.commons;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public interface EmailService {
    void setSubject(String subject) throws Exception;

    void setFrom(String email, String name) throws Exception;

    void setReplyTo(String email, String name) throws Exception;

    void addReplyTo(String email, String name) throws Exception;

    void addRecipient(String email, String name) throws Exception;

    void addRecipientCC(String email, String name) throws Exception;

    void addRecipientBCC(String email, String name) throws Exception;

    void setBody(String message, String type) throws Exception;

    void addAttachment(String name, DataHandler data) throws Exception;

    void send() throws Exception;
}