public class Proyecto {
    long id;
    String name_Proyect;

    public Proyecto(long id, String name_Proyect) {
        this.id = id;
        this.name_Proyect = name_Proyect;
    }

    public void verProyecto() {
        System.out.println("Nombre: "+ name_Proyect +"");
    }
    
    public static void main(String[] args) {
        Proyecto p = new Proyecto(1, "Nemesis");
        p.verProyecto();
        System.out.println(p.id);
    }
}