package factoryDesign;

public class Client {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pC","16 GB", "2.4 GHz", "1 TB");
        Computer server = ComputerFactory.getComputer("Server", "500 GB", "5 GHz", "10 TB");

        System.out.println("Created PC of:\t"+pc);
        System.out.println("Created Server of:\t" +server);

    }
}
