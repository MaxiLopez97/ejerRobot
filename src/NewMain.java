
public class NewMain {

   
    public static void main(String[] args) {
        Robot robot= new Robot();
        System.out.println(robot.getBateria());
        robot.avanzar(100);
        System.out.println(robot.getBateria());
        robot.avanzar(100000);
        System.out.println(robot.getBateria());
        robot.avanzar(100);
        
        robot.cargarBateria();
        System.out.println(robot.getBateria());
    }
    
}
