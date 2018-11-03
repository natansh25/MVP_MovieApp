package infinity1087.android.com.mvp_movieapp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import infinity1087.android.com.mvp_movieapp.Interactor
import infinity1087.android.com.mvp_movieapp.contract.MainContract
import infinity1087.android.com.mvp_movieapp.presenter.MainPresenter
import infinity1087.android.com.mvp_movieapp.R
import infinity1087.android.com.mvp_movieapp.adapter.RecyclerAdapter
import infinity1087.android.com.myapplication.model.Result
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.MainView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireUpRecyclerView()

        val presenter = MainPresenter(
            this,
            Interactor()
        )
        presenter.requestDataFromServer()
    }

    private fun wireUpRecyclerView() {


        val layoutManager = GridLayoutManager(applicationContext, 2)


        recyclerView.layoutManager = layoutManager
        recyclerView.isNestedScrollingEnabled = false

    }

    override fun setDataToRecyclerView(list: List<Result>) {
        val adapter = RecyclerAdapter(this, list)
        recyclerView.adapter = adapter


    }
}
