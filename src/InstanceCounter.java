public class InstanceCounter {
    private static int numInstances = 0;

    private static void addInstance(){numInstances++;}

    public InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static int getCount(){
        return numInstances;
    }



//#############################################################################################
    public static void main(String[] args) {
        System.out.println("Rozpoczynamy z " + InstanceCounter.getCount() + " obiektami.");

        for (int i = 0; i < 100_007; i++) {
            new InstanceCounter();
                    }


        System.out.println("Utworzono " + InstanceCounter.getCount() + " obiektów.");

    }


}
