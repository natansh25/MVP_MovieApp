package infinity1087.android.com.mvp_movieapp.presenter

import infinity1087.android.com.mvp_movieapp.contract.MainContract
import infinity1087.android.com.myapplication.model.Result

class MainPresenter(val mView: MainContract.MainView, val mI: MainContract.GetNoticeIntractor) : MainContract.presenter,
    MainContract.GetNoticeIntractor.OnFinishedListener {

    override fun onFinished(noticeArrayList: List<Result>) {

        mView.setDataToRecyclerView(noticeArrayList)

    }


    override fun onFailure(t: Throwable) {


    }

    val mainView = mView
    val interactor = mI


    override fun requestDataFromServer() {

        interactor.getNoticeArrayList(this)

    }

}