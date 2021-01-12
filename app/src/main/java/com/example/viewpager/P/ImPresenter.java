package com.example.viewpager.P;

import com.example.mylibrary.Base.BasePresenter;
import com.example.mylibrary.Utils.Net.One.CallBack;
import com.example.mylibrary.Utils.Net.One.ConUrl;
import com.example.viewpager.Contract.C;
import com.example.viewpager.FooBean.Bean;
import com.example.viewpager.FooBean.FooClassfiyBean;
import com.example.viewpager.FooBean.FooHomeBean;
import com.example.viewpager.FooBean.FooHomeClickBean;
import com.example.viewpager.FooBean.FooShoppingBean;
import com.example.viewpager.FooBean.FooSpBean;
import com.example.viewpager.FooBean.FooTablayoutBean;
import com.example.viewpager.FooBean.XqBean;
import com.example.viewpager.m.ImMode;

public class ImPresenter  extends BasePresenter<C.View,C.Mode> implements C.Presenter {
    @Override
    public C.Mode setImode() {
        return new ImMode();
    }

    @Override
    public void P1() {
        imode.Next1(ConUrl.BannUrl, new CallBack<FooHomeBean>() {
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
            public void OnSuucessUserToke(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessShopping(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessHomeClick(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessHomeSpXq(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnSuucessGWC(FooHomeBean fooHomeBean) {

            }

            @Override
            public void OnLogin(FooHomeBean fooHomeBean) {

            }

        });
    }

    @Override
    public void P2(int id) {
        imode.Next2(id,new CallBack<Bean>() {
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
            public void OnSuucessUserToke(Bean bean) {

            }

            @Override
            public void OnSuucessShopping(Bean bean) {

            }

            @Override
            public void OnSuucessHomeClick(Bean bean) {

            }

            @Override
            public void OnSuucessHomeSpXq(Bean bean) {

            }

            @Override
            public void OnSuucessGWC(Bean bean) {

            }

            @Override
            public void OnLogin(Bean bean) {

            }
        });
    }

    @Override
    public void P3() {
    imode.Next3(ConUrl.TabUrl, new CallBack<FooTablayoutBean>() {
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
        public void OnSuucessUserToke(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucessShopping(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucessHomeClick(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucessHomeSpXq(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnSuucessGWC(FooTablayoutBean fooTablayoutBean) {

        }

        @Override
        public void OnLogin(FooTablayoutBean fooTablayoutBean) {

        }
    });
    }

    @Override
    public void P4(int id) {
    imode.Next4(id, new CallBack<FooClassfiyBean>() {
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
        public void OnSuucessUserToke(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessShopping(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessHomeClick(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessHomeSpXq(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnSuucessGWC(FooClassfiyBean fooClassfiyBean) {

        }

        @Override
        public void OnLogin(FooClassfiyBean fooClassfiyBean) {

        }
    });

    }

    @Override
    public void P5() {

        imode.Next5(ConUrl.ShoppingUrl, new CallBack<FooShoppingBean>() {
            @Override
            public void OnSuucessHome(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucess(String err) {
            iview.OnErro(err);
            }

            @Override
            public void OnSuucessColl(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessTab(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessClassfiy(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessUserToke(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessShopping(FooShoppingBean fooShoppingBean) {
            iview.OnSuucessShooping(fooShoppingBean);
            }

            @Override
            public void OnSuucessHomeClick(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessHomeSpXq(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnSuucessGWC(FooShoppingBean fooShoppingBean) {

            }

            @Override
            public void OnLogin(FooShoppingBean fooShoppingBean) {

            }
        });

    }

    @Override
    public void P6(int categoryId) {
        imode.Next5(categoryId, new CallBack<FooHomeClickBean>() {
            @Override
            public void OnSuucessHome(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucess(String err) {
            iview.OnErro(err);
            }

            @Override
            public void OnSuucessColl(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessTab(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessClassfiy(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessUserToke(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessShopping(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessHomeClick(FooHomeClickBean fooHomeClickBean) {
                    iview.OnSuucessHomeClick(fooHomeClickBean);
            }

            @Override
            public void OnSuucessHomeSpXq(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnSuucessGWC(FooHomeClickBean fooHomeClickBean) {

            }

            @Override
            public void OnLogin(FooHomeClickBean fooHomeClickBean) {

            }
        });
    }

    @Override
    public void P7(int id) {
        imode.Next7(id, new CallBack<FooSpBean>() {
            @Override
            public void OnSuucessHome(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucess(String err) {

            }

            @Override
            public void OnSuucessColl(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessTab(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessClassfiy(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessUserToke(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessShopping(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessHomeClick(FooSpBean fooSpBean) {

            }

            @Override
            public void OnSuucessHomeSpXq(FooSpBean fooSpBean) {
            iview.OnSuucessHomeSpxq(fooSpBean);
            }

            @Override
            public void OnSuucessGWC(FooSpBean fooSpBean) {

            }

            @Override
            public void OnLogin(FooSpBean fooSpBean) {

            }
        });
    }

    @Override
    public void P8(int id) {
        imode.Next8(id, new CallBack<XqBean>() {
            @Override
            public void OnSuucessHome(XqBean xqBean) {

            }

            @Override
            public void OnSuucess(String err) {
            iview.OnErro(err);
            }

            @Override
            public void OnSuucessColl(XqBean xqBean) {

            }

            @Override
            public void OnSuucessTab(XqBean xqBean) {

            }

            @Override
            public void OnSuucessClassfiy(XqBean xqBean) {

            }

            @Override
            public void OnSuucessUserToke(XqBean xqBean) {

            }

            @Override
            public void OnSuucessShopping(XqBean xqBean) {

            }

            @Override
            public void OnSuucessHomeClick(XqBean xqBean) {

            }

            @Override
            public void OnSuucessHomeSpXq(XqBean xqBean) {

            }

            @Override
            public void OnSuucessGWC(XqBean xqBean) {

            }

            @Override
            public void OnLogin(XqBean xqBean) {
            iview.OnSuucessHomeGwc(xqBean);
            }
        });
    }


}
