package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.SerenityPage.*;

public class CrearUnidadN implements Task {

    private String nombreR;
    private String NombreP;
    public CrearUnidadN(String nombreR, String NombreP){
        this.nombreR = nombreR;
        this.NombreP = NombreP;
    }

    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(SPAN_ORGANIZACION, isVisible()),
                Click.on(SPAN_ORGANIZACION),
                Click.on(SPAN_UNIDADES),
                Click.on(DIV_NUEVA_UNIDAD),
                Enter.theValue(nombreR).into(INPUT_NOMBRE_UNIDAD),
                Click.on(SPAN_UNIDAD_PADRE),
                Enter.theValue(NombreP).into(INPUT_BUSCAR_PADRE),
                Click.on(LI_SELECCIONAR_PADRE),
                Click.on(SPAN_CREAR_UNIDAD));





    }

    public static CrearUnidadN crearUnidadN(String nombreR, String NombreP){
        return instrumented(CrearUnidadN.class, nombreR, NombreP);

    }
}
