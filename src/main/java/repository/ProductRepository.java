package repository;

import lombok.Getter;
import lombok.Setter;
import product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ProductRepository {
    public static List<Product> products = new ArrayList<>();
    public static Map<Long,Product> productMap = new HashMap<>();
}
