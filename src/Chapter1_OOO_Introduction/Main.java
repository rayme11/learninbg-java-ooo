package Chapter1_OOO_Introduction;

public class Main {
    public static void main(String[] args) {

         Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor myfavoriteTree =
                 new Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor(101, 5, TreeType.OAK);

         System.out.println(myfavoriteTree.treeType);
         myfavoriteTree.announceTallTree();

         System.out.println("Accessing static value from Class: " +
                 Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor.TRUNK_COLOR);

         Chapter1_Exercise1_Class_With_Enum_Tree_Class_WithConstructor.watchOutTree();

    }

}
