class Empleado {
    public int id;
    public String nombre;
    private String departamento;

    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setDepartamento(String dpto) {
        this.departamento = dpto;
    }

    ;

    public String getDepartamento() {
        return this.departamento;
    }

}


public class Ciclos {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Heriberto");
        Empleado e2 = new Empleado(2, "Benjamin");
        Empleado e3 = new Empleado(3, "Marco");

        Empleado[] empleados = new Empleado[3];
        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;


        System.out.println("## Ciclo while");
        int indice = 0;
        while (indice < empleados.length) {
            System.out.println("nombre: " + empleados[indice].nombre);
            indice++;
        }


        e1.setDepartamento("Informatica");
        e2.setDepartamento("Fisica");
        e3.setDepartamento("Quimica");

        System.out.println("## Ciclo FOR");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("nombre: " + empleados[i].nombre + "   Departamento: " + empleados[i].getDepartamento());
        }

        System.out.println("## Ciclo For each");
        for (Empleado empleadoActual : empleados) {
            System.out.println("nombre: " + empleadoActual.nombre + " Departamento: " + empleadoActual.getDepartamento());
        }

    }
}