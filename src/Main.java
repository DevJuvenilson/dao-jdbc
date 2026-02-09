import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    Department department = new Department(1, "Books");
    Seller seller = new Seller(2, "Juvenilson", "juve@gmail.com", LocalDate.now(), 2000.0, new Department(2, "TI"));

    SellerDao sellerDao = DaoFactory.createSellerDao();

    IO.println(department);
    IO.println(seller);

}