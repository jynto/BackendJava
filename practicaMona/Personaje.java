package practicaMona;

class Mona {
    int id;
    String name, design, skills, activities;

    Mona(int id, String name, String design, String skills ,String activities) {
        this.id = id;
        this.name = name;
        this.design = design;
        this.skills = skills;
        this.activities = activities;
    }
}

public class Personaje extends Mona {

    Personaje(int id, String name, String design, String skills,String activities){
        super(id, name, design, skills ,activities);
    }

    void display() {
        System.out.println("Id: "+id+" "+"\nNombre: "+" "+name+" "+"\nDiseño: "+design+" "+"\nHabilidades: "+skills+" "+"\nActividades: "+activities+" "+"\n");
    }

}

class TestMonaPersonaje {
    public static void main(String[] args) {
        Personaje p1 = new Personaje(1, "Ironcat", "Tiene un traje completo de metal muy ligero que consta de un Casco, Pechera, Botitas y Cola.", "Usa su propia tecnología a través de una IA por medio de maullidos. El traje le permite usar fuerza x5, volar y el uso de garras.", "Ademas de evitar el bien y hacer el mal, duerme la mayor parte del tiempo y come todo el dia. 'No es villano'");
        Personaje p2 = new Personaje(2, "Kal-elcat", "Es un Traje de medio cuerpo que esta hecho de un material elástico muy resistente que trae unas Botitas y Capa.", "Todos sus sentidos son ilimitados, supera la velocidad de la luz, ve a través de las cosas. Sus debilidades son la kryptonita, las caricias y el atún.", "Es muy posesivo por lo que siempre esta inquieto para que nadie invada su planeta, hace mas desorden que orden, puede comer todo el dia, no duerme.");
        Personaje p3 = new Personaje(3, "Mummycat", "Tiene un traje completo que cubre desde las patitas hasta la cabeza por un rollo de tela que no tiene inicio y no tiene fin.", "Es inmortal, nunca tiene hambre, es bien portado y no hace travesuras.", "Duerme muy poco, camina como zombie y le gusta rodearse con personas de buen corazon que le acaricien la mayor parte del tiempo.");
        Personaje p4 = new Personaje(4, "Firefightercat", "Su traje es resistente al fuego y consta de un casco, chaleco, pantaloncito y botitas.", "Es experto apagando incendios y salvando personas.", "La mayor parte del tiempo esta jugando, duerme muy poco, le gusta el agua, el pescado y en las noches siempre podrán verlo patrullar el vecindario.");
        Personaje p5 = new Personaje(5, "Steroidcat", "Siempre viste a la moda, su ropa es ajustada y siempre usa lentes oscuros.", "El uso de fuerza y resistencia.","Se la pasa dando vueltas todo el dia alardeando que es el mejor, come hasta 10 veces al dia pero solo cuando esta a dieta.");
        Personaje p6 = new Personaje(6, "Pilotcat", "Usa un traje especial desarrollado por la NASA, consta de un traje completo con botas y casco.", "Maneja un jet donde puede hacer acrobacias y recorrer distancias enormes en un parpadeo.", "Practica su vuelo cuando no esta en el aire, le gusta tomar pequeñas siestas sobre su jet cuando esta en tierra, le gusta casar su alimento y su mayor sueño es viajar a la luna.");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
    }
}