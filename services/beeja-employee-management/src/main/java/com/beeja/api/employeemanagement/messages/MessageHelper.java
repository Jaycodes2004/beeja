package com.beeja.api.employeemanagement.messages;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageHelper {

  @Autowired private MessageSource messageSource;

  public String getMessage(String messageKey, String... data) {
    return messageSource.getMessage(messageKey, data, Locale.ENGLISH);
  }

  public String getMessage(String messageKey) {
    return messageSource.getMessage(messageKey, null, Locale.ENGLISH);
  }
}
