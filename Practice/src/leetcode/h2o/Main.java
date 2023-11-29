package leetcode.h2o;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        H2O water = new H2O();
        Runnable releaseHydrogen = new Runnable() {
            @Override
            public void run() {
                System.out.print("H");
            }
        };

        Runnable releaseOxygen = new Runnable() {
            @Override
            public void run() {
                System.out.print("O");
            }
        };

        water.hydrogen(releaseHydrogen);
        water.hydrogen(releaseHydrogen);
        water.oxygen(releaseOxygen);
        water.oxygen(releaseOxygen);
        water.hydrogen(releaseHydrogen);
        water.hydrogen(releaseHydrogen);
        water.hydrogen(releaseHydrogen);
        water.hydrogen(releaseHydrogen);
        water.oxygen(releaseOxygen);
    }
}
