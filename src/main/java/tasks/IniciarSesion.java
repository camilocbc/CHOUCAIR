package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.ClearElement;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.SerenityPage.*;

public class IniciarSesion implements Task {
    private String usuario;
    private String clave;
    public IniciarSesion(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }


    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                Clear.field(INPUT_USUARIO),
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Clear.field(INPUT_CLAVE),
                Enter.theValue(clave).into(INPUT_CLAVE),
                Click.on(BUTTON_INICIAR));

    }

    public static IniciarSesion login(String usuario, String clave){
        return instrumented(IniciarSesion.class, usuario,clave);

    }
}
