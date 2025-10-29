package Array;

public class Menu {
    public static String itemFinder(String[] menu,String item){
        for (String s : menu) {
            if (s.equals(item)) {
                return "Item is Present " + item;
            }
        }
        return "Item not present";
    }
    public static void main(String[] args) {
        String []menu={"dosa","samosa","idli"};
        String item="idli";
        String value=itemFinder(menu,item);
        System.out.println(value);
    }
}
