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
		option.setCoorType("bd09ll");// ��ѡ��Ĭ��gcj02�����÷��صĶ�λ�������ϵ
		int span = 1000;
		option.setScanSpan(span);// ��ѡ��Ĭ��0��������λһ�Σ����÷���λ����ļ����Ҫ���ڵ���1000ms������Ч��
		option.setIsNeedAddress(true);// ��ѡ�������Ƿ���Ҫ��ַ��Ϣ��Ĭ�ϲ���Ҫ
		option.setOpenGps(true);// ��ѡ��Ĭ��false,�����Ƿ�ʹ��gps
		option.setLocationNotify(true);// ��ѡ��Ĭ��false�������Ƿ�gps��Чʱ����1S1��Ƶ�����GPS���
		option.setIsNeedLocationDescribe(true);// ��ѡ��Ĭ��false�������Ƿ���Ҫλ�����廯�����������BDLocation.getLocationDescribe��õ�����������ڡ��ڱ����찲�Ÿ�����
		option.setIsNeedLocationPoiList(true);// ��ѡ��Ĭ��false�������Ƿ���ҪPOI�����������BDLocation.getPoiList��õ�
		option.setIgnoreKillProcess(false);// ��ѡ��Ĭ��false����λSDK�ڲ���һ��SERVICE�����ŵ��˶������̣������Ƿ���stop��ʱ��ɱ��������̣�Ĭ��ɱ��
		option.SetIgnoreCacheException(false);// ��ѡ��Ĭ��false�������Ƿ��ռ�CRASH��Ϣ��Ĭ���ռ�
		option.setEnableSimulateGps(false);// ��ѡ��Ĭ��false�������Ƿ���Ҫ����gps��������Ĭ����Ҫ
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