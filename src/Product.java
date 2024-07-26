public class Product {
    String name;
    int price;
    int quantity;
    String category = "fotbal";

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    String getCategory() {
        return category;
    }

    boolean hasStock() {
       return quantity != 0;
    }

    boolean isCategory(){
        if(category == "fotbal" ){
                return true;
        }else {
                return false;
        }
    }

    String getInformacion(){
        return getName() + getPrice() + " " + hasStock() + " " + isCategory();
    }
}

