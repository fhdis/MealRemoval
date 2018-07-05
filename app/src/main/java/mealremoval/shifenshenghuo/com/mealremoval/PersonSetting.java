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
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(PersonSetting.this,R.layout.xiaoqu_item,R.id.item,new String []{"帝景豪园11栋，12栋，13栋，14栋，15栋，16栋","东方明珠11栋，12栋，13栋，14栋，15栋，16栋","农联花园11栋，12栋，13栋，14栋，15栋，16栋"}
        );
        list_xiaoqu.setAdapter(arrayAdapter);
    }
}
