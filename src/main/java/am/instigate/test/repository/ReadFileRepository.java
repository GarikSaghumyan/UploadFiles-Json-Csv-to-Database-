package am.instigate.test.repository;

import am.instigate.test.entity.User;
import am.instigate.test.service.ReadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadFileRepository extends CrudRepository<User, Long> {
}
