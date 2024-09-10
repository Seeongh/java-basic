package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview mr = new MovieReview();
        mr.title = "인셉션" ;
        mr.review= "good" ;

        MovieReview mr2 = new MovieReview();
        mr2.title = "어바웃타임";
        mr2.review="soso";

        System.out.println("이름:  " + mr.title + " 리뷰 : " + mr.review);

        System.out.println("이름:  " + mr2.title + " 리뷰 : " + mr2.review);
    }
}
