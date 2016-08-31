package com.jikexueyuan.news.adapter;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikexueyuan.news.R;
import com.jikexueyuan.news.model.News;
import com.jikexueyuan.news.utils.HttpUtils;

public class NewsAdapter extends BaseAdapter {
	
	private Context context;
	private List<News> newsList;
	
	public NewsAdapter(Context context, List<News> newsList){
		this.context = context;
		this.newsList = newsList;
	}

	@Override
	public int getCount() {
		return newsList.size();
	}

	@Override
	public News getItem(int position) {
		return newsList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.news_item, null);
		}
		TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
		TextView tvSource = (TextView) convertView.findViewById(R.id.tvSource);
		TextView tvArticle_url = (TextView) convertView.findViewById(R.id.tvArticle_url);
		TextView tvPublish_time = (TextView) convertView.findViewById(R.id.tvPublish_time);
		//ImageView ivPic = (ImageView) convertView.findViewById(R.id.ivPic);
		
		News news = newsList.get(position);
		tvTitle.setText(news.getTitle());
		//tvSource.setText(news.getSource());

		tvArticle_url.setText(news.getArticle_url());
		//tvPublish_time.setText(news.getPublish_time());
		
	/*	String pic_url = news.getPic_url();
		HttpUtils.setPicBitmap(ivPic, pic_url);*/
		
		return convertView;
	}
	
	

}
