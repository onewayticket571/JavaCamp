package Concretes;

import Entities.*;

public class ProductManager  {


    public void sell(Product product,Player player,Campaign campaign) {
        double newPrice = product.getProductPrice()*(100- campaign.getDiscountRatioPercent())/100;

        System.out.println("Satış İşlemi Gerçekleşti : (Geçerli Kampanya : "+campaign.getCampaignName()+")");
        System.out.println(player.getNickName()+" "+product.getProductName()+" adlı ürünü %"+campaign.getDiscountRatioPercent()+" indirimle "+String.format("%.2f",newPrice)+"₺ fiyata satın aldı");
        System.out.println("Ürün indirimsiz fiyatı : "+String.format("%.2f",product.getProductPrice())+"₺");
        System.out.println("Ürün Kampanyalı satış fiyatı : "+String.format("%.2f",newPrice)+"₺");
        player.setProductsOwned(product);
    }
    public void sell(Product product,Player player) {
        System.out.println("Satış İşlemi Gerçekleşti :");
        System.out.println(player.getNickName()+" "+product.getProductName()+" adlı ürünü "+product.getProductPrice()+"₺ fiyata satın aldı");
        player.setProductsOwned(product);
    }


}
