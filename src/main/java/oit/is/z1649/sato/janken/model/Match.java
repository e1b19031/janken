package oit.is.z1649.sato.janken.model;

public class Match {
    int id,user1,user2;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser1() {
        return user1;
    }
    public void setUser1(int user1) {
        this.user1 = user1;
    }
    public int getUser2() {
        return user2;
    }
    public void setUser2(int user2) {
        this.user2 = user2;
    }
    public String getUser1Hand() {
        return user1Hand;
    }
    public void setUser1Hand(String user1Hand) {
        this.user1Hand = user1Hand;
    }
    public String getUser2Hand() {
        return user2Hand;
    }
    public void setUser2Hand(String user2Hand) {
        this.user2Hand = user2Hand;
    }
    String user1Hand,user2Hand;
}
