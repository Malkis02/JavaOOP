package HW6.controller;

import HW6.service.VendingMachineImpl;

import java.util.List;
import java.util.Map;

public class VendingMachineController {
    private VendingMachineImpl vendingMachineService = new VendingMachineImpl();

    public void addProduct(String productType, Map<String, Object> productData) {
        if (vendingMachineService.getProductTypes().contains(productType)) {
            vendingMachineService.addProduct(productType, productData);
        }
    }

    public List<String> getPriceList() {
        return vendingMachineService.getProductPriceList();
    }

    public List<String> getProductByMatchPattern(Map<String, Object> matchPattern) {
        return vendingMachineService.getProducts(matchPattern);
    }
}
