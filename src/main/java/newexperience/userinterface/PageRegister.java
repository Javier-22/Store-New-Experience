package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageRegister {
    public static  final Target LOGIN =Target.the("Button home ").located(By.xpath("//a[@class='login']"));
    public  static final Target EMAIL =Target.the(" Email").located(By.xpath("//input[@id='email_create']"));
    public static final  Target VALIDATE_EMAIL =Target.the("Validate email").located(By.xpath("//button[@id='SubmitCreate']"));
    public static final Target FIRST_NAMEONE =Target.the("Type first NAME").located(By.xpath("//input[@id='customer_firstname']"));
    public static final Target LAST_NAMEONE=Target.the("type Last Name").located(By.xpath("//input[@id='customer_lastname']"));
    public static final Target PASSWD= Target.the("type passwd").located(By.xpath("//input[@id='passwd']"));
    public static final Target FIRST_NAME =Target.the("Type first NAME").located(By.xpath("//input[@id='firstname']"));
    public static final Target LAST_NAME=Target.the("type Last Name").located(By.xpath("//input[@id='lastname']"));
    public static final Target ADDRESS=Target.the("type Address").located(By.xpath("//input[@id='address1']"));
    public static final Target CITY=Target.the("Type City").located(By.xpath("//input[@id='city']"));
    public static final Target STATE=Target.the("hooose state").located(By.xpath("//select[@id='id_state']"));
    public static final Target POSCODE=Target.the("type Poscode").located(By.xpath("//input[@id='postcode']"));
    public static final Target COUNTRY=Target.the("type country").located(By.xpath("//div[@id='uniform-id_country']"));
    public static final Target MOBILE=Target.the("type Mobile").located(By.xpath("//input[@id='phone_mobile']"));
    public static final Target REFE=Target.the("type Reference").located(By.xpath("//input[@id='alias']"));
    public static final Target BUTTO_FIN= Target.the("the register form complete").located(By.xpath("//button[@id='submitAccount']"));

}
