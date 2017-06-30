import java.util.*;

public class StructuredObject extends RenovationObject {

    private Set<RenovationObject> parts;

    public StructuredObject() {

        this.parts = new HashSet<>();
    }

    public void add(RenovationObject object) {

        if (object == null) throw new NullPointerException("Object to add cant be NULL!");

        this.parts.add(object);
    }

    public double getPrice() {

        double price = 0;

        for (RenovationObject object : parts) {

            price += object.getPrice();
        }

        return price;
    }

    private Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

        return null;
    }

    public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        if (materials == null) throw new NullPointerException("Materials to add cant be NULL!");

        for (Map.Entry<String, Integer> entry : materials.entrySet()) {

            if (entry.getKey() == null) throw new NullPointerException("A Key of material map cant be NULL!");
            if (entry.getValue() == null) throw new NullPointerException("A Value of material map cant be NULL!");
        }

        for (RenovationObject object : parts) {

            materials = object.addMaterialReq(materials);
        }

        return materials;
    }


}
