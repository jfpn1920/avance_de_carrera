import java.util.Scanner;
public class avance_de_carrera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = new String[10];
        String[] carreras = new String[10];
        int[] semestres = new int[10];
        int[] asignaturasAprobadas = new int[10];
        int[] asignaturasPendientes = new int[10];
        int[] creditosAprobados = new int[10];
        double[] avances = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //--------------------------------------//
        //--|menu_principal_avance_de_carrera|--//
        //--------------------------------------//
        do {
            System.out.println("menu principal avance de carrera");
            System.out.println("1) Registrar avance");
            System.out.println("2) Editar avance");
            System.out.println("3) Listar avances");
            System.out.println("4) Buscar avance");
            System.out.println("5) Eliminar avance");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //----------------------//
                //--|registrar_avance|--//
                //----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro de avance de carrera");
                    System.out.println("id del avance a registrar: " + id);
                    System.out.print("nombre del estudiante: ");
                    estudiantes[total] = entrada.nextLine();
                    System.out.print("carrera: ");
                    carreras[total] = entrada.nextLine();
                    System.out.print("semestre actual: ");
                    semestres[total] = entrada.nextInt();
                    System.out.print("asignaturas aprobadas: ");
                    asignaturasAprobadas[total] = entrada.nextInt();
                    System.out.print("asignaturas pendientes: ");
                    asignaturasPendientes[total] = entrada.nextInt();
                    System.out.print("creditos aprobados: ");
                    creditosAprobados[total] = entrada.nextInt();
                    entrada.nextLine();
                    int totalAsignaturas = asignaturasAprobadas[total] + asignaturasPendientes[total];
                    if (totalAsignaturas > 0) {
                        avances[total] = (asignaturasAprobadas[total] * 100.0) / totalAsignaturas;
                    } else {
                        avances[total] = 0;
                    }
                    System.out.print("estado academico: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Avance registrado correctamente.");
                    total++;
                    break;
                //-------------------//
                //--|editar_avance|--//
                //-------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen avances registrados.");
                        break;
                    }
                    System.out.println("Datos de los avances");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Estudiante: " + estudiantes[i] + " | Carrera: " + carreras[i] + " | Semestre: " + semestres[i] + " | Aprobadas: " + asignaturasAprobadas[i] + " | Pendientes: " + asignaturasPendientes[i] + " | Creditos: " + creditosAprobados[i] + " | Avance: " + String.format("%.2f", avances[i]) + "% | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del avance: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del avance");
                        System.out.print("Nuevo nombre del estudiante: ");
                        estudiantes[posicion] = entrada.nextLine();
                        System.out.print("Nueva carrera: ");
                        carreras[posicion] = entrada.nextLine();
                        System.out.print("Nuevo semestre actual: ");
                        semestres[posicion] = entrada.nextInt();
                        System.out.print("Nuevas asignaturas aprobadas: ");
                        asignaturasAprobadas[posicion] = entrada.nextInt();
                        System.out.print("Nuevas asignaturas pendientes: ");
                        asignaturasPendientes[posicion] = entrada.nextInt();
                        System.out.print("Nuevos creditos aprobados: ");
                        creditosAprobados[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        int totalAsignaturasEditar = asignaturasAprobadas[posicion] + asignaturasPendientes[posicion];
                        if (totalAsignaturasEditar > 0) {
                            avances[posicion] = (asignaturasAprobadas[posicion] * 100.0) / totalAsignaturasEditar;
                        } else {
                            avances[posicion] = 0;
                        }
                        System.out.print("Nuevo estado academico: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Avance actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------//
                //--|listar_avances|--//
                //--------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen avances registrados.");
                    } else {
                        System.out.println("Lista de avances");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Estudiante: " + estudiantes[i] + " | Carrera: " + carreras[i] + " | Semestre: " + semestres[i] + " | Aprobadas: " + asignaturasAprobadas[i] + " | Pendientes: " + asignaturasPendientes[i] + " | Creditos: " + creditosAprobados[i] + " | Avance: " + String.format("%.2f", avances[i]) + "% | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-------------------//
                //--|buscar_avance|--//
                //-------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen avances registrados.");
                        break;
                    }
                    System.out.println("busqueda de avance");
                    System.out.print("ingresa la id para buscar avance: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del avance encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Estudiante: " + estudiantes[posicion] + " | Carrera: " + carreras[posicion] + " | Semestre: " + semestres[posicion] + " | Aprobadas: " + asignaturasAprobadas[posicion] + " | Pendientes: " + asignaturasPendientes[posicion] + " | Creditos: " + creditosAprobados[posicion] + " | Avance: " + String.format("%.2f", avances[posicion]) + "% | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|eliminar_avance|--//
                //---------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen avances registrados.");
                        break;
                    }
                    System.out.println("Datos de los avances");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Estudiante: " + estudiantes[i] + " | Carrera: " + carreras[i] + " | Semestre: " + semestres[i] + " | Aprobadas: " + asignaturasAprobadas[i] + " | Pendientes: " + asignaturasPendientes[i] + " | Creditos: " + creditosAprobados[i] + " | Avance: " + String.format("%.2f", avances[i]) + "% | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del avance a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            estudiantes[i] = estudiantes[i + 1];
                            carreras[i] = carreras[i + 1];
                            semestres[i] = semestres[i + 1];
                            asignaturasAprobadas[i] = asignaturasAprobadas[i + 1];
                            asignaturasPendientes[i] = asignaturasPendientes[i + 1];
                            creditosAprobados[i] = creditosAprobados[i + 1];
                            avances[i] = avances[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Avance eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Avance de Carrera.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}