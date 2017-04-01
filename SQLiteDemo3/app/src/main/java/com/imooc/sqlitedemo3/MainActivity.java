package com.imooc.sqlitedemo3;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
//	SQLiteOpenHelper:
//	SQLiteOpenHelper�����࣬���ڶ����ݿ���д�����������
//	ʵ������������onCreate()��������ʵ�ִ������ݿ⡢onUpgrade()����ʵ���������ݿ�
//
//	getWritableDatabase()��getReadableDatabase()���������Ի�ȡһ�����ڲ������ݿ��SQLiteDatabaseʵ����
//	����getReadableDatabase()�����������Զ�д��ʽ�����ݿ⣬������ݿ�Ĵ��̿ռ����ˣ��ͻ��ʧ�ܣ�����ʧ�ܺ�
//	�����������ֻ����ʽ�����ݿ⡣���������ɹ��������ֻ�����ݿ����ͻ�رգ�Ȼ�󷵻�һ���ɶ�д�����ݿ����
//	getWritableDatabase() �����Զ�д��ʽ�����ݿ⣬һ�����ݿ�Ĵ��̿ռ����ˣ����ݿ��ֻ�ܶ�������д��
//	ʹ�õ���getWritableDatabase() �����ͻ����

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DBOpenHelper helper =	new DBOpenHelper(MainActivity.this, "stu.db");
//		helper.getReadableDatabase();//��ȡһ��ֻ�������ݿ� ֻ�ܲ�ѯ ����д�� ���ܸ���
		SQLiteDatabase db = helper.getWritableDatabase();
//		db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy)
		Cursor c = db.rawQuery("select * from stutb", null);
		if (c!=null) {
			String [] cols = c.getColumnNames();
			while (c.moveToNext()) {
				for (String ColumnName : cols) {
					Log.i("info ", ColumnName+":"+c.getString(c.getColumnIndex(ColumnName)));
				}
			}
			c.close();
		}
		db.close();
	}


}
