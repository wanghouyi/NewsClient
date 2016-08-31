package com.jikexueyuan.news;



/*public class MyLocation extends Activity {

	private LocationClient client;
	private MyBDLocationListener listener;

	public MyLocation(MapView mapView) {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	protected void onResume() {
		location();
		client.start();
		super.onResume();
	}

	@Override
	protected void onPause() {

		client.stop();
		super.onPause();

	}

	private void location() {
		client = new LocationClient(this);
		listener = new MyBDLocationListener();
		LocationClientOption option = new LocationClientOption();
		option.setCoorType("bd09ll");// 可选，默认gcj02，设置返回的定位结果坐标系
		int span = 1000;
		option.setScanSpan(span);// 可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
		option.setIsNeedAddress(true);// 可选，设置是否需要地址信息，默认不需要
		option.setOpenGps(true);// 可选，默认false,设置是否使用gps
		option.setLocationNotify(true);// 可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
		option.setIsNeedLocationDescribe(true);// 可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
		option.setIsNeedLocationPoiList(true);// 可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
		option.setIgnoreKillProcess(false);// 可选，默认false，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认杀死
		option.SetIgnoreCacheException(false);// 可选，默认false，设置是否收集CRASH信息，默认收集
		option.setEnableSimulateGps(false);// 可选，默认false，设置是否需要过滤gps仿真结果，默认需要
		client.setLocOption(option);
		client.registerLocationListener(listener);
	}

	public class MyBDLocationListener implements BDLocationListener {

		@Override
		public void onReceiveLocation(BDLocation location) {
			if(location ==null){
				return;
			}
			location.getLongitude();
			location.getLatitude();
			MapView mapView = new MapView(getApplicationContext());
			MyLocation overlay = new MyLocation(mapView);
		//	LocationDate data = new LocationDate();
			data.latitude = location.getLatitude();
			data.longitude = location.getLongitude();
			overlay.setData(date);
			
;			
		}

	}

}
*/