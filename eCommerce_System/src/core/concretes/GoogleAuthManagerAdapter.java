package core.concretes;

import business.abstracts.LoginService;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements LoginService {
    @Override
    public boolean login(String userEmail, String userPassword) {
        GoogleAuthManager googleAuthManager = new GoogleAuthManager();

        if(googleAuthManager.loginWithGoogle(userEmail,userPassword)){
            System.out.println("Google Hesabı ile Giriş başarılı");
            return true;
        }else{
            System.out.println("Google hesap bilgilerinizi Kontrol Edin, Giriş Başarısız");
        }
        return false;


    }
}
