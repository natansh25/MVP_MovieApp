package infinity1087.android.com.mvp_movieapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import infinity1087.android.com.myapplication.model.Result

class MainActivity : AppCompatActivity(), MainContract.MainView {


    override fun setDataToRecyclerView(list: ArrayList<Result>) {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
