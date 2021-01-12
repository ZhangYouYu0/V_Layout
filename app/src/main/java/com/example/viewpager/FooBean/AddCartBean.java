package com.example.viewpager.FooBean;

import java.util.List;

public class AddCartBean {

    /**
     * errno : 0
     * errmsg :
     * data : {"cartList":[{"id":2034,"user_id":7,"session_id":"1","goods_id":1051002,"goods_sn":"1051002","product_id":65,"goods_name":"Carat钻石汤锅24cm","market_price":228,"retail_price":228,"number":14,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png"},{"id":2043,"user_id":7,"session_id":"1","goods_id":1166008,"goods_sn":"1166008","product_id":244,"goods_name":"Carat钻石 不粘厨具组合","market_price":459,"retail_price":459,"number":0,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png"},{"id":2044,"user_id":7,"session_id":"1","goods_id":1134032,"goods_sn":"1134032","product_id":199,"goods_name":"趣味粉彩系列记忆棉坐垫","market_price":49,"retail_price":49,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/8b30eeb17c831eba08b97bdcb4c46a8e.png"},{"id":2046,"user_id":7,"session_id":"1","goods_id":1155000,"goods_sn":"1155000","product_id":241,"goods_name":"清新趣粉全棉四件套 条纹绿格","market_price":399,"retail_price":399,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/d7d6ef1f1865991077384761b4521dce.png"}],"cartTotal":{"goodsCount":16,"goodsAmount":3640,"checkedGoodsCount":16,"checkedGoodsAmount":3640}}
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
         * cartList : [{"id":2034,"user_id":7,"session_id":"1","goods_id":1051002,"goods_sn":"1051002","product_id":65,"goods_name":"Carat钻石汤锅24cm","market_price":228,"retail_price":228,"number":14,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png"},{"id":2043,"user_id":7,"session_id":"1","goods_id":1166008,"goods_sn":"1166008","product_id":244,"goods_name":"Carat钻石 不粘厨具组合","market_price":459,"retail_price":459,"number":0,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png"},{"id":2044,"user_id":7,"session_id":"1","goods_id":1134032,"goods_sn":"1134032","product_id":199,"goods_name":"趣味粉彩系列记忆棉坐垫","market_price":49,"retail_price":49,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/8b30eeb17c831eba08b97bdcb4c46a8e.png"},{"id":2046,"user_id":7,"session_id":"1","goods_id":1155000,"goods_sn":"1155000","product_id":241,"goods_name":"清新趣粉全棉四件套 条纹绿格","market_price":399,"retail_price":399,"number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan.nosdn.127.net/d7d6ef1f1865991077384761b4521dce.png"}]
         * cartTotal : {"goodsCount":16,"goodsAmount":3640,"checkedGoodsCount":16,"checkedGoodsAmount":3640}
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
             * goodsCount : 16
             * goodsAmount : 3640
             * checkedGoodsCount : 16
             * checkedGoodsAmount : 3640
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
             * id : 2034
             * user_id : 7
             * session_id : 1
             * goods_id : 1051002
             * goods_sn : 1051002
             * product_id : 65
             * goods_name : Carat钻石汤锅24cm
             * market_price : 228
             * retail_price : 228
             * number : 14
             * goods_specifition_name_value :
             * goods_specifition_ids :
             * checked : 1
             * list_pic_url : http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png
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
