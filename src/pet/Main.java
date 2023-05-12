package pet;

public class Main {
    //Modificacio para ver si va al subir a github
    public static void main(String[] args) {
        Animal a1 = new Animal();
        seleccionarTipo(a1);
        seleccionarNombre(a1);
        a1.inicializarAtributos();
        a1.mostrarAtributos();
        jugar(a1);

    }

    private static void seleccionarTipo(Animal a1) {
        char type;
        do {
            System.out.print("Do you want a dog or a cat? (D/C)");
            type = Teclat.llegirChar();
            type = Character.toLowerCase(type);
        } while (type != 'd' && type != 'c');
        a1.setType(type);
    }

    private static void seleccionarNombre(Animal a1) {
        String nombre;
        System.out.println("What do you want your pet to be called?");
        nombre = Teclat.llegirString();
        a1.setName(nombre);
        System.out.println("To make sure " + nombre + " is happy, try to keep the attributes between 1 and a 100.");
    }

    private static int menu(Animal a1) {
        int opcion;
        do {
            System.out.println("1.- Sleep");
            System.out.println("2.- Play");
            System.out.println("3.- Eat");
            if (a1.getType() == 'd') {
                System.out.println("4.- Shower");
            } else {
                System.out.println("4.- Self cleaning");
            }
            System.out.println("0.- Exit application");
            System.out.print("Option:");
            opcion = Teclat.llegirInt();
        } while (opcion > 4 || opcion < 0);
        return opcion;
    }

    private static boolean realizarOperaciones(Animal a1, int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 0:
                salir = true;
                break;
            case 1:
                a1.Sleep();
                break;
            case 2:
                a1.Play();
                break;
            case 3:
                a1.Eat();
                break;
            case 4:
                a1.clean();
                break;
        }
        if (opcion != 0) {
            System.out.println("The attributes after are:");
            a1.mostrarAtributos();
        }
        if ((a1.getEnergy() >= 100 || a1.getEnergy() < 0) || (a1.getFatigue() >= 100 || a1.getFatigue() < 0)
                || (a1.getSleep() >= 100 || a1.getSleep() < 0) || (a1.getHygiene() >= 100 || a1.getHygiene() < 0)
                || (a1.getWeight() >= 100 || a1.getWeight() < 0)) {

            salir = true;
        }
        return salir;
    }

    private static void jugar(Animal a1) {
        boolean salir;
        int opcion;
        do {
            opcion = menu(a1);
            salir = realizarOperaciones(a1, opcion);
        } while (!salir);
        if (opcion == 0) {
            System.out.println("Bye. Hope to see you soon!");
        } else {
            System.out.println(a1.getName() + " has died.");
        }
    }
}