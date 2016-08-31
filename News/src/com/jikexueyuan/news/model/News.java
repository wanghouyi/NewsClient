package com.jikexueyuan.news.model;

public class News {
	
	private String title;
	private String source;
	private String article_url;
	private String publish_time;
	//private String pic_url;
	
	public News(String title, String source, String article_url, String publish_time){
		setTitle(title);
		setSource(source);
		setArticle_url(article_url);
		setPublish_time(publish_time);
		//setPic_url(pic_url);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getArticle_url() {
		return article_url;
	}
	public void setArticle_url(String content_url) {
		this.article_url = content_url;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String time) {
		this.publish_time = time;
	}

	
}
