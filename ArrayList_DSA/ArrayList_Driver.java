public class ArrayList_Driver{
    public static void main(String[] args) 

    {
        ArrayList<Integer> list_DVC = new ArrayList<>();  // DVC 
        
        list_DVC.add(23);
        System.out.println(list_DVC);
        
        list_DVC.add(5);
        System.out.println(list_DVC);
        
        list_DVC.add(25);
        System.out.println(list_DVC);

        
        System.out.println("-----------------------------------");
        System.out.println(list_DVC);
        System.out.println("\n\n-----------------------------------");

        ArrayList<Integer> list_EVC = new ArrayList<>(1);
        list_EVC.add(6);
        System.out.println(list_EVC);
        list_EVC.add(12);
        System.out.println(list_EVC);

    




    }
}