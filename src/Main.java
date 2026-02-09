import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

    Seller seller = sellerDao.findById(8);

    IO.println(seller);

}