package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity {
    private TextView tx_date;
    private Button bt_person_setting;
    private ListView list_xiaoqu;
    private Toolbar toolbar;
    private List<CommunityBean> mDatas;
    private CommunityAdapter mAdapter;
    private Button bt_erweima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.homepage);
        tx_date = (TextView) findViewById(R.id.tx_date);
        //bt_person_setting = (Button) findViewById(R.id.bt_person_setting);
        list_xiaoqu = (ListView)findViewById(R.id.list_xiaoqu);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        bt_erweima = (Button)findViewById(R.id.bt_erweima);
        toolbar.setNavigationIcon(R.mipmap.ic_menu_information);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Homepage.this, PersonSetting.class);
                startActivity(intent);
            }
        });

        bt_erweima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        initData();

        list_xiaoqu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ImageView xiaoqu_detail = (ImageView)view.findViewById(R.id.xiaoqu_detail);
                xiaoqu_detail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(Homepage.this, CommunityDetail.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

    public  void initData() {
        mDatas = new ArrayList<CommunityBean>();
        //将数据装到集合中去
        CommunityBean bean = new CommunityBean("张家港市杨舍镇帝景豪园小区(200户)", "总户数:100户", "已完成：58户", "未完成：42户");
        mDatas.add(bean);

        bean = new CommunityBean("张家港市杨舍镇东方明珠(150户)", "总户数:100户", "已完成：58户", "未完成：42户");
        mDatas.add(bean);

        bean = new CommunityBean("张家港市杨舍镇农联花苑(200户)", "总户数:100户", "已完成：58户", "未完成：42户");
        mDatas.add(bean);

        mAdapter = new CommunityAdapter(this,mDatas);
        list_xiaoqu.setAdapter(mAdapter);
    }
}
