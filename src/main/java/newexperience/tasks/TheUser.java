package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import newexperience.model.DateRegister;
import newexperience.utils.WaitTime;

import java.util.List;

import static newexperience.userinterface.PageRegister.*;

public class TheUser implements Task {
    private List<DateRegister>register;
    public TheUser(List<DateRegister> register) {this.register=register;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        String mail= register.get(0).getStrEmail();
        int arr=(int)(Math.random()*10000);
        String email=  mail +arr+"@gmail.com";

        actor.attemptsTo(Click.on(LOGIN),
                Enter.theValue(email).into(EMAIL),
                Click.on(VALIDATE_EMAIL),
                Enter.theValue(register.get(0).getStrFistName()).into(FIRST_NAMEONE),
                Enter.theValue(register.get(0).getStrLastName()).into(LAST_NAMEONE),
                Enter.theValue(register.get(0).getStrPasswd()).into(PASSWD),
                Enter.theValue(register.get(0).getStrFistName()).into(FIRST_NAME),
                Enter.theValue(register.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(register.get(0).getStrAddress()).into(ADDRESS),
                Enter.theValue(register.get(0).getStrCity()).into(CITY),
                Click.on(STATE),
                SelectFromOptions.byVisibleText(register.get(0).getStrState()).from(STATE),
                Enter.theValue(register.get(0).getStrCodePostal()).into(POSCODE),
                Click.on(COUNTRY),
                Enter.theValue(register.get(0).getStrMobile()).into(MOBILE),
                Enter.theValue(register.get(0).getStrReference()).into(REFE),
                Click.on(BUTTO_FIN)
        );
        WaitTime.Time(5000);


    }
    public static TheUser register(List<DateRegister>register){return Tasks.instrumented(TheUser.class, register);
    }

}
