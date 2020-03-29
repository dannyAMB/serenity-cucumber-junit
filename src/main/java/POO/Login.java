package POO;

public class Login {
    public String password = "";
    public String user = "";

   public User setUsuario(String user){
       return new User(user);
   }


    public String getPassword(){

        return password;
    }
    public class User{
        public String user = "";

        public User(String user) {
            this.user = user;
        }



        public String getUser() {
            return user;
        }



    }

}
