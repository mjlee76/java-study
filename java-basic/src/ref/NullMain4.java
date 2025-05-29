package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 객체를 생성해줌
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException -> 발생안함
        System.out.println("bigData.data.value = " + bigData.data.value); // x001.value
    }
}
