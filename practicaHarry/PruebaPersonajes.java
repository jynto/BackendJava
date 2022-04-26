package practicaHarry;

public class PruebaPersonajes {

    public static void main (String[] args) {
        def();
    }

    public static void def() {

        Personajes pHarryPotter = new Personajes();
        Personajes pHermione = new Personajes();
        Personajes pRonald = new Personajes();
        Personajes pAlbus = new Personajes();
        Personajes pSeverus = new Personajes();

        pHarryPotter.setCasa("Gryffindor");
        pHarryPotter.setGenero("Masculino");
        pHarryPotter.setNombre("Harry James Potter");
        pHarryPotter.setBoggart("Dementor");
        pHarryPotter.setPatronus("Ciervo");

        pHermione.setCasa("Gryffindor");
        pHermione.setGenero("Femenino");
        pHermione.setNombre("Hermione Jean Granger");
        pHermione.setBoggart("La profesora McGonagall diciéndole que reprobó todo");
        pHermione.setPatronus("Nutria");

        pRonald.setCasa("Gryffindor");
        pRonald.setGenero("Masculino");
        pRonald.setNombre("Ronald Weasley");
        pRonald.setBoggart("Acromántula");
        pRonald.setPatronus("Jack Russell Terrier");

        pAlbus.setCasa("Gryffindor");
        pAlbus.setGenero("Masculino");
        pAlbus.setNombre("Albus Percival Wulfric Brian Dumbledore");
        pAlbus.setBoggart("El cuerpo de su hermana Ariana");
        pAlbus.setPatronus("Fénix");

        pSeverus.setCasa("Slytherin");
        pSeverus.setGenero("Masculino");
        pSeverus.setNombre("Severus Snape");
        pSeverus.setBoggart("Lord Voldemort");
        pSeverus.setPatronus("Cierva");

        String msg = "Hola, soy un personaje en la historia de Harry Potter y estas son mis características: ";

        msg += "\n[Casa: "+pHarryPotter.getCasa();
        msg += ", Genero: "+pHarryPotter.getGenero();
        msg += ", Nombre: "+pHarryPotter.getNombre();
        msg += ", Boggart: "+pHarryPotter.getBoggart();
        msg += ", Patronus: "+pHarryPotter.getPatronus()+"]";

        msg += "\n[Casa: "+pHermione.getCasa();
        msg += ", Genero: "+pHermione.getGenero();
        msg += ", Nombre: "+pHermione.getNombre();
        msg += ", Boggart: "+pHermione.getBoggart();
        msg += ", Patronus: "+pHermione.getPatronus()+"]";

        msg += "\n[Casa: "+pRonald.getCasa();
        msg += ", Genero: "+pRonald.getGenero();
        msg += ", Nombre: "+pRonald.getNombre();
        msg += ", Boggart: "+pRonald.getBoggart();
        msg += ", Patronus: "+pRonald.getPatronus()+"]";

        msg += "\n[Casa: "+pAlbus.getCasa();
        msg += ", Genero: "+pAlbus.getGenero();
        msg += ", Nombre: "+pAlbus.getNombre();
        msg += ", Boggart: "+pAlbus.getBoggart();
        msg += ", Patronus: "+pAlbus.getPatronus()+"]";

        msg += "\n[Casa: "+pSeverus.getCasa();
        msg += ", Genero: "+pSeverus.getGenero();
        msg += ", Nombre: "+pSeverus.getNombre();
        msg += ", Boggart: "+pSeverus.getBoggart();
        msg += ", Patronus: "+pSeverus.getPatronus()+"]";

        System.out.print(msg);
    }
}