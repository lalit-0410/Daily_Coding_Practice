package Array;

public class LinearSearchForString {
    public static String linearSearch(String[] menu,String item){
        for (String value:menu){
            if(value.equals(item)){
                return "Present";
            }
        }
        return "not present";
    }
    public static void main(String[] args) {
        String[] menu={"dosa","idli","samosa","pepsi"};
        String item="pepsi";

        String item_finder= linearSearch(menu,item);
        System.out.println(item_finder);

    }
}
