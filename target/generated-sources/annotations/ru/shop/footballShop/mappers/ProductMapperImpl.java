package ru.shop.footballShop.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import ru.shop.footballShop.dto.NewProductDTO;
import ru.shop.footballShop.dto.ProductDTO;
import ru.shop.footballShop.dto.ProductImageDTO;
import ru.shop.footballShop.entites.Product;
import ru.shop.footballShop.entites.ProductImage;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-27T22:07:42+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO convertProductToProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( product.getId() );
        productDTO.setName( product.getName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setCategory( product.getCategory() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setImages( productImageListToProductImageDTOList( product.getImages() ) );

        return productDTO;
    }

    @Override
    public Product convertProductDTOToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setName( productDTO.getName() );
        product.setDescription( productDTO.getDescription() );
        product.setCategory( productDTO.getCategory() );
        product.setPrice( productDTO.getPrice() );
        product.setImages( productImageDTOListToProductImageList( productDTO.getImages() ) );

        return product;
    }

    @Override
    public Product convertNewProductDTOToProduct(NewProductDTO newProductDTO) {
        if ( newProductDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( newProductDTO.getName() );
        product.setDescription( newProductDTO.getDescription() );
        product.setCategory( newProductDTO.getCategory() );
        product.setPrice( newProductDTO.getPrice() );

        return product;
    }

    protected ProductImageDTO productImageToProductImageDTO(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }

        ProductImageDTO productImageDTO = new ProductImageDTO();

        productImageDTO.setUrl( productImage.getUrl() );

        return productImageDTO;
    }

    protected List<ProductImageDTO> productImageListToProductImageDTOList(List<ProductImage> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductImageDTO> list1 = new ArrayList<ProductImageDTO>( list.size() );
        for ( ProductImage productImage : list ) {
            list1.add( productImageToProductImageDTO( productImage ) );
        }

        return list1;
    }

    protected ProductImage productImageDTOToProductImage(ProductImageDTO productImageDTO) {
        if ( productImageDTO == null ) {
            return null;
        }

        ProductImage.ProductImageBuilder productImage = ProductImage.builder();

        productImage.url( productImageDTO.getUrl() );

        return productImage.build();
    }

    protected List<ProductImage> productImageDTOListToProductImageList(List<ProductImageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductImage> list1 = new ArrayList<ProductImage>( list.size() );
        for ( ProductImageDTO productImageDTO : list ) {
            list1.add( productImageDTOToProductImage( productImageDTO ) );
        }

        return list1;
    }
}
