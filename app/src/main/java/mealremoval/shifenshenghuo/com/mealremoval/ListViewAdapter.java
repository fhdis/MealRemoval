package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;

public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private GridViewAdapter gridViewAdapter;
    private List<CommunityHouseBean> mDatas;

    public ListViewAdapter(List<CommunityHouseBean> mDatas, Context mContext) {
        super();
        //this.mList = mList;
        mDatas = mDatas;
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        if (mDatas == null) {
            return 0;
        } else {
            return this.mDatas.size();
        }
    }

    @Override
    public Object getItem(int position) {
        if (mDatas == null) {
            return null;
        } else {
            return this.mDatas.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(this.mContext).inflate(R.layout.gridview_item, null, false);

            holder.gridView = (fixedGridView) convertView.findViewById(R.id.fixed_gridView);
            holder.textView = (TextView) convertView.findViewById(R.id.community_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        if (this.mDatas != null) {

            if (holder.gridView != null) {
                //ArrayList<HashMap<String, Object>> arrayListForEveryGridView = this.mList.get(position);
                List<CommunityHouseBean> temp = mDatas;
                    for (int i = 0; i < temp.size(); i++) {
                        List<CommunityHouseItemBean> list = temp.get(i).getCommunityHouseItemBeanList();
                        if(list!=null){
                            gridViewAdapter = new GridViewAdapter(mContext, list);
                            holder.gridView.setAdapter(gridViewAdapter);
                            setGridViewOnclik(holder.gridView, position);
                            //setGridViewHeight( holder.gridView,convertView);
                        }
                    }
                }
                /*for(int i = 0;i<temp.size();i++) {
                    gridViewAdapter = new GridViewAdapter(mContext, temp.get(i));
                    holder.gridView.setAdapter(gridViewAdapter);
                    setGridViewOnclik(holder.gridView, position);
                    //setGridViewHeight( holder.gridView,convertView);
                }*/
            }


        return convertView;

    }
    public void setGridViewOnclik(GridView gridView, final int parentPosition) {
        if (gridViewAdapter !=null){
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //Toast.makeText(mContext, "位置" + mList.get(parentPosition).get(position).get("son").toString(), Toast.LENGTH_SHORT).show();
                }
            });


        }
    }


    private class ViewHolder {

        fixedGridView gridView;
        TextView textView;
    }

}
