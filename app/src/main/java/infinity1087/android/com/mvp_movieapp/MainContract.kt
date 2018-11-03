package infinity1087.android.com.mvp_movieapp

import infinity1087.android.com.myapplication.model.Result

interface MainContract {


    interface MainView {
        fun setDataToRecyclerView(list: ArrayList<Result>)

    }

    interface presenter {
        fun requestDataFromServer()
    }


    interface GetNoticeIntractor {

        interface OnFinishedListener {
            fun onFinished(noticeArrayList: ArrayList<Result>)
            fun onFailure(t: Throwable)
        }

        fun getNoticeArrayList(onFinishedListener: OnFinishedListener)
    }


}