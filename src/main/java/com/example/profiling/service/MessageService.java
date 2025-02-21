package com.example.profiling.service;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
  private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        String textEn = messageSource.getMessage(
                "hello" ,
                new Object[]{"Victor", "Adodo"},
                Locale.ENGLISH
              );
        System.out.println(textEn);


        String textPL = messageSource.getMessage(
                "hello" ,
                new Object[]{"Fever", "", "", "", "", "", ""},
                Locale.forLanguageTag("pl")
        );

        System.out.println(textPL);
Object[] objects = {textEn, textPL};
        String textEE = messageSource.getMessage(
                "hello" ,
                new Object[]{"Ramona Adodo", "ja", "Johnson Johnson"},
                Locale.forLanguageTag("ee")
        );
        System.out.println(textEE);


    }
}

