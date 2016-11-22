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
		setContentView(R.layout.activity_main);//设置显示界面
		tvTop=(TextView)this.findViewById(R.id.tvTop);//根据ID在布局文件中查找控件
		tvTop.setText(Html.fromHtml(getResources().getString(R.string.str_top)));//为文本显示框设置显示内容
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
