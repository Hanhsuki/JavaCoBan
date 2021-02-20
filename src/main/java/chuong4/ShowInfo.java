package chuong4;

public class ShowInfo {

    public String name;
    public int birthday;

        public String getName() {
            return name;
        }

        public int getBirthday() {
            return birthday;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBirthday(int birthday) {
            this.birthday = birthday;
        }

    public void showInfo(){
// \t dùng để tab dòng dữ liệu
        System.out.println("Name\t:" + this.getName());
        System.out.println("Birthday\t:" + this.getBirthday());
    }
}
