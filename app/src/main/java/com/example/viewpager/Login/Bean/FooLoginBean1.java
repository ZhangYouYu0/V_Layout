package com.example.viewpager.Login.Bean;

public class FooLoginBean1 {

    /**
     * errno : 0
     * errmsg :
     * data : {"code":200,"token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiNjM4ZGEyMTEtOTJkNi00MzkzLWE5MDItNzc5ZjkwMmRjMDc5IiwicmFuZG9tIjoiaGUwdnIxZ2l0biIsImlhdCI6MTYxMDI3MzY5Mn0.emaL_CHU23gDpuNPa3-NCBAeONQaleDrRdi4FG954pU","userInfo":{"uid":"638da211-92d6-4393-a902-779f902dc079","username":"z123","nickname":"123","gender":0,"avatar":"http://2002a.oss-cn-beijing.aliyuncs.com/638da211-92d6-4393-a902-779f902dc079/16098174897738107.909713651668.png","birthday":0}}
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
         * code : 200
         * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiNjM4ZGEyMTEtOTJkNi00MzkzLWE5MDItNzc5ZjkwMmRjMDc5IiwicmFuZG9tIjoiaGUwdnIxZ2l0biIsImlhdCI6MTYxMDI3MzY5Mn0.emaL_CHU23gDpuNPa3-NCBAeONQaleDrRdi4FG954pU
         * userInfo : {"uid":"638da211-92d6-4393-a902-779f902dc079","username":"z123","nickname":"123","gender":0,"avatar":"http://2002a.oss-cn-beijing.aliyuncs.com/638da211-92d6-4393-a902-779f902dc079/16098174897738107.909713651668.png","birthday":0}
         */

        private Integer code;
        private String token;
        private UserInfoDTO userInfo;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public UserInfoDTO getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoDTO userInfo) {
            this.userInfo = userInfo;
        }

        public static class UserInfoDTO {
            /**
             * uid : 638da211-92d6-4393-a902-779f902dc079
             * username : z123
             * nickname : 123
             * gender : 0
             * avatar : http://2002a.oss-cn-beijing.aliyuncs.com/638da211-92d6-4393-a902-779f902dc079/16098174897738107.909713651668.png
             * birthday : 0
             */

            private String uid;
            private String username;
            private String nickname;
            private Integer gender;
            private String avatar;
            private Integer birthday;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Integer getGender() {
                return gender;
            }

            public void setGender(Integer gender) {
                this.gender = gender;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public Integer getBirthday() {
                return birthday;
            }

            public void setBirthday(Integer birthday) {
                this.birthday = birthday;
            }
        }
    }
}
