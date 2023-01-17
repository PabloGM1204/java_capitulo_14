public class Gato{
    
    //Atributos 
    private String sexo;
    private String nombre;

    //Constructor
    Gato(String sexo, String n){
        this.sexo = sexo;
        this.nombre = n;
    }

    //Getter
    String getNombre(){
        return this.nombre;
    }

    //Metodo
    public Gato apareaCon(Gato g) throws ExcepcionApareamientoImposible{
        if(this.sexo.equals(g.sexo)){
            throw new ExcepcionApareamientoImposible();
        }
        return new Gato("hijo", "hijo");
    }
}