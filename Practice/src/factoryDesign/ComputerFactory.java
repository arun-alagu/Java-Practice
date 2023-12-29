package factoryDesign;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String cpu, String hdd){

        switch(type.toLowerCase()){
            case "pc":
                return new PC(ram, cpu, hdd);
            case "server":
                return new Server(ram, cpu, hdd);
            default:
                return null;
        }
    }
}
