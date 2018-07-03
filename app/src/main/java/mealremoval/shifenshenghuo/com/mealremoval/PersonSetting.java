package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class PersonSetting extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView list_xiaoqu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.person_setting);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        list_xiaoqu = (ListView)findViewById(R.id.list_xiaoqu);
        toolbar.setNavigationIcon(R.mipmap.ic_menu_left);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(PersonSetting.this,R.layout.homepage_xiaoqu_item,R.id.tv_xiaoqu_name,new String []{"张家港市杨舍镇帝景豪园小区(200户)","张家港市杨舍镇东方明珠(150户)","张家港市杨舍镇农联花苑(200户)"}
        );
        list_xiaoqu.setAdapter(arrayAdapter);
    }
}
