package domain;

public class Pagevknetology

public class VkPost {
    private String id;
    private String nameId;
    private String imageId;
    private int date;
    private String imageUrl;
    private String text;
    private int createdBy;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    // + get/set на все поля
}

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private String coommenterId;
    private String commenterImageId;
    private int commentDate;
    private String commentImageId;
    private String commentText;
    private int numberOfCommentLikes;
    private boolean myLike;

// + методы Ответить и Поделиться + оставить свой комментарий
// + get/set на все поля
}

public class InnerThreeDotMenu { // меню типа объект, под такой типа объекта - отдельный класс
    // здесь должно быть 2 метода Пожаловаться и Сохранить в закладках
}

public class CopyRight {
    private int id;
    private String link;
    private String name;
    private String type;
    // + get/set на все поля
}

public class Like {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;
    // + get/set на все поля
}

public class Repost {
    private int count;
    // + get/set на все поля
}

public class Views {
    private int count;
    // + get/set на все поля
}

public class Geo {
    private String type;
    private String coordinates;
    // + get/set на все поля
}

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canpublishFeeCopy;
    private String editMode;
    // + get/set на все поля
}