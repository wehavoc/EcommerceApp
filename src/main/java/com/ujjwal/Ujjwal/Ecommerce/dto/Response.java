package com.ujjwal.Ujjwal.Ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int status;
    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();
    private String token;
    private String role;
    private String expirationTime;
    private int totalPage;
    private long totalElement;
    private AddressDto address;
    private UserDto user;
    private List<UserDto> userList;
    private CategoryDto category;
    private List<CategoryDto> categoryList;
    private ProductDto product;
    private List<ProductDto> productList;
    private OrderItemDto orderItem;
    private List<OrderItemDto> orderItemList;
    private OrderDto order;
    private List<OrderDto> orderList;

    // Static builder method
    public static ResponseBuilder builder() {
        return new ResponseBuilder();
    }

    // Builder class
    public static class ResponseBuilder {
        private Response response = new Response();

        public ResponseBuilder status(int status) {
            response.setStatus(status);
            return this;
        }

        public ResponseBuilder message(String message) {
            response.setMessage(message);
            return this;
        }

        public ResponseBuilder token(String token) {
            response.setToken(token);
            return this;
        }

        public ResponseBuilder role(String role) {
            response.setRole(role);
            return this;
        }

        // Add other builder methods as needed

        public Response build() {
            return response;
        }
    }

    // Getters and Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(long totalElement) {
        this.totalElement = totalElement;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<UserDto> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDto> userList) {
        this.userList = userList;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public List<CategoryDto> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryDto> categoryList) {
        this.categoryList = categoryList;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public List<ProductDto> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDto> productList) {
        this.productList = productList;
    }

    public OrderItemDto getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItemDto orderItem) {
        this.orderItem = orderItem;
    }

    public List<OrderItemDto> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDto> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }

    public List<OrderDto> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDto> orderList) {
        this.orderList = orderList;
    }
}