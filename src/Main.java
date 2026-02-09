import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

    IO.println("=== TEST 1 : seller findById ===");
    Seller seller = sellerDao.findById(7);
    IO.println(seller);

    IO.println("=== TEST 2 : seller findByDepartment ===");
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department);
    for (Seller seller1 : list) {
        IO.println(seller1);
    }

    IO.println("=== TEST 3 : seller findAll ===");
    list = sellerDao.findAll();
    for (Seller seller1 : list) {
        IO.println(seller1);
    }

}