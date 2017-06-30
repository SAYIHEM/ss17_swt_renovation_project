import java.util.List;
import java.util.Map;

public class Surface extends RenovationObject {

    private double length;
    private double width;

    private Material selectedMaterial;

    public Surface(double length, double width) {

        if (length <= 0) throw new IllegalArgumentException("Length hast to be positive!");
        if (width <= 0) throw new IllegalArgumentException("Width hast to be positive!");

        this.length = length;
        this.width = width;
    }

    public void setMaterial(Material m) {

        if (m == null) throw new NullPointerException("Material to set cant be NULL!");

        this.selectedMaterial = m;
    }

    public double getArea() {

        return length * width;
    }

    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }


    public double getPrice() {

        return selectedMaterial.getPriceOfASurface(this);
    }

    public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        if (materials == null) throw new NullPointerException("Materials to add cant be NULL!");
        if (selectedMaterial == null) throw new NullPointerException("Selected material was NULL!");

        for (Map.Entry<String, Integer> entry : materials.entrySet()) {

            if (entry.getKey() == null) throw new NullPointerException("A Key of material map cant be NULL!");
            if (entry.getValue() == null) throw new NullPointerException("A Value of material map cant be NULL!");
        }

        if (materials.containsKey(selectedMaterial.getName())) {

            int count = materials.get(selectedMaterial.getName()) + selectedMaterial.getMaterialReq(this);
            materials.replace(selectedMaterial.getName(), count);

        } else {

            materials.put(selectedMaterial.getName(), selectedMaterial.getMaterialReq(this));
        }

        return materials;
    }
}
