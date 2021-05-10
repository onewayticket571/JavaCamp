package Entities;

import Abstract.Entities;

public class Campaign implements Entities {
    private String campaignName;
    private double discountRatioPercent;

    public Campaign(String campaignName, double discountRatioPercent){
        this.setCampaignName(campaignName);
        this.setDiscountRatioPercent(discountRatioPercent);
    }


    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRatioPercent() {
        return discountRatioPercent;
    }

    public void setDiscountRatioPercent(double discountRatioPercent) {
        this.discountRatioPercent = discountRatioPercent;
    }
}
