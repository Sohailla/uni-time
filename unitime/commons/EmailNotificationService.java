package org.unitime.commons;

import org.unitime.commons.EmailService;
import org.unitime.timetable.defaults.ApplicationProperty;

public class EmailNotificationService {
    private EmailService emailService;

    public EmailNotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void addNotify() throws Exception {
        emailService.addRecipient(
                ApplicationProperty.EmailNotificationAddress.value(),
                ApplicationProperty.EmailNotificationAddressName.value()
        );
    }

    public void addNotifyCC() throws Exception {
        emailService.addRecipientCC(
                ApplicationProperty.EmailNotificationAddress.value(),
                ApplicationProperty.EmailNotificationAddressName.value()
        );
    }
}