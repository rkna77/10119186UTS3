package com.rikaaadila.a10119186uts;

public class DailyModel {
        int image;
        String title;
        String desc;

        public DailyModel(int image, String title, String desc) {
            this.image = image;
            this.title = title;
            this.desc = desc;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
