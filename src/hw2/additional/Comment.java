package hw2.additional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int postId;
    private int id;
    private String email;
    private String comment;

    @Override
    public String toString() {
        return "Comments{" +
                "postId=" + postId +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

}
