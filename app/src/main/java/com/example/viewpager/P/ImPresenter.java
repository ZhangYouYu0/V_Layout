package com.example.viewpager.P;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.CallBack;
import com.example.mylibrary.Utils.Net.ConUrl;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooCollBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.m.ImMode;

public class ImPresenter  extends BasePresenter<C.View,C.Mode> implements C.Presenter {
    @Override
    public C.Mode setImode() {
        return new ImMode(this);
    }

    @Override
    public void P1() {
        imode.Next(ConUrl.BannUrl, new CallBack<FooHomeBean>() {
            @Override
            public void OnSuucessHome(FooHomeBean fooHomeBean) {
                iview.OnSuucessHome(fooHomeBean);
            }

            @Override
            public void OnSuucess(String err) {
                iview.OnErro(err);
            }

            @Override
            public void OnSuucessColl(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessTab(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessClassfiy(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnLogin(FooHomeBean fooHomeBean) {

            }

        });
    }

    @Override
    public void P2(int id) {
        imode.Next1(id,new CallBack<Bean>() {
         @Override
         public void OnSuucessHome(Bean fooCollBean) {

         }

         @Override
         public void OnSuucess(String err) {
            iview.OnErro(err);
         }

         @Override
         public void OnSuucessColl(Bean fooCollBean) {
             iview.OnSuucessColl(fooCollBean);
         }

            @Override
            public void OnSuucessTab(Bean bean) {

            }

            @Override
            public void OnSuucessClassfiy(Bean bean) {

            }

            @Override
            public void OnLogin(Bean bean) {

            }
        });
    }

    @Override
    public void P3() {
    imode.Next2(ConUrl.TabUrl, new CallBack<FooTablayoutBean>() {
        @Override
        public void OnSuucessHome(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucess(String err) {
        iview.OnErro(err);
        }

        @Override
        public void OnSuucessColl(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucessTab(FooTablayoutBean fooTablayoutBean) {
        iview.OnSuucessTab(fooTablayoutBean);
        }

        @Override
        public void OnSuucessClassfiy(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnLogin(FooTablayoutBean fooTablayoutBean) {

        }
    });
    }

    @Override
    public void P4(int id) {
    imode.Next3(id, new CallBack<FooClassfiyBean>() {
        @Override
        public void OnSuucessHome(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucess(String err) {
        iview.OnErro(err);
        }

        @Override
        public void OnSuucessColl(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessTab(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessClassfiy(FooClassfiyBean fooClassfiyBean) {
        iview.OnSuucessClassfiy(fooClassfiyBean);
        }

        @Override
        public void OnLogin(FooClassfiyBean fooClassfiyBean) {

        }
    });

    }


}
