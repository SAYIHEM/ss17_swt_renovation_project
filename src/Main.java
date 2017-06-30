public class Main {

    public static void main(String[] args) {

        Flooring testFlooring;
        Surface[] surfaces;
        int[] results;

        surfaces = new Surface[3];
        results = new int[3];

        testFlooring = new Flooring("PVC red", 10.0, 2.0);
        surfaces[0] = new Surface(5.0, 2.0);
        surfaces[0].setMaterial(testFlooring);
        surfaces[1] = new Surface(5.0, 2.808);
        surfaces[1].setMaterial(testFlooring);
        surfaces[2] = new Surface(5.0, 2.804);
        surfaces[2].setMaterial(testFlooring);

        results[0] = 5; // 5.00
        results[1] = 8; // 7.02
        results[2] = 7; // 7.01

        System.out.println("Test 0");
        System.out.println(testFlooring.getMaterialReq(surfaces[0]));
        System.out.println(results[0]);
        System.out.println("");

        System.out.println("Test 1");
        System.out.println(testFlooring.getMaterialReq(surfaces[1]));
        System.out.println(results[1]);
        System.out.println("");

        System.out.println("Test 2");
        System.out.println(testFlooring.getMaterialReq(surfaces[2]));
        System.out.println(results[2]);
        System.out.println("");

    }
}
