public class Ventilador{
    private String marca;
    private int potenciaVentilador;
    private boolean encendido;

    public Ventilador(String marcaVentilador, int potenciaDelVentilador){
        marca = marcaVentilador;
        potenciaVentilador = potenciaDelVentilador;
        encendido = true;
    }

    public String getMarca(){
        return marca;
    }

    public int getPotenciaDelVentilador(){
        return potenciaVentilador;
    }

    public boolean getEncendido(){
        return encendido;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void incrementarPotencia(int nuevaPotencia){
        potenciaVentilador = potenciaVentilador + nuevaPotencia;
    }

    public void encendido(){
        if(encendido == true){
            encendido = false;
        }
        else{
            encendido = true;
        }
    }

    public void imprimirDetallesVentilador() {
        System.out.println("Marca " +  marca  + " | Potencia " +  potenciaVentilador  + " | Encendido " + encendido);
    }
    
    public String getEstado(){
        String estado;
        String ventiladorEncendido;
        if(encendido == true){
            ventiladorEncendido = "si";
        }
        else{
            ventiladorEncendido = "no";
        }
        estado = ("Marca " +  marca  + " | Potencia " +  potenciaVentilador  + " | Encendido " + ventiladorEncendido);
        return estado;
    }
}