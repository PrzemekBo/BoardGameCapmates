package com.boardgame.comdemo.domain;


public class BasicBuldierUser implements UserBuilder {

   private User user;


   public BasicBuldierUser(){
       this.user=new User();
   }

    @Override
    public void buildFirstname() {
        this.user.setFirstname("Adam");
    }

    @Override
    public void buildLastname() {
        this.user.setLastname("Malysz");

    }

    @Override
    public void buildEmail() {
       this.user.setEmail("adammalysy@gmail.com");

    }

    @Override
    public void buildPassword() {
       this.user.setPassword("dqwetz");

    }

    @Override
    public void biuldMotto() {
       this.user.setMotto("ewkdmew  iewkidef");

    }

    @Override
    public User getUser() {
        return user;
    }
}
