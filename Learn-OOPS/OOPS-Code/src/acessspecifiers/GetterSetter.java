package acessspecifiers;
class Login{
    private String name;
    String email;
    private String password;



    public String getName(){
        return this.name;
    }

    public void setName(String nam){
        this.name = nam;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Login lg = new Login();
        lg.setPassword("ajmal12345");
        lg.setName("mohammed");
        System.out.println(lg.getPassword());
        System.out.println(lg.getName());
    }
}
