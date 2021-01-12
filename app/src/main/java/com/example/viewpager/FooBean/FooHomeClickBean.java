package com.example.viewpager.FooBean;

import java.util.List;

public class FooHomeClickBean {

    /**
     * data : {"count":9,"currentPage":1,"data":[{"id":1166008,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png","name":"Carat钻石 不粘厨具组合","retail_price":459},{"id":1073008,"list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png","name":"铸铁珐琅牛排煎锅","retail_price":149},{"id":1051003,"list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png","name":"Carat钻石奶锅18cm","retail_price":148},{"id":1051002,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png","name":"Carat钻石汤锅24cm","retail_price":228},{"id":1051001,"list_pic_url":"http://yanxuan.nosdn.127.net/f53ed57d9e23fda7e24dfd0e0a50c5d1.png","name":"Carat钻石煎锅28cm","retail_price":159},{"id":1051000,"list_pic_url":"http://yanxuan.nosdn.127.net/e564410546a11ddceb5a82bfce8da43d.png","name":"Carat钻石炒锅30cm","retail_price":180},{"id":1038004,"list_pic_url":"http://yanxuan.nosdn.127.net/4d3d3eaeb872860539d7faa59f9f84e9.png","name":"100年传世珐琅锅 马卡龙系列","retail_price":359},{"id":1025005,"list_pic_url":"http://yanxuan.nosdn.127.net/49e26f00ca4d0ce00f9960d22c936738.png","name":"100年传世珐琅锅","retail_price":268},{"id":1023003,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png","name":"100年传世珐琅锅 全家系列","retail_price":398}],"filterCategory":[{"checked":false,"id":0,"name":"全部"},{"checked":false,"id":1005000,"name":"居家"},{"checked":true,"id":1005001,"name":"餐厨"},{"checked":false,"id":1008000,"name":"配件"},{"checked":false,"id":1010000,"name":"服装"},{"checked":false,"id":1013001,"name":"洗护"},{"checked":false,"id":1011000,"name":"婴童"},{"checked":false,"id":1012000,"name":"杂货"},{"checked":false,"id":1005002,"name":"饮食"},{"checked":false,"id":1019000,"name":"志趣"}],"goodsList":[{"id":1166008,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png","name":"Carat钻石 不粘厨具组合","retail_price":459},{"id":1073008,"list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png","name":"铸铁珐琅牛排煎锅","retail_price":149},{"id":1051003,"list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png","name":"Carat钻石奶锅18cm","retail_price":148},{"id":1051002,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png","name":"Carat钻石汤锅24cm","retail_price":228},{"id":1051001,"list_pic_url":"http://yanxuan.nosdn.127.net/f53ed57d9e23fda7e24dfd0e0a50c5d1.png","name":"Carat钻石煎锅28cm","retail_price":159},{"id":1051000,"list_pic_url":"http://yanxuan.nosdn.127.net/e564410546a11ddceb5a82bfce8da43d.png","name":"Carat钻石炒锅30cm","retail_price":180},{"id":1038004,"list_pic_url":"http://yanxuan.nosdn.127.net/4d3d3eaeb872860539d7faa59f9f84e9.png","name":"100年传世珐琅锅 马卡龙系列","retail_price":359},{"id":1025005,"list_pic_url":"http://yanxuan.nosdn.127.net/49e26f00ca4d0ce00f9960d22c936738.png","name":"100年传世珐琅锅","retail_price":268},{"id":1023003,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png","name":"100年传世珐琅锅 全家系列","retail_price":398}],"pageSize":10,"totalPages":1}
     * errmsg :
     * errno : 0
     */

    private DataDTO data;
    private String errmsg;
    private Integer errno;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public static class DataDTO {
        /**
         * count : 9
         * currentPage : 1
         * data : [{"id":1166008,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png","name":"Carat钻石 不粘厨具组合","retail_price":459},{"id":1073008,"list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png","name":"铸铁珐琅牛排煎锅","retail_price":149},{"id":1051003,"list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png","name":"Carat钻石奶锅18cm","retail_price":148},{"id":1051002,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png","name":"Carat钻石汤锅24cm","retail_price":228},{"id":1051001,"list_pic_url":"http://yanxuan.nosdn.127.net/f53ed57d9e23fda7e24dfd0e0a50c5d1.png","name":"Carat钻石煎锅28cm","retail_price":159},{"id":1051000,"list_pic_url":"http://yanxuan.nosdn.127.net/e564410546a11ddceb5a82bfce8da43d.png","name":"Carat钻石炒锅30cm","retail_price":180},{"id":1038004,"list_pic_url":"http://yanxuan.nosdn.127.net/4d3d3eaeb872860539d7faa59f9f84e9.png","name":"100年传世珐琅锅 马卡龙系列","retail_price":359},{"id":1025005,"list_pic_url":"http://yanxuan.nosdn.127.net/49e26f00ca4d0ce00f9960d22c936738.png","name":"100年传世珐琅锅","retail_price":268},{"id":1023003,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png","name":"100年传世珐琅锅 全家系列","retail_price":398}]
         * filterCategory : [{"checked":false,"id":0,"name":"全部"},{"checked":false,"id":1005000,"name":"居家"},{"checked":true,"id":1005001,"name":"餐厨"},{"checked":false,"id":1008000,"name":"配件"},{"checked":false,"id":1010000,"name":"服装"},{"checked":false,"id":1013001,"name":"洗护"},{"checked":false,"id":1011000,"name":"婴童"},{"checked":false,"id":1012000,"name":"杂货"},{"checked":false,"id":1005002,"name":"饮食"},{"checked":false,"id":1019000,"name":"志趣"}]
         * goodsList : [{"id":1166008,"list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png","name":"Carat钻石 不粘厨具组合","retail_price":459},{"id":1073008,"list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png","name":"铸铁珐琅牛排煎锅","retail_price":149},{"id":1051003,"list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png","name":"Carat钻石奶锅18cm","retail_price":148},{"id":1051002,"list_pic_url":"http://yanxuan.nosdn.127.net/56f4b4753392d27c0c2ccceeb579ed6f.png","name":"Carat钻石汤锅24cm","retail_price":228},{"id":1051001,"list_pic_url":"http://yanxuan.nosdn.127.net/f53ed57d9e23fda7e24dfd0e0a50c5d1.png","name":"Carat钻石煎锅28cm","retail_price":159},{"id":1051000,"list_pic_url":"http://yanxuan.nosdn.127.net/e564410546a11ddceb5a82bfce8da43d.png","name":"Carat钻石炒锅30cm","retail_price":180},{"id":1038004,"list_pic_url":"http://yanxuan.nosdn.127.net/4d3d3eaeb872860539d7faa59f9f84e9.png","name":"100年传世珐琅锅 马卡龙系列","retail_price":359},{"id":1025005,"list_pic_url":"http://yanxuan.nosdn.127.net/49e26f00ca4d0ce00f9960d22c936738.png","name":"100年传世珐琅锅","retail_price":268},{"id":1023003,"list_pic_url":"http://yanxuan.nosdn.127.net/c39d54c06a71b4b61b6092a0d31f2335.png","name":"100年传世珐琅锅 全家系列","retail_price":398}]
         * pageSize : 10
         * totalPages : 1
         */

        private Integer count;
        private Integer currentPage;
        private Integer pageSize;
        private Integer totalPages;
        private List<DataDTO.DataDTOX> data;
        private List<DataDTO.FilterCategoryDTOX> filterCategory;
        private List<DataDTO.GoodsListDTOX> goodsList;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public Integer getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
        }

        public List<DataDTO.DataDTOX> getData() {
            return data;
        }

        public void setData(List<DataDTO.DataDTOX> data) {
            this.data = data;
        }

        public List<DataDTO.FilterCategoryDTOX> getFilterCategory() {
            return filterCategory;
        }

        public void setFilterCategory(List<DataDTO.FilterCategoryDTOX> filterCategory) {
            this.filterCategory = filterCategory;
        }

        public List<DataDTO.GoodsListDTOX> getGoodsList() {
            return goodsList;
        }

        public void setGoodsList(List<DataDTO.GoodsListDTOX> goodsList) {
            this.goodsList = goodsList;
        }

        public static class DataDTOX {
            /**
             * id : 1166008
             * list_pic_url : http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png
             * name : Carat钻石 不粘厨具组合
             * retail_price : 459
             */

            private Integer id;
            private String list_pic_url;
            private String name;
            private Double retail_price;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Double getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(Double retail_price) {
                this.retail_price = retail_price;
            }
        }

        public static class FilterCategoryDTOX {
            /**
             * checked : false
             * id : 0
             * name : 全部
             */

            private Boolean checked;
            private Integer id;
            private String name;

            public Boolean isChecked() {
                return checked;
            }

            public void setChecked(Boolean checked) {
                this.checked = checked;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class GoodsListDTOX {
            /**
             * id : 1166008
             * list_pic_url : http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png
             * name : Carat钻石 不粘厨具组合
             * retail_price : 459
             */

            private Integer id;
            private String list_pic_url;
            private String name;
            private Double retail_price;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Double getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(Double retail_price) {
                this.retail_price = retail_price;
            }
        }
    }
}
