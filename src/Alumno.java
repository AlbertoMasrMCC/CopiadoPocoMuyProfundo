public class Alumno {

    String numeroControl    = "";

    String nombre           = "";

    public Alumno(String numeroControl, String nombre) {

        this.numeroControl = numeroControl;
        this.nombre = nombre;

    }

    public String getNumeroControl() {

        return numeroControl;

    }

    public void setNumeroControl(String numeroControl) {

        this.numeroControl = numeroControl;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    @Override
    public String toString() {

        return "El alumno es "+ nombre +" y tiene número de control: "+ numeroControl;

    }

}
