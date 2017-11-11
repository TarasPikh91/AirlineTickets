package com.AirlineTickets.service;

public interface MailSendlerService {

    void sendMail(String theme, String body, String email);
}
