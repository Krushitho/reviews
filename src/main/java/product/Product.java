package product;

import lombok.Getter;
import lombok.Setter;
import review.Review;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Product {
    private long productId;
    private String sku;
    private String productName;

    private List<Review> reviews;

    public Product() {}

    public Product(long productId, String sku, String productName) {
        this.productId = productId;
        this.sku = sku;
        this.productName = productName;
        reviews = new ArrayList<>();
    }



}
