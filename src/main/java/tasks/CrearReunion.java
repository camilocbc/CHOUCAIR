package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.SerenityPage.*;

public class CrearReunion implements Task {

    private String nombreReunion;
    private String tipoReunion;
    private String fechaInicio;
    private String horaInicio;
    private String fechaFin;
    private String horaFin;

    public CrearReunion(String nombreReunion, String tipoReunion, String fechaInicio, String horaInicio, String fechaFin, String horaFin){
        this.nombreReunion = nombreReunion;
        this.tipoReunion = tipoReunion;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
    }

    @Override
    public<T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                Click.on(SPAN_REUNION),
                Click.on(SPAN_REUNIONES),
                Click.on(SPAN_NUEVA_REUNION),
                Enter.theValue(nombreReunion).into(INPUT_NOMBRE_REUNION),
                Click.on(SPAN_TIPO_REUNION),
                Enter.theValue(tipoReunion).into(INPUT_TIPO_REUNION),
                Click.on(By.xpath("//span[text()='"+tipoReunion+"']")),
                Clear.field(INPUT_FECHA_INICIO),
                Enter.theValue(fechaInicio).into(INPUT_FECHA_INICIO),
                SelectFromOptions.byVisibleText(horaInicio).from(SELECT_HORA_INICIO),
                Clear.field(INPUT_FECHA_FIN),
                Enter.theValue(fechaFin).into(INPUT_FECHA_FIN),
                SelectFromOptions.byVisibleText(horaFin).from(SELECT_HORA_FIN),
                Click.on(BUTTON_GUARDAR),
                Enter.theValue(nombreReunion).into(INPUT_BUSCAR),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR)
        );

    }

    public static CrearReunion crearReunion(String nombreReunion, String tipoReunion, String fechaInicio, String horaInicio, String fechaFin, String horaFin){
        return instrumented(CrearReunion.class,nombreReunion,tipoReunion,fechaInicio,horaInicio,fechaFin,horaFin);

    }

    public static CrearReunion validarReunion(){
        return instrumented(CrearReunion.class);
    }
}

