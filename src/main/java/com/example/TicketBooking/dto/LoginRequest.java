package com.example.TicketBooking.dto;

public class LoginRequest {

    private String email;
    private String password;

    public LoginRequest(){

    }

    public LoginRequest(String email){
        this.email = email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
