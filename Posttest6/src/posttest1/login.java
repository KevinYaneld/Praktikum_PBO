
package posttest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class login {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        User user = new UserImpl();
        
        System.out.println("============================");
        System.out.println("|          Login           |");
        System.out.println("============================");
        
        boolean isLoggedIn = false;
        int attempt = 0;
        while (!isLoggedIn && attempt < 3) {
            System.out.print("Username : ");
            String username = br.readLine();
            System.out.print("Password : ");
            String password = br.readLine();
            
            isLoggedIn = user.login(username, password);
            attempt++;
            
            if (isLoggedIn) {
                System.out.println("Login berhasil!");
                user.redirect();
                main.crud();
            } else {
                System.out.println("Login gagal!");
                if (attempt == 3) {
                    System.out.println("Anda telah mencoba login sebanyak 3 kali. Silakan coba lagi nanti.");
                }
            }
        }
    }
    
    interface User {
        boolean login(String username, String password);
        void redirect();
    }
    
    static class UserImpl implements User {
        String Username = "admin";
        String Password = "12345";
        
        @Override
        public boolean login(String username, String password) {
            if (Username.equals(username) && Password.equals(password)) {
                return true;
            } else{
                return false;
            }
        }
       @Override
       public void redirect() {
            System.out.println("Masuk Ke Menu Utama...");
            System.out.println("");
        }
    }
    
}
