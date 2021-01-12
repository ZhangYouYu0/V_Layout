package com.example.viewpager.FooBean;

import java.util.List;

public class FooGwcBean {

    /**
     * errno : 0
     * errmsg :
     * data : {"cartList":[{"id":1950,"user_id":638,"session_id":"1","goods_id":1020000,"goods_sn":"1020000","product_id":26,"goods_name":"升级款记忆绵护椎腰靠","market_price":79,"retail_price":79,"number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png"},{"id":1983,"user_id":638,"session_id":"1","goods_id":1113011,"goods_sn":"1113011","product_id":157,"goods_name":"女式丝滑莫代尔三角内裤","market_price":49,"retail_price":49,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/7a683f68fc988df299b5cfe6273d6fb7.png"},{"id":2013,"user_id":638,"session_id":"1","goods_id":1011004,"goods_sn":"1011004","product_id":20,"goods_name":"色织精梳AB纱格纹空调被","market_price":199,"retail_price":199,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/0984c9388a2c3fd2335779da904be393.png"},{"id":2014,"user_id":638,"session_id":"1","goods_id":1023003,"goods_sn":"1023003","product_id":33,"goods_name":"100年传世珐琅锅 全家系列","market_price":398,"retail_price":398,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png"},{"id":2065,"user_id":638,"session_id":"1","goods_id":1127047,"goods_sn":"1127047","product_id":182,"goods_name":"趣味粉彩系列笔记本","market_price":29,"retail_price":29,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/6c03ca93d8fe404faa266ea86f3f1e43.png"},{"id":2067,"user_id":638,"session_id":"1","goods_id":1134030,"goods_sn":"1134030","product_id":198,"goods_name":"简约知性记忆棉坐垫","market_price":46,"retail_price":46,"number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/aa49dfe878becf768eddc4c1636643a6.png"}],"cartTotal":{"goodsCount":8,"goodsAmount":925,"checkedGoodsCount":8,"checkedGoodsAmount":925}}
     */

    private Integer errno;
    private String errmsg;
    private DataDTO data;

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        /**
         * cartList : [{"id":1950,"user_id":638,"session_id":"1","goods_id":1020000,"goods_sn":"1020000","product_id":26,"goods_name":"升级款记忆绵护椎腰靠","market_price":79,"retail_price":79,"number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png"},{"id":1983,"user_id":638,"session_id":"1","goods_id":1113011,"goods_sn":"1113011","product_id":157,"goods_name":"女式丝滑莫代尔三角内裤","market_price":49,"retail_price":49,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/7a683f68fc988df299b5cfe6273d6fb7.png"},{"id":2013,"user_id":638,"session_id":"1","goods_id":1011004,"goods_sn":"1011004","product_id":20,"goods_name":"色织精梳AB纱格纹空调被","market_price":199,"retail_price":199,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/0984c9388a2c3fd2335779da904be393.png"},{"id":2014,"user_id":638,"session_id":"1","goods_id":1023003,"goods_sn":"1023003","product_id":33,"goods_name":"100年传世珐琅锅 全家系列","market_price":398,"retail_price":398,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png"},{"id":2065,"user_id":638,"session_id":"1","goods_id":1127047,"goods_sn":"1127047","product_id":182,"goods_name":"趣味粉彩系列笔记本","market_price":29,"retail_price":29,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/6c03ca93d8fe404faa266ea86f3f1e43.png"},{"id":2067,"user_id":638,"session_id":"1","goods_id":1134030,"goods_sn":"1134030","product_id":198,"goods_name":"简约知性记忆棉坐垫","market_price":46,"retail_price":46,"number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/aa49dfe878becf768eddc4c1636643a6.png"}]
         * cartTotal : {"goodsCount":8,"goodsAmount":925,"checkedGoodsCount":8,"checkedGoodsAmount":925}
         */

        private CartTotalDTO cartTotal;
        private List<CartListDTO> cartList;

        public CartTotalDTO getCartTotal() {
            return cartTotal;
        }

        public void setCartTotal(CartTotalDTO cartTotal) {
            this.cartTotal = cartTotal;
        }

        public List<CartListDTO> getCartList() {
            return cartList;
        }

        public void setCartList(List<CartListDTO> cartList) {
            this.cartList = cartList;
        }

        public static class CartTotalDTO {
            /**
             * goodsCount : 8
             * goodsAmount : 925
             * checkedGoodsCount : 8
             * checkedGoodsAmount : 925
             */

            private Integer goodsCount;
            private Integer goodsAmount;
            private Integer checkedGoodsCount;
            private Integer checkedGoodsAmount;

            public Integer getGoodsCount() {
                return goodsCount;
            }

            public void setGoodsCount(Integer goodsCount) {
                this.goodsCount = goodsCount;
            }

            public Integer getGoodsAmount() {
                return goodsAmount;
            }

            public void setGoodsAmount(Integer goodsAmount) {
                this.goodsAmount = goodsAmount;
            }

            public Integer getCheckedGoodsCount() {
                return checkedGoodsCount;
            }

            public void setCheckedGoodsCount(Integer checkedGoodsCount) {
                this.checkedGoodsCount = checkedGoodsCount;
            }

            public Integer getCheckedGoodsAmount() {
                return checkedGoodsAmount;
            }

            public void setCheckedGoodsAmount(Integer checkedGoodsAmount) {
                this.checkedGoodsAmount = checkedGoodsAmount;
            }
        }

        public static class CartListDTO {
            /**
             * id : 1950
             * user_id : 638
             * session_id : 1
             * goods_id : 1020000
             * goods_sn : 1020000
             * product_id : 26
             * goods_name : 升级款记忆绵护椎腰靠
             * market_price : 79
             * retail_price : 79
             * number : 2
             * goods_specifition_name_value :
             * goods_specifition_ids :
             * checked : 1
             * list_pic_url : http://yanxuan.nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png
             */

            private Integer id;
            private Integer user_id;
            private String session_id;
            private Integer goods_id;
            private String goods_sn;
            private Integer product_id;
            private String goods_name;
            private Integer market_price;
            private Integer retail_price;
            private Integer number;
            private String goods_specifition_name_value;
            private String goods_specifition_ids;
            private Integer checked;
            private String list_pic_url;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public Integer getUser_id() {
                return user_id;
            }

            public void setUser_id(Integer user_id) {
                this.user_id = user_id;
            }

            public String getSession_id() {
                return session_id;
            }

            public void setSession_id(String session_id) {
                this.session_id = session_id;
            }

            public Integer getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(Integer goods_id) {
                this.goods_id = goods_id;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public Integer getProduct_id() {
                return product_id;
            }

            public void setProduct_id(Integer product_id) {
                this.product_id = product_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public Integer getMarket_price() {
                return market_price;
            }

            public void setMarket_price(Integer market_price) {
                this.market_price = market_price;
            }

            public Integer getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(Integer retail_price) {
                this.retail_price = retail_price;
            }

            public Integer getNumber() {
                return number;
            }

            public void setNumber(Integer number) {
                this.number = number;
            }

            public String getGoods_specifition_name_value() {
                return goods_specifition_name_value;
            }

            public void setGoods_specifition_name_value(String goods_specifition_name_value) {
                this.goods_specifition_name_value = goods_specifition_name_value;
            }

            public String getGoods_specifition_ids() {
                return goods_specifition_ids;
            }

            public void setGoods_specifition_ids(String goods_specifition_ids) {
                this.goods_specifition_ids = goods_specifition_ids;
            }

            public Integer getChecked() {
                return checked;
            }

            public void setChecked(Integer checked) {
                this.checked = checked;
            }

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }
        }
    }
}
