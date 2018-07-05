package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<HashMap<String, Object>> mList;
    private LayoutInflater inflater;
    private List<CommunityHouseItemBean> mDatas;

    public GridViewAdapter(Context mContext, List<CommunityHouseItemBean> mDatasa) {
        this.mContext = mContext;
        mDatas = mDatasa;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        if (mDatas == null)
            return 0;
        return this.mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        if (mDatas == null)
            return null;
        return this.mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.community_detail_item, null);
            //viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.imageView_gridView);
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.house_number);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (mDatas != null) {
            viewHolder.mTextView.setText(mDatas.get(position).getHousenumber());
            if((position==0)|(position==7)|(position==14)|(position==21)|(position==28)){
                Resources resources=mContext.getResources();
                Drawable drawable=resources.getDrawable(R.color.colorNeed);
                viewHolder.mTextView.setBackgroundDrawable(drawable);
            }else if((position==1)|(position==8)|(position==15)|(position==22)|(position==29)){
                Resources resources=mContext.getResources();
                Drawable drawable=resources.getDrawable(R.color.colorFinish);
                viewHolder.mTextView.setBackgroundDrawable(drawable);
            }else if((position==2)|(position==9)|(position==16)|(position==23)|(position==30)){
                Resources resources=mContext.getResources();
                Drawable drawable=resources.getDrawable(R.color.colorUndo);
                viewHolder.mTextView.setBackgroundDrawable(drawable);
            }else if((position==3)|(position==10)|(position==17)|(position==24)|(position==31)){
                Resources resources=mContext.getResources();
                Drawable drawable=resources.getDrawable(R.color.colorFinish);
                viewHolder.mTextView.setBackgroundDrawable(drawable);
            }else {
                Resources resources=mContext.getResources();
                Drawable drawable=resources.getDrawable(R.color.colorAlluser);
                viewHolder.mTextView.setBackgroundDrawable(drawable);
            }
        }

        CommunityHouseItemBean bean = mDatas.get(position);
        viewHolder.mTextView.setText(bean.getHousenumber());

        return convertView;
    }

    class ViewHolder {
        ImageView mImageView;
        TextView mTextView;
    }

}
