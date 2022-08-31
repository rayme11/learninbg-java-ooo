package Chapter1_OOO_Introduction;
import java.awt.Color;

public class Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor {

    double heightFt;
    double trunkDiameter;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor(double heightFt, double trunkDiameter,
                                                                  TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree(){
        if (this.heightFt > 100) {
            System.out.println("The tree: " +this.treeType + " is tall");
        }
    }

    static void watchOutTree(){
        System.out.println("Watch out for that tree, is too tall....");
    }


}
