package hw1.task3;

public class Comments {
    private int postId;
    private int id;
    private String email;
    private String comment;

    public Comments(int postId, int id, String email, String comment) {
        this.postId = postId;
        this.id = id;
        this.email = email;
        this.comment = comment;
    }

    public Comments(){}

    @Override
    public String toString() {
        return "Comments{" +
                "postId=" + postId +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
