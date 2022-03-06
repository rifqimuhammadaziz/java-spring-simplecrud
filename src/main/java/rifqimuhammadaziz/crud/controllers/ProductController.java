package rifqimuhammadaziz.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rifqimuhammadaziz.crud.entities.ProductEntity;
import rifqimuhammadaziz.crud.entities.ProductImage;
import rifqimuhammadaziz.crud.repositories.ProductRepository;
import rifqimuhammadaziz.crud.response.CommonResponse;
import rifqimuhammadaziz.crud.response.CommonResponseGenerator;
import rifqimuhammadaziz.crud.services.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @Autowired
    ProductService productService;

    @GetMapping(value = "checkAPI")
    public CommonResponse<String> checkApi()  {
        return commonResponseGenerator.successResponse("API is OK", "Success check API");
    }

    @PostMapping(value = "addProduct")
    public CommonResponse<ProductEntity> addProduct(@RequestBody ProductEntity data) {
        try {
            ProductEntity product = productService.addProduct(data);
            return commonResponseGenerator.successResponse(data, "Success add new product");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @GetMapping(value = "getById")
    public CommonResponse<ProductEntity> getById(@RequestParam int id) {
        try {
            ProductEntity product = productService.getById(id);
            return commonResponseGenerator.successResponse(product, "Success get product by id : " + id);
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @GetMapping(value = "getAllProduct")
    public CommonResponse<List<ProductEntity>> getAllProduct() {
        try {
            List<ProductEntity> products = productService.getAllProduct();
            return commonResponseGenerator.successResponse(products, "Success get all product");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }

    @PutMapping(value = "updateProduct")
    public CommonResponse<ProductEntity> updateProduct(@RequestBody ProductEntity product) {
        try {
            ProductEntity editProduct = productService.update(product);
            return commonResponseGenerator.successResponse(editProduct, "Success update data id: " + product.getId());
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage() + " for id : " + product.getId());
        }
    }

    @DeleteMapping(value = "deleteProduct")
    public CommonResponse<ProductEntity> deleteProduct(@RequestParam int id) {
        try {
            ProductEntity product = productService.getById(id);
            productService.delete(id);
            return commonResponseGenerator.successResponse(product, "Success delete product id: " + id);
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage() + " for id : " + id);
        }
    }

    @PostMapping(value = "upload-product")
    public CommonResponse<ProductImage> upload() {

    }

}
