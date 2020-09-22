package Proceso;
import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

import org.mockito.*;

import static org.mockito.Mockito.when;

public class MARCOSALBERTOSANTOSAQUINO_201700328 {

    private static Carrera carreraestado;
    private RegistroAcademico chequearRegistro;
    private Estudiante verificaEstudiante;
    private Horario validaHorario;
    private AsignarHorario asginarMokc;

    @Before
    public void setUp(){

        carreraestado=new Carrera(1,"Sistemas");
        chequearRegistro= Mockito.mock(RegistroAcademico.class);
        asginarMokc = Mockito.mock(AsignarHorario.class);
    }

    @Test
    public void CarreranotNull(){

        Assert.assertNotNull("El objeto debe ser creado correctamente",carreraestado
        );

        System.out.println("Prueba 1 aprobada");
    }

    @Test
    public void porcesarCarreraAssertest() throws Exception {
        //setup
        int procesarcarrera_valorEsperado=2;
        int actual;

        //accion
        actual= carreraestado.procesarCarrera();
        //assert
        assertEquals(procesarcarrera_valorEsperado,carreraestado.procesarCarrera());
        System.out.println("Prueba 2 aprobada");
    }

    @Test
    public void getDescripcionAssertest() throws Exception {
        //setup
        String procesarcarrera_valorEsperado="Sistemas";
        String actual;

        //accion
        actual= carreraestado.getDescripcion();
        //assert
        assertEquals(procesarcarrera_valorEsperado,carreraestado.getDescripcion());
        System.out.println("Prueba 3 aprobada");
    }
    @Test
    public void getandsetCodeAssertest() throws Exception {
        //setup
        String procesarcarrera_valorEsperado="Sistemas si sale";
        String actual;

        //accion
        carreraestado.setDescripcion("Sistemas si sale");
        carreraestado.setCodigo(8);
        //assert
        assertEquals(procesarcarrera_valorEsperado,carreraestado.getDescripcion());
        assertEquals(8,carreraestado.getCodigo());
        System.out.println("Prueba 4 aprobada");
    }

    @Test
    public void chequearCarnet(){
        chequearRegistro.setAnio(2017);
        chequearRegistro.setCorrelativo("00328");
        Assert.assertFalse("Se ingresa mal el numero de carnet",chequearRegistro.cheequearCarnet()==true);
        System.out.println("Prueba 5 aprobada");
    }

    @Test
    public void asignarHorarioTest() throws Exception {
        Horario horario= asginarMokc.generarHorario(new Carrera(1,"Sistemas"),new RegistroAcademico(2017,"11328"));
        System.out.println("Prueba 6 aprobada");
       assertNull(horario,"Hubo un problema");

    }

}
