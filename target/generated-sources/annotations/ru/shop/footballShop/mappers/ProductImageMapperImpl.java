package ru.shop.footballShop.mappers;

import javax.annotation.processing.Generated;
import ru.shop.footballShop.dto.ProductImageDTO;
import ru.shop.footballShop.entites.ProductImage;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-27T22:07:41+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class ProductImageMapperImpl implements ProductImageMapper {

    @Override
    public ProductImageDTO convertProductImageToProductImageDTO(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }

        ProductImageDTO productImageDTO = new ProductImageDTO();

        productImageDTO.setUrl( productImage.getUrl() );

        return productImageDTO;
    }
}
