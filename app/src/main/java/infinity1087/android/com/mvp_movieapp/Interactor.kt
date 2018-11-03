package infinity1087.android.com.mvp_movieapp

import android.util.Log
import infinity1087.android.com.mvp_movieapp.contract.MainContract
import infinity1087.android.com.myapplication.model.ModieData
import infinity1087.android.com.myapplication.model.Result
import infinity1087.android.com.myapplication.service.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interactor : MainContract.GetNoticeIntractor {


    override fun getNoticeArrayList(onFinishedListener: MainContract.GetNoticeIntractor.OnFinishedListener) {

        val apiServices = ApiInterface.create()
        val call = apiServices.getPopularMovies(ApiInterface.api_key)

        call.enqueue(object : Callback<ModieData> {
            override fun onFailure(call: Call<ModieData>, t: Throwable) {

                onFinishedListener.onFailure(t)
            }

            override fun onResponse(call: Call<ModieData>, response: Response<ModieData>) {
                // logging the built URL
                Log.d("Urlz", response.raw().request().url().toString())
                val result: List<Result> = response.body()!!.results
                onFinishedListener.onFinished(result)

            }
        })

    }

}