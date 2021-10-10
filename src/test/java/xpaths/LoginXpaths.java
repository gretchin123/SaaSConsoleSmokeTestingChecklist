package xpaths;

public class LoginXpaths {

    public String LogInFields;

    public String EmailTextField(){ return this.LogInFields = "//input[@name='email']"; }
    public String PasswordTextField(){ return  this.LogInFields = "//input[@name='password']"; }
    public String LogInButton(){
        return this.LogInFields = "//button[contains(text(),'SIGN IN')]";
    }
    public String EmailRequiredField(){
        return this.LogInFields = "//div[contains(text(),'This field is required')]";
    }
    public String InputtedInvalidEmail(){ return this.LogInFields = "//div[contains(text(),'Please input a valid email')]";}
    public String SuccessLoginIndicator(){ return this.LogInFields = "//span[contains(text(),'GO')]";}


}
