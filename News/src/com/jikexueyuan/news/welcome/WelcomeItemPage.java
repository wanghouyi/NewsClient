package com.jikexueyuan.news.welcome;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jikexueyuan.news.MainActivity;
import com.jikexueyuan.news.R;

@SuppressLint("Instantiatable")
public class WelcomeItemPage extends Fragment {
	int id;

	@SuppressLint("Instantiatable")
	public WelcomeItemPage(int id) {
		this.id = id;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(id, null);
		view.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (id == R.layout.welcome_list_third_page_layout) {
					startActivity(new Intent(getActivity(),MainActivity.class));
					getActivity().finish();
				}

			}
		});
		return view;
	}

}
