package infinity1087.android.com.mvp_movieapp.contract

import infinity1087.android.com.myapplication.model.Result

interface MainContract {


    interface MainView {
        fun setDataToRecyclerView(list: List<Result>)

    }

    interface presenter {
        fun requestDataFromServer()
    }


    interface GetNoticeIntractor {

        interface OnFinishedListener {
            fun onFinished(noticeArrayList: List<Result>)
            fun onFailure(t: Throwable)
        }

        fun getNoticeArrayList(onFinishedListener: OnFinishedListener)
    }


}