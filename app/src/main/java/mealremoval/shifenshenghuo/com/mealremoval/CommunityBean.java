package mealremoval.shifenshenghuo.com.mealremoval;

public class CommunityBean {
    private String xiaoqu_name;
    private String total;
    private String finish;
    private String undo;
    //picture undo
    public CommunityBean(String xiaoqu_name, String total, String finish, String undo) {
        super();
        this.xiaoqu_name = xiaoqu_name;
        this.total = total;
        this.finish = finish;
        this.undo = undo;
    }

    public CommunityBean() {
        super();
    }

    public String getXiaoqu_name() {
        return xiaoqu_name;
    }

    public String getTotal() {
        return total;
    }

    public String getFinish() {
        return finish;
    }

    public String getUndo() {
        return undo;
    }

    public void setXiaoqu_name(String xiaoqu_name) {
        this.xiaoqu_name = xiaoqu_name;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setUndo(String undo) {
        this.undo = undo;
    }
}
