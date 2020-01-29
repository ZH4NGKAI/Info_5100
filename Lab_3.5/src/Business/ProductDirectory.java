/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author info
 */
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    
    public ProductDirectory(){
        productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public Product addProduct(){
        Product newProduct = new Product();
        productDirectory.add(newProduct);
        return newProduct;
    }
    
    public void deleteProduct(Product product){
        productDirectory.remove(product);
    }
    
    public List<Product> searchProduct(String name){
        List<Product> list = new ArrayList();
        for(Product prod : this.productDirectory){
            if(prod.getName().equalsIgnoreCase(name)){
                list.add(prod);
            }
        }
        return list;
    }
}
