package com.demo.login.entity;

public class User {
	 //序列化版本号
   private static final long serialVersionUID = 1L;
   private Integer id;
   private String username;
   private String password;

   public  User(){

   }

   public User(Integer id, String username, String password) {
       this.id = id;
       this.username = username;
       this.password = password;
   }

   public Integer getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getName() {
       return username;
   }

   public void setName(String username) {
       this.username = username;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   @Override
   public String toString() {
       return "User{" +
               "id=" + id +
               ", name='" + username + '\'' +
               ", password='" + password + '\'' +
               '}';
   }
}