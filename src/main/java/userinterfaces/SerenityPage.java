package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://serenity.is/demo/")
public class SerenityPage extends PageObject {



    //Inicio de Sesion
    public static final Target INPUT_USUARIO = Target.the( "input donde se digita el usuario").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_CLAVE = Target.the( "input donde se digita la clave").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BUTTON_INICIAR = Target.the( "button donde se inicia sesion").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
    //Crear Unidad de Negocio
    public static final Target SPAN_ORGANIZACION = Target.the( "span lista desplegable ").located(By.xpath("//span[text()='Organization']"));

    public static final Target SPAN_UNIDADES = Target.the( "span  click en Unidades de negocio").located(By.xpath("//span[text()='Business Units']"));

    public static final Target DIV_NUEVA_UNIDAD = Target.the( "span  click en nueva Unidad").located(By.xpath("//span[text()=' New Business Unit']"));
    public static final Target INPUT_NOMBRE_UNIDAD = Target.the( "input donde se digita el nombre").located(By.xpath("//form/div/div[1]/div/div/div[1]/input"));

    public static final Target SPAN_UNIDAD_PADRE = Target.the( "span se selecciona Unidad Padre").located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));
    public static final Target INPUT_BUSCAR_PADRE = Target.the( "a se da click en nueva Unidad").located(By.id("s2id_autogen1_search"));
    public static final Target LI_SELECCIONAR_PADRE = Target.the( "li Se selecciona padre").located(By.xpath("//*[@id='select2-results-1']/li[3]"));
    public static final Target SPAN_CREAR_UNIDAD = Target.the( "span donde se guardan la Unidad").located(By.xpath("//*[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar']/div/div/div/div[1]/div/span"));
    // Crear Reunion
    public static final Target SPAN_REUNION = Target.the( "span lista desplegable ").located(By.xpath("//span[text()='Meeting']"));
    public static final Target SPAN_REUNIONES = Target.the( "span click en reuniones ").located(By.xpath("//span[text()='Meetings']"));
    public static final Target SPAN_NUEVA_REUNION = Target.the( "span click en reuniones ").located(By.xpath("//span[text()=' New Meeting']"));
    public static final Target INPUT_NOMBRE_REUNION = Target.the( "span click en reuniones ").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target SPAN_TIPO_REUNION = Target.the( "span click en tipo de reunion ").located(By.id("select2-chosen-6"));
    public static final Target INPUT_TIPO_REUNION = Target.the( "input digito el tipo de reunion ").located(By.id("s2id_autogen6_search"));
    public static final Target INPUT_FECHA_INICIO = Target.the( "input digito la fecha de inicio ").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECT_HORA_INICIO = Target.the( "select digito la hora de inicio ").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select"));
    public static final Target INPUT_FECHA_FIN = Target.the( "input digito la fecha de fin ").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_HORA_FIN = Target.the( "select digito la hora de fin ").located(By.xpath("//form/div/div/div/div/div[5]/select"));
    public static final Target BUTTON_GUARDAR = Target.the( "button click para guardar reunion ").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_Toolbar']/div/div/div/div[1]"));
    public static final Target INPUT_BUSCAR = Target.the( "input buscar reunion ").located(By.xpath("//*[@id='GridDiv']/div[2]/div[1]/input"));
    public static final Target A_REUNION = Target.the( "a confirmar reunion ").located(By.xpath("//*[@id='GridDiv']/div[3]/div[4]/div[3]/div/div/div[2]/a"));

}
