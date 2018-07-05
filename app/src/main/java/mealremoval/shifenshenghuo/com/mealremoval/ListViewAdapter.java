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

    public ListViewAdapter(List<CommunityHouseBean> mDatasa, Context mContext) {
       // super();
        mDatas = mDatasa;
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
            CommunityHouseBean communityHouseBean = mDatas.get(position);
            if (holder.gridView != null) {
                 android.util.Log.d("testa","gridView"+communityHouseBean.getCommunityHouseItemBeanList().size());
                gridViewAdapter = new GridViewAdapter(mContext,communityHouseBean.getCommunityHouseItemBeanList() );
                            holder.gridView.setAdapter(gridViewAdapter);
                            setGridViewOnclik(holder.gridView, position);
                            //setGridViewHeight( holder.gridView,convertView);
                      //  }
                    }
            if (holder.textView != null) {
                android.util.Log.d("testa","textview"+communityHouseBean.getCommunityName());
                holder.textView.setText(communityHouseBean.getCommunityName());
            }
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
