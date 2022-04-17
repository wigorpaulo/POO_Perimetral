package Model;

public class Usuario {
    private int id;
    private String username;
    private String password;

    //GET
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }


    //SET
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
