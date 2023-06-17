package lab9p1_gabrielosorto;

import java.util.Scanner;

public class Lab9P1_GabrielOsorto {

    static Scanner sc = new Scanner(System.in);
    static Scanner cs = new Scanner(System.in);

    public static void main(String[] args) {
        boolean seguir = true;
        String titulo;
        String autor;
        String genero;
        int edad;
        while (seguir) {
            System.out.println("-----Menu-----");
            System.out.println("1. Libros y mas Libros (REMASTERED).");
            System.out.println("2. Salir.");
            System.out.print("Ingrese la opcion deseada:");
            int op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    boolean seguir2 = true;
                    System.out.println("=====SUB MENU=====");
                    System.out.println("1. Agregar Libro");
                    System.out.println("2. Listar Libro");
                    System.out.println("3. Modificar libro");
                    System.out.println("4. Eliminar Libro");
                    System.out.println("5. Buscar libro por titulo");
                    System.out.println("6. Buscar libro por Autor");
                    System.out.println("7. Busqueda con filtro de genero");
                    System.out.println("8. Salir Sub Menu");
                    System.out.println("");
                    System.out.print("Ingrese la opcion deseada:");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1 -> {
                            System.out.println("");
                            System.out.println("Opcion ingresada:1");
                            System.out.println("");
                            System.out.println("Ha escogido la opcion de agregar libro, ingrese la informacion solicitada");
                            System.out.println("");
                            System.out.print("Ingrese el titulo del libro:");
                            titulo = cs.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese el autor del Libro:");
                            autor = cs.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese el genero del libro:");
                            genero = cs.nextLine();
                            System.out.println("");
                            System.out.print("Ingrese edad minima:");
                            edad = sc.nextInt();
                            System.out.println("");
                            System.out.println("Libro ingresado Exitosamente!!");
                            System.out.println("");
                            break;
                        }
                        case 2 -> {
                            break;
                        }
                        case 3 -> {
                            break;
                        }
                        case 4 -> {
                            break;
                        }
                        case 5 -> {
                            break;
                        }
                        case 6 -> {
                            break;
                        }
                        case 7 -> {
                            break;
                        }
                        case 8 -> {
                            System.out.println("Volviendo al menu principal");
                            System.out.println("");
                            seguir2 = false;
                            break;
                        }
                        default -> {
                            break;
                        }
                    }//fin switch menu interno
                    break;
                }//fin case 1 menu principal
                case 2 -> {
                    System.out.println("Gracias por usar");
                    seguir = false;
                    break;
                }//fin case 2 menu principal
                default -> {
                    System.out.println("Opcion no valida");
                    break;
                }
            }//fin switch
        }//Fin while 
    }//Fin void

}//fin class
