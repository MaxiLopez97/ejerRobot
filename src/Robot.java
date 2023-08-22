
public class Robot {
    private Bateria bateria= new Bateria();
    private boolean despierto;
    private double numSerie;
    private int pasos;
   
    public Robot(double numSerie){
        this.pasos=0;
        this.numSerie=numSerie;
    }
    public Robot(){
        
    }

    public int getBateria() {
        return bateria.getCarga();
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDespierto() {
        return despierto;
    }

    public void setDespierto(boolean despierto) {
        this.despierto = despierto;
    }

    public double getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(double numSerie) {
        this.numSerie = numSerie;
    }
    
    public void avanzar(int pasos){
        int resultado=0;
        while(bateria.getCarga()>=10){
         if(bateria.getCarga()>=10){
         this.pasos+=pasos;
        resultado=pasos/100;
        bateria.setCarga(bateria.getCarga()-(resultado*10));   
         } 
      }if (bateria.getCarga()<=10){
            System.out.println("sin carga de bateria..."+bateria.getCarga());
        }
}
   public void cargarBateria(){
       bateria.setCarga(1000);
    }
}
