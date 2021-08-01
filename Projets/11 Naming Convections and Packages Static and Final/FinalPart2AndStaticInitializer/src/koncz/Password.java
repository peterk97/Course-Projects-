package koncz;

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt (int password){
        return password ^ key;
    }


// sometimes it is useful to make some fo the methods final if you know they are gonna be overridden
    public final void  storePassword (){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }



    }
