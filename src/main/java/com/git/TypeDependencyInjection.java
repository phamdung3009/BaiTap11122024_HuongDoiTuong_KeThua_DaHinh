package com.git;

public class TypeDependencyInjection {
    /* Field Injection
    Field Injection là cách ngắn gọn nhất, trong đó Spring inject dependencies trực tiếp vào các
    field của lớp mà không cần dùng constructor hoặc setter. Để làm điều này, ta chỉ cần
    thêm annotation @Autowired lên trường cần inject, và Spring sẽ tự động cung cấp dependencies cho field đó.*/
    // @Autowired
    private Vehicle vehicle;

    /* Constructor Injection
    Constructor Injection cung cấp dependencies cho đối tượng thông qua constructor của nó. Các
    dependencies cần thiết sẽ được truyền vào đối tượng khi nó được khởi tạo. Spring sẽ dùng constructor
    có các tham số tương ứng với dependencies để tạo đối tượng và cung cấp sẵn các dependencies cần thiết.   */
    // @Autowired
    public TypeDependencyInjection(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /* Setter Injection
    Setter Injection cho phép Spring inject dependencies qua các phương thức setter. Thay vì khởi
    tạo đối tượng và truyền tất cả dependencies ngay từ đầu, Spring tạo đối tượng trước và sau đó
    inject các dependencies bằng cách gọi các phương thức setter */
    // @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
