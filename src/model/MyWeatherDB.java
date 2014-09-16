package model;

import java.util.List;

import db.MyWeatherOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/*
 *������ ����֤ȫ��ֻ��һ�� MyWeatherDBʵ��
 *
 */

public class MyWeatherDB {

	/*
	 * ���ݿ���
	 */
	public static final String DB_NAME = "my_weather";
	
	/*
	 * ���ݿ�汾
	 */
	public static final int VERSION = 1;
	
	private static MyWeatherDB myWeatherDB;
	
	private SQLiteDatabase db;
	
	/*
	 * ���췽��˽�л�
	 */
	private MyWeatherDB(Context context){
		MyWeatherOpenHelper dbHelper = new MyWeatherOpenHelper(context, DB_NAME,
				null, VERSION);
		db = dbHelper.getWritableDatabase();
	}
	
	public synchronized static MyWeatherDB getInstance(Context context){
		if(myWeatherDB == null){
			myWeatherDB = new MyWeatherDB(context);
		}
		return myWeatherDB;
	}
	
	/*
	 * ��province ʵ���洢�����ݿ�
	 */
	public void saveProvince(Province province){
		
	}
	
	/*
	 * �����ݿ��ȡȫ�����е�province��Ϣ
	 */
	public List<Province> loadProvince(){
		
		
		return null;
		
	}
	
	/*
	 * ��city ʵ���洢�����ݿ�
	 */
	public void saveProvince(City city){
		
	}
	
	/*
	 * �����ݿ��ȡȫ�����е�city��Ϣ
	 */
	public List<City> loadCity(){
		
		
		return null;
		
	}
	
	/*
	 * ��country ʵ���洢�����ݿ�
	 */
	public void saveCountry(Country country){
		
	}
	
	/*
	 * �����ݿ��ȡȫ�����е�city��Ϣ
	 */
	public List<Country> Country(){
		
		
		return null;
		
	}
	
	
	
	
	
	
}
