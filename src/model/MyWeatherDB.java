package model;

import java.util.List;

import db.MyWeatherOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/*
 *单例类 ，保证全局只有一个 MyWeatherDB实例
 *
 */

public class MyWeatherDB {

	/*
	 * 数据库名
	 */
	public static final String DB_NAME = "my_weather";
	
	/*
	 * 数据库版本
	 */
	public static final int VERSION = 1;
	
	private static MyWeatherDB myWeatherDB;
	
	private SQLiteDatabase db;
	
	/*
	 * 构造方法私有化
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
	 * 将province 实例存储到数据库
	 */
	public void saveProvince(Province province){
		
	}
	
	/*
	 * 从数据库读取全国所有的province信息
	 */
	public List<Province> loadProvince(){
		
		
		return null;
		
	}
	
	/*
	 * 将city 实例存储到数据库
	 */
	public void saveProvince(City city){
		
	}
	
	/*
	 * 从数据库读取全国所有的city信息
	 */
	public List<City> loadCity(){
		
		
		return null;
		
	}
	
	/*
	 * 将country 实例存储到数据库
	 */
	public void saveCountry(Country country){
		
	}
	
	/*
	 * 从数据库读取全国所有的city信息
	 */
	public List<Country> Country(){
		
		
		return null;
		
	}
	
	
	
	
	
	
}
