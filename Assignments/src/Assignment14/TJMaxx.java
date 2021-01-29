package Assignment14;

import java.util.ArrayList;
import java.util.List;


public class TJMaxx {
    
    
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;
    
   
    public TJMaxx() {
        this.regularItems = new ArrayList<>();
        this.onSaleItems = new ArrayList<>();
    }
    
    
    public void addRegularItem(Item item) {
        this.regularItems.add(item);
        
    }
    
    
    public void addOnSaleItem(OnSaleItem item) {
        this.onSaleItems.add(item);
        
    }
    
   
    public List<Item> getRegularItems() {
        return this.regularItems;
    }
    
   
    public List<OnSaleItem> getOnSaleItems() {
        return this.onSaleItems;
    }
    
   
    public int regularItemsCount() {
        return this.regularItems.size();
    }
    
  
    public int onSaleItemsCount() {
        return this.onSaleItems.size();
    }
    
    
    public List<String> getAllItemNames() {
        List<String> allItemNames = new ArrayList<String>();
        
        for (Item eachRegularItem : this.regularItems) {
            allItemNames.add(eachRegularItem.getName());
        }
        for (Item eachSaleItem : this.onSaleItems) {
            allItemNames.add(eachSaleItem.getName());
        }
        
        return allItemNames;
    }
    
    
    public double getItemPrice(int catalogNumber) {
        for (Item eachRegularItem : this.regularItems) {
            if (eachRegularItem.getCatalogNumber() == catalogNumber) {
                return eachRegularItem.getPrice();
            }
        }
        for (Item eachSaleItem : this.onSaleItems) {
            if (eachSaleItem.getCatalogNumber() == catalogNumber) {
                return eachSaleItem.getPrice();
            }
        }
        return 0.0;
    }
    
   
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem eachOnSaleItem : this.onSaleItems) {
            if (eachOnSaleItem.getName() == name) {
                return eachOnSaleItem;
            }
        }
        
        return null;
    }
    
   
    public void removeItem(int catalogNumber) {
        this.regularItems.removeIf(eachRegularItem -> eachRegularItem.getCatalogNumber() == catalogNumber);
        this.onSaleItems.removeIf(eachOnSaleItem -> eachOnSaleItem.getCatalogNumber() == catalogNumber);
    }
    
  
    public void buyItem(int catalogNumber) {
        for (Item eachRegularItem : this.regularItems) {
            if (eachRegularItem.getCatalogNumber() == catalogNumber) {
                eachRegularItem.setQuantity(eachRegularItem.getQuantity() - 1);
                if (eachRegularItem.getQuantity() == 0) {
                    removeItem(eachRegularItem.getCatalogNumber());
                }
            }
        }
        for (Item eachOnSaleItem : this.onSaleItems) {
            if (eachOnSaleItem.getCatalogNumber() == catalogNumber) {
                eachOnSaleItem.setQuantity(eachOnSaleItem.getQuantity() - 1);
                if (eachOnSaleItem.getQuantity() == 0) {
                    removeItem(eachOnSaleItem.getCatalogNumber());
                }
            }
        }
        
    }
    
    
}