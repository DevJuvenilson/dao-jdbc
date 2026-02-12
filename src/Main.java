import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

//    IO.println("=== TEST 1 : seller findById ===");
//    Seller seller = sellerDao.findById(7);
//    IO.println(seller);
//
//    IO.println("=== TEST 2 : seller findByDepartment ===");
//    Department department = new Department(2, null);
//    List<Seller> list = sellerDao.findByDepartment(department);
//    for (Seller seller1 : list) {
//        IO.println(seller1);
//    }

//    IO.println("=== TEST 3 : seller findAll ===");
//    list = sellerDao.findAll();
//    for (Seller seller1 : list) {
//        IO.println(seller1);
//    }

//    IO.println("=== TEST 4 : seller insert ===");
//    Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
//    sellerDao.insert(newSeller);
//    IO.println("Inserted! New id = " + newSeller.getId());

//    IO.println("=== TEST 5 : seller update ===");
//    seller = sellerDao.findById(1);
//    seller.setName("Martha");
//    sellerDao.update(seller);
//    IO.println("Update completed!");

//    IO.println("=== TEST 6 : seller delete ===");
//    sellerDao.deleteById(10);
//    IO.println("User deleted!");

    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//    IO.println("=== TEST 1 : department insert ===");
//    Department newDepartment = new Department(null, "Greg");
//    departmentDao.insert(newDepartment);
//    IO.println("Inserted! New id = " + newDepartment.getId());

//    IO.println("=== TEST 2 : department update and findById ===");
//    Department department = departmentDao.findById(1);
//    IO.println(department);
//    department.setName("Computers");
//    departmentDao.update(department);
//    IO.println("Update completed!");

//    IO.println("=== TEST 3 : department delete ===");
//    departmentDao.deleteById(5);
//    IO.println("Department deleted!");

//    IO.println("=== TEST 4 : department findAll ===");
//    List<Department> list = departmentDao.findAll();
//    for (Department department : list) {
//        IO.println(department);
//    }
}