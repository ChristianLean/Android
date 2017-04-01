package com.imooc.sqlitedemo3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper{
//	SQLiteOpenHelper:
//	SQLiteOpenHelper�����࣬���ڶ����ݿ���д�����������
//	ʵ������������onCreate()��������ʵ�ִ������ݿ⡢onUpgrade()����ʵ���������ݿ�
//
//	getWritableDatabase()��getReadableDatabase()���������Ի�ȡһ�����ڲ������ݿ��SQLiteDatabaseʵ����
//	����getReadableDatabase()�����������Զ�д��ʽ�����ݿ⣬������ݿ�Ĵ��̿ռ����ˣ��ͻ��ʧ�ܣ�����ʧ�ܺ�
//	�����������ֻ����ʽ�����ݿ⡣���������ɹ��������ֻ�����ݿ����ͻ�رգ�Ȼ�󷵻�һ���ɶ�д�����ݿ����
//	getWritableDatabase() �����Զ�д��ʽ�����ݿ⣬һ�����ݿ�Ĵ��̿ռ����ˣ����ݿ��ֻ�ܶ�������д��
//	ʹ�õ���getWritableDatabase() �����ͻ����
//
	
	public DBOpenHelper(Context context, String name) {
		super(context, name, null, 1);
		// TODO Auto-generated constructor stub
	}
	public DBOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override //�״δ������ݿ��ʱ��ִ��  ����һ��д���� ����
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table if not exists stutb(_id integer primary key autoincrement,name text not null,sex text not null,age integer not null)");
		db.execSQL("insert into stutb(name,sex,age)values('aa','man',18)");
		db.execSQL("insert into stutb(name,sex,age)values('bb','women',20)");
	}

	@Override // �����ݿ�汾�����仯ʱ ִ�д˷���
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
