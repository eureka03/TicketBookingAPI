package com.example.TicketBooking.entity;

import jakarta.persistence.*;
import jdk.jfr.ContentType;

import java.util.UUID;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name="user_email")
    private String email;


    private String password;

  public User(){

  }

  public User(String email){
      this.email=email;
  }

  public void setEmail(String email){
      this.email = email;
  }

  public String getEmail(){
      return email;
  }

  public UUID getId(){
      return id;
  }

}
