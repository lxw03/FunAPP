package com.xujun.funapp.presenter;

import com.xujun.funapp.beans.PictureDetailBean;
import com.xujun.funapp.common.mvp.DefaultContract;
import com.xujun.funapp.model.PictureDetailMOdel;
import com.xujun.myrxretrofitlibrary.RequestListener;

/**
 * @ explain:图片详情的Presenter
 * @ author：xujun on 2016/10/19 23:12
 * @ email：gdutxiaoxu@163.com
 */
public class PictureDetailPresenter extends DefaultContract.Presenter<PictureDetailContract.View>
        implements PictureDetailContract.Presenter {



    PictureDetailMOdel mModel=new PictureDetailMOdel();

    public PictureDetailPresenter(PictureDetailContract.View view) {
        super(view);

    }

    @Override
    public void getPictureList(int id) {
        mModel.getPictureList(id, new RequestListener<PictureDetailBean>() {
            @Override
            public void onSuccess(PictureDetailBean pictureDetailBean) {
                PictureDetailContract.View view = getView();
                if(view!=null){
                    view.onReceivePictureList(pictureDetailBean);
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });
    }

    @Override
    public void getComments(int id) {

    }
}
