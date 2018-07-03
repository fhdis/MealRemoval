package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CommunityAdapter extends BaseAdapter {
     private LayoutInflater mInflater;
     private List<CommunityBean> mDatas;

     //MyAdapter需要一个Context，通过Context获得Layout.inflater，然后通过inflater加载item的布局
     public CommunityAdapter(Context context, List<CommunityBean> datas) {

                 mInflater = LayoutInflater.from(context);
                 mDatas = datas;
             }

             //返回数据集的长度
             @Override
     public int getCount() {
                return mDatas.size();
             }

             @Override
     public Object getItem(int position) {
                return mDatas.get(position);
             }

             @Override
     public long getItemId(int position) {
                return position;
            }

            //这个方法才是重点，我们要为它编写一个ViewHolder
             @Override
     public View getView(int position, View convertView, ViewGroup parent) {
                 ViewHolder holder = null;
                if (convertView == null) {
                        convertView = mInflater.inflate(R.layout.homepage_xiaoqu_item, parent, false); //加载布局
                         holder = new ViewHolder();
                         holder.tv_xiaoqu_name = (TextView) convertView.findViewById(R.id.tv_xiaoqu_name);
                        holder.tv_total = (TextView) convertView.findViewById(R.id.tv_total);
                         holder.tv_finish = (TextView) convertView.findViewById(R.id.tv_finish);
                         holder.tv_undo = (TextView) convertView.findViewById(R.id.tv_undo);

                         convertView.setTag(holder);
                     } else {
                         holder = (ViewHolder) convertView.getTag();
                     }

                 CommunityBean bean = mDatas.get(position);
                holder.tv_xiaoqu_name.setText(bean.getXiaoqu_name());
                holder.tv_total.setText(bean.getTotal());
                holder.tv_finish.setText(bean.getFinish());
                 holder.tv_undo.setText(bean.getUndo());

                 return convertView;
            }

            //这个ViewHolder只能服务于当前这个特定的adapter，因为ViewHolder里会指定item的控件，不同的ListView，item可能不同，所以ViewHolder写成一个私有的类
             private class ViewHolder {
             TextView tv_xiaoqu_name;
             TextView tv_total;
             TextView tv_finish;
             TextView tv_undo;
            }
}
