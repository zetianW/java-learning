package com.zetian.threetimereview.getsetmethod;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/24
 **/
public class GetSet {
    private String PeopleName;
    private int ages;
    private String weight;

    public void setPeopleName(String peopleName) {
        PeopleName = peopleName;
    }

    public String getPeopleName() {
        return PeopleName;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getAges() {
        return ages;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }
}
