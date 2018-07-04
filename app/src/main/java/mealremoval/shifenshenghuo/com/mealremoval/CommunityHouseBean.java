package mealremoval.shifenshenghuo.com.mealremoval;

import java.util.List;

public class CommunityHouseBean {
    private String CommunityName;
    private List<CommunityHouseItemBean> communityHouseItemBeanList;

    public CommunityHouseBean(String communityName, List<CommunityHouseItemBean> communityHouseItemBeanList) {
        CommunityName = communityName;
        this.communityHouseItemBeanList = communityHouseItemBeanList;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public List<CommunityHouseItemBean> getCommunityHouseItemBeanList() {
        return communityHouseItemBeanList;
    }

    public void setCommunityHouseItemBeanList(List<CommunityHouseItemBean> communityHouseItemBeanList) {
        this.communityHouseItemBeanList = communityHouseItemBeanList;
    }

    public void setCommunityName(String communityName) {
        CommunityName = communityName;
    }


}
