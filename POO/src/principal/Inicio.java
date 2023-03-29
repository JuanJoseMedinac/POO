package principal;
import salud.persona;
import salud.empleado;

public class Inicio {
    public static void main(String[] args) {
        persona persona1 = new persona();
        empleado empleado1 = new empleado();
        empleado1.pedirDatos();
        empleado1.mostrarEmpleado();
        persona1.pedirdatos();
        persona1.mostrarpersona();
        
        System.out.println("IMC: " + persona1.calcularImc());
        if (persona1.mayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
