package base.android.lesson5hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import base.android.lesson5hw.dummy.DummyContent;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements DataFragment.OnFragmentInteractionListener,
                                                               ImageFragment.OnFragmentInteractionListener,
                                                               ListFragment.OnListFragmentInteractionListener {
public static final String tag = "lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.Config.getInstance().setSuccessColor(getResources().getColor(R.color.colorAccent)).apply();

        Toast t = Toasty.info(this,"onCreate Activity");
        t.setMargin(0.5f,0.5f);
        t.show();
//        Toasty.info(this,"onCreate").show();
        Log.i(tag,"onCreate Activity");
    }

    @Override
    public void onFragmentInteraction() {
        Toasty.success(this,"yooo").show();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
