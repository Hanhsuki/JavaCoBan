package chuong8;

public class ClassGeneric <T1,T2> {
    public String getName() {
        return name;
    }

    public T1 getTime() {
        return time;
    }

    public T2 getChapter() {
        return chapter;
    }

//    public ClassGeneric(String name, T1 time, T2 chapter) {
//        this.name = name;
//        this.time = time;
//        this.chapter = chapter;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(T1 time) {
        this.time = time;
    }

    public void setChapter(T2 chapter) {
        this.chapter = chapter;
    }

    private String name;
    private T1 time;      // nếu truyền vào 25h sẽ dẫn đến lỗi
    private T2 chapter;   // nếu truyền vào 4chapter sẽ dẫn đến lỗi

}
