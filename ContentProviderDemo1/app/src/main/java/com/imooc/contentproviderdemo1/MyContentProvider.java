package com.imooc.contentproviderdemo1;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
//http://www.jianshu.com/p/f5ec75a9cfea
//1.�Զ���һ��Provider �̳�ContentProvider ��ContentProviderȥ�������ݿ⣩
//2.��������ʹ��ContentResolver ��Provider���в���
// ��ContentResolver�����ж���Ĳ������������Ǹ�����������ʵ��Ȼ��
//   ���Ҫ֪��һ̨�ֻ��пɲ���ֻ��һ��Provider���ݣ������ܰ�װ�˺ܶ�
//   ����Provider��Ӧ�ã�������ϵ��Ӧ�ã�����Ӧ�ã��ֵ�Ӧ�õȵȡ�����
//   �˶��Provider������㿪��һ��Ӧ��Ҫʹ�����ж�����������ȥ�˽�
//   ÿ��ContentProvider�Ĳ�ͬʵ�֣�����Ҫͷ�����ˡ�����AndroidΪ
//   �����ṩ��ContentResolver��ͳһ�����벻ͬContentProvider��Ĳ�������
public class MyContentProvider extends ContentProvider{


	//������ʵ��������ɾ  ��ô���������ڷ������provider��ʱ���ֻ��������������
	@Override//����Uriɾ��selectionָ����������ƥ���ȫ����¼
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override//���ص�ǰuri��MIME���ͣ������URI��Ӧ�����ݿ��ܰ���������¼
	//��ôMIME�����ַ��� ������vnd.android.dir/��ͷ
//	�����URI��Ӧ������ֻ��һ����¼ ��MIME�����ַ��� ������vnd.android.cursor.item/��ͷ
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//����Uri����Values��Ӧ������
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//��ContetnProvider�����󱻵���
	public boolean onCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override//����uri��ѯ��selectionָ����������ƥ���ȫ����¼�����ҿ���ָ����ѯ��Щ�� ��ʲô��ʽ(order)����
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//����uri�޸�selectionָ����������ƥ���ȫ����¼
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

}
