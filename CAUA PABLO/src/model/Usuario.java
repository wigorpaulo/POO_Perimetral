package model;
public class Usuario {

    private int id;
    private String username;
    private String password;

    //GET
    public String getUsername() {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; }


    @Override
    public String toString(){

        String retorno = Integer.toString(getId()) + "|| " +getUsername() + " ||" +getPassword();

        return retorno;
    }

}


