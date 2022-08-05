package review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Meta {
    private long reviewId;
    private byte[] reviewImage;
    private String imagePath;
}
