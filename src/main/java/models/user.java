package models;

public class User{
    private final int userID;
    private final String name;
    private final String email;
    private final String phone;

    public User(int userID,String name,String email,String phone){
        this.userID=userID;
        this.name=name;
        this.email=email;
        this.phone=phone;
        

    }
     public int getuserId(){
        return userID;
     }
      public String getName(){
        return name;
      }
      public String getemail(){
        return email;
      }
      public String getphone(){
        return phone;
      }

	
}
