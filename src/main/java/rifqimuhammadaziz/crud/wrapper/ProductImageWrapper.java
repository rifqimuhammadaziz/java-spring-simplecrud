package rifqimuhammadaziz.crud.wrapper;

public class ProductImageWrapper {

    private int productId;

    private String contentType;

    private String base64;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @Override
    public String toString() {
        return "ProductImageWrapper{" +
                "productId=" + productId +
                ", contentType='" + contentType + '\'' +
                ", base64='" + base64 + '\'' +
                '}';
    }
}
