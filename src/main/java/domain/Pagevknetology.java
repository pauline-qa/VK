package domain;

public class Pagevknetology {}

public class VkPost {
    private String id;
    private String nameId;
    private String imageId;
    private int date;
    private String imageUrl;
    private String text;
    private boolean myLike;
    private int numberOfLikes;
    private int numberOfViews;
    private int numberOfReposts;
    private CommentsInfo commentsInfo;

    // + get/set на все поля
}

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private String coommenterId;
    private String commenterImageId;
    private int commentDate;
    private int commentImageId;
    private int commentText;
    private int numberOfCommentLikes;
    private boolean myLike;

// + 2 метода Ответить и Сохранить закладки + оставить свой комментарий
// + get/set на все поля
}

public class InnerThreeDotMenu { // меню типа объект, под такой типа объекта - отдельный класс
    // здесь должно быть 2 метода Пожаловаться и Сохранить в закладках
}