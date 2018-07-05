package mealremoval.shifenshenghuo.com.mealremoval;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommunityDetail extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView lv;
    private List<CommunityHouseBean> mDatas;
    private ListViewAdapter mLAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.community_detail);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.mipmap.ic_menu_left);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        initData();
        init();
    }

    private void initData() {
        mDatas=new ArrayList();
        List<CommunityHouseItemBean> listCommunityHouseItemBean= new ArrayList();
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                android.util.Log.d("testa","j=="+j);
                CommunityHouseItemBean communityHouseItemBean =new CommunityHouseItemBean("12栋701");
                listCommunityHouseItemBean.add(communityHouseItemBean);
            }
            if(listCommunityHouseItemBean!=null) {
                android.util.Log.d("testa","i=="+i);
                CommunityHouseBean communityHouseBean = new CommunityHouseBean("帝景豪园12栋", listCommunityHouseItemBean);
                mDatas.add(communityHouseBean);
            }
        }
        }

    private void init() {
        lv = (ListView)findViewById(R.id.lv);
        android.util.Log.d("testa","textview"+(mDatas == null));
        mLAdapter = new ListViewAdapter(mDatas, CommunityDetail.this);
        lv.setAdapter(mLAdapter);
    }
}
