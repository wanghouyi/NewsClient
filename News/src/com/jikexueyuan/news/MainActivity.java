package com.jikexueyuan.news;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.jikexueyuan.news.adapter.NewsAdapter;
import com.jikexueyuan.news.model.News;
import com.jikexueyuan.news.utils.HttpUtils;

public class MainActivity extends Activity implements OnItemClickListener{
	
	private ListView lvNews;
	private NewsAdapter adapter;
	private List<News> newsList;
	private Button btn;
	
	public static final String GET_NEWS_URL = "http://api.1-blog.com/biz/bizserver/news/list.do";
	
	private Handler getNewsHandler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			String jsonData = (String) msg.obj;
			try {
				JSONObject root = new JSONObject(jsonData);
				JSONArray jsonArray = new JSONArray(root.getString("detail"));
				for (int i=0;i<jsonArray.length();i++){
					JSONObject object = jsonArray.getJSONObject(i);
					String title = object.getString("title");
					String source = object.getString("source");
					String article_url = object.getString("article_url");
					String publish_time = object.getString("publish_time");
					//String pic_url = object.getString("pic_url");
					newsList.add(new News(title, source, article_url, publish_time));
					System.out.println(title);
				}
				adapter.notifyDataSetChanged();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//btn = (Button) findViewById(R.id.btn);
		
		lvNews = (ListView) findViewById(R.id.lvNews);
		newsList = new ArrayList<News>();
		adapter = new NewsAdapter(this, newsList);
		
		lvNews.setAdapter(adapter);
		lvNews.setOnItemClickListener(this);
		
		
		HttpUtils.getNewsJSON(GET_NEWS_URL, getNewsHandler);
	}
/*	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		intent.setClass(this,MyLocation.class);
		startActivity(intent);
	}*/
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		News news = newsList.get(position);
		Intent intent = new Intent(this, BrowseNewsActivity.class);
		intent.putExtra("article_url", news.getArticle_url());
		startActivity(intent);
	}

}
