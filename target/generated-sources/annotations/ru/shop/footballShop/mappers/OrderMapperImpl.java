package ru.shop.footballShop.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import ru.shop.footballShop.dto.OrderDTO;
import ru.shop.footballShop.dto.OrderItemDTO;
import ru.shop.footballShop.entites.Order;
import ru.shop.footballShop.entites.OrderItem;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-27T22:07:42+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    @Override
    public OrderDTO convertOrderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( order.getId() );
        orderDTO.setAddress( order.getAddress() );
        orderDTO.setCreationDate( order.getCreationDate() );
        orderDTO.setPhone( order.getPhone() );
        orderDTO.setStatus( order.getStatus() );
        orderDTO.setTotal( order.getTotal() );
        orderDTO.setOrderItems( orderItemListToOrderItemDTOList( order.getOrderItems() ) );

        return orderDTO;
    }

    protected OrderItemDTO orderItemToOrderItemDTO(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemDTO orderItemDTO = new OrderItemDTO();

        orderItemDTO.setId( orderItem.getId() );
        orderItemDTO.setQuantity( orderItem.getQuantity() );
        orderItemDTO.setProduct( productMapper.convertProductToProductDTO( orderItem.getProduct() ) );

        return orderItemDTO;
    }

    protected List<OrderItemDTO> orderItemListToOrderItemDTOList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemDTO> list1 = new ArrayList<OrderItemDTO>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( orderItemToOrderItemDTO( orderItem ) );
        }

        return list1;
    }
}
