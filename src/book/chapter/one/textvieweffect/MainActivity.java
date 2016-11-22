package book.chapter.one.textvieweffect;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView tvTop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//������ʾ����
		tvTop=(TextView)this.findViewById(R.id.tvTop);//����ID�ڲ����ļ��в��ҿؼ�
		tvTop.setText(Html.fromHtml(getResources().getString(R.string.str_top)));//Ϊ�ı���ʾ��������ʾ����
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
