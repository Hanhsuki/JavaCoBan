package chuong4;
/* Override hay còn gọi là sự ghi đè các phương thức
Override là các phương thức đã xuất hiện ở lớp cha nhưng vẫn xuất hiện ở lớp con
khi đối tượng gọi method thì sẽ chạy method ở lớp con, nếu lớp con không có phương thức đó thì mới gọi đối tượng
nằm ở lớp cha.
 */
public class Overriding extends ShowInfo {
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double score;
//Từ khóa this đại diện cho class Overriding, từ khóa super đại diện cho từ khóa ShowInfo
    public void showInfo(){
        super.showInfo();
        System.out.println("Score\t:" + this.getScore());

    }

}
